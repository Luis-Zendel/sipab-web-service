package mx.com.telcel.sipab.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_DISTRIBUIDORES)
public @Data class Distribuidor {

	@Id
    @Column(name = DatabaseConstant.TB_DISTRIBUIDORES_ID)
    private Integer idDistribuidor;

    @Column(name = DatabaseConstant.TB_DISTRIBUIDORES_DESC)
    private String descripcion;

    @Column(name = DatabaseConstant.TB_DISTRIBUIDORES_ESTATUS)
    private String estatus;

    @Column(name = DatabaseConstant.TB_DISTRIBUIDORES_CVE_USUARIO)
    private String cveUsuario;

    @Column(name = DatabaseConstant.TB_DISTRIBUIDORES_FECHA_ALTA)
    private Date fechaAlta;

    @Column(name = DatabaseConstant.TB_DISTRIBUIDORES_ID_REGION)
    private Integer idRegion;
}
