package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_ESTATUS)
public @Data class Estatus {

	@Id
    @Column(name = DatabaseConstant.TB_ESTATUS_ID)
    private Integer idEstatus;

    @Column(name = DatabaseConstant.TB_ESTATUS_DESC)
    private String descripcion;

    @Column(name = DatabaseConstant.TB_ESTATUS_ORIGEN)
    private String origen;

    @Column(name = DatabaseConstant.TB_ESTATUS_COD)
    private String codigo;
    
}
