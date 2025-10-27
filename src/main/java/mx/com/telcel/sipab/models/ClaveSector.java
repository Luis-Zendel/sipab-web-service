package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "SIPAB4_CLAVES_SECTOR")
public @Data class ClaveSector {

	@Id
	@Column(name="ID_SECTOR")
	private Integer idSector;
	@Column(name="ID_REGION")
	private Integer idRegion;
	@Column(name="DESC_SECTOR")
	private String descSector;
	@Column(name="DETALLE_SECTOR")
	private String detalle;
	
}
