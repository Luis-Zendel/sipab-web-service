package mx.com.telcel.sipab.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.Constantes;
import mx.com.telcel.sipab.constant.ErrorResponse;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.dto.request.NotasRequest;
import mx.com.telcel.sipab.dto.response.DetalleFactura;
import mx.com.telcel.sipab.models.Nota;
import mx.com.telcel.sipab.models.Rfc;
import mx.com.telcel.sipab.models.Sides;
import mx.com.telcel.sipab.models.TipoTramite;
import mx.com.telcel.sipab.models.Tramite;
import mx.com.telcel.sipab.models.TramiteDetalle;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class NotaCreditoService {
	
	@Autowired
	private TipoTramiteService tipoTramiteService;
	@Autowired
	private SecuenciaService secuenciaService;
	@Autowired
	private TramiteService tramiteService;
	@Autowired
	private TramiteDetalleService tramiteDetalleService;
	@Autowired
	private NotaService notaService;
	@Autowired
	private RfcService rfcService;
	@Autowired
	private SidesService sidesService;

	public Response<String> notaCredito(NotasRequest request) {
		try {
			TipoTramite tipoTramite = tipoTramiteService.findByPrefijo("NCR");
			Long secuencia = secuenciaService.findByIdCentroAndTramite(request.getIdCentro(), tipoTramite.getPrefijo()).getValor();
			String folio = request.getPrefijo() + "-" + tipoTramite.getPrefijo() + "-" + secuencia;
			Integer anio = Calendar.getInstance().get(Calendar.YEAR);
			Integer idEstatus = generaEstatusInicial(request.getGrupo(), request.getIdRegionUsuario(), request.getCentro(), request.getIdPuesto(), request.getFactura().getTotal());
			Integer idFlujo = 0;
			idFlujo = request.getFolioSides() != null && !request.getFolioSides().equals(0) ? Constantes.FLUJO_NCR_SIDES
					: Constantes.FLUJO_NCR_R09;
			if (request.getIdRegionUsuario() != 9) {
				idFlujo = Constantes.ID_FLUJO_CARGO_REGIONALES;
			}
			if (request.getGrupo().contains("CORPORATIVO") || request.getCentro().contains("CAE ")) {
				idFlujo = Constantes.ID_FLUJO_CORPORATVO_R09;
				if (request.getIdRegionUsuario() != 9) {
					idFlujo = Constantes.ID_FLUJO_CORPORATIVO_REGIONALES;
				}
			}
			
			Tramite tramite = new Tramite(folio, anio, idEstatus, request.getNumeroEmpleado(), request.getIdRegionUsuario(), request.getIdCentro(), 
					idFlujo, request.getIdSoporte(), request.getSoporte(), request.getIdMotivo(), request.getMotivo(), request.getObservaciones(), new Date());
			tramiteService.save(tramite);
			Integer loteBatch = 0;
			for (DetalleFactura detalleFactura : request.getFactura().getDetallesFactura()) {
				long idTramiteDetalle = tramiteDetalleService.findMaxIdTramiteDetalle();
				TramiteDetalle tramiteDetalle = new TramiteDetalle(idTramiteDetalle, folio, anio, tipoTramite.getIdTipoTramite(), request.getIdRegionCuenta(), 
						request.getCuenta(), secuencia, request.getTelefono(), request.getCliente(), request.getCiclo(), detalleFactura.getImporte(), 
						detalleFactura.getIva(), detalleFactura.getTotal());
				tramiteDetalleService.save(tramiteDetalle);
		        idTramiteDetalle = tramiteDetalleService.findMaxIdTramiteDetalle(folio, anio);
		        loteBatch ++;
		        Nota nota = new Nota(idTramiteDetalle, detalleFactura.getClaveBatch() == null ? 5024 : detalleFactura.getClaveBatch(), 
		        		detalleFactura.getClaveSap(), loteBatch, request.getTipoCaptura(), detalleFactura.getInvoiceDetailId(), 
		        		detalleFactura.getDescripcion(), detalleFactura.getClave(), request.getFactura().getFechaExpedicion(), 
		        		request.getFactura().getUuid(), request.getFactura().getNumeroFactura(), request.getFactura().getEstatus());
		        notaService.save(nota);
			}
			String pais = "MX";
	        Rfc rfc = new Rfc(folio, anio, request.getInformacionFiscal().getCalle(), request.getInformacionFiscal().getColonia(), 
	        		request.getInformacionFiscal().getCodigoPostal(), request.getInformacionFiscal().getCiudad(), pais, 
	        		request.getInformacionFiscal().getRfc(), request.getInformacionFiscal().getNoExterior(), 
	        		request.getInformacionFiscal().getNoInterior(), request.getInformacionFiscal().getEstado(),
	        		request.getInformacionFiscal().getIdRegimenFiscal(), request.getInformacionFiscal().getIdUsoCfdi());
	        rfcService.save(rfc);
	        if (request.getFolioSides() != null && !request.getFolioSides().equals(0)) {
	        	Sides sides = new Sides(sidesService.findMaxIdSides(), request.getIdDistribuidor(), request.getFolioSides(), folio, anio);
		        sidesService.save(sides);
			}
			return new Response<String>(MessageResponse.SUCCESS_SAVE, tramite.getFolio());
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new Response<String>(9002, ErrorResponse.RECORD_NOT_SAVE, e.getMessage());
		}
	}
	
	private Integer generaEstatusInicial(String grupo, int idRegionUsuario, String centro, int idPuesto, Double total) {
		if ("CORPORATIVO".equals(grupo) && idRegionUsuario != 9 && !centro.contains("TELE")) {
			if (idPuesto == 1) {
				return Constantes.ESTATUS_RV;
			} else if (idPuesto == 2) {
				if (total >= 5000) {
					return Constantes.ESTATUS_RJ;
				} else {
					return Constantes.ESTATUS_CC;
				}
			} else if (idPuesto == 3) {
				if (total >= 10000) {
					return Constantes.ESTATUS_RG;
				} else {
					return Constantes.ESTATUS_CC;
				}
			}
		} else if ("COBRANZA".equals(grupo) && idRegionUsuario != 9) {
			if(idPuesto >= 1 && idPuesto <= 3){
				return Constantes.ESTATUS_RJ;
			}
		}
		return Constantes.ESTATUS_RV;
	}
}
