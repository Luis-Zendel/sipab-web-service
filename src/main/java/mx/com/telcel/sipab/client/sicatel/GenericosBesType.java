
package mx.com.telcel.sipab.client.sicatel;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Tipos de datos genéricos para solicitudes a Sicatel de aplicativos categoría BES para el servicio SicatelWSPagosSistExt u otro servicio que le sea funcional.
 * 
 * <p>Clase Java para GenericosBesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GenericosBesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fechaMovimiento" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}DateTimeType"/&gt;
 *         &lt;element name="plataforma" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type"/&gt;
 *         &lt;element name="idOrden" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type"/&gt;
 *         &lt;element name="notaCredito" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="numeroCuenta" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type"/&gt;
 *         &lt;element name="estatusFolio" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericosBesType", propOrder = {
    "fechaMovimiento",
    "plataforma",
    "idOrden",
    "notaCredito",
    "numeroCuenta",
    "estatusFolio"
})
public class GenericosBesType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaMovimiento;
    @XmlElement(required = true)
    protected String plataforma;
    @XmlElement(required = true)
    protected String idOrden;
    protected String notaCredito;
    @XmlElement(required = true)
    protected String numeroCuenta;
    @XmlElement(required = true)
    protected String estatusFolio;

    /**
     * Obtiene el valor de la propiedad fechaMovimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaMovimiento() {
        return fechaMovimiento;
    }

    /**
     * Define el valor de la propiedad fechaMovimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaMovimiento(XMLGregorianCalendar value) {
        this.fechaMovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad plataforma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Define el valor de la propiedad plataforma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlataforma(String value) {
        this.plataforma = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOrden() {
        return idOrden;
    }

    /**
     * Define el valor de la propiedad idOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOrden(String value) {
        this.idOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad notaCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaCredito() {
        return notaCredito;
    }

    /**
     * Define el valor de la propiedad notaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaCredito(String value) {
        this.notaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad estatusFolio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatusFolio() {
        return estatusFolio;
    }

    /**
     * Define el valor de la propiedad estatusFolio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatusFolio(String value) {
        this.estatusFolio = value;
    }

}
