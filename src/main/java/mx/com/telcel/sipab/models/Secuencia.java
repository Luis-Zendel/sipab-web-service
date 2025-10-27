package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SIPAB4_SECUENCIAS")
public @Data class Secuencia {
	
	@Id
    @Column(name="ID_SECUENCIAS")
	private Integer idSecuencia;
	@Column(name="ID_CENTRO")
	private Integer idCentro;
	@Column(name="TRAMITE")
	private String tramite;
	@Column(name="VALOR")
	private Long valor;
	
}