
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InsuranceOfferType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InsuranceOfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activeDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType"/&gt;
 *         &lt;element name="activeMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type"/&gt;
 *         &lt;element name="applyObjId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="applyObjType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="attributeGroups" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferAttributeGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType"/&gt;
 *         &lt;element name="effMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType"/&gt;
 *         &lt;element name="expMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="statusDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="isBundled" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica3Type" minOccurs="0"/&gt;
 *         &lt;element name="isPrimary" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica3Type" minOccurs="0"/&gt;
 *         &lt;element name="offeringCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="offeringId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="offeringInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="offeringSubType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="offeringType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="pOfferingId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="pOfferingInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="offeringSpec" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingBaseInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceOfferType", propOrder = {
    "activeDate",
    "activeMode",
    "applyObjId",
    "applyObjType",
    "attributeGroups",
    "effDate",
    "effMode",
    "expDate",
    "expMode",
    "statusDate",
    "isBundled",
    "isPrimary",
    "offeringCode",
    "offeringId",
    "offeringInstId",
    "offeringSubType",
    "offeringType",
    "pOfferingId",
    "pOfferingInstId",
    "status",
    "offeringSpec"
})
public class InsuranceOfferType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activeDate;
    @XmlElement(required = true)
    protected String activeMode;
    protected BigDecimal applyObjId;
    protected String applyObjType;
    protected List<OfferAttributeGroupType> attributeGroups;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlElement(required = true)
    protected String effMode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    protected String expMode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    protected String isBundled;
    protected String isPrimary;
    @XmlElement(required = true)
    protected String offeringCode;
    @XmlElement(required = true)
    protected BigDecimal offeringId;
    @XmlElement(required = true)
    protected BigDecimal offeringInstId;
    protected String offeringSubType;
    @XmlElement(required = true)
    protected String offeringType;
    protected BigDecimal pOfferingId;
    protected BigDecimal pOfferingInstId;
    @XmlElement(required = true)
    protected String status;
    protected OfferingBaseInfoType offeringSpec;

    /**
     * Obtiene el valor de la propiedad activeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveDate() {
        return activeDate;
    }

    /**
     * Define el valor de la propiedad activeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveDate(XMLGregorianCalendar value) {
        this.activeDate = value;
    }

    /**
     * Obtiene el valor de la propiedad activeMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveMode() {
        return activeMode;
    }

    /**
     * Define el valor de la propiedad activeMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveMode(String value) {
        this.activeMode = value;
    }

    /**
     * Obtiene el valor de la propiedad applyObjId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApplyObjId() {
        return applyObjId;
    }

    /**
     * Define el valor de la propiedad applyObjId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApplyObjId(BigDecimal value) {
        this.applyObjId = value;
    }

    /**
     * Obtiene el valor de la propiedad applyObjType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyObjType() {
        return applyObjType;
    }

    /**
     * Define el valor de la propiedad applyObjType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyObjType(String value) {
        this.applyObjType = value;
    }

    /**
     * Gets the value of the attributeGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attributeGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferAttributeGroupType }
     * 
     * 
     */
    public List<OfferAttributeGroupType> getAttributeGroups() {
        if (attributeGroups == null) {
            attributeGroups = new ArrayList<OfferAttributeGroupType>();
        }
        return this.attributeGroups;
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
     * Obtiene el valor de la propiedad effMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffMode() {
        return effMode;
    }

    /**
     * Define el valor de la propiedad effMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffMode(String value) {
        this.effMode = value;
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

    /**
     * Obtiene el valor de la propiedad expMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpMode() {
        return expMode;
    }

    /**
     * Define el valor de la propiedad expMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpMode(String value) {
        this.expMode = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Define el valor de la propiedad statusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Obtiene el valor de la propiedad isBundled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBundled() {
        return isBundled;
    }

    /**
     * Define el valor de la propiedad isBundled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBundled(String value) {
        this.isBundled = value;
    }

    /**
     * Obtiene el valor de la propiedad isPrimary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrimary() {
        return isPrimary;
    }

    /**
     * Define el valor de la propiedad isPrimary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrimary(String value) {
        this.isPrimary = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingCode() {
        return offeringCode;
    }

    /**
     * Define el valor de la propiedad offeringCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingCode(String value) {
        this.offeringCode = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferingId() {
        return offeringId;
    }

    /**
     * Define el valor de la propiedad offeringId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferingId(BigDecimal value) {
        this.offeringId = value;
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
     * Obtiene el valor de la propiedad offeringSubType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingSubType() {
        return offeringSubType;
    }

    /**
     * Define el valor de la propiedad offeringSubType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingSubType(String value) {
        this.offeringSubType = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingType() {
        return offeringType;
    }

    /**
     * Define el valor de la propiedad offeringType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingType(String value) {
        this.offeringType = value;
    }

    /**
     * Obtiene el valor de la propiedad pOfferingId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPOfferingId() {
        return pOfferingId;
    }

    /**
     * Define el valor de la propiedad pOfferingId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPOfferingId(BigDecimal value) {
        this.pOfferingId = value;
    }

    /**
     * Obtiene el valor de la propiedad pOfferingInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPOfferingInstId() {
        return pOfferingInstId;
    }

    /**
     * Define el valor de la propiedad pOfferingInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPOfferingInstId(BigDecimal value) {
        this.pOfferingInstId = value;
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
     * Obtiene el valor de la propiedad offeringSpec.
     * 
     * @return
     *     possible object is
     *     {@link OfferingBaseInfoType }
     *     
     */
    public OfferingBaseInfoType getOfferingSpec() {
        return offeringSpec;
    }

    /**
     * Define el valor de la propiedad offeringSpec.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferingBaseInfoType }
     *     
     */
    public void setOfferingSpec(OfferingBaseInfoType value) {
        this.offeringSpec = value;
    }

}
