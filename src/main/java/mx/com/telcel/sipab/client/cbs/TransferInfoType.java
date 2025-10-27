
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransferInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransferInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctKeyType"/&gt;
 *         &lt;element name="subKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="primaryIdentity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="transferChannelID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica8Type" minOccurs="0"/&gt;
 *         &lt;element name="transID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="extTransID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="transferAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="oppositePrimaryIdentity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="oppositeAcctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctKeyType" minOccurs="0"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/&gt;
 *         &lt;element name="resultCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica24Type"/&gt;
 *         &lt;element name="balanceChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CreditChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="loanChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LoanChgInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferInfoType", propOrder = {
    "tradeTime",
    "acctKey",
    "subKey",
    "primaryIdentity",
    "transferChannelID",
    "transID",
    "extTransID",
    "transferAmount",
    "oppositePrimaryIdentity",
    "oppositeAcctKey",
    "currencyID",
    "resultCode",
    "balanceChgInfo",
    "freeUnitChgInfo",
    "additionalProperty",
    "creditChgInfo",
    "loanChgInfo"
})
public class TransferInfoType {

    @XmlElement(required = true)
    protected String tradeTime;
    @XmlElement(required = true)
    protected String acctKey;
    protected String subKey;
    protected String primaryIdentity;
    protected String transferChannelID;
    protected long transID;
    protected String extTransID;
    protected long transferAmount;
    protected String oppositePrimaryIdentity;
    protected String oppositeAcctKey;
    @XmlElement(required = true)
    protected BigInteger currencyID;
    @XmlElement(required = true)
    protected String resultCode;
    protected List<BalanceChgInfoType> balanceChgInfo;
    protected List<FreeUnitChgInfoType> freeUnitChgInfo;
    protected List<SimplePropertyType> additionalProperty;
    protected List<CreditChgInfoType> creditChgInfo;
    protected LoanChgInfoType loanChgInfo;

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
     * Obtiene el valor de la propiedad transferChannelID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferChannelID() {
        return transferChannelID;
    }

    /**
     * Define el valor de la propiedad transferChannelID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferChannelID(String value) {
        this.transferChannelID = value;
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
     * Obtiene el valor de la propiedad transferAmount.
     * 
     */
    public long getTransferAmount() {
        return transferAmount;
    }

    /**
     * Define el valor de la propiedad transferAmount.
     * 
     */
    public void setTransferAmount(long value) {
        this.transferAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad oppositePrimaryIdentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppositePrimaryIdentity() {
        return oppositePrimaryIdentity;
    }

    /**
     * Define el valor de la propiedad oppositePrimaryIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOppositePrimaryIdentity(String value) {
        this.oppositePrimaryIdentity = value;
    }

    /**
     * Obtiene el valor de la propiedad oppositeAcctKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppositeAcctKey() {
        return oppositeAcctKey;
    }

    /**
     * Define el valor de la propiedad oppositeAcctKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOppositeAcctKey(String value) {
        this.oppositeAcctKey = value;
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
     * Gets the value of the freeUnitChgInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitChgInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitChgInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitChgInfoType }
     * 
     * 
     */
    public List<FreeUnitChgInfoType> getFreeUnitChgInfo() {
        if (freeUnitChgInfo == null) {
            freeUnitChgInfo = new ArrayList<FreeUnitChgInfoType>();
        }
        return this.freeUnitChgInfo;
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

}
