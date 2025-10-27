package mx.com.telcel.sipab.dto.request;

import lombok.Data;
import mx.com.telcel.sipab.dto.response.Factura;
import mx.com.telcel.sipab.dto.response.InformacionFiscal;

public @Data class NotasRequest {

	private String numeroEmpleado;
	private String prefijo;
	private Integer idGrupo;
	private String grupo;
	private Integer idRegionUsuario;
	private Integer idCentro;
	private String centro;
	private Integer idPuesto;
	private Integer idSoporte;
	private String soporte;
	private Integer idMotivo;
	private String motivo;
	private String observaciones;
	private Integer idRegionCuenta;
	private Long cuenta;
	private String telefono;
	private String cliente;
	private Long ciclo;
	private InformacionFiscal informacionFiscal;
	private Factura factura;
	private Integer folioSides;
	private Integer idDistribuidor;
	private String tipoCaptura;
	
}
