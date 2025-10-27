
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoanChgInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoanChgInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oldLoanAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="newLoanAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="loanPaymentAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="loanInterestAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/&gt;
 *         &lt;element name="payLoanPoundage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanChgInfoType", propOrder = {
    "oldLoanAmt",
    "newLoanAmt",
    "loanPaymentAmt",
    "loanInterestAmt",
    "currencyID",
    "payLoanPoundage"
})
public class LoanChgInfoType {

    protected long oldLoanAmt;
    protected long newLoanAmt;
    protected long loanPaymentAmt;
    protected long loanInterestAmt;
    @XmlElement(required = true)
    protected BigInteger currencyID;
    protected long payLoanPoundage;

    /**
     * Obtiene el valor de la propiedad oldLoanAmt.
     * 
     */
    public long getOldLoanAmt() {
        return oldLoanAmt;
    }

    /**
     * Define el valor de la propiedad oldLoanAmt.
     * 
     */
    public void setOldLoanAmt(long value) {
        this.oldLoanAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad newLoanAmt.
     * 
     */
    public long getNewLoanAmt() {
        return newLoanAmt;
    }

    /**
     * Define el valor de la propiedad newLoanAmt.
     * 
     */
    public void setNewLoanAmt(long value) {
        this.newLoanAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad loanPaymentAmt.
     * 
     */
    public long getLoanPaymentAmt() {
        return loanPaymentAmt;
    }

    /**
     * Define el valor de la propiedad loanPaymentAmt.
     * 
     */
    public void setLoanPaymentAmt(long value) {
        this.loanPaymentAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad loanInterestAmt.
     * 
     */
    public long getLoanInterestAmt() {
        return loanInterestAmt;
    }

    /**
     * Define el valor de la propiedad loanInterestAmt.
     * 
     */
    public void setLoanInterestAmt(long value) {
        this.loanInterestAmt = value;
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
     * Obtiene el valor de la propiedad payLoanPoundage.
     * 
     */
    public long getPayLoanPoundage() {
        return payLoanPoundage;
    }

    /**
     * Define el valor de la propiedad payLoanPoundage.
     * 
     */
    public void setPayLoanPoundage(long value) {
        this.payLoanPoundage = value;
    }

}
