
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BalanceListARType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BalanceListARType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outStandingAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="prepayment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="availableCreditLimit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="pendingAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="depositAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="disputedAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="unbilledAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="lateFee" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="outStandingDepositAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="overDueAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
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
@XmlType(name = "BalanceListARType", propOrder = {
    "outStandingAmount",
    "prepayment",
    "availableCreditLimit",
    "pendingAmount",
    "depositAmount",
    "disputedAmount",
    "unbilledAmount",
    "lateFee",
    "outStandingDepositAmount",
    "overDueAmount",
    "currencyID"
})
public class BalanceListARType {

    protected long outStandingAmount;
    protected long prepayment;
    protected long availableCreditLimit;
    protected long pendingAmount;
    protected long depositAmount;
    protected long disputedAmount;
    protected long unbilledAmount;
    protected long lateFee;
    protected long outStandingDepositAmount;
    protected long overDueAmount;
    @XmlElement(required = true)
    protected BigInteger currencyID;

    /**
     * Obtiene el valor de la propiedad outStandingAmount.
     * 
     */
    public long getOutStandingAmount() {
        return outStandingAmount;
    }

    /**
     * Define el valor de la propiedad outStandingAmount.
     * 
     */
    public void setOutStandingAmount(long value) {
        this.outStandingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad prepayment.
     * 
     */
    public long getPrepayment() {
        return prepayment;
    }

    /**
     * Define el valor de la propiedad prepayment.
     * 
     */
    public void setPrepayment(long value) {
        this.prepayment = value;
    }

    /**
     * Obtiene el valor de la propiedad availableCreditLimit.
     * 
     */
    public long getAvailableCreditLimit() {
        return availableCreditLimit;
    }

    /**
     * Define el valor de la propiedad availableCreditLimit.
     * 
     */
    public void setAvailableCreditLimit(long value) {
        this.availableCreditLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad pendingAmount.
     * 
     */
    public long getPendingAmount() {
        return pendingAmount;
    }

    /**
     * Define el valor de la propiedad pendingAmount.
     * 
     */
    public void setPendingAmount(long value) {
        this.pendingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad depositAmount.
     * 
     */
    public long getDepositAmount() {
        return depositAmount;
    }

    /**
     * Define el valor de la propiedad depositAmount.
     * 
     */
    public void setDepositAmount(long value) {
        this.depositAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad disputedAmount.
     * 
     */
    public long getDisputedAmount() {
        return disputedAmount;
    }

    /**
     * Define el valor de la propiedad disputedAmount.
     * 
     */
    public void setDisputedAmount(long value) {
        this.disputedAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad unbilledAmount.
     * 
     */
    public long getUnbilledAmount() {
        return unbilledAmount;
    }

    /**
     * Define el valor de la propiedad unbilledAmount.
     * 
     */
    public void setUnbilledAmount(long value) {
        this.unbilledAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad lateFee.
     * 
     */
    public long getLateFee() {
        return lateFee;
    }

    /**
     * Define el valor de la propiedad lateFee.
     * 
     */
    public void setLateFee(long value) {
        this.lateFee = value;
    }

    /**
     * Obtiene el valor de la propiedad outStandingDepositAmount.
     * 
     */
    public long getOutStandingDepositAmount() {
        return outStandingDepositAmount;
    }

    /**
     * Define el valor de la propiedad outStandingDepositAmount.
     * 
     */
    public void setOutStandingDepositAmount(long value) {
        this.outStandingDepositAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad overDueAmount.
     * 
     */
    public long getOverDueAmount() {
        return overDueAmount;
    }

    /**
     * Define el valor de la propiedad overDueAmount.
     * 
     */
    public void setOverDueAmount(long value) {
        this.overDueAmount = value;
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
