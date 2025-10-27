package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SIPAB4_RFC")
@IdClass(LlaveTramite.class)
public @Data class Rfc {
	
	@Id
	@Column(name="FOLIO")
	private String folio;
	@Id
	@Column(name="ANIO")
	private int anio;
//	@Column(name="NOMBRE")
//	private String nombre;
	@Column(name="CALLE")
	private String calle;
	@Column(name="COLONIA")
	private String colonia;
	@Column(name="CP")
	private String codigoPostal;
	@Column(name="DELEGACION")
	private String delegacion;
	@Column(name="PAIS")
	private String pais;
	@Column(name="RFC")
	private String rfc;
	@Column(name="NUM_EXT")
	private String numeroExterior;
	@Column(name="NUM_INT")
	private String numeroInterior;
//	@Column(name="ID_TIPO_TRAMITE")
//	private Integer idTipoTramite;
	@Column(name="ESTADO")
	private String estado;
	@Column(name="ID_REGIMEN_FISCAL")
	private Integer idRegimenFiscal;
	@Column(name="ID_USO_CFDI")
	private Integer idUsoCfdi;
	
}
