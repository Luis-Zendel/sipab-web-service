package mx.com.telcel.sipab.dto.response;

import java.util.List;

import lombok.Data;

public @Data class InformacionCuenta {

	private String region;
    private Long cuenta;
    private String nombre;
    private Long ciclo;
    private String telefono;
    private String estatus;
    private String tipo;
    private List<String> metodosPago;
    private InformacionFiscal informacionFiscal;
}
