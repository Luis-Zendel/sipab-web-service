package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_ROLES)
public @Data class Rol {

	@Id
    @Column(name = DatabaseConstant.TB_ROLES_ID_ROL)
    private Integer idRol;

    @Column(name = DatabaseConstant.TB_ROLES_DESC_ROL)
    private String descripcion;
}
