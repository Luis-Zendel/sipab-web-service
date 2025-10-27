
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QuerySumBalanceAndCreditRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QuerySumBalanceAndCreditRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctKeyType"/&gt;
 *         &lt;element name="balanceResult" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}MainAcctBalanceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outStandingResult" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OutStandingResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="accountCredit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AccountCredit2Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="unbilledResult" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}UnbilledResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySumBalanceAndCreditRespType", propOrder = {
    "acctKey",
    "balanceResult",
    "outStandingResult",
    "accountCredit",
    "unbilledResult"
})
public class QuerySumBalanceAndCreditRespType {

    @XmlElement(required = true)
    protected String acctKey;
    protected List<MainAcctBalanceType> balanceResult;
    protected List<OutStandingResultType> outStandingResult;
    protected List<AccountCredit2Type> accountCredit;
    protected List<UnbilledResultType> unbilledResult;

    /**
     * Obtiene el valor de la propiedad acctKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctKey() {
        return acctKey;
    }

    /**
     * Define el valor de la propiedad acctKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctKey(String value) {
        this.acctKey = value;
    }

    /**
     * Gets the value of the balanceResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the balanceResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MainAcctBalanceType }
     * 
     * 
     */
    public List<MainAcctBalanceType> getBalanceResult() {
        if (balanceResult == null) {
            balanceResult = new ArrayList<MainAcctBalanceType>();
        }
        return this.balanceResult;
    }

    /**
     * Gets the value of the outStandingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the outStandingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutStandingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutStandingResultType }
     * 
     * 
     */
    public List<OutStandingResultType> getOutStandingResult() {
        if (outStandingResult == null) {
            outStandingResult = new ArrayList<OutStandingResultType>();
        }
        return this.outStandingResult;
    }

    /**
     * Gets the value of the accountCredit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accountCredit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCredit2Type }
     * 
     * 
     */
    public List<AccountCredit2Type> getAccountCredit() {
        if (accountCredit == null) {
            accountCredit = new ArrayList<AccountCredit2Type>();
        }
        return this.accountCredit;
    }

    /**
     * Gets the value of the unbilledResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unbilledResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnbilledResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnbilledResultType }
     * 
     * 
     */
    public List<UnbilledResultType> getUnbilledResult() {
        if (unbilledResult == null) {
            unbilledResult = new ArrayList<UnbilledResultType>();
        }
        return this.unbilledResult;
    }

}
