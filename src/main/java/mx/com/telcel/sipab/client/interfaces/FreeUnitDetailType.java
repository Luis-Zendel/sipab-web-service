
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FreeUnitDetailType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FreeUnitDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InitialAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="CurrentAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="MaxUsageAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="OfferingCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseSeq" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeUnitDetailType", propOrder = {
    "initialAmount",
    "currentAmount",
    "maxUsageAmt",
    "offeringCode",
    "purchaseSeq"
})
public class FreeUnitDetailType {

    @XmlElement(name = "InitialAmount")
    protected BigDecimal initialAmount;
    @XmlElement(name = "CurrentAmount")
    protected BigDecimal currentAmount;
    @XmlElement(name = "MaxUsageAmt")
    protected BigDecimal maxUsageAmt;
    @XmlElement(name = "OfferingCode")
    protected String offeringCode;
    @XmlElement(name = "PurchaseSeq")
    protected String purchaseSeq;

    /**
     * Obtiene el valor de la propiedad initialAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialAmount() {
        return initialAmount;
    }

    /**
     * Define el valor de la propiedad initialAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialAmount(BigDecimal value) {
        this.initialAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad currentAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    /**
     * Define el valor de la propiedad currentAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentAmount(BigDecimal value) {
        this.currentAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad maxUsageAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxUsageAmt() {
        return maxUsageAmt;
    }

    /**
     * Define el valor de la propiedad maxUsageAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxUsageAmt(BigDecimal value) {
        this.maxUsageAmt = value;
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

}
