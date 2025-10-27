
package mx.com.telcel.sipab.client.sicatel;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dato complejo para el/los concepto(s) de pagos enviados por los sistemas externos y ser registrados en Sicatel para posteriormente ser cobrados.
 * 
 * <p>Clase Java para ConceptoPagoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConceptoPagoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idConceptoTerceros" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Entero1a10dType"/&gt;
 *         &lt;element name="importe" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Decimal10c2Type"/&gt;
 *         &lt;element name="telefono" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="cuenta" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="nombreCliente" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}NombreType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptoPagoType", propOrder = {
    "idConceptoTerceros",
    "importe",
    "telefono",
    "cuenta",
    "nombreCliente"
})
public class ConceptoPagoType {

    @XmlSchemaType(name = "integer")
    protected int idConceptoTerceros;
    @XmlElement(required = true)
    protected BigDecimal importe;
    protected String telefono;
    protected String cuenta;
    protected String nombreCliente;

    /**
     * Obtiene el valor de la propiedad idConceptoTerceros.
     * 
     */
    public int getIdConceptoTerceros() {
        return idConceptoTerceros;
    }

    /**
     * Define el valor de la propiedad idConceptoTerceros.
     * 
     */
    public void setIdConceptoTerceros(int value) {
        this.idConceptoTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporte(BigDecimal value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad cuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuenta(String value) {
        this.cuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Define el valor de la propiedad nombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
    }

}
