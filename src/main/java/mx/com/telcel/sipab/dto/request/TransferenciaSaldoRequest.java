package mx.com.telcel.sipab.dto.request;

import lombok.Data;

public @Data class TransferenciaSaldoRequest {

	private AjusteRequest ajusteCreditoRequest;
	private AjusteRequest ajusteDebitoRequest;
	
}
