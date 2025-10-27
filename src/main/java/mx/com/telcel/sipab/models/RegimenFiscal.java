package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_REGIMEN_FISCAL)
public @Data class RegimenFiscal {

	@Id
    @Column(name = DatabaseConstant.TB_REGIMEN_FISCAL_ID)
    private Integer idRegimenFiscal;
    @Column(name = DatabaseConstant.TB_REGIMEN_FISCAL_REGIMEN_FISCAL)
    private String regimenFiscal;
    @Column(name = DatabaseConstant.TB_REGIMEN_FISCAL_DESCRIPCION)
    private String descripcion;
    @Column(name = DatabaseConstant.TB_REGIMEN_FISCAL_FISICA)
    private String fisica;
    @Column(name = DatabaseConstant.TB_REGIMEN_FISCAL_MORAL)
    private String moral;
    
}
