package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "SIPAB4_CONCEPTOS")
public @Data class Concepto {

	@Id
	@Column(name="ID_CONCEPTO")
	private Integer idConcepto;
	@Column(name="DESC_CONCEPTO")
	private String descripcion;
	@Column(name="TRAMITE")
	private String tramite;
	@Column(name="ESTATUS")
	private String estatus;
	@Column(name="PLATAFORMA")
	private String plataforma;
	@Column(name="ID_CLAVE_BATCH")
	private Integer idClaveBatch;
	
}
