
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PropBasicInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PropBasicInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="propInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="offeringInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="propId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="sourceId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type"/&gt;
 *         &lt;element name="propCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="complexFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="propValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}String4000Type" minOccurs="0"/&gt;
 *         &lt;element name="pPropInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropBasicInfoType", propOrder = {
    "propInstId",
    "offeringInstId",
    "propId",
    "sourceId",
    "propCode",
    "complexFlag",
    "propValue",
    "pPropInstId",
    "effDate",
    "expDate"
})
public class PropBasicInfoType {

    protected BigDecimal propInstId;
    protected BigDecimal offeringInstId;
    @XmlElement(required = true)
    protected BigDecimal propId;
    @XmlElement(required = true)
    protected BigDecimal sourceId;
    @XmlElement(required = true)
    protected String propCode;
    protected String complexFlag;
    protected String propValue;
    protected BigDecimal pPropInstId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;

    /**
     * Obtiene el valor de la propiedad propInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPropInstId() {
        return propInstId;
    }

    /**
     * Define el valor de la propiedad propInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPropInstId(BigDecimal value) {
        this.propInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferingInstId() {
        return offeringInstId;
    }

    /**
     * Define el valor de la propiedad offeringInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferingInstId(BigDecimal value) {
        this.offeringInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad propId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPropId() {
        return propId;
    }

    /**
     * Define el valor de la propiedad propId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPropId(BigDecimal value) {
        this.propId = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourceId() {
        return sourceId;
    }

    /**
     * Define el valor de la propiedad sourceId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourceId(BigDecimal value) {
        this.sourceId = value;
    }

    /**
     * Obtiene el valor de la propiedad propCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropCode() {
        return propCode;
    }

    /**
     * Define el valor de la propiedad propCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropCode(String value) {
        this.propCode = value;
    }

    /**
     * Obtiene el valor de la propiedad complexFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexFlag() {
        return complexFlag;
    }

    /**
     * Define el valor de la propiedad complexFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexFlag(String value) {
        this.complexFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad propValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropValue() {
        return propValue;
    }

    /**
     * Define el valor de la propiedad propValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropValue(String value) {
        this.propValue = value;
    }

    /**
     * Obtiene el valor de la propiedad pPropInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPPropInstId() {
        return pPropInstId;
    }

    /**
     * Define el valor de la propiedad pPropInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPPropInstId(BigDecimal value) {
        this.pPropInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad effDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDate() {
        return effDate;
    }

    /**
     * Define el valor de la propiedad effDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDate(XMLGregorianCalendar value) {
        this.effDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Define el valor de la propiedad expDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

}
