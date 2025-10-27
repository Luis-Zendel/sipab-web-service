package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_CENTRO_COSTOS)
public @Data class CentroCostos {
	
	@Id
    @Column(name = DatabaseConstant.TB_CENTRO_COSTOS_ID)
    private Integer idCentro;

    @Column(name = DatabaseConstant.TB_CENTRO_COSTOS_ID_GRUPO)
    private Integer idGrupo;

    @Column(name = DatabaseConstant.TB_CENTRO_COSTOS_ID_REGION)
    private Integer idRegion;

    @Column(name = DatabaseConstant.TB_CENTRO_COSTOS_DESC)
    private String descripcion;

    @Column(name = DatabaseConstant.TB_CENTRO_COSTOS_PREFIJO)
    private String prefijo;

    @Column(name = DatabaseConstant.TB_CENTRO_COSTOS_ESTATUS)
    private String estatus;

    @Column(name = DatabaseConstant.TB_CENTRO_COSTOS_ID_GERENCIA)
    private Integer idGerencia;

    @Column(name = DatabaseConstant.TB_CENTRO_COSTOS_ID_SUBDIRECCION)
    private Integer idSubDireccion;

    @Column(name = DatabaseConstant.TB_CENTRO_COSTOS_ID_DIRECCION)
    private Integer idDireccion;

}
