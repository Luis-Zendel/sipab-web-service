package mx.com.telcel.sipab.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.Constantes;
import mx.com.telcel.sipab.constant.ErrorResponse;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.dto.request.AjusteRequest;
import mx.com.telcel.sipab.dto.request.BonificacionRequest;
import mx.com.telcel.sipab.models.Bonificacion;
import mx.com.telcel.sipab.models.TipoTramite;
import mx.com.telcel.sipab.models.Tramite;
import mx.com.telcel.sipab.models.TramiteDetalle;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class AjusteService {
	
	@Autowired
	private TipoTramiteService tipoTramiteService;
	@Autowired
	private SecuenciaService secuenciaService;
	@Autowired
	private TramiteService tramiteService;
	@Autowired
	private TramiteDetalleService tramiteDetalleService;

	public Response<String> ajusteCredito(AjusteRequest request) {
		try {
			TipoTramite tipoTramite = tipoTramiteService.findByPrefijo("AJC");
			Long secuencia = secuenciaService.findByIdCentroAndTramite(request.getIdCentro(), tipoTramite.getPrefijo()).getValor();
			String folio = request.getPrefijo() + "-" + tipoTramite.getPrefijo() + "-" + secuencia;
			Integer anio = Calendar.getInstance().get(Calendar.YEAR);
			Integer idEstatus = generaEstatusInicial(request.getGrupo(), request.getIdRegionUsuario(), request.getCentro(), request.getIdPuesto(), 
					request.getImporte()*1.16);
			Integer idFlujo = obtieneFlujo(request.getIdRegionUsuario(), request.getIdTipoAjuste(), request.getGrupo(), request.getCentro());
			
			Tramite tramite = new Tramite(folio, anio, idEstatus, request.getNumeroEmpleado(), request.getIdRegionUsuario(), request.getIdCentro(), 
					idFlujo, request.getIdSoporte(), request.getSoporte(), request.getIdMotivo(), request.getMotivo(), request.getObservaciones(), new Date());
			tramiteService.save(tramite);
			long idTramiteDetalle = tramiteDetalleService.findMaxIdTramiteDetalle();
			TramiteDetalle tramiteDetalle = new TramiteDetalle(idTramiteDetalle, folio, anio, tipoTramite.getIdTipoTramite(), request.getIdRegionCuenta(), request.getCuenta(), secuencia, 
					request.getTelefono(), request.getCliente(), request.getCiclo(), request.getImporte(), request.getImporte()*0.16, request.getImporte()*1.16);
			tramiteDetalleService.save(tramiteDetalle);
			
			
			return new Response<String>(MessageResponse.SUCCESS_SAVE, tramite.getFolio());
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new Response<String>(ErrorResponse.RECORD_NOT_SAVE, e.getMessage());
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
	
	private Integer obtieneFlujo(int idRegion, int idClaveBatchTipoAjuste, String grupo, String centro) {
		if(grupo.contains("CORPORATIVO") || centro.contains("CAE ")){
			if(idRegion != 9){
				return Constantes.ID_FLUJO_CORPORATIVO_REGIONALES;
			}
			return Constantes.ID_FLUJO_CORPORATVO_R09;
		}
		if(idRegion == 9 && idClaveBatchTipoAjuste == Constantes.ID_TIPO_AJUSTE_CREDITO){
			log.info("---> Ajuste de credito R09");
			return Constantes.ID_FLUJO_AJUSTE_R09;
		}else
		if(idRegion == 9 && idClaveBatchTipoAjuste != Constantes.ID_TIPO_AJUSTE_CREDITO){
			log.info("---> Ajuste de credito otros tramites R09");
			return Constantes.ID_FLUJO_AJUSTE_OTROS_R09;
		}else
		if(idRegion != 9){
			log.info("---> Ajuste de credito de regionales");
			return Constantes.ID_FLUJO_AJUSTE_REGIONALES;
		}
		
		return 0;
	}
	
}
