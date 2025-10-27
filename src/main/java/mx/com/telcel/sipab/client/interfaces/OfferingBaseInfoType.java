
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OfferingBaseInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OfferingBaseInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offeringId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="offeringCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="offeringName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="offeringShortName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="offerDesc" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="offerShortDesc" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="brandId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="isAutoCreate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="isBundled" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="isPricingPack" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="isPrimary" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="isSellSingly" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="isMultiPurchase" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="effectiveMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}EffectiveModeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expiredMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ExpiredModeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sellObject" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="busiModeType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="offeringType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="maxPrice" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal8c2Type" minOccurs="0"/&gt;
 *         &lt;element name="minPrice" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal8c2Type" minOccurs="0"/&gt;
 *         &lt;element name="minDisplayPrice" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal8c2Type" minOccurs="0"/&gt;
 *         &lt;element name="maxDisplayPrice" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal8c2Type" minOccurs="0"/&gt;
 *         &lt;element name="displayPrice" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal8c2Type" minOccurs="0"/&gt;
 *         &lt;element name="monthlyFee" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal8c2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferingBaseInfoType", propOrder = {
    "offeringId",
    "offeringCode",
    "offeringName",
    "offeringShortName",
    "offerDesc",
    "offerShortDesc",
    "brandId",
    "isAutoCreate",
    "isBundled",
    "isPricingPack",
    "isPrimary",
    "isSellSingly",
    "paymentMode",
    "isMultiPurchase",
    "effectiveMode",
    "expiredMode",
    "sellObject",
    "busiModeType",
    "offeringType",
    "maxPrice",
    "minPrice",
    "minDisplayPrice",
    "maxDisplayPrice",
    "displayPrice",
    "monthlyFee"
})
public class OfferingBaseInfoType {

    @XmlElement(required = true)
    protected BigDecimal offeringId;
    protected String offeringCode;
    protected String offeringName;
    protected String offeringShortName;
    protected String offerDesc;
    protected String offerShortDesc;
    protected BigDecimal brandId;
    @XmlElement(required = true)
    protected String isAutoCreate;
    @XmlElement(required = true)
    protected String isBundled;
    @XmlElement(required = true)
    protected String isPricingPack;
    @XmlElement(required = true)
    protected String isPrimary;
    protected String isSellSingly;
    protected String paymentMode;
    protected String isMultiPurchase;
    protected List<EffectiveModeType> effectiveMode;
    protected List<ExpiredModeType> expiredMode;
    protected String sellObject;
    protected String busiModeType;
    protected String offeringType;
    protected BigDecimal maxPrice;
    protected BigDecimal minPrice;
    protected BigDecimal minDisplayPrice;
    protected BigDecimal maxDisplayPrice;
    protected BigDecimal displayPrice;
    protected BigDecimal monthlyFee;

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
     * Obtiene el valor de la propiedad offeringName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingName() {
        return offeringName;
    }

    /**
     * Define el valor de la propiedad offeringName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingName(String value) {
        this.offeringName = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringShortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingShortName() {
        return offeringShortName;
    }

    /**
     * Define el valor de la propiedad offeringShortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingShortName(String value) {
        this.offeringShortName = value;
    }

    /**
     * Obtiene el valor de la propiedad offerDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferDesc() {
        return offerDesc;
    }

    /**
     * Define el valor de la propiedad offerDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferDesc(String value) {
        this.offerDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad offerShortDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferShortDesc() {
        return offerShortDesc;
    }

    /**
     * Define el valor de la propiedad offerShortDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferShortDesc(String value) {
        this.offerShortDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad brandId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBrandId() {
        return brandId;
    }

    /**
     * Define el valor de la propiedad brandId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBrandId(BigDecimal value) {
        this.brandId = value;
    }

    /**
     * Obtiene el valor de la propiedad isAutoCreate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAutoCreate() {
        return isAutoCreate;
    }

    /**
     * Define el valor de la propiedad isAutoCreate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAutoCreate(String value) {
        this.isAutoCreate = value;
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
     * Obtiene el valor de la propiedad isPricingPack.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPricingPack() {
        return isPricingPack;
    }

    /**
     * Define el valor de la propiedad isPricingPack.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPricingPack(String value) {
        this.isPricingPack = value;
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
     * Obtiene el valor de la propiedad isSellSingly.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSellSingly() {
        return isSellSingly;
    }

    /**
     * Define el valor de la propiedad isSellSingly.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSellSingly(String value) {
        this.isSellSingly = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     * Define el valor de la propiedad paymentMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMode(String value) {
        this.paymentMode = value;
    }

    /**
     * Obtiene el valor de la propiedad isMultiPurchase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMultiPurchase() {
        return isMultiPurchase;
    }

    /**
     * Define el valor de la propiedad isMultiPurchase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMultiPurchase(String value) {
        this.isMultiPurchase = value;
    }

    /**
     * Gets the value of the effectiveMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectiveModeType }
     * 
     * 
     */
    public List<EffectiveModeType> getEffectiveMode() {
        if (effectiveMode == null) {
            effectiveMode = new ArrayList<EffectiveModeType>();
        }
        return this.effectiveMode;
    }

    /**
     * Gets the value of the expiredMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the expiredMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpiredMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpiredModeType }
     * 
     * 
     */
    public List<ExpiredModeType> getExpiredMode() {
        if (expiredMode == null) {
            expiredMode = new ArrayList<ExpiredModeType>();
        }
        return this.expiredMode;
    }

    /**
     * Obtiene el valor de la propiedad sellObject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellObject() {
        return sellObject;
    }

    /**
     * Define el valor de la propiedad sellObject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellObject(String value) {
        this.sellObject = value;
    }

    /**
     * Obtiene el valor de la propiedad busiModeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusiModeType() {
        return busiModeType;
    }

    /**
     * Define el valor de la propiedad busiModeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusiModeType(String value) {
        this.busiModeType = value;
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
     * Obtiene el valor de la propiedad maxPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    /**
     * Define el valor de la propiedad maxPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPrice(BigDecimal value) {
        this.maxPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad minPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    /**
     * Define el valor de la propiedad minPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinPrice(BigDecimal value) {
        this.minPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad minDisplayPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinDisplayPrice() {
        return minDisplayPrice;
    }

    /**
     * Define el valor de la propiedad minDisplayPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinDisplayPrice(BigDecimal value) {
        this.minDisplayPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad maxDisplayPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxDisplayPrice() {
        return maxDisplayPrice;
    }

    /**
     * Define el valor de la propiedad maxDisplayPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxDisplayPrice(BigDecimal value) {
        this.maxDisplayPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad displayPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisplayPrice() {
        return displayPrice;
    }

    /**
     * Define el valor de la propiedad displayPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisplayPrice(BigDecimal value) {
        this.displayPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad monthlyFee.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlyFee() {
        return monthlyFee;
    }

    /**
     * Define el valor de la propiedad monthlyFee.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlyFee(BigDecimal value) {
        this.monthlyFee = value;
    }

}
