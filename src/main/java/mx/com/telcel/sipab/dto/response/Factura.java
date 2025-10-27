package mx.com.telcel.sipab.dto.response;

import java.util.Date;
import java.util.List;

import lombok.Data;

public @Data class Factura {
	
	private Long cuenta;
	private Long invoiceId;
	private String numeroFactura;
	private Long ciclo;
	private double total;
	private double importe;
	private double openAmount;
	private double iva;
	private Date fechaFactura;
//	private String fechaFacturaString;
	private String estatus;
	private String uuid;
	private Date fechaExpedicion;
	private List<DetalleFactura> detallesFactura;

}
