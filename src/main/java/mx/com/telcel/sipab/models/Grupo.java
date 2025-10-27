package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_GRUPOS)
public @Data class Grupo {

	@Id
	@Column(name = DatabaseConstant.TB_GRUPOS_ID_GRUPO)
	private Integer idGrupo;
	
	@Column(name = DatabaseConstant.TB_GRUPOS_DESC_GRUPO)
	private String descripcion;
	
}
