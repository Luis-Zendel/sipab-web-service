
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FreeUnitAdjustmentInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FreeUnitAdjustmentInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freeUnitInstanceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="effectiveTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="expireTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="offsetUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *             &lt;element name="offsetValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="selectInstanceMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="validityExtMethod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeUnitAdjustmentInfoType", propOrder = {
    "freeUnitInstanceID",
    "freeUnitType",
    "adjustmentType",
    "adjustmentAmt",
    "effectiveTime",
    "expireTime",
    "offsetUnit",
    "offsetValue",
    "selectInstanceMode",
    "validityExtMethod"
})
public class FreeUnitAdjustmentInfoType {

    protected Long freeUnitInstanceID;
    protected String freeUnitType;
    protected String adjustmentType;
    protected Long adjustmentAmt;
    protected String effectiveTime;
    protected String expireTime;
    protected String offsetUnit;
    protected Integer offsetValue;
    @XmlElement(required = true)
    protected String selectInstanceMode;
    protected String validityExtMethod;

    /**
     * Obtiene el valor de la propiedad freeUnitInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeUnitInstanceID() {
        return freeUnitInstanceID;
    }

    /**
     * Define el valor de la propiedad freeUnitInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeUnitInstanceID(Long value) {
        this.freeUnitInstanceID = value;
    }

    /**
     * Obtiene el valor de la propiedad freeUnitType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeUnitType() {
        return freeUnitType;
    }

    /**
     * Define el valor de la propiedad freeUnitType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeUnitType(String value) {
        this.freeUnitType = value;
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

}
