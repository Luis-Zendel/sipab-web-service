package mx.com.telcel.sipab.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SIPAB4_NOTAS")
@IdClass(LlaveNotas.class)
public @Data class Nota {

	@Id
    @Column(name="ID_DETALLE_TRAMITE")
	private Long idTramiteDetalle;
	@Column(name="ID_CLAVE_BATCH")
	private Integer idClaveBatch;
	@Column(name="ID_CLAVE_SAP")
	private Integer idClaveSap;
	@Id
	@Column(name="LOTE_BATCH")
	private Integer loteBatch;
	@Column(name="TIPO_CAPTURA")
	private String tipoCaptura;
	@Column(name="ID_DETALLE_FACTURA")
	private Long idDetalleFactura;
	@Column(name="CONCEPTO")
	private String concepto;
	@Column(name="CLAVE")
	private String clave;
	@Column(name="FECHA_FACTURA")
	private Date fechaFactura;
	@Column(name="UUID")
	private String uuid;
	@Column(name="NUMERO_FACTURA")
	private String numeroFactura;
	@Column(name="ESTATUS_FACTURA")
	private String estatusFactura;
	
}
