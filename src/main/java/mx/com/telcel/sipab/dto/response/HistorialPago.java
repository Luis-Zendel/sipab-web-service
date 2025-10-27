package mx.com.telcel.sipab.dto.response;

import lombok.Data;

public @Data class HistorialPago {

	private Double monto;
	private String fechaAplicacion;
	private String origenPagoCorto;
	private String origenPagoLargo;
	private String estatusPago;
	private String formaPago;
	private String extTransId;
	private Long numeroBatch;
	private Long secuenciaPago; 
	private Integer numeroRegistro;
	
}
