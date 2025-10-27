package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SIPAB_C_BONIFICACIONES")
public @Data class Bonificacion {
	
	@Id
	@Column(name="ID_DETALLE_TRAMITE")
	private long idTramiteDetalle;
	@Column(name="ID_TIPO_BONIFICACION")
	private Integer idTipoBonificacion;
	@Column(name="ID_CONCEPTO")
	private Integer idConcepto;
	@Column(name="CONCEPTO")
	private String concepto;
	@Column(name="SESION_DERECHOS")
	private String sesionDerechos;
	@Column(name="A_FAVOR")
	private String aFavor;
	@Column(name="ID_BANCO")
	private Integer idBanco;
	@Column(name="NUMERO_TARJETA")
	private String numeroTarjeta;
	@Column(name="CUENTA_CLABE")
	private String cuentaClabe;
}
