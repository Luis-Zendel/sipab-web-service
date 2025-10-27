
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RechargeInfo2Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RechargeInfo2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctKeyType"/&gt;
 *         &lt;element name="subKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="primaryIdentity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="transID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="extTransID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="rechargeAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/&gt;
 *         &lt;element name="oriAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="oriCurrencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType" minOccurs="0"/&gt;
 *         &lt;element name="currencyRate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FloatType" minOccurs="0"/&gt;
 *         &lt;element name="rechargeTax" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="rechargePenalty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="rechargeType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica24Type"/&gt;
 *         &lt;element name="extRechargeType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="cardInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CardInfoType" minOccurs="0"/&gt;
 *         &lt;element name="bankInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BankInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rechargeChannelID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica8Type" minOccurs="0"/&gt;
 *         &lt;element name="rechargeReason" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica24Type" minOccurs="0"/&gt;
 *         &lt;element name="operID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="deptID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="resultCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica24Type" minOccurs="0"/&gt;
 *         &lt;element name="reversalFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="reversalReason" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica16Type" minOccurs="0"/&gt;
 *         &lt;element name="reversalOpID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="reversalDeptID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="reversalTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="lifeCycleChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LifeCycleChgInfo2Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="balanceChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="rechargeBonus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RechargeBonus2Type" minOccurs="0"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CreditChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="loanPaymentList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LoanPaymentListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargeInfo2Type", propOrder = {
    "tradeTime",
    "acctKey",
    "subKey",
    "primaryIdentity",
    "transID",
    "extTransID",
    "rechargeAmount",
    "currencyID",
    "oriAmount",
    "oriCurrencyID",
    "currencyRate",
    "rechargeTax",
    "rechargePenalty",
    "rechargeType",
    "extRechargeType",
    "cardInfo",
    "bankInfo",
    "rechargeChannelID",
    "rechargeReason",
    "operID",
    "deptID",
    "resultCode",
    "reversalFlag",
    "reversalReason",
    "reversalOpID",
    "reversalDeptID",
    "reversalTime",
    "lifeCycleChgInfo",
    "balanceChgInfo",
    "rechargeBonus",
    "additionalProperty",
    "creditChgInfo",
    "remark",
    "loanPaymentList"
})
public class RechargeInfo2Type {

    @XmlElement(required = true)
    protected String tradeTime;
    @XmlElement(required = true)
    protected String acctKey;
    protected String subKey;
    protected String primaryIdentity;
    protected long transID;
    protected String extTransID;
    protected long rechargeAmount;
    @XmlElement(required = true)
    protected BigInteger currencyID;
    protected Long oriAmount;
    protected BigInteger oriCurrencyID;
    protected Float currencyRate;
    protected Long rechargeTax;
    protected Long rechargePenalty;
    @XmlElement(required = true)
    protected String rechargeType;
    protected String extRechargeType;
    protected CardInfoType cardInfo;
    protected List<BankInfoType> bankInfo;
    protected String rechargeChannelID;
    protected String rechargeReason;
    protected Long operID;
    protected Long deptID;
    protected String resultCode;
    @XmlElement(required = true)
    protected String reversalFlag;
    protected String reversalReason;
    protected Long reversalOpID;
    protected Long reversalDeptID;
    protected String reversalTime;
    protected List<LifeCycleChgInfo2Type> lifeCycleChgInfo;
    protected List<BalanceChgInfoType> balanceChgInfo;
    protected RechargeBonus2Type rechargeBonus;
    protected List<SimplePropertyType> additionalProperty;
    protected List<CreditChgInfoType> creditChgInfo;
    protected String remark;
    protected List<LoanPaymentListType> loanPaymentList;

    /**
     * Obtiene el valor de la propiedad tradeTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeTime() {
        return tradeTime;
    }

    /**
     * Define el valor de la propiedad tradeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeTime(String value) {
        this.tradeTime = value;
    }

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
     * Obtiene el valor de la propiedad subKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubKey() {
        return subKey;
    }

    /**
     * Define el valor de la propiedad subKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubKey(String value) {
        this.subKey = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryIdentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    /**
     * Define el valor de la propiedad primaryIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIdentity(String value) {
        this.primaryIdentity = value;
    }

    /**
     * Obtiene el valor de la propiedad transID.
     * 
     */
    public long getTransID() {
        return transID;
    }

    /**
     * Define el valor de la propiedad transID.
     * 
     */
    public void setTransID(long value) {
        this.transID = value;
    }

    /**
     * Obtiene el valor de la propiedad extTransID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTransID() {
        return extTransID;
    }

    /**
     * Define el valor de la propiedad extTransID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTransID(String value) {
        this.extTransID = value;
    }

    /**
     * Obtiene el valor de la propiedad rechargeAmount.
     * 
     */
    public long getRechargeAmount() {
        return rechargeAmount;
    }

