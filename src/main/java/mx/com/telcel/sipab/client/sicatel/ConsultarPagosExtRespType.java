
package mx.com.telcel.sipab.client.sicatel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarPagosExtRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarPagosExtRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estatusProceso" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="fechaRecepcion" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}DateYearType" minOccurs="0"/&gt;
 *         &lt;element name="fechaCobroSicatel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}DateYearType" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Entero1a10dType" minOccurs="0"/&gt;
 *         &lt;element name="centro" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String64Type"/&gt;
 *         &lt;element name="folioSicatel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Entero1a10dType" minOccurs="0"/&gt;
 *         &lt;element name="formaPago" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="conceptoPago" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}ConceptoPagoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="genericos" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}GenericosType" minOccurs="0"/&gt;
 *         &lt;element name="genericosBes" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}GenericosBesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarPagosExtRespType", propOrder = {
    "estatusProceso",
    "fechaRecepcion",
    "fechaCobroSicatel",
    "region",
    "centro",
    "codigoRespuesta",
    "folioSicatel",
    "formaPago",
    "conceptoPago",
    "genericos",
    "genericosBes"
})
public class ConsultarPagosExtRespType {

    protected String estatusProceso;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaRecepcion;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaCobroSicatel;
    @XmlSchemaType(name = "integer")
    protected Integer region;
    protected String centro;
    @XmlElement(required = true)
    protected String codigoRespuesta;
    @XmlSchemaType(name = "integer")
    protected Integer folioSicatel;
    protected String formaPago;
    protected List<ConceptoPagoType> conceptoPago;
    protected GenericosType genericos;
    protected GenericosBesType genericosBes;

    /**
     * Obtiene el valor de la propiedad estatusProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatusProceso() {
        return estatusProceso;
    }

    /**
     * Define el valor de la propiedad estatusProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatusProceso(String value) {
        this.estatusProceso = value;
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
     * Obtiene el valor de la propiedad fechaCobroSicatel.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCobroSicatel() {
        return fechaCobroSicatel;
    }

    /**
     * Define el valor de la propiedad fechaCobroSicatel.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCobroSicatel(XMLGregorianCalendar value) {
        this.fechaCobroSicatel = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegion(Integer value) {
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
     * Obtiene el valor de la propiedad codigoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Define el valor de la propiedad codigoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRespuesta(String value) {
        this.codigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad folioSicatel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolioSicatel() {
        return folioSicatel;
    }

    /**
     * Define el valor de la propiedad folioSicatel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolioSicatel(Integer value) {
        this.folioSicatel = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Gets the value of the conceptoPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the conceptoPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptoPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptoPagoType }
     * 
     * 
     */
    public List<ConceptoPagoType> getConceptoPago() {
        if (conceptoPago == null) {
            conceptoPago = new ArrayList<ConceptoPagoType>();
        }
        return this.conceptoPago;
    }

    /**
     * Obtiene el valor de la propiedad genericos.
     * 
     * @return
     *     possible object is
     *     {@link GenericosType }
     *     
     */
    public GenericosType getGenericos() {
        return genericos;
    }

    /**
     * Define el valor de la propiedad genericos.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericosType }
     *     
     */
    public void setGenericos(GenericosType value) {
        this.genericos = value;
    }

    /**
     * Obtiene el valor de la propiedad genericosBes.
     * 
     * @return
     *     possible object is
     *     {@link GenericosBesType }
     *     
     */
    public GenericosBesType getGenericosBes() {
        return genericosBes;
    }

    /**
     * Define el valor de la propiedad genericosBes.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericosBesType }
     *     
     */
    public void setGenericosBes(GenericosBesType value) {
        this.genericosBes = value;
    }

}
