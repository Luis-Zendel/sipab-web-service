
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryLoanLogRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryLoanLogRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loanLogSummary" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LoanLogSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="loanLogDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LoanLogDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="repaymentLogDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RepaymentLogDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryLoanLogRespType", propOrder = {
    "loanLogSummary",
    "loanLogDetail",
    "repaymentLogDetail"
})
public class QueryLoanLogRespType {

    protected LoanLogSummaryType loanLogSummary;
    protected List<LoanLogDetailType> loanLogDetail;
    protected List<RepaymentLogDetailType> repaymentLogDetail;

    /**
     * Obtiene el valor de la propiedad loanLogSummary.
     * 
     * @return
     *     possible object is
     *     {@link LoanLogSummaryType }
     *     
     */
    public LoanLogSummaryType getLoanLogSummary() {
        return loanLogSummary;
    }

    /**
     * Define el valor de la propiedad loanLogSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanLogSummaryType }
     *     
     */
    public void setLoanLogSummary(LoanLogSummaryType value) {
        this.loanLogSummary = value;
    }

    /**
     * Gets the value of the loanLogDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the loanLogDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanLogDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanLogDetailType }
     * 
     * 
     */
    public List<LoanLogDetailType> getLoanLogDetail() {
        if (loanLogDetail == null) {
            loanLogDetail = new ArrayList<LoanLogDetailType>();
        }
        return this.loanLogDetail;
    }

    /**
     * Gets the value of the repaymentLogDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentLogDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentLogDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentLogDetailType }
     * 
     * 
     */
    public List<RepaymentLogDetailType> getRepaymentLogDetail() {
        if (repaymentLogDetail == null) {
            repaymentLogDetail = new ArrayList<RepaymentLogDetailType>();
        }
        return this.repaymentLogDetail;
    }

}
