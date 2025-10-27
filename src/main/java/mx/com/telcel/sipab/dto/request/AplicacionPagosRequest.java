package mx.com.telcel.sipab.dto.request;

import java.util.Date;

import lombok.Data;

public @Data class AplicacionPagosRequest {

	private String numeroEmpleado;
	private String prefijo;
	private Integer idGrupo;
	private String grupo;
	private Integer idRegionUsuario;
	private Integer idCentro;
	private String centro;
	private Integer idSoporte;
	private String soporte;
	private String observaciones;
	private Integer idRegionCuenta;
	private Long cuenta;
	private String telefono;
	private String cliente;
	private Long ciclo;
	private Double importe;
	private Integer idFormaPago;
	private Date fechaPago;
	private Integer idOrigenPago;
	private Integer idTipoPago;
	
}
