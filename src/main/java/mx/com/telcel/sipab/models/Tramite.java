package mx.com.telcel.sipab.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "SIPAB_C_TRAMITE")

@Entity(name = "SIPAB4_TRAMITES")
@IdClass(LlaveTramite.class)
public @Data class Tramite {
	@Id
//	@Column(name="ID_TRAMITE")
//	private String idTramite;
	@Column(name="FOLIO")
	private String folio;
	@Id
	@Column(name="ANIO")
	private Integer anio;
	@Column(name="ID_ESTATUS")
	private Integer idEstatus;
	@Column(name="NUMERO_EMPLEADO")
	private String numeroEmpleado;
//	@Column(name="ID_REGION_USUARIO")
	@Column(name="ID_REGION")
	private Integer idRegionUsuario;
	@Column(name="ID_CENTRO")
	private Integer idCentro;
	@Column(name="ID_FLUJO")
	private Integer idFlujo;
	@Column(name="ID_SOPORTE")
	private Integer idSoporte;
	@Column(name="SOPORTE")
	private String soporte;
	@Column(name="ID_MOTIVO")
	private Integer idMotivo;
	@Column(name="MOTIVO")
	private String motivo;
	@Column(name="OBSERVACIONES")
	private String observaciones;
	@Column(name="FECHA_CREACION")
	private Date fechaCreacion;
	
}
