
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="balanceChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="loanChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LoanChgInfoType" minOccurs="0"/&gt;
 *         &lt;element name="paymentBonus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}PaymentBonusType" minOccurs="0"/&gt;
 *         &lt;element name="lifeCycleChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LifeCycleChgInfo4Type" minOccurs="0"/&gt;
 *         &lt;element name="outStandingList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OutStandingListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRespType", propOrder = {
    "paymentSerialNo",
    "balanceChgInfo",
    "loanChgInfo",
    "paymentBonus",
    "lifeCycleChgInfo",
    "outStandingList"
})
public class PaymentRespType {

    @XmlElement(required = true)
    protected String paymentSerialNo;
    protected List<BalanceChgInfoType> balanceChgInfo;
    protected LoanChgInfoType loanChgInfo;
    protected PaymentBonusType paymentBonus;
    protected LifeCycleChgInfo4Type lifeCycleChgInfo;
    protected List<OutStandingListType> outStandingList;

    /**
     * Obtiene el valor de la propiedad paymentSerialNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSerialNo() {
        return paymentSerialNo;
    }

    /**
     * Define el valor de la propiedad paymentSerialNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSerialNo(String value) {
        this.paymentSerialNo = value;
    }

    /**
     * Gets the value of the balanceChgInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the balanceChgInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceChgInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceChgInfoType }
     * 
     * 
     */
    public List<BalanceChgInfoType> getBalanceChgInfo() {
        if (balanceChgInfo == null) {
            balanceChgInfo = new ArrayList<BalanceChgInfoType>();
        }
        return this.balanceChgInfo;
    }

    /**
     * Obtiene el valor de la propiedad loanChgInfo.
     * 
     * @return
     *     possible object is
     *     {@link LoanChgInfoType }
     *     
     */
    public LoanChgInfoType getLoanChgInfo() {
        return loanChgInfo;
    }

    /**
     * Define el valor de la propiedad loanChgInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanChgInfoType }
     *     
     */
    public void setLoanChgInfo(LoanChgInfoType value) {
        this.loanChgInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentBonus.
     * 
     * @return
     *     possible object is
     *     {@link PaymentBonusType }
     *     
     */
    public PaymentBonusType getPaymentBonus() {
        return paymentBonus;
    }

    /**
     * Define el valor de la propiedad paymentBonus.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentBonusType }
     *     
     */
    public void setPaymentBonus(PaymentBonusType value) {
        this.paymentBonus = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeCycleChgInfo.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleChgInfo4Type }
     *     
     */
    public LifeCycleChgInfo4Type getLifeCycleChgInfo() {
        return lifeCycleChgInfo;
    }

    /**
     * Define el valor de la propiedad lifeCycleChgInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleChgInfo4Type }
     *     
     */
    public void setLifeCycleChgInfo(LifeCycleChgInfo4Type value) {
        this.lifeCycleChgInfo = value;
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
     * {@link OutStandingListType }
     * 
     * 
     */
    public List<OutStandingListType> getOutStandingList() {
        if (outStandingList == null) {
            outStandingList = new ArrayList<OutStandingListType>();
        }
        return this.outStandingList;
    }

}
