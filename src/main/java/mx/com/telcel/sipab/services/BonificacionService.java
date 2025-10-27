package mx.com.telcel.sipab.services;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.client.interfaces.InvoiceItemExInfoType;
import mx.com.telcel.sipab.client.interfaces.QueryUnpaidInvoiceItemResponse;
import mx.com.telcel.sipab.constant.Constantes;
import mx.com.telcel.sipab.constant.ErrorResponse;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.dto.request.BonificacionRequest;
import mx.com.telcel.sipab.dto.response.DetalleOrden;
import mx.com.telcel.sipab.models.Bonificacion;
import mx.com.telcel.sipab.models.TipoTramite;
import mx.com.telcel.sipab.models.Tramite;
import mx.com.telcel.sipab.models.TramiteDetalle;
import mx.com.telcel.sipab.repositories.BonificacionRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class BonificacionService {
	
	@Autowired
	BonificacionRepository repository;
	@Autowired
	private TipoTramiteService tipoTramiteService;
	@Autowired
	private SecuenciaService secuenciaService;
	@Autowired
	private TramiteService tramiteService;
	@Autowired
	private TramiteDetalleService tramiteDetalleService;
	@Autowired
	private InterfacesClientService interfacesClientService;
	
	public Response<List<DetalleOrden>> conceptosPorOrden(String orden) {
//		QueryUnpaidInvoiceItemResponse queryUnpaidInvoiceItemResponse = interfacesClientService.queryUnpaidInvoiceItemResponse(orden);
//		List<InvoiceItemExInfoType> lista = queryUnpaidInvoiceItemResponse.getQueryUnpaidInvoiceItemResponse().getInvoiceItem();
		return null;
	}

	public Response<String> bonificaciones(BonificacionRequest request) {
		try {
			TipoTramite tipoTramite = tipoTramiteService.findByPrefijo("BON");
			Long secuencia = secuenciaService.findByIdCentroAndTramite(request.getIdCentro(), tipoTramite.getPrefijo()).getValor();
			String folio = request.getPrefijo() + "-" + tipoTramite.getPrefijo() + "-" + secuencia;
			Integer anio = Calendar.getInstance().get(Calendar.YEAR);
			Integer idEstatus = generaEstatusInicial(request.getGrupo(), request.getIdRegionUsuario(), request.getCentro(), request.getIdPuesto(), 
					request.getImporte()*1.16);
			Integer idFlujo = obtieneFlujo(request.getIdRegionUsuario(), request.getGrupo(), request.getCentro());
			
			Tramite tramite = new Tramite(folio, anio, idEstatus, request.getNumeroEmpleado(), request.getIdRegionUsuario(), request.getIdCentro(), 
					idFlujo, request.getIdSoporte(), request.getSoporte(), request.getIdMotivo(), request.getMotivo(), request.getObservaciones(), new Date());
			tramiteService.save(tramite);
			long idTramiteDetalle = tramiteDetalleService.findMaxIdTramiteDetalle();
			TramiteDetalle tramiteDetalle = new TramiteDetalle(idTramiteDetalle, folio, anio, tipoTramite.getIdTipoTramite(), request.getIdRegionCuenta(), request.getCuenta(), secuencia, 
					request.getTelefono(), request.getCliente(), request.getCiclo(), request.getImporte(), request.getImporte()*0.16, request.getImporte()*1.16);
			tramiteDetalleService.save(tramiteDetalle);
			Bonificacion bonificacion = new Bonificacion(idTramiteDetalle, request.getIdTipoBonificacion(), request.getIdConcepto(), 
					request.getConcepto(), request.getSesionDerechos() ? "S" : "N", request.getAFavor(), request.getIdBanco(), request.getNumeroTarjeta(), 
					request.getCuentaClabe());
			repository.save(bonificacion);
			
			return new Response<String>(MessageResponse.SUCCESS_SAVE, tramite.getFolio());
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new Response<String>(ErrorResponse.RECORD_NOT_SAVE, e.getMessage());
		}
	}
	
	public Integer generaEstatusInicial(String grupo, int idRegionUsuario, String centro, int idPuesto, double total) {
		if ("CORPORATIVO".equals(grupo) && idRegionUsuario != 9 && !grupo.contains("TELE")) {
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
	
	private int obtieneFlujo(int idRegion, String grupo, String centro) {
		int idFlujo = 0;
		if (idRegion == 9) {
			idFlujo = Constantes.ID_FLUJO_AJUSTE_R09;
		} else {
			idFlujo = Constantes.ID_FLUJO_AJUSTE_REGIONALES;
		}
		if(grupo.contains("CORPORATIVO") || centro.contains("CAE ")){
			idFlujo = Constantes.ID_FLUJO_CORPORATVO_R09;
			if(idRegion != 9){
				idFlujo = Constantes.ID_FLUJO_CORPORATIVO_REGIONALES;
			}
		}
		return idFlujo;
	}
}
