package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_MOTIVOS)
public @Data class Motivo {

	@Id
    @Column(name = DatabaseConstant.TB_MOTIVOS_ID)
    private Integer idMotivo;

    @Column(name = DatabaseConstant.TB_MOTIVOS_ID_REG)
    private Integer idReg;

    @Column(name = DatabaseConstant.TB_MOTIVOS_ID_SUMOTIVO)
    private Integer idSubMotivo;

    @Column(name = DatabaseConstant.TB_MOTIVOS_DESC_MOTIVO)
    private String descripcion;

    @Column(name = DatabaseConstant.TB_MOTIVOS_DESC_SUBM)
    private String descSubMotivo;

    @Column(name = DatabaseConstant.TB_MOTIVOS_ESTATUS)
    private String estatus;

    @Column(name = DatabaseConstant.TB_MOTIVOS_TIPO_TRAMITE)
    private Integer tipoTramite;

    @Column(name = DatabaseConstant.TB_MOTIVOS_ID_REGION)
    private Integer region;
}
