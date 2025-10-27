
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcctListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcctListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctKeyType"/&gt;
 *         &lt;element name="balanceResult" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctBalanceType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="outStandingList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OutStandingList2Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="numberofDaysDebt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="accountCredit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AccountCreditType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pendingPenaltyList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}PendingPenaltyListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctListType", propOrder = {
    "acctKey",
    "balanceResult",
    "outStandingList",
    "numberofDaysDebt",
    "accountCredit",
    "pendingPenaltyList"
})
public class AcctListType {

    @XmlElement(required = true)
    protected String acctKey;
    @XmlElement(required = true)
    protected List<AcctBalanceType> balanceResult;
    protected List<OutStandingList2Type> outStandingList;
    protected Integer numberofDaysDebt;
    protected List<AccountCreditType> accountCredit;
    protected List<PendingPenaltyListType> pendingPenaltyList;

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
     * {@link AcctBalanceType }
     * 
     * 
     */
    public List<AcctBalanceType> getBalanceResult() {
        if (balanceResult == null) {
            balanceResult = new ArrayList<AcctBalanceType>();
        }
        return this.balanceResult;
    }

    /**
     * Gets the value of the outStandingList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the outStandingList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutStandingList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutStandingList2Type }
     * 
     * 
     */
    public List<OutStandingList2Type> getOutStandingList() {
        if (outStandingList == null) {
            outStandingList = new ArrayList<OutStandingList2Type>();
        }
        return this.outStandingList;
    }

    /**
     * Obtiene el valor de la propiedad numberofDaysDebt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberofDaysDebt() {
        return numberofDaysDebt;
    }

    /**
     * Define el valor de la propiedad numberofDaysDebt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberofDaysDebt(Integer value) {
        this.numberofDaysDebt = value;
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
     * {@link AccountCreditType }
     * 
     * 
     */
    public List<AccountCreditType> getAccountCredit() {
        if (accountCredit == null) {
            accountCredit = new ArrayList<AccountCreditType>();
        }
        return this.accountCredit;
    }

    /**
     * Gets the value of the pendingPenaltyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pendingPenaltyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingPenaltyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingPenaltyListType }
     * 
     * 
     */
    public List<PendingPenaltyListType> getPendingPenaltyList() {
        if (pendingPenaltyList == null) {
            pendingPenaltyList = new ArrayList<PendingPenaltyListType>();
        }
        return this.pendingPenaltyList;
    }

}
