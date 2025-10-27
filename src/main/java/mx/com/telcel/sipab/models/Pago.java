package mx.com.telcel.sipab.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SIPAB4_PAGOS")
public @Data class Pago {

	@Id
	@Column(name="ID_DETALLE_TRAMITE")
	private long idTramiteDetalle;
	@Column(name="FORMA_PAGO")
	private String formaPago;
	@Column(name="FECHA_PAGO")
	private Date fechaPago;
	@Column(name="ORIGEN_LARGO")
	private String origenLargo;
	@Column(name="ORIGEN_CORTO")
	private String origenCorto;
	@Column(name="ESTATUS_PAGO")
	private String estatusPago;
	@Column(name="SEC_PAGO")
	private Long secPago;
	@Column(name="LOTE_PAGO")
	private Integer lotePago;
	@Column(name="NUM_REG_BATCH")
	private Integer numRegBatch;
	@Column(name="TIPO_PAGO")
	private String tipoPago;
	@Column(name="EXT_TRANS_ID")
	private String extTransId;
}
