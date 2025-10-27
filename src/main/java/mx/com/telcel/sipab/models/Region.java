package mx.com.telcel.sipab.models;

//import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_REGION)
public @Data class Region implements Serializable {
	
	//@Serial
	private static final long serialVersionUID = 7583581395565566055L;

	@Id
    @Column(name = DatabaseConstant.TB_REGION_ID)
    private Integer idRegion;

    @Column(name = DatabaseConstant.TB_REGION_DESCRIPCION)
    private String descripcion;
	
}
