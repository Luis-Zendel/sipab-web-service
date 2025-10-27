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
import mx.com.telcel.sipab.models.TipoTramite;
import mx.com.telcel.sipab.models.Tramite;
import mx.com.telcel.sipab.models.TramiteDetalle;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class NotaCreditoFianzaService {

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

	public Response<String> notaCreditoFianza(NotasRequest request) {
		try {
			TipoTramite tipoTramite = tipoTramiteService.findByPrefijo("FIA");
			Long secuencia = secuenciaService.findByIdCentroAndTramite(request.getIdCentro(), tipoTramite.getPrefijo()).getValor();
			String folio = request.getPrefijo() + "-" + tipoTramite.getPrefijo() + "-" + secuencia;
			Integer anio = Calendar.getInstance().get(Calendar.YEAR);
			Integer idEstatus = generaEstatusInicialFianza(request.getGrupo(), request.getIdRegionUsuario(), request.getCentro(), request.getIdPuesto());
			Integer idFlujo = 0;
			idFlujo = obtieneFlujo(request.getIdRegionUsuario(), request.getGrupo());
			
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
		        Nota nota = new Nota(idTramiteDetalle, detalleFactura.getClaveBatch(), 
		        		/*3965*/detalleFactura.getClaveSap(), loteBatch, null, detalleFactura.getInvoiceDetailId(), 
		        		detalleFactura.getDescripcion(), detalleFactura.getClave(), request.getFactura().getFechaExpedicion(), 
		        		request.getFactura().getUuid(), request.getFactura().getNumeroFactura(), request.getFactura().getEstatus());
		        notaService.save(nota);
			}
			return new Response<String>(MessageResponse.SUCCESS_SAVE, tramite.getFolio());
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new Response<String>(9002, ErrorResponse.RECORD_NOT_SAVE, e.getMessage());
		}
	}
	
	public Integer generaEstatusInicialFianza(String grupo, int idRegionUsuario, String centro, int idPuesto) {
		if ("CORPORATIVO".equals(grupo) && idRegionUsuario != 9 && !centro.contains("TELE")) {
			if (idPuesto == 1) {
				return Constantes.ESTATUS_RV;
			} else if (idPuesto == 2) {
					return Constantes.ESTATUS_RJ;
			} else if (idPuesto == 3) {
					return Constantes.ESTATUS_RG;
			}
		} else if ("COBRANZA".equals(grupo) && idRegionUsuario != 9) {
			if(idPuesto >= 1 && idPuesto <= 3){
				return Constantes.ESTATUS_RJ;
			}
		}
		return Constantes.ESTATUS_RV;
	}
	
	private int obtieneFlujo(int idRegion, String grupo) {
		// R09 POR FIANZA
		if (idRegion == 9) {
			log.info("---> Nota por fianza R09");
			if (grupo.contains("CORPORATIVO")) {
				return 42;
			}
			return Constantes.ID_FLUJO_FIANZA_R09;
		} else
		// REGIONALES POR FIANZA
		if (idRegion != 9) {
			log.info("---> Nota por fianza Regionales");
			return Constantes.ID_FLUJO_FIANZA_REGIONALES;
		} else {
			return 0;
		}
	}
	
}
