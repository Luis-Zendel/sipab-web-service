
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionMembersType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionMembersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="memberInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="promotionActivityId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="promotionInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="promotionMemberType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="promotionRankId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="rewardId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="rewardTriggerCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="rewardTriggerId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="rewardTriggerType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="rewardType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionMembersType", propOrder = {
    "discount",
    "memberInstId",
    "promotionActivityId",
    "promotionInstId",
    "promotionMemberType",
    "promotionRankId",
    "rewardId",
    "rewardTriggerCode",
    "rewardTriggerId",
    "rewardTriggerType",
    "rewardType"
})
public class PromotionMembersType {

    protected String discount;
    protected BigDecimal memberInstId;
    protected String promotionActivityId;
    protected BigDecimal promotionInstId;
    protected String promotionMemberType;
    protected String promotionRankId;
    protected BigDecimal rewardId;
    protected String rewardTriggerCode;
    protected BigDecimal rewardTriggerId;
    protected String rewardTriggerType;
    protected String rewardType;

    /**
     * Obtiene el valor de la propiedad discount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Define el valor de la propiedad discount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Obtiene el valor de la propiedad memberInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMemberInstId() {
        return memberInstId;
    }

    /**
     * Define el valor de la propiedad memberInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMemberInstId(BigDecimal value) {
        this.memberInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionActivityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionActivityId() {
        return promotionActivityId;
    }

    /**
     * Define el valor de la propiedad promotionActivityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionActivityId(String value) {
        this.promotionActivityId = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromotionInstId() {
        return promotionInstId;
    }

    /**
     * Define el valor de la propiedad promotionInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromotionInstId(BigDecimal value) {
        this.promotionInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionMemberType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionMemberType() {
        return promotionMemberType;
    }

    /**
     * Define el valor de la propiedad promotionMemberType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionMemberType(String value) {
        this.promotionMemberType = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionRankId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionRankId() {
        return promotionRankId;
    }

    /**
     * Define el valor de la propiedad promotionRankId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionRankId(String value) {
        this.promotionRankId = value;
    }

    /**
     * Obtiene el valor de la propiedad rewardId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRewardId() {
        return rewardId;
    }

    /**
     * Define el valor de la propiedad rewardId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRewardId(BigDecimal value) {
        this.rewardId = value;
    }

    /**
     * Obtiene el valor de la propiedad rewardTriggerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardTriggerCode() {
        return rewardTriggerCode;
    }

    /**
     * Define el valor de la propiedad rewardTriggerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardTriggerCode(String value) {
        this.rewardTriggerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad rewardTriggerId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRewardTriggerId() {
        return rewardTriggerId;
    }

    /**
     * Define el valor de la propiedad rewardTriggerId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRewardTriggerId(BigDecimal value) {
        this.rewardTriggerId = value;
    }

    /**
     * Obtiene el valor de la propiedad rewardTriggerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardTriggerType() {
        return rewardTriggerType;
    }

    /**
     * Define el valor de la propiedad rewardTriggerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardTriggerType(String value) {
        this.rewardTriggerType = value;
    }

    /**
     * Obtiene el valor de la propiedad rewardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardType() {
        return rewardType;
    }

    /**
     * Define el valor de la propiedad rewardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardType(String value) {
        this.rewardType = value;
    }

}
