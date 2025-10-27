
package mx.com.telcel.sipab.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import mx.com.telcel.sipab.constant.DatabaseConstant;

@Entity(name = DatabaseConstant.TB_FORMA_PAGO)
public @Data class FormaPago {

	@Id
	@Column(name = DatabaseConstant.TB_FORMA_PAGO_ID_FORMA)
	private Integer idFormaPago;
	
	@Column(name = DatabaseConstant.TB_FORMA_PAGO_CVE_FORMA_PAGO)
	private String clave;
	
	@Column(name = DatabaseConstant.TB_FORMA_PAGO_DESCRIPCION)
	private String descripcion;
}
