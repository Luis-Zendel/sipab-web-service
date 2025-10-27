package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_TIPO_TRAMITE)
public @Data class TipoTramite {

	@Id
    @Column(name = DatabaseConstant.TB_TIPO_TRAMITE_ID)
    private Integer idTipoTramite;
	
	@Column(name = DatabaseConstant.TB_TIPO_TRAMITE_PREFIJO)
    private String prefijo;

    @Column(name = DatabaseConstant.TB_TIPO_TRAMITE_TIPO)
    private String tipo;
    
    @Column(name = DatabaseConstant.TB_TIPO_TRAMITE_ESTATUS)
    private String estatus;
    
}
