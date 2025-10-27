package mx.com.telcel.sipab.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity(name = "SIPAB4_HISTORICO_ESTATUS")
public @Data class HistoricoEstatus {

	@Id
	@Column(name="ID_HISTORICO_ESTATUS")
	private Integer idHistorico;
	@Column(name="FOLIO")
	private String folio;
	@Column(name="ANIO")
	private Integer anio;
	@Column(name="ID_ESTATUS")
	private Integer idEstatus;
	@Column(name="ID_SECUENCIA")
	private Integer idSecuencia;
	@Column(name="NUMERO_EMPLEADO")
	private String numeroEmpleado;
	@Column(name="FECHA_AUTORIZACION")
	private Date fechaAutorizacion;
	
//	@MapsId("tramiteDetalleId")
//	@JoinColumns({
//        @JoinColumn(name="FOLIO", nullable = false),
//        @JoinColumn(name="ANIO", nullable = false)
//	})
//	@ManyToOne
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="folio", referencedColumnName = "folio", insertable=false, updatable=false)
//	@JoinColumns({
//        @JoinColumn(name="folio", referencedColumnName="folio", insertable=false, updatable=false),
//        @JoinColumn(name="anio", referencedColumnName="anio", insertable=false, updatable=false)
//    })
	private TramiteDetalle tramiteDetalle;
	
	
}
