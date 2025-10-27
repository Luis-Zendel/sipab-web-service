package mx.com.telcel.sipab.models;

//import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_USUARIOS)
public @Data class Usuario implements Serializable {
	
	//@Serial
	private static final long serialVersionUID = -1976310142404630299L;

	@Id
    @Column(name = DatabaseConstant.TB_USUARIOS_NUM_EMP)
    private String numeroEmpleado;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = DatabaseConstant.TB_USUARIOS_ID_CENTRO)
    private CentroCostos idCentro;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = DatabaseConstant.TB_USUARIOS_ID_ROL)
    private Rol rol;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = DatabaseConstant.TB_USUARIOS_ID_REGION)
    private Region region;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = DatabaseConstant.TB_USUARIOS_ID_PUESTO)
    private Puesto puesto;

    @Column(name = DatabaseConstant.TB_USUARIOS_CVE_USUARIO)
    private String cveUsuario;

    @Column(name = DatabaseConstant.TB_USUARIOS_NOMBRE)
    private String nombre;

    @Column(name = DatabaseConstant.TB_USUARIOS_ESTATUS)
    private String estatus;

    @Column(name = DatabaseConstant.TB_USUARIOS_CORREO)
    private String correo;

    @Column(name = DatabaseConstant.TB_USUARIOS_ULTIMO_ACCESO)
    private Date ultimoAcceso;

    @Column(name = DatabaseConstant.TB_USUARIOS_EMPLEADO_MODIFICA)
    private String empleadoModifica;

    @Column(name = DatabaseConstant.TB_USUARIOS_FECHA_MODIFICA)
    private Date fechaModifica;
}
