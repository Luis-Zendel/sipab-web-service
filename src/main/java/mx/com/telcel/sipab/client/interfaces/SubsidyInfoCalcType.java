
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubsidyInfoCalcType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubsidyInfoCalcType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="totalPeriod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal8c2Type"/&gt;
 *         &lt;element name="firstPeriodAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal10Type" minOccurs="0"/&gt;
 *         &lt;element name="middlePeriodAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal10Type" minOccurs="0"/&gt;
 *         &lt;element name="lastPeriodAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal10Type" minOccurs="0"/&gt;
 *         &lt;element name="chargeCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidyInfoCalcType", propOrder = {
    "totalAmount",
    "totalPeriod",
    "firstPeriodAmount",
    "middlePeriodAmount",
    "lastPeriodAmount",
    "chargeCode"
})
public class SubsidyInfoCalcType {

    @XmlElement(required = true)
    protected BigDecimal totalAmount;
    @XmlElement(required = true)
    protected BigDecimal totalPeriod;
    protected BigDecimal firstPeriodAmount;
    protected BigDecimal middlePeriodAmount;
    protected BigDecimal lastPeriodAmount;
    protected String chargeCode;

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
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

}
