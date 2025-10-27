package mx.com.telcel.sipab.dto.request;

import java.util.List;

import lombok.Data;
import mx.com.telcel.sipab.dto.response.HistorialPago;

public @Data class ReversionPagosRequest {
	
	private String numeroEmpleado;
	private String prefijo;
	private Integer idGrupo;
	private String grupo;
	private Integer idRegionUsuario;
	private Integer idCentro;
	private String centro;
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
	List<HistorialPago> pagos;

}
