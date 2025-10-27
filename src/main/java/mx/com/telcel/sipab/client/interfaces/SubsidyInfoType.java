
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubsidyInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubsidyInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subsidyInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="subsidyId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="refInstallmentId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="totalPeriod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal10c0Type"/&gt;
 *         &lt;element name="firstPrice" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="firstPeriodAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="middlePeriodAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="lastPeriodAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="chargeCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="opCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="mode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="delayCycle" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal10c0Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidyInfoType", propOrder = {
    "subsidyInstId",
    "subsidyId",
    "refInstallmentId",
    "totalPeriod",
    "firstPrice",
    "firstPeriodAmount",
    "middlePeriodAmount",
    "lastPeriodAmount",
    "chargeCode",
    "opCode",
    "mode",
    "delayCycle"
})
public class SubsidyInfoType {

    protected BigDecimal subsidyInstId;
    protected BigDecimal subsidyId;
    protected BigDecimal refInstallmentId;
    @XmlElement(required = true)
    protected BigDecimal totalPeriod;
    @XmlElement(required = true)
    protected BigDecimal firstPrice;
    @XmlElement(required = true)
    protected BigDecimal firstPeriodAmount;
    @XmlElement(required = true)
    protected BigDecimal middlePeriodAmount;
    @XmlElement(required = true)
    protected BigDecimal lastPeriodAmount;
    @XmlElement(required = true)
    protected String chargeCode;
    protected String opCode;
    protected String mode;
    protected BigDecimal delayCycle;

    /**
     * Obtiene el valor de la propiedad subsidyInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsidyInstId() {
        return subsidyInstId;
    }

    /**
     * Define el valor de la propiedad subsidyInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsidyInstId(BigDecimal value) {
        this.subsidyInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad subsidyId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsidyId() {
        return subsidyId;
    }

    /**
     * Define el valor de la propiedad subsidyId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsidyId(BigDecimal value) {
        this.subsidyId = value;
    }

    /**
     * Obtiene el valor de la propiedad refInstallmentId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefInstallmentId() {
        return refInstallmentId;
    }

    /**
     * Define el valor de la propiedad refInstallmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefInstallmentId(BigDecimal value) {
        this.refInstallmentId = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPeriod.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPeriod() {
        return totalPeriod;
    }

    /**
     * Define el valor de la propiedad totalPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPeriod(BigDecimal value) {
        this.totalPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad firstPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstPrice() {
        return firstPrice;
    }

    /**
     * Define el valor de la propiedad firstPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstPrice(BigDecimal value) {
        this.firstPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad firstPeriodAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstPeriodAmount() {
        return firstPeriodAmount;
    }

    /**
     * Define el valor de la propiedad firstPeriodAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstPeriodAmount(BigDecimal value) {
        this.firstPeriodAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad middlePeriodAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiddlePeriodAmount() {
        return middlePeriodAmount;
    }

    /**
     * Define el valor de la propiedad middlePeriodAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiddlePeriodAmount(BigDecimal value) {
        this.middlePeriodAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad lastPeriodAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPeriodAmount() {
        return lastPeriodAmount;
    }

    /**
     * Define el valor de la propiedad lastPeriodAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPeriodAmount(BigDecimal value) {
        this.lastPeriodAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * Define el valor de la propiedad chargeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCode(String value) {
        this.chargeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad opCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpCode() {
        return opCode;
    }

    /**
     * Define el valor de la propiedad opCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpCode(String value) {
        this.opCode = value;
    }

    /**
     * Obtiene el valor de la propiedad mode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Define el valor de la propiedad mode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Obtiene el valor de la propiedad delayCycle.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDelayCycle() {
        return delayCycle;
    }

    /**
     * Define el valor de la propiedad delayCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDelayCycle(BigDecimal value) {
        this.delayCycle = value;
    }

}
