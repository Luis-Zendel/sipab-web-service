
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RechargeRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RechargeRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rechargeSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="balanceChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="loanChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LoanChgInfoType" minOccurs="0"/&gt;
 *         &lt;element name="rechargeBonus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RechargeBonus2Type" minOccurs="0"/&gt;
 *         &lt;element name="lifeCycleChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LifeCycleChgInfo21Type" minOccurs="0"/&gt;
 *         &lt;element name="creditChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CreditChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="redoOfferInfoList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RedoOfferInfoListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargeRespType", propOrder = {
    "rechargeSerialNo",
    "balanceChgInfo",
    "loanChgInfo",
    "rechargeBonus",
    "lifeCycleChgInfo",
    "creditChgInfo",
    "redoOfferInfoList"
})
public class RechargeRespType {

    @XmlElement(required = true)
    protected String rechargeSerialNo;
    protected List<BalanceChgInfoType> balanceChgInfo;
    protected LoanChgInfoType loanChgInfo;
    protected RechargeBonus2Type rechargeBonus;
    protected LifeCycleChgInfo21Type lifeCycleChgInfo;
    protected List<CreditChgInfoType> creditChgInfo;
    protected List<RedoOfferInfoListType> redoOfferInfoList;

    /**
     * Obtiene el valor de la propiedad rechargeSerialNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeSerialNo() {
        return rechargeSerialNo;
    }

    /**
     * Define el valor de la propiedad rechargeSerialNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeSerialNo(String value) {
        this.rechargeSerialNo = value;
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
     * Obtiene el valor de la propiedad rechargeBonus.
     * 
     * @return
     *     possible object is
     *     {@link RechargeBonus2Type }
     *     
     */
    public RechargeBonus2Type getRechargeBonus() {
        return rechargeBonus;
    }

    /**
     * Define el valor de la propiedad rechargeBonus.
     * 
     * @param value
     *     allowed object is
     *     {@link RechargeBonus2Type }
     *     
     */
    public void setRechargeBonus(RechargeBonus2Type value) {
        this.rechargeBonus = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeCycleChgInfo.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleChgInfo21Type }
     *     
     */
    public LifeCycleChgInfo21Type getLifeCycleChgInfo() {
        return lifeCycleChgInfo;
    }

    /**
     * Define el valor de la propiedad lifeCycleChgInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleChgInfo21Type }
     *     
     */
    public void setLifeCycleChgInfo(LifeCycleChgInfo21Type value) {
        this.lifeCycleChgInfo = value;
    }

    /**
     * Gets the value of the creditChgInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the creditChgInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditChgInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditChgInfoType }
     * 
     * 
     */
    public List<CreditChgInfoType> getCreditChgInfo() {
        if (creditChgInfo == null) {
            creditChgInfo = new ArrayList<CreditChgInfoType>();
        }
        return this.creditChgInfo;
    }

    /**
     * Gets the value of the redoOfferInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the redoOfferInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedoOfferInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedoOfferInfoListType }
     * 
     * 
     */
    public List<RedoOfferInfoListType> getRedoOfferInfoList() {
        if (redoOfferInfoList == null) {
            redoOfferInfoList = new ArrayList<RedoOfferInfoListType>();
        }
        return this.redoOfferInfoList;
    }

}
