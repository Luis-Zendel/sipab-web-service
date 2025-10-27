package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_USO_CFDI)
public @Data class UsoCfdi {

	@Id
    @Column(name = DatabaseConstant.TB_USO_CFDI_ID)
    private Integer idUsoCfdi;
    @Column(name = DatabaseConstant.TB_USO_CFDI_REGIMEN_FISCAL)
    private String usoCfdi;
    @Column(name = DatabaseConstant.TB_USO_CFDI_DESCRIPCION)
    private String descripcion;
    @Column(name = DatabaseConstant.TB_USO_CFDI_FISICA)
    private String fisica;
    @Column(name = DatabaseConstant.TB_USO_CFDI_MORAL)
    private String moral;
}
