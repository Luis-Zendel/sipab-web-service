
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FreeUnitItemListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FreeUnitItemListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freeUnitID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="freeUnitType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="freeUnitTypeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="measureUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="measureUnitName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="bonusAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="effectiveTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *         &lt;element name="expireTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeUnitItemListType", propOrder = {
    "freeUnitID",
    "freeUnitType",
    "freeUnitTypeName",
    "measureUnit",
    "measureUnitName",
    "bonusAmt",
    "effectiveTime",
    "expireTime"
})
public class FreeUnitItemListType {

    @XmlElement(required = true)
    protected String freeUnitID;
    @XmlElement(required = true)
    protected String freeUnitType;
    protected String freeUnitTypeName;
    @XmlElement(required = true)
    protected String measureUnit;
    protected String measureUnitName;
    protected long bonusAmt;
    @XmlElement(required = true)
    protected String effectiveTime;
    @XmlElement(required = true)
    protected String expireTime;

    /**
     * Obtiene el valor de la propiedad freeUnitID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeUnitID() {
        return freeUnitID;
    }

    /**
     * Define el valor de la propiedad freeUnitID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeUnitID(String value) {
        this.freeUnitID = value;
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
     * Obtiene el valor de la propiedad freeUnitTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeUnitTypeName() {
        return freeUnitTypeName;
    }

    /**
     * Define el valor de la propiedad freeUnitTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeUnitTypeName(String value) {
        this.freeUnitTypeName = value;
    }

    /**
     * Obtiene el valor de la propiedad measureUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureUnit() {
        return measureUnit;
    }

    /**
     * Define el valor de la propiedad measureUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureUnit(String value) {
        this.measureUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad measureUnitName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureUnitName() {
        return measureUnitName;
    }

    /**
     * Define el valor de la propiedad measureUnitName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureUnitName(String value) {
        this.measureUnitName = value;
    }

    /**
     * Obtiene el valor de la propiedad bonusAmt.
     * 
     */
    public long getBonusAmt() {
        return bonusAmt;
    }

    /**
     * Define el valor de la propiedad bonusAmt.
     * 
     */
    public void setBonusAmt(long value) {
        this.bonusAmt = value;
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

}
