package mx.com.telcel.sipab.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_PUESTO)
public @Data class Puesto {
	
	@Id
    @Column(name = DatabaseConstant.TB_PUESTO_ID_PUESTO)
    private Integer idPuesto;

    @Column(name = DatabaseConstant.TB_PUESTO_ID_REGION)
    private Integer idRegion;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = DatabaseConstant.TB_PUESTO_ID_GRUPO)
    private Grupo grupo;

    @Column(name = DatabaseConstant.TB_PUESTO_ID_ROL)
    private Integer idRol;

    @Column(name = DatabaseConstant.TB_PUESTO_DESC_PUESTO)
    private String descripcion;

}
