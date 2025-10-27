
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OfferingBasicInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OfferingBasicInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offeringInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="offeringId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="purchaseSeq" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="expiryMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}EffExpModeType" minOccurs="0"/&gt;
 *         &lt;element name="effectiveMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}EffExpModeType" minOccurs="0"/&gt;
 *         &lt;element name="activeMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="lastActiveDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="trialPeriodUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="trialPeriodValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}NumberLong19Type" minOccurs="0"/&gt;
 *         &lt;element name="installmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InstallmentInfoType" minOccurs="0"/&gt;
 *         &lt;element name="leasingInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}LeasingInfoType" minOccurs="0"/&gt;
 *         &lt;element name="subsidyInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SubsidyInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferingBasicInfoType", propOrder = {
    "offeringInstId",
    "offeringId",
    "purchaseSeq",
    "expiryMode",
    "effectiveMode",
    "activeMode",
    "lastActiveDate",
    "trialPeriodUnit",
    "trialPeriodValue",
    "installmentInfo",
    "leasingInfo",
    "subsidyInfo"
})
public class OfferingBasicInfoType {

    protected BigDecimal offeringInstId;
    @XmlElement(required = true)
    protected BigDecimal offeringId;
    protected String purchaseSeq;
    protected EffExpModeType expiryMode;
    protected EffExpModeType effectiveMode;
    protected String activeMode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastActiveDate;
    protected String trialPeriodUnit;
    protected Long trialPeriodValue;
    protected InstallmentInfoType installmentInfo;
    protected LeasingInfoType leasingInfo;
    protected SubsidyInfoType subsidyInfo;

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
     * Obtiene el valor de la propiedad expiryMode.
     * 
     * @return
     *     possible object is
     *     {@link EffExpModeType }
     *     
     */
    public EffExpModeType getExpiryMode() {
        return expiryMode;
    }

    /**
     * Define el valor de la propiedad expiryMode.
     * 
     * @param value
     *     allowed object is
     *     {@link EffExpModeType }
     *     
     */
    public void setExpiryMode(EffExpModeType value) {
        this.expiryMode = value;
    }

    /**
     * Obtiene el valor de la propiedad effectiveMode.
     * 
     * @return
     *     possible object is
     *     {@link EffExpModeType }
     *     
     */
    public EffExpModeType getEffectiveMode() {
        return effectiveMode;
    }

    /**
     * Define el valor de la propiedad effectiveMode.
     * 
     * @param value
     *     allowed object is
     *     {@link EffExpModeType }
     *     
     */
    public void setEffectiveMode(EffExpModeType value) {
        this.effectiveMode = value;
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
     * Obtiene el valor de la propiedad trialPeriodUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrialPeriodUnit() {
        return trialPeriodUnit;
    }

    /**
     * Define el valor de la propiedad trialPeriodUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrialPeriodUnit(String value) {
        this.trialPeriodUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad trialPeriodValue.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrialPeriodValue() {
        return trialPeriodValue;
    }

    /**
     * Define el valor de la propiedad trialPeriodValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrialPeriodValue(Long value) {
        this.trialPeriodValue = value;
    }

    /**
     * Obtiene el valor de la propiedad installmentInfo.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentInfoType }
     *     
     */
    public InstallmentInfoType getInstallmentInfo() {
        return installmentInfo;
    }

    /**
     * Define el valor de la propiedad installmentInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentInfoType }
     *     
     */
    public void setInstallmentInfo(InstallmentInfoType value) {
        this.installmentInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad leasingInfo.
     * 
     * @return
     *     possible object is
     *     {@link LeasingInfoType }
     *     
     */
    public LeasingInfoType getLeasingInfo() {
        return leasingInfo;
    }

    /**
     * Define el valor de la propiedad leasingInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link LeasingInfoType }
     *     
     */
    public void setLeasingInfo(LeasingInfoType value) {
        this.leasingInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad subsidyInfo.
     * 
     * @return
     *     possible object is
     *     {@link SubsidyInfoType }
     *     
     */
    public SubsidyInfoType getSubsidyInfo() {
        return subsidyInfo;
    }

    /**
     * Define el valor de la propiedad subsidyInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidyInfoType }
     *     
     */
    public void setSubsidyInfo(SubsidyInfoType value) {
        this.subsidyInfo = value;
    }

}
