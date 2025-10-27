package mx.com.telcel.sipab.dto.request;

import lombok.Data;

public @Data class TransferenciaSaldosBonificacionRequest {

	private TransferenciaSaldoRequest transferenciaSaldoRequest;
	private BonificacionRequest bonificacionRequest;
	
}
