package mx.com.telcel.sipab.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
//@Entity(name = "SIPAB_C_TRAMITE_DETALLE")
@Entity(name = "SIPAB4_TRAMITES_DETALLE")
//@IdClass(LlaveTramiteDetalle.class)
public @Data class TramiteDetalle {
	@Id
	@Column(name="ID_DETALLE_TRAMITE")
	private long idTramiteDetalle;
//	@Id
	@Column(name="FOLIO")
	private String folio;
//	@Id
	@Column(name="ANIO")
	private Integer anio;
	@Column(name="ID_TIPO_TRAMITE")
	private Integer idTipoTramite;
	@Column(name="ID_REGION")
	private Integer idRegion;
	@Column(name="CUENTA")
	private Long cuenta;
	@Column(name="NUMERO_FOLIO")
	private Long numeroFolio;
	@Column(name="TELEFONO")
	private String telefono;
	@Column(name="CLIENTE")
	private String cliente;
	@Column(name="CICLO")
	private Long ciclo;
	@Column(name="IMPORTE")
	private Double importe;
	@Column(name="IVA")
	private Double iva;
	@Column(name="TOTAL")
	private Double total;
}
