
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SendIMEINotePetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SendIMEINotePetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imeiKit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica15Type"/&gt;
 *         &lt;element name="imeiUsed" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica15Type" minOccurs="0"/&gt;
 *         &lt;element name="promotion" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica60Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica60Type" minOccurs="0"/&gt;
 *         &lt;element name="msisdnKitIot" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="msisdnUsed" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="montoRecarga" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="burningDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="cancellationDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendIMEINotePetType", propOrder = {
    "imeiKit",
    "imeiUsed",
    "promotion",
    "status",
    "msisdnKitIot",
    "msisdnUsed",
    "montoRecarga",
    "creationDate",
    "burningDate",
    "expirationDate",
    "cancellationDate"
})
public class SendIMEINotePetType {

    @XmlElement(required = true)
    protected String imeiKit;
    protected String imeiUsed;
    protected String promotion;
    protected String status;
    protected String msisdnKitIot;
    protected String msisdnUsed;
    protected BigDecimal montoRecarga;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar burningDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;

    /**
     * Obtiene el valor de la propiedad imeiKit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImeiKit() {
        return imeiKit;
    }

    /**
     * Define el valor de la propiedad imeiKit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImeiKit(String value) {
        this.imeiKit = value;
    }

    /**
     * Obtiene el valor de la propiedad imeiUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImeiUsed() {
        return imeiUsed;
    }

    /**
     * Define el valor de la propiedad imeiUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImeiUsed(String value) {
        this.imeiUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad promotion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * Define el valor de la propiedad promotion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotion(String value) {
        this.promotion = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad msisdnKitIot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdnKitIot() {
        return msisdnKitIot;
    }

    /**
     * Define el valor de la propiedad msisdnKitIot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdnKitIot(String value) {
        this.msisdnKitIot = value;
    }

    /**
     * Obtiene el valor de la propiedad msisdnUsed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdnUsed() {
        return msisdnUsed;
    }

    /**
     * Define el valor de la propiedad msisdnUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdnUsed(String value) {
        this.msisdnUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad montoRecarga.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoRecarga() {
        return montoRecarga;
    }

    /**
     * Define el valor de la propiedad montoRecarga.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoRecarga(BigDecimal value) {
        this.montoRecarga = value;
    }

    /**
     * Obtiene el valor de la propiedad creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad burningDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBurningDate() {
        return burningDate;
    }

    /**
     * Define el valor de la propiedad burningDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBurningDate(XMLGregorianCalendar value) {
        this.burningDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define el valor de la propiedad expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad cancellationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Define el valor de la propiedad cancellationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

}
