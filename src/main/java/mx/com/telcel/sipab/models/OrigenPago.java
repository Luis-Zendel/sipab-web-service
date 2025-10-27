package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_ORIGENES_PAGO)
public @Data class OrigenPago {

	@Id
    @Column(name = DatabaseConstant.TB_ORIGENES_PAGO_ID_ORIGEN)
    private Integer idOrigenPago;

    @Column(name = DatabaseConstant.TB_ORIGENES_PAGO_ID_REGION)
    private Integer idRegion;

    @Column(name = DatabaseConstant.TB_ORIGENES_PAGO_ORIGEN)
    private String origen;

    @Column(name = DatabaseConstant.TB_ORIGENES_PAGO_DESCRIPCION)
    private String descripcion;

    @Column(name = DatabaseConstant.TB_ORIGENES_PAGO_ORIGEN_CORTO)
    private String origenCorto;

    @Column(name = DatabaseConstant.TB_ORIGENES_PAGO_ORIGEN_LARGO)
    private String origenLargo;

    @Column(name = DatabaseConstant.TB_ORIGENES_PAGO_NUMERO_EMPLEADO)
    private String numeroEmpleado;
}