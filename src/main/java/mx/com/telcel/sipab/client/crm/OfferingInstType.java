
package mx.com.telcel.sipab.client.crm;

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
 * <p>Clase Java para OfferingInstType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OfferingInstType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offeringInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type"/&gt;
 *         &lt;element name="offeringId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type"/&gt;
 *         &lt;element name="purchaseSeq" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="brand" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="primaryFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="bundleFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="pOfferingInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="offeringType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="offeringSubType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaNumerica1Type"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType"/&gt;
 *         &lt;element name="activeMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="activeDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="lastActiveDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="trialBeginDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="trialEndDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="createOperId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="createOperName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="createOrderId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="installmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}InstallmentInfonType" minOccurs="0"/&gt;
 *         &lt;element name="subsidyInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}SubsidyInfonType" minOccurs="0"/&gt;
 *         &lt;element name="promotionMembers" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}PromotionMembersType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferingInstType", propOrder = {
    "offeringInstId",
    "offeringId",
    "purchaseSeq",
    "brand",
    "primaryFlag",
    "bundleFlag",
    "pOfferingInstId",
    "offeringType",
    "offeringSubType",
    "status",
    "effDate",
    "expDate",
    "activeMode",
    "activeDate",
    "lastActiveDate",
    "trialBeginDate",
    "trialEndDate",
    "createOperId",
    "createOperName",
    "createOrderId",
    "installmentInfo",
    "subsidyInfo",
    "promotionMembers"
})
public class OfferingInstType {

    @XmlElement(required = true)
    protected BigDecimal offeringInstId;
    @XmlElement(required = true)
    protected BigDecimal offeringId;
    protected String purchaseSeq;
    protected BigDecimal brand;
    @XmlElement(required = true)
    protected String primaryFlag;
    @XmlElement(required = true)
    protected String bundleFlag;
    protected BigDecimal pOfferingInstId;
    @XmlElement(required = true)
    protected String offeringType;
    protected String offeringSubType;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    protected String activeMode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activeDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trialBeginDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trialEndDate;
    protected BigDecimal createOperId;
    protected String createOperName;
    protected BigDecimal createOrderId;
    protected InstallmentInfonType installmentInfo;
    protected SubsidyInfonType subsidyInfo;
    protected List<PromotionMembersType> promotionMembers;

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
     * Obtiene el valor de la propiedad purchaseSeq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseSeq() {
        return purchaseSeq;
    }

    /**
     * Define el valor de la propiedad purchaseSeq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseSeq(String value) {
        this.purchaseSeq = value;
    }

    /**
     * Obtiene el valor de la propiedad brand.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBrand() {
        return brand;
    }

    /**
     * Define el valor de la propiedad brand.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBrand(BigDecimal value) {
        this.brand = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Define el valor de la propiedad primaryFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryFlag(String value) {
        this.primaryFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad bundleFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleFlag() {
        return bundleFlag;
    }

    /**
     * Define el valor de la propiedad bundleFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleFlag(String value) {
        this.bundleFlag = value;
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
     * Obtiene el valor de la propiedad lastActiveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastActiveDate() {
        return lastActiveDate;
    }

    /**
     * Define el valor de la propiedad lastActiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastActiveDate(XMLGregorianCalendar value) {
        this.lastActiveDate = value;
    }

    /**
     * Obtiene el valor de la propiedad trialBeginDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrialBeginDate() {
        return trialBeginDate;
    }

    /**
     * Define el valor de la propiedad trialBeginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrialBeginDate(XMLGregorianCalendar value) {
        this.trialBeginDate = value;
    }

    /**
     * Obtiene el valor de la propiedad trialEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrialEndDate() {
        return trialEndDate;
    }

    /**
     * Define el valor de la propiedad trialEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrialEndDate(XMLGregorianCalendar value) {
        this.trialEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad createOperId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreateOperId() {
        return createOperId;
    }

    /**
     * Define el valor de la propiedad createOperId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreateOperId(BigDecimal value) {
        this.createOperId = value;
    }

    /**
     * Obtiene el valor de la propiedad createOperName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateOperName() {
        return createOperName;
    }

    /**
     * Define el valor de la propiedad createOperName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateOperName(String value) {
        this.createOperName = value;
    }

    /**
     * Obtiene el valor de la propiedad createOrderId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreateOrderId() {
        return createOrderId;
    }

    /**
     * Define el valor de la propiedad createOrderId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreateOrderId(BigDecimal value) {
        this.createOrderId = value;
    }

    /**
     * Obtiene el valor de la propiedad installmentInfo.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentInfonType }
     *     
     */
    public InstallmentInfonType getInstallmentInfo() {
        return installmentInfo;
    }

    /**
     * Define el valor de la propiedad installmentInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentInfonType }
     *     
     */
    public void setInstallmentInfo(InstallmentInfonType value) {
        this.installmentInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad subsidyInfo.
     * 
     * @return
     *     possible object is
     *     {@link SubsidyInfonType }
     *     
     */
    public SubsidyInfonType getSubsidyInfo() {
        return subsidyInfo;
    }

    /**
     * Define el valor de la propiedad subsidyInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidyInfonType }
     *     
     */
    public void setSubsidyInfo(SubsidyInfonType value) {
        this.subsidyInfo = value;
    }

    /**
     * Gets the value of the promotionMembers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the promotionMembers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionMembersType }
     * 
     * 
     */
    public List<PromotionMembersType> getPromotionMembers() {
        if (promotionMembers == null) {
            promotionMembers = new ArrayList<PromotionMembersType>();
        }
        return this.promotionMembers;
    }

}
