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
@Entity(name = "SIPAB4_DETALLE_SAP_REF")
@IdClass(LlaveDetalleSap.class)
public @Data class DetalleSap {
	
	@Id
    @Column(name="ID_DETALLE_TRAMITE")
	private long idTramiteDetalle;
	@Id
	@Column(name="MATERIAL_SAP")
	private Integer materialSap;
	@Column(name="MONTO")
	private Double monto;
	@Column(name="FECHA_INSERCION")
	private Date fechaInsercion;
	
}
