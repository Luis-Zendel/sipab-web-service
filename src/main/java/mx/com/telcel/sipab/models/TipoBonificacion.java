package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "SIPAB4_TIPO_BONIFICACION")
public @Data class TipoBonificacion {
	
	@Id
	@Column(name="ID_TIPO_BON")
	private Integer idTipoBonificacion;
	@Column(name="CVE_TIPO_BON")
	private String clave;
	@Column(name="DESC_TIPO_BON")
	private String descripcion;

}
