package mx.com.telcel.sipab.dto.request;

import lombok.Data;

public @Data class AjusteRequest {

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
	private Double importe;
	private Integer idTipoBonificacion;
	private Integer idTipoAjuste;
	
}
