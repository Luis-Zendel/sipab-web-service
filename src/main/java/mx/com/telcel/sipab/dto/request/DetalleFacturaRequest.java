package mx.com.telcel.sipab.dto.request;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

public @Data class DetalleFacturaRequest {

	private Long cuenta;
    @DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
    private Date fechaInicial;
    @DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
    private Date fechaFinal;
    private String numeroFactura;
    private boolean nota;
    
}
