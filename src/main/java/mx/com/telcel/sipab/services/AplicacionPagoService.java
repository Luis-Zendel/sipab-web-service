package mx.com.telcel.sipab.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.Constantes;
import mx.com.telcel.sipab.constant.ErrorResponse;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.dto.request.AplicacionPagosRequest;
import mx.com.telcel.sipab.models.FormaPago;
import mx.com.telcel.sipab.models.OrigenPago;
import mx.com.telcel.sipab.models.Pago;
import mx.com.telcel.sipab.models.TipoPago;
import mx.com.telcel.sipab.models.TipoTramite;
import mx.com.telcel.sipab.models.Tramite;
import mx.com.telcel.sipab.models.TramiteDetalle;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class AplicacionPagoService {
	
	@Autowired
	private TipoTramiteService tipoTramiteService;
	@Autowired
	private SecuenciaService secuenciaService;
	@Autowired
	private FormaPagoService formaPagoService;
	@Autowired
	private OrigenPagoService origenPagoService;
	@Autowired
	private TipoPagoService tipoPagoService;
	@Autowired
	private TramiteService tramiteService;
	@Autowired
	private TramiteDetalleService tramiteDetalleService;
	@Autowired
	private PagoService pagoService;

	public Response<String> aplicacionPago(AplicacionPagosRequest request) {
		try {
			TipoTramite tipoTramite = tipoTramiteService.findByPrefijo("APA");
			Long secuencia = secuenciaService.findByIdCentroAndTramite(request.getIdCentro(), tipoTramite.getPrefijo()).getValor();
			String folio = request.getPrefijo() + "-" + tipoTramite.getPrefijo() + "-" + secuencia;
			Integer anio = Calendar.getInstance().get(Calendar.YEAR);
			Integer idEstatus = (request.getGrupo().contains("CORPORATIVO") && request.getIdRegionUsuario() == 9 ? Constantes.ESTATUS_RJ : Constantes.ESTATUS_RV);
			Integer idFlujo = 0;
			if(request.getIdRegionUsuario() == 9){
				idFlujo = Constantes.FLUJO_PAGOS_R09;
			}else{
				idFlujo = Constantes.FLUJO_PAGOS_REGIONAL;
			}
			if(request.getGrupo().contains("CORPORATIVO") || request.getCentro().contains("CAE ")){
				idFlujo = Constantes.FLUJO_PAGOS_REV_COR;
				if(request.getIdRegionUsuario() != 9){
					idFlujo = Constantes.ID_FLUJO_CORPORATIVO_REGIONALES;
				}
			}
			Integer idMotivo = 14;
			
			FormaPago formaPago = formaPagoService.findByIdFormaPago(request.getIdFormaPago());
			OrigenPago origenPago = origenPagoService.findByIdOrigenPago(request.getIdOrigenPago());
			TipoPago tipoPago = tipoPagoService.findByIdTipoPago(request.getIdTipoPago());
		
		
			Tramite tramite = new Tramite(folio, anio, idEstatus, request.getNumeroEmpleado(), request.getIdRegionUsuario(), request.getIdCentro(), idFlujo
					, request.getIdSoporte(), request.getSoporte(), idMotivo, null, request.getObservaciones(), new Date());
			long idTramiteDetalle = tramiteDetalleService.findMaxIdTramiteDetalle();
			TramiteDetalle tramiteDetalle = new TramiteDetalle(idTramiteDetalle, folio, anio, tipoTramite.getIdTipoTramite(), request.getIdRegionCuenta(), 
					request.getCuenta(), secuencia, request.getTelefono(), request.getCliente(), request.getCiclo(), request.getImporte(), 0.0, 
					request.getImporte());
			tramiteService.save(tramite);
			tramiteDetalleService.save(tramiteDetalle).getIdTramiteDetalle();
			idTramiteDetalle = tramiteDetalleService.findMaxIdTramiteDetalle(folio, anio);
			Pago pago = new Pago(idTramiteDetalle, formaPago.getClave(), request.getFechaPago(), origenPago.getOrigenLargo(), origenPago.getOrigenCorto(), 
					null, Long.valueOf(0), 0, 0, tipoPago.getClavePago(), null);
			pagoService.save(pago);
			return new Response<String>(MessageResponse.SUCCESS_SAVE, tramite.getFolio());
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new Response<String>(9002, ErrorResponse.RECORD_NOT_SAVE, e.getMessage());
		}
	}
}
