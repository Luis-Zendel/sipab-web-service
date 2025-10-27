
package mx.com.telcel.sipab.client.sicatel;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarPagosExtPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarPagosExtPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSistTerceros" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Entero1a10dType"/&gt;
 *         &lt;element name="region" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}AccountRegionType"/&gt;
 *         &lt;element name="centro" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type"/&gt;
 *         &lt;element name="fuezaVtas" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="idProceso" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Entero1a10dType"/&gt;
 *         &lt;element name="numFolioTerceros" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type"/&gt;
 *         &lt;element name="fechaRecepcion" type="{http://amx.com/mexico/telcel/esb/v1_1}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="cuenta" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarPagosExtPetType", propOrder = {
    "idSistTerceros",
    "region",
    "centro",
    "fuezaVtas",
    "idProceso",
    "numFolioTerceros",
    "fechaRecepcion",
    "telefono",
    "cuenta"
})
public class ConsultarPagosExtPetType {

    @XmlSchemaType(name = "integer")
    protected int idSistTerceros;
    protected int region;
    @XmlElement(required = true)
    protected String centro;
    protected String fuezaVtas;
    @XmlSchemaType(name = "integer")
    protected int idProceso;
    @XmlElement(required = true)
    protected String numFolioTerceros;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRecepcion;
    protected String telefono;
    protected String cuenta;

    /**
     * Obtiene el valor de la propiedad idSistTerceros.
     * 
     */
    public int getIdSistTerceros() {
        return idSistTerceros;
    }

    /**
     * Define el valor de la propiedad idSistTerceros.
     * 
     */
    public void setIdSistTerceros(int value) {
        this.idSistTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     */
    public int getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     */
    public void setRegion(int value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad centro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentro() {
        return centro;
    }

    /**
     * Define el valor de la propiedad centro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentro(String value) {
        this.centro = value;
    }

    /**
     * Obtiene el valor de la propiedad fuezaVtas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuezaVtas() {
        return fuezaVtas;
    }

    /**
     * Define el valor de la propiedad fuezaVtas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuezaVtas(String value) {
        this.fuezaVtas = value;
    }

    /**
     * Obtiene el valor de la propiedad idProceso.
     * 
     */
    public int getIdProceso() {
        return idProceso;
    }

    /**
     * Define el valor de la propiedad idProceso.
     * 
     */
    public void setIdProceso(int value) {
        this.idProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad numFolioTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFolioTerceros() {
        return numFolioTerceros;
    }

    /**
     * Define el valor de la propiedad numFolioTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFolioTerceros(String value) {
        this.numFolioTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Define el valor de la propiedad fechaRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRecepcion(XMLGregorianCalendar value) {
        this.fechaRecepcion = value;
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

}
