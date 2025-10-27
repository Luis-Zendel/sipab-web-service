package mx.com.telcel.sipab.models;

import java.io.Serializable;

import lombok.Data;

public @Data class LlaveDetalleSap implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idTramiteDetalle;
	private int materialSap;

}
