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
public class NotaCargoService {

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

	public Response<String> notaCargo(NotasRequest request) {
		try {
			TipoTramite tipoTramite = tipoTramiteService.findByPrefijo("NCA");
			Long secuencia = secuenciaService.findByIdCentroAndTramite(request.getIdCentro(), tipoTramite.getPrefijo()).getValor();
			String folio = request.getPrefijo() + "-" + tipoTramite.getPrefijo() + "-" + secuencia;
			Integer anio = Calendar.getInstance().get(Calendar.YEAR);
			Integer idEstatus = generaEstatusInicial(request.getGrupo(), request.getIdRegionUsuario(), request.getCentro(), request.getIdPuesto(), request.getFactura().getTotal());
			Integer idFlujo = 0;
			idFlujo = obtieneFlujo(request.getGrupo(), request.getIdRegionUsuario(), request.getCentro(), request.getFolioSides() == null ? false : true);
			
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
		        		detalleFactura.getClaveSap(), loteBatch, null, detalleFactura.getInvoiceDetailId(), 
		        		detalleFactura.getDescripcion(), detalleFactura.getClave(), request.getFactura().getFechaExpedicion(), 
		        		request.getFactura().getUuid(), request.getFactura().getNumeroFactura(), request.getFactura().getEstatus());
		        notaService.save(nota);
			}
			if (request.getInformacionFiscal() != null) {
				String pais = "MX";
		        Rfc rfc = new Rfc(folio, anio, request.getInformacionFiscal().getCalle(), request.getInformacionFiscal().getColonia(), 
		        		request.getInformacionFiscal().getCodigoPostal(), request.getInformacionFiscal().getCiudad(), pais, 
		        		request.getInformacionFiscal().getRfc(), request.getInformacionFiscal().getNoExterior(), 
		        		request.getInformacionFiscal().getNoInterior(), request.getInformacionFiscal().getEstado(),
		        		request.getInformacionFiscal().getIdRegimenFiscal(), request.getInformacionFiscal().getIdUsoCfdi());
		        rfcService.save(rfc);
			}
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
	
	private Integer obtieneFlujo(String grupo, int idRegionUsuario, String centro, boolean cargoDAT) {
		// CORPORTATIVOS
		if (grupo.contains("CORPORATIVO") || centro.contains("CAE ")) {
			if (idRegionUsuario != 9) {
				return Constantes.ID_FLUJO_CORPORATIVO_REGIONALES;
			}
			return Constantes.ID_FLUJO_CORPORATVO_R09;
		}
		// R09
		if (idRegionUsuario == 9 && !cargoDAT) {
			log.info("---> Nota de Cargo R09");
			return Constantes.ID_FLUJO_CARGO_R09;
		} else
		// REGIONALES
		if (idRegionUsuario != 9 && !cargoDAT) {
			log.info("---> Nota de Cargo Regionales");
			return Constantes.ID_FLUJO_CARGO_REGIONALES;
		} else 
		if (idRegionUsuario != 9 && cargoDAT) {
			log.info("---> Nota de Cargo Regionales");
			return Constantes.ID_FLUJO_CARGO_REGIONALES;
		}
		// R09 con folio SIDES
		if (idRegionUsuario == 9 && cargoDAT) {
			log.info("---> Nota de Cargo por folio SIDES R09");
			return Constantes.ID_FLUJO_CARGO_FOLIO_SIDES_R09;
		} else {
			return 0;
		}
	}
	
}
