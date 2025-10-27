package mx.com.telcel.sipab.dto.request;

import lombok.Data;

public @Data class FechasFacturaRequest {
	
	private Long cuenta;
    private boolean anioActual;
    
}
