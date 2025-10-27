package mx.com.telcel.sipab.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = "SIPAB4_CLAVES_BATCH")
public @Data class ClaveBatch {
	
	@Id
	@Column(name="ID_CLAVE_BATCH")
	private Integer idClaveBatch;
	@Column(name="ID_TIPO_TRAMITE")
	private Integer idtipoTramite;
	@Column(name="ID_GRUPO")
	private Integer idGrupo;
	@Column(name="ID_CONCEPTO")
	private Integer idConcepto;
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name= "ID_CONCEPTO")
//	private Concepto concepto;
	@Column(name="ID_REGION_USUARIO")
	private Integer idRegionUsuario;
	@Column(name="ID_REGION_CUENTA")
	private Integer idRegionCuenta;
	@Column(name="TIPO_BATCH")
	private String tipoBatch;
	@Column(name="CLAVE_BATCH")
	private Integer claveBatch;
	@Column(name="ID_TIPO_BON")
	private Integer idTipoBon;
	@Column(name="ID_BANCO")
	private Integer idBanco;
	
}
