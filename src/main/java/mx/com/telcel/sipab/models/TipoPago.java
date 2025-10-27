package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_TIPO_PAGO)
public @Data class TipoPago {

	@Id
    @Column(name = DatabaseConstant.TB_TIPO_PAGO_ID_TIPO)
    private Integer idTipoPago;
	
    @Column(name = DatabaseConstant.TB_TIPO_PAGO_CLAVE_PAGO)
    private String clavePago;

    @Column(name = DatabaseConstant.TB_TIPO_PAGO_DESCRIPCION)
    private String descripcion;
}
