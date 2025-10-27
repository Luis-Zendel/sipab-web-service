package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SIPAB4_SIDES")
public @Data class Sides {
	
	@Id
	@Column(name="ID_NOTA_SIDES")
	private Integer idSides;
	@Column(name="ID_DISTRIBUIDOR")
	private Integer idDistribuidor;
	@Column(name="FOLIO_SIDES")
	private Integer folioSides;
	@Column(name="FOLIO")
	private String folio;
	@Column(name="ANIO")
	private Integer anio;
//	@Column(name="ID_TIPO_TRAMITE")
//	private Integer idTipoTramite;

}
