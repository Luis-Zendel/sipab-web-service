package mx.com.telcel.sipab.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SIPAB4_CANCELACION_CFDI")
@IdClass(LlaveTramite.class)
public class CancelacionCfdi {

	@Id
    @Column(name="FOLIO")
	private String folio;
	@Id
	@Column(name="ANIO")
	private Integer anio;
	@Column(name="ID_ESTATUS_COMPLEMENTO")
	private Integer idEstatusComplemento;
	@Column(name="ID_ESTATUS_CANCELACION")
	private Integer idEstatusCfdi;
	@Column(name="ID_CLAVE_BATCH_EGR")
	private Integer idClaveBatchEgr;
	@Column(name="ID_CLAVE_BATCH_ING")
	private Integer idClaveBatchIng;
	@Column(name="FECHA_FACTURA")
	private Date fechaFactura;
	@Column(name="UUID")
	private String uuid;
	@Column(name="FACTURA_PAGADA")//Estatus factura
	private String facturaPagada;
	@Column(name="TIPO_CANCELACION")
	private String tipoCancelacion;
	@Column(name="IMPRESORA_SAP")
	private String impresoraSap;
	@Column(name="NUMERO_FACTURA")
	private String numeroFactura;
	
}
