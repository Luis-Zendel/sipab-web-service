package mx.com.telcel.sipab.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.client.cbs.PaymentInfoResType;
import mx.com.telcel.sipab.client.cbs.QueryPaymentLogResponse;
import mx.com.telcel.sipab.constant.Constantes;
import mx.com.telcel.sipab.constant.ErrorResponse;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.dto.request.ReversionPagosRequest;
import mx.com.telcel.sipab.dto.response.HistorialPago;
import mx.com.telcel.sipab.models.FormaPago;
import mx.com.telcel.sipab.models.OrigenPago;
import mx.com.telcel.sipab.models.Pago;
import mx.com.telcel.sipab.models.TipoTramite;
import mx.com.telcel.sipab.models.Tramite;
import mx.com.telcel.sipab.models.TramiteDetalle;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class ReversionPagoService {

	@Autowired
	PagoService pagoService;
	@Autowired
	private CbsClientService cbsClientService;
	@Autowired
	private TipoTramiteService tipoTramiteService;
	@Autowired
	private SecuenciaService secuenciaService;
	@Autowired
	private FormaPagoService formaPagoService;
	@Autowired
	private OrigenPagoService origenPagoService;
	@Autowired
	private TramiteService tramiteService;
	@Autowired
	private TramiteDetalleService tramiteDetalleService;
	
	public Response<List<HistorialPago>> historialPagos(Long cuenta) {
		List<HistorialPago> listaPagos = new ArrayList<>();
		QueryPaymentLogResponse queryPaymentLogResponse = cbsClientService.queryPaymentLog(String.valueOf(cuenta));
		for (PaymentInfoResType paymentInfoResType : queryPaymentLogResponse.getQueryPaymentLogResponse().getPaymentInfo()) {
			HistorialPago historialPago = new HistorialPago();
			historialPago.setMonto(paymentInfoResType.getTotalPaymentAmount() / Constantes.DIVISOR_IMPORTE);
			historialPago.setFechaAplicacion(paymentInfoResType.getPaymentTime());
			historialPago.setOrigenPagoCorto(paymentInfoResType.getPayChannelID());
			historialPago.setOrigenPagoLargo(paymentInfoResType.getPayChannelID());
			historialPago.setEstatusPago(paymentInfoResType.getStatus());
			historialPago.setFormaPago(paymentInfoResType.getPaymentMethod());
			historialPago.setNumeroBatch(Long.valueOf(paymentInfoResType.getTransID()));
			historialPago.setSecuenciaPago(Long.valueOf(paymentInfoResType.getTransID()));
			historialPago.setExtTransId(paymentInfoResType.getExtTransID());
			if (!listaPagos.contains(historialPago) && !historialPago.getEstatusPago().equals("R")) {
				listaPagos.add(historialPago);
			}
		}
		return new Response<List<HistorialPago>>(MessageResponse.SUCCESS_RETRIEVE, listaPagos);
	}
	
//	public Response<List<HistorialPago>> historialPagos(Long cuenta, List<String> metodosPago) {
//		List<HistorialPago> listaPagos = new ArrayList<>();
//		if (metodosPago.isEmpty()) {
//			metodosPago = Arrays.asList("1001");
//		}
//		for (String metodoPago : metodosPago) {
//			QueryPaymentLogResponse queryPaymentLogResponse = cbsClientService.queryPaymentLog(String.valueOf(cuenta));
//			for (PaymentInfoResType paymentInfoResType : queryPaymentLogResponse.getQueryPaymentLogResponse().getPaymentInfo()) {
//				HistorialPago historialPago = new HistorialPago();
//				historialPago.setMonto(paymentInfoResType.getTotalPaymentAmount() / Constantes.DIVISOR_IMPORTE);
//				historialPago.setFechaAplicacion(paymentInfoResType.getPaymentTime());
//				historialPago.setOrigenPagoCorto(paymentInfoResType.getPayChannelID());
//				historialPago.setOrigenPagoLargo(paymentInfoResType.getPayChannelID());
//				historialPago.setEstatusPago(paymentInfoResType.getStatus());
//				historialPago.setFormaPago(paymentInfoResType.getPaymentMethod());
//				historialPago.setNumeroBatch(Long.valueOf(paymentInfoResType.getTransID()));
//				historialPago.setSecuenciaPago(Long.valueOf(paymentInfoResType.getTransID()));
//				historialPago.setExtTransId(paymentInfoResType.getExtTransID());
//				if (!listaPagos.contains(historialPago) && !historialPago.getEstatusPago().equals("R")) {
//					listaPagos.add(historialPago);
//				}
//			}
//		}
//		return new Response<List<HistorialPago>>(MessageResponse.SUCCESS_RETRIEVE, listaPagos);
//	}
	
	public Response<String> reversionPago(ReversionPagosRequest request) {
		try {
			TipoTramite tipoTramite = tipoTramiteService.findByPrefijo("REV");
			Long secuencia = secuenciaService.findByIdCentroAndTramite(request.getIdCentro(), tipoTramite.getPrefijo()).getValor();
			String folio = request.getPrefijo() + "-" + tipoTramite.getPrefijo() + "-" + secuencia;
			Integer anio = Calendar.getInstance().get(Calendar.YEAR);
			Integer idEstatus = (request.getGrupo().contains("CORPORATIVO") && request.getIdRegionUsuario() == 9 ? Constantes.ESTATUS_RJ : Constantes.ESTATUS_RV);
			Integer idFlujo = 0;
			if(request.getIdRegionUsuario() == 9){
				idFlujo = Constantes.FLUJO_REVERSION_R09;
			}else{
				idFlujo = Constantes.FLUJO_REVERSION_REGIONAL;
			}
			if(request.getGrupo().contains("CORPORATIVO") || request.getCentro().contains("CAE ")){
				idFlujo = Constantes.FLUJO_PAGOS_REV_COR;
				if(request.getIdRegionUsuario() != 9){
					idFlujo = Constantes.ID_FLUJO_CORPORATIVO_REGIONALES;
				}
			}
		
			Tramite tramite = new Tramite(folio, anio, idEstatus, request.getNumeroEmpleado(), request.getIdRegionUsuario(), request.getIdCentro(), idFlujo
					, request.getIdSoporte(), request.getSoporte(), request.getIdMotivo(), request.getMotivo(), request.getObservaciones(), new Date());
			tramiteService.save(tramite);
			for (HistorialPago historialPago : request.getPagos()) {
				FormaPago formaPago = formaPagoService.findByIdFormaPago(Integer.valueOf(historialPago.getFormaPago()));
//				OrigenPago origenPago = origenPagoService.findByOrigenCorto(historialPago.getOrigenPagoCorto());
				long idTramiteDetalle = tramiteDetalleService.findMaxIdTramiteDetalle();
				TramiteDetalle tramiteDetalle = new TramiteDetalle(idTramiteDetalle, folio, anio, tipoTramite.getIdTipoTramite(), request.getIdRegionCuenta(), 
						request.getCuenta(), secuencia, request.getTelefono(), request.getCliente(), request.getCiclo(), historialPago.getMonto(), 0.00, 
						historialPago.getMonto());
				tramiteService.save(tramite);
				tramiteDetalleService.save(tramiteDetalle).getIdTramiteDetalle();
				idTramiteDetalle = tramiteDetalleService.findMaxIdTramiteDetalle(folio, anio);
				Pago pago = new Pago(idTramiteDetalle, formaPago.getClave(), convierteFechaAplicacion(historialPago.getFechaAplicacion()), 
						historialPago.getOrigenPagoLargo(), historialPago.getOrigenPagoCorto(), historialPago.getEstatusPago(), 
						historialPago.getSecuenciaPago(), 0, historialPago.getNumeroRegistro(), null, historialPago.getExtTransId());
				pagoService.save(pago);
			}
			return new Response<String>(MessageResponse.SUCCESS_SAVE, tramite.getFolio());
		} catch (Exception e) {
			return new Response<String>(9002, ErrorResponse.RECORD_NOT_SAVE, e.getMessage());
		}
	}
	
	private Date convierteFechaAplicacion(String fecha){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			return sdf.parse(fecha.substring(0,8));
		} catch (ParseException e) {
			log.info(e.getMessage());
			return new Date();
		}
	}
}
