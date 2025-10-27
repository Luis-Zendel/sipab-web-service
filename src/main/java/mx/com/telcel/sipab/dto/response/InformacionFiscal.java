package mx.com.telcel.sipab.dto.response;

import lombok.Data;

public @Data class InformacionFiscal {
	
	private String razonSocial;
	private String rfc;
	private String codigoPostal;
	private String calle;
	private String noExterior;
	private String noInterior;
	private String colonia;
	private String ciudad;
	private String estado;
	private String direccion;
	private Integer idRegimenFiscal;
	private Integer idUsoCfdi;
	
}
