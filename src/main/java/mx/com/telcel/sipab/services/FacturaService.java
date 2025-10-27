package mx.com.telcel.sipab.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.client.cbs.InvoiceDetailType;
import mx.com.telcel.sipab.client.cbs.InvoiceInfoQueryInvoiceType;
import mx.com.telcel.sipab.client.cbs.QueryInvoiceResponse;
import mx.com.telcel.sipab.client.coldview.FacturaCFD;
import mx.com.telcel.sipab.client.coldview.RetrieveDocumentListByIndexCFDIResponse;
import mx.com.telcel.sipab.constant.ErrorResponse;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.dto.request.DetalleFacturaRequest;
import mx.com.telcel.sipab.dto.request.FechasFacturaRequest;
import mx.com.telcel.sipab.dto.response.DetalleFactura;
import mx.com.telcel.sipab.dto.response.Factura;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class FacturaService {
	
	@Autowired
	private CbsClientService cbsClientService;
	@Autowired
	private ColdviewClientService coldviewClientService;
	
	public Response<List<Factura>> consultaFechas (FechasFacturaRequest facturaRequest) {
		List<Factura> facturas = new ArrayList<>();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date hoy = new Date();
		String fechaInicial = facturaRequest.isAnioActual() ? "20240101000000" : "20200101000000";
		String fechaFinal = simpleDateFormat.format(hoy);
		QueryInvoiceResponse queryInvoiceResponse = cbsClientService.queryInvoice(String.valueOf(facturaRequest.getCuenta()), fechaInicial, fechaFinal, null);
		if (queryInvoiceResponse.getQueryInvoiceResponse() == null) {
			return new Response<List<Factura>>(ErrorResponse.RECORDS_NOT_FOUND, null);
		}
		
		for (InvoiceInfoQueryInvoiceType invoiceInfoQueryInvoiceType : queryInvoiceResponse.getQueryInvoiceResponse().getInvoiceInfo()) {
			Factura factura = new Factura();
//			factura.setCuenta(Long.valueOf(invoiceInfoQueryInvoiceType.getAcctCode()));
//			factura.setInvoiceId(invoiceInfoQueryInvoiceType.getInvoiceID());
			factura.setNumeroFactura(invoiceInfoQueryInvoiceType.getInvoiceNo());
//			factura.setCiclo(Long.valueOf(invoiceInfoQueryInvoiceType.getBillCycleID()));
//			factura.setTotal(invoiceInfoQueryInvoiceType.getInvoiceAmount());
//			factura.setImporte(invoiceInfoQueryInvoiceType.getOpenAmount());
//			factura.setOpenAmount(invoiceInfoQueryInvoiceType.getOpenAmount());
//			factura.setIva(invoiceInfoQueryInvoiceType.getTaxAmount());
			try {
				factura.setFechaFactura(simpleDateFormat.parse(invoiceInfoQueryInvoiceType.getInvoiceDate()));
			} catch (ParseException e) {
				log.error(e.getMessage());
			}
//			factura.setEstatus(invoiceInfoQueryInvoiceType.getStatus());
			facturas.add(factura);
					}
		
		return new Response<List<Factura>>(MessageResponse.SUCCESS_RETRIEVE, facturas);
	}
	
	public Response<Factura> detalle (DetalleFacturaRequest detalleFacturaRequest) {
		Factura factura = new Factura();
		List<DetalleFactura> detallesFactura = new ArrayList<>();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		QueryInvoiceResponse queryInvoiceResponse = cbsClientService.queryInvoice(String.valueOf(detalleFacturaRequest.getCuenta()), null, null, detalleFacturaRequest.getNumeroFactura());
		if (queryInvoiceResponse.getQueryInvoiceResponse() == null) {
			return new Response<Factura>(ErrorResponse.RECORD_NOT_FOUND, null);
		}
		InvoiceInfoQueryInvoiceType invoiceInfoQueryInvoiceType = queryInvoiceResponse.getQueryInvoiceResponse().getInvoiceInfo().get(0);
		factura.setCuenta(Long.valueOf(invoiceInfoQueryInvoiceType.getAcctCode()));
		factura.setInvoiceId(invoiceInfoQueryInvoiceType.getInvoiceID());
		factura.setNumeroFactura(invoiceInfoQueryInvoiceType.getInvoiceNo());
		factura.setCiclo(Long.valueOf(invoiceInfoQueryInvoiceType.getBillCycleID()));
		factura.setTotal(invoiceInfoQueryInvoiceType.getInvoiceAmount());
		factura.setImporte(invoiceInfoQueryInvoiceType.getOpenAmount());
		factura.setOpenAmount(invoiceInfoQueryInvoiceType.getOpenAmount());
		factura.setIva(invoiceInfoQueryInvoiceType.getTaxAmount());
		try {
			factura.setFechaFactura(simpleDateFormat.parse(invoiceInfoQueryInvoiceType.getInvoiceDate()));
		} catch (ParseException e) {
			log.error(e.getMessage());
		}
		factura.setEstatus(invoiceInfoQueryInvoiceType.getStatus());
		boolean isOpen = factura.getOpenAmount()>0?true:false;
		for (InvoiceDetailType invoiceDetailType : invoiceInfoQueryInvoiceType.getInvoiceDetail()) {
			DetalleFactura detalleFactura = new DetalleFactura();
			
			detalleFactura.setDescripcion(invoiceDetailType.getChargeCode());
			detalleFactura.setClave(invoiceDetailType.getChargeCode());
			detalleFactura.setTipoServicio(invoiceDetailType.getChargeCodeGroup());
			if (!detalleFacturaRequest.isNota()) {
//				detalleFactura.setTotal(invoiceDetailType.getChargeAmount());
				detalleFactura.setTotal(Double.valueOf(invoiceDetailType.getChargeAmount()));
			}
			else {
//				detalleFactura.setTotal(isOpen?invoiceDetailType.getOpenAmount():invoiceDetailType.getChargeAmount());
				detalleFactura.setTotal(Double.valueOf(isOpen?invoiceDetailType.getOpenAmount():invoiceDetailType.getChargeAmount()));
			}
			detalleFactura.setIva(invoiceDetailType.getTaxAmount()!=0?0.16:0.0);
			detalleFactura.setImporte(detalleFactura.getIva()==0?detalleFactura.getTotal():(detalleFactura.getTotal()/1.16));
			detalleFactura.setImporte(new BigDecimal(detalleFactura.getImporte()/1000000.0).setScale(2,RoundingMode.HALF_UP).doubleValue());
//			detalleFactura.setImporteString(null);
			detalleFactura.setInvoiceDetailId(invoiceDetailType.getInvoiceID());
			detalleFactura.setOfferingId(invoiceDetailType.getOfferingID()==null?0:invoiceDetailType.getOfferingID());
			if (detalleFactura.getTipoServicio() != null && (
					detalleFactura.getTipoServicio().toLowerCase().equals("C_Telecommunication_Services".toLowerCase()) || 
					detalleFactura.getTipoServicio().toLowerCase().equals("C_Telcel_Service_Subscription".toLowerCase()) ||
					detalleFactura.getTipoServicio().toLowerCase().equals("C_Third_Party_Subscription".toLowerCase()) ||
					detalleFactura.getTipoServicio().toLowerCase().equals("C_fourth_Party_Subscription".toLowerCase()))) {
				if(detalleFactura.getImporte()!=0.0) {
					detallesFactura.add(detalleFactura);
				}
			}
		}
		if (detallesFactura.size() > 0) {
			factura.setDetallesFactura(detallesFactura);
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(factura.getFechaFactura());
		calendar.add(Calendar.DAY_OF_YEAR, 5);
		Date fechaFin = calendar.getTime();
		RetrieveDocumentListByIndexCFDIResponse retrieveDocumentListByIndexCFDIResponse = coldviewClientService.retrieveDocumentListByIndexCFDI(factura.getCuenta(), factura.getNumeroFactura(), factura.getFechaFactura(), fechaFin);
		
		for (FacturaCFD facturaCFD : retrieveDocumentListByIndexCFDIResponse.getRequestResultsInvoiceList().getInvoiceDetails().getFacturaCFD()) {
			if (Long.valueOf(facturaCFD.getFolio()).equals(Long.valueOf(factura.getNumeroFactura()))) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				factura.setUuid(facturaCFD.getUUID());
				try {
					factura.setFechaExpedicion(sdf.parse(facturaCFD.getFechaExpedicion()));
				} catch (ParseException e) {
					log.error(e.getMessage());
				}
				break;
			}
		}
		if (factura.getUuid() == null || factura.getUuid().equals("")) {
			log.error("No hay factura en coldview");
			return new Response<Factura>("No hay factura en coldview", null);
		}
		return new Response<Factura>(MessageResponse.SUCCESS_RETRIEVE, factura);
	}

}
