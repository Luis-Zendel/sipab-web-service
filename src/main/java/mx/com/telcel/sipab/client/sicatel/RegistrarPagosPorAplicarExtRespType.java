
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
 * <p>Clase Java para RegistrarPagosPorAplicarExtRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistrarPagosPorAplicarExtRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String64Type"/&gt;
 *         &lt;element name="idMovimientoTerceros" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}SerialType" minOccurs="0"/&gt;
 *         &lt;element name="numFolioTerceros" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type"/&gt;
 *         &lt;element name="fechaRecepcion" type="{http://amx.com/mexico/telcel/esb/v1_1}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="estatusProceso" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Entero1a10dType" minOccurs="0"/&gt;
 *         &lt;element name="centro" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
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
@XmlType(name = "RegistrarPagosPorAplicarExtRespType", propOrder = {
    "codigoRespuesta",
    "idMovimientoTerceros",
    "numFolioTerceros",
    "fechaRecepcion",
    "estatusProceso",
    "region",
    "centro",
    "conceptoPago",
    "genericos",
    "genericosBes"
})
public class RegistrarPagosPorAplicarExtRespType {

    @XmlElement(required = true)
    protected String codigoRespuesta;
    protected String idMovimientoTerceros;
    @XmlElement(required = true)
    protected String numFolioTerceros;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRecepcion;
    protected String estatusProceso;
    @XmlSchemaType(name = "integer")
    protected Integer region;
    protected String centro;
    protected List<ConceptoPagoType> conceptoPago;
    protected GenericosType genericos;
    protected GenericosBesType genericosBes;

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
     * Obtiene el valor de la propiedad idMovimientoTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMovimientoTerceros() {
        return idMovimientoTerceros;
    }

    /**
     * Define el valor de la propiedad idMovimientoTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMovimientoTerceros(String value) {
        this.idMovimientoTerceros = value;
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
