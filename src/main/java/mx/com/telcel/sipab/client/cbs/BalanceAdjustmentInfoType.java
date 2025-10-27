
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BalanceAdjustmentInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BalanceAdjustmentInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="balanceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="balanceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type" minOccurs="0"/&gt;
 *         &lt;element name="ReasonCodeInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="expireTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="offsetUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *             &lt;element name="offsetValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="selectInstanceMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *           &lt;element name="validityExtMethod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="owner" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OwnerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceAdjustmentInfoType", propOrder = {
    "balanceType",
    "balanceID",
    "adjustmentType",
    "adjustmentAmt",
    "currencyID",
    "effectiveTime",
    "reasonCodeInfo",
    "expireTime",
    "offsetUnit",
    "offsetValue",
    "selectInstanceMode",
    "validityExtMethod",
    "owner"
})
public class BalanceAdjustmentInfoType {

    protected String balanceType;
    protected Long balanceID;
    protected String adjustmentType;
    protected Long adjustmentAmt;
    protected BigInteger currencyID;
    protected String effectiveTime;
    @XmlElement(name = "ReasonCodeInfo")
    protected String reasonCodeInfo;
    protected String expireTime;
    protected String offsetUnit;
    protected Integer offsetValue;
    protected String selectInstanceMode;
    protected String validityExtMethod;
    protected OwnerType owner;

    /**
     * Obtiene el valor de la propiedad balanceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * Define el valor de la propiedad balanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBalanceID() {
        return balanceID;
    }

    /**
     * Define el valor de la propiedad balanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBalanceID(Long value) {
        this.balanceID = value;
    }

    /**
     * Obtiene el valor de la propiedad adjustmentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Define el valor de la propiedad adjustmentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentType(String value) {
        this.adjustmentType = value;
    }

    /**
     * Obtiene el valor de la propiedad adjustmentAmt.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdjustmentAmt() {
        return adjustmentAmt;
    }

    /**
     * Define el valor de la propiedad adjustmentAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdjustmentAmt(Long value) {
        this.adjustmentAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyID() {
        return currencyID;
    }

    /**
     * Define el valor de la propiedad currencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyID(BigInteger value) {
        this.currencyID = value;
    }

    /**
     * Obtiene el valor de la propiedad effectiveTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Define el valor de la propiedad effectiveTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveTime(String value) {
        this.effectiveTime = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonCodeInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCodeInfo() {
        return reasonCodeInfo;
    }

    /**
     * Define el valor de la propiedad reasonCodeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCodeInfo(String value) {
        this.reasonCodeInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad expireTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * Define el valor de la propiedad expireTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireTime(String value) {
        this.expireTime = value;
    }

    /**
     * Obtiene el valor de la propiedad offsetUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffsetUnit() {
        return offsetUnit;
    }

    /**
     * Define el valor de la propiedad offsetUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffsetUnit(String value) {
        this.offsetUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad offsetValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffsetValue() {
        return offsetValue;
    }

    /**
     * Define el valor de la propiedad offsetValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffsetValue(Integer value) {
        this.offsetValue = value;
    }

    /**
     * Obtiene el valor de la propiedad selectInstanceMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectInstanceMode() {
        return selectInstanceMode;
    }

    /**
     * Define el valor de la propiedad selectInstanceMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectInstanceMode(String value) {
        this.selectInstanceMode = value;
    }

    /**
     * Obtiene el valor de la propiedad validityExtMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityExtMethod() {
        return validityExtMethod;
    }

    /**
     * Define el valor de la propiedad validityExtMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityExtMethod(String value) {
        this.validityExtMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad owner.
     * 
     * @return
     *     possible object is
     *     {@link OwnerType }
     *     
     */
    public OwnerType getOwner() {
        return owner;
    }

    /**
     * Define el valor de la propiedad owner.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerType }
     *     
     */
    public void setOwner(OwnerType value) {
        this.owner = value;
    }

}
