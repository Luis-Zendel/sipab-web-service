
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountCredit2Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountCredit2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditLimitType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="creditLimitTypeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="totalCreditAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="totalUsageAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="totalRemainAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCredit2Type", propOrder = {
    "creditLimitType",
    "creditLimitTypeName",
    "totalCreditAmount",
    "totalUsageAmount",
    "totalRemainAmount",
    "currencyID"
})
public class AccountCredit2Type {

    protected String creditLimitType;
    protected String creditLimitTypeName;
    protected long totalCreditAmount;
    protected long totalUsageAmount;
    protected long totalRemainAmount;
    @XmlElement(required = true)
    protected BigInteger currencyID;

    /**
     * Obtiene el valor de la propiedad creditLimitType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitType() {
        return creditLimitType;
    }

    /**
     * Define el valor de la propiedad creditLimitType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitType(String value) {
        this.creditLimitType = value;
    }

    /**
     * Obtiene el valor de la propiedad creditLimitTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitTypeName() {
        return creditLimitTypeName;
    }

    /**
     * Define el valor de la propiedad creditLimitTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitTypeName(String value) {
        this.creditLimitTypeName = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCreditAmount.
     * 
     */
    public long getTotalCreditAmount() {
        return totalCreditAmount;
    }

    /**
     * Define el valor de la propiedad totalCreditAmount.
     * 
     */
    public void setTotalCreditAmount(long value) {
        this.totalCreditAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalUsageAmount.
     * 
     */
    public long getTotalUsageAmount() {
        return totalUsageAmount;
    }

    /**
     * Define el valor de la propiedad totalUsageAmount.
     * 
     */
    public void setTotalUsageAmount(long value) {
        this.totalUsageAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRemainAmount.
     * 
     */
    public long getTotalRemainAmount() {
        return totalRemainAmount;
    }

    /**
     * Define el valor de la propiedad totalRemainAmount.
     * 
     */
    public void setTotalRemainAmount(long value) {
        this.totalRemainAmount = value;
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

}
