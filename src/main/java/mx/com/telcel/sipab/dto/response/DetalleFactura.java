package mx.com.telcel.sipab.dto.response;

import lombok.Data;

public @Data class DetalleFactura {

	private String descripcion;
	private String clave;
	private String tipoServicio;
	private Double importe;
	private Double iva;
	private Double total;
	private String importeString;
	private Long invoiceDetailId;
	private Integer offeringId;
	private Integer claveBatch;
	private Integer claveSap;
	
}
