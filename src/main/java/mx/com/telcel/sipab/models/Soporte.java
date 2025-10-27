package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_SOPORTE)
public @Data class Soporte {
	
	@Id
    @Column(name = DatabaseConstant.TB_SOPORTE_ID)
    private Integer idSoporte;

    @Column(name = DatabaseConstant.TB_SOPORTE_DESCRIPCION)
    private String descripcion;

}
