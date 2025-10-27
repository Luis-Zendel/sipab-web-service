package mx.com.telcel.sipab.dto.request;

import lombok.Data;

public @Data class AjusteBonificacionRequest {

	private AjusteRequest ajusteRequest;
	private BonificacionRequest bonificacionRequest;
	
}