    /**
     * Define el valor de la propiedad rechargeAmount.
     * 
     */
    public void setRechargeAmount(long value) {
        this.rechargeAmount = value;
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
     * Obtiene el valor de la propiedad oriAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriAmount() {
        return oriAmount;
    }

    /**
     * Define el valor de la propiedad oriAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriAmount(Long value) {
        this.oriAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad oriCurrencyID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriCurrencyID() {
        return oriCurrencyID;
    }

    /**
     * Define el valor de la propiedad oriCurrencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriCurrencyID(BigInteger value) {
        this.oriCurrencyID = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Define el valor de la propiedad currencyRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCurrencyRate(Float value) {
        this.currencyRate = value;
    }

    /**
     * Obtiene el valor de la propiedad rechargeTax.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRechargeTax() {
        return rechargeTax;
    }

    /**
     * Define el valor de la propiedad rechargeTax.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRechargeTax(Long value) {
        this.rechargeTax = value;
    }

    /**
     * Obtiene el valor de la propiedad rechargePenalty.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRechargePenalty() {
        return rechargePenalty;
    }

    /**
     * Define el valor de la propiedad rechargePenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRechargePenalty(Long value) {
        this.rechargePenalty = value;
    }

    /**
     * Obtiene el valor de la propiedad rechargeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeType() {
        return rechargeType;
    }

    /**
     * Define el valor de la propiedad rechargeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeType(String value) {
        this.rechargeType = value;
    }

    /**
     * Obtiene el valor de la propiedad extRechargeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtRechargeType() {
        return extRechargeType;
    }

    /**
     * Define el valor de la propiedad extRechargeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtRechargeType(String value) {
        this.extRechargeType = value;
    }

    /**
     * Obtiene el valor de la propiedad cardInfo.
     * 
     * @return
     *     possible object is
     *     {@link CardInfoType }
     *     
     */
    public CardInfoType getCardInfo() {
        return cardInfo;
    }

    /**
     * Define el valor de la propiedad cardInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfoType }
     *     
     */
    public void setCardInfo(CardInfoType value) {
        this.cardInfo = value;
    }

    /**
     * Gets the value of the bankInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bankInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankInfoType }
     * 
     * 
     */
    public List<BankInfoType> getBankInfo() {
        if (bankInfo == null) {
            bankInfo = new ArrayList<BankInfoType>();
        }
        return this.bankInfo;
    }

    /**
     * Obtiene el valor de la propiedad rechargeChannelID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeChannelID() {
        return rechargeChannelID;
    }

    /**
     * Define el valor de la propiedad rechargeChannelID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeChannelID(String value) {
        this.rechargeChannelID = value;
    }

    /**
     * Obtiene el valor de la propiedad rechargeReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeReason() {
        return rechargeReason;
    }

    /**
     * Define el valor de la propiedad rechargeReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeReason(String value) {
        this.rechargeReason = value;
    }

    /**
     * Obtiene el valor de la propiedad operID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperID() {
        return operID;
    }

    /**
     * Define el valor de la propiedad operID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperID(Long value) {
        this.operID = value;
    }

    /**
     * Obtiene el valor de la propiedad deptID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeptID() {
        return deptID;
    }

    /**
     * Define el valor de la propiedad deptID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeptID(Long value) {
        this.deptID = value;
    }

    /**
     * Obtiene el valor de la propiedad resultCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Define el valor de la propiedad resultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Obtiene el valor de la propiedad reversalFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversalFlag() {
        return reversalFlag;
    }

    /**
     * Define el valor de la propiedad reversalFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversalFlag(String value) {
        this.reversalFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad reversalReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversalReason() {
        return reversalReason;
    }

    /**
     * Define el valor de la propiedad reversalReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversalReason(String value) {
        this.reversalReason = value;
    }

    /**
     * Obtiene el valor de la propiedad reversalOpID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReversalOpID() {
        return reversalOpID;
    }

    /**
     * Define el valor de la propiedad reversalOpID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReversalOpID(Long value) {
        this.reversalOpID = value;
    }

    /**
     * Obtiene el valor de la propiedad reversalDeptID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReversalDeptID() {
        return reversalDeptID;
    }

    /**
     * Define el valor de la propiedad reversalDeptID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReversalDeptID(Long value) {
        this.reversalDeptID = value;
    }

    /**
     * Obtiene el valor de la propiedad reversalTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversalTime() {
        return reversalTime;
    }

    /**
     * Define el valor de la propiedad reversalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversalTime(String value) {
        this.reversalTime = value;
    }

    /**
     * Gets the value of the lifeCycleChgInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lifeCycleChgInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLifeCycleChgInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LifeCycleChgInfo2Type }
     * 
     * 
     */
    public List<LifeCycleChgInfo2Type> getLifeCycleChgInfo() {
        if (lifeCycleChgInfo == null) {
            lifeCycleChgInfo = new ArrayList<LifeCycleChgInfo2Type>();
        }
        return this.lifeCycleChgInfo;
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
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyType }
     * 
     * 
     */
    public List<SimplePropertyType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<SimplePropertyType>();
        }
        return this.additionalProperty;
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
     * Obtiene el valor de la propiedad remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Define el valor de la propiedad remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the loanPaymentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the loanPaymentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanPaymentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanPaymentListType }
     * 
     * 
     */
    public List<LoanPaymentListType> getLoanPaymentList() {
        if (loanPaymentList == null) {
            loanPaymentList = new ArrayList<LoanPaymentListType>();
        }
        return this.loanPaymentList;
    }

}
