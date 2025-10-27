package mx.com.telcel.sipab.models;

import java.io.Serializable;

import lombok.Data;

public @Data class LlaveTramite implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String folio;
	private int anio;

}
