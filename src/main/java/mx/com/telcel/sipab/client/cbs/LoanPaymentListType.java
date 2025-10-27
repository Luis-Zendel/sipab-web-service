
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoanPaymentListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoanPaymentListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paidLoanAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="paidLoanPoundage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="paidLoanPenalty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanPaymentListType", propOrder = {
    "paidLoanAmount",
    "paidLoanPoundage",
    "paidLoanPenalty"
})
public class LoanPaymentListType {

    protected long paidLoanAmount;
    protected long paidLoanPoundage;
    protected long paidLoanPenalty;

    /**
     * Obtiene el valor de la propiedad paidLoanAmount.
     * 
     */
    public long getPaidLoanAmount() {
        return paidLoanAmount;
    }

    /**
     * Define el valor de la propiedad paidLoanAmount.
     * 
     */
    public void setPaidLoanAmount(long value) {
        this.paidLoanAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paidLoanPoundage.
     * 
     */
    public long getPaidLoanPoundage() {
        return paidLoanPoundage;
    }

    /**
     * Define el valor de la propiedad paidLoanPoundage.
     * 
     */
    public void setPaidLoanPoundage(long value) {
        this.paidLoanPoundage = value;
    }

    /**
     * Obtiene el valor de la propiedad paidLoanPenalty.
     * 
     */
    public long getPaidLoanPenalty() {
        return paidLoanPenalty;
    }

    /**
     * Define el valor de la propiedad paidLoanPenalty.
     * 
     */
    public void setPaidLoanPenalty(long value) {
        this.paidLoanPenalty = value;
    }

}
