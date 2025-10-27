package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "SIPAB4_CLAVES_SAP")
public @Data class ClaveSap {

	@Id
	@Column(name="ID_CLAVE_SAP")
	private Integer idClaveSap;
	@Column(name="ID_SECTOR")
	private Integer idSector;
	@Column(name="ID_ORIGEN_PAGOS")
	private Integer idOrigenPago;
	@Column(name="ID_SECCION")
	private Integer idSeccion;
	@Column(name="CLAVE_SAP")
	private Integer claveSap;
	@Column(name="DESCRIPCION")
	private String descripcion;
	@Column(name="TRAMITE")
	private String tramite;
	@Column(name="PLATAFORMA")
	private String plataforma;
	@Column(name="IEPS")
	private Integer ieps;
	@Column(name="CUENTA_CONTABLE")
	private Long cuentaContable;
	@Column(name="CUENTA_IEPS")
	private Long cuentaIeps;
	@Column(name="VERSION_SAP")
	private Integer versionSap;
	@Column(name="ESTATUS")
	private String estatus;
	@Column(name="ID_CLAVE_BATCH")
	private Integer idClaveBatch;
	@Column(name="CLAVE_BATCH")
	private String claveBatch;
	
}
