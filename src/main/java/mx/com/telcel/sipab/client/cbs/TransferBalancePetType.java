
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransferBalancePetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransferBalancePetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransferType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="TransferorObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransferorObjType" minOccurs="0"/&gt;
 *         &lt;element name="TransfereeObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransfereeObjType" minOccurs="0"/&gt;
 *         &lt;element name="TransferorAcct" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransferorAcctType" minOccurs="0"/&gt;
 *         &lt;element name="TransfereeAcct" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransfereeAcctType" minOccurs="0"/&gt;
 *         &lt;element name="srcBalanceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="srcBalanceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="destBalanceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="transferAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="transferHandleFee" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="transfeeHandleFee" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitTransferorInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitTransferorInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditTransferorInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CreditTransferorInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType" minOccurs="0"/&gt;
 *         &lt;element name="transferReasonCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferBalancePetType", propOrder = {
    "transferType",
    "transferorObj",
    "transfereeObj",
    "transferorAcct",
    "transfereeAcct",
    "srcBalanceID",
    "srcBalanceType",
    "destBalanceType",
    "transferAmount",
    "transferHandleFee",
    "transfeeHandleFee",
    "freeUnitTransferorInfo",
    "creditTransferorInfo",
    "currencyID",
    "transferReasonCode",
    "remark",
    "additionalProperty"
})
public class TransferBalancePetType {

    @XmlElement(name = "TransferType", required = true)
    protected String transferType;
    @XmlElement(name = "TransferorObj")
    protected TransferorObjType transferorObj;
    @XmlElement(name = "TransfereeObj")
    protected TransfereeObjType transfereeObj;
    @XmlElement(name = "TransferorAcct")
    protected TransferorAcctType transferorAcct;
    @XmlElement(name = "TransfereeAcct")
    protected TransfereeAcctType transfereeAcct;
    protected Long srcBalanceID;
    protected String srcBalanceType;
    protected String destBalanceType;
    protected Long transferAmount;
    protected Long transferHandleFee;
    protected Long transfeeHandleFee;
    protected List<FreeUnitTransferorInfoType> freeUnitTransferorInfo;
    protected List<CreditTransferorInfoType> creditTransferorInfo;
    protected BigInteger currencyID;
    protected String transferReasonCode;
    protected String remark;
    protected List<SimplePropertyType> additionalProperty;

    /**
     * Obtiene el valor de la propiedad transferType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferType() {
        return transferType;
    }

    /**
     * Define el valor de la propiedad transferType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferType(String value) {
        this.transferType = value;
    }

    /**
     * Obtiene el valor de la propiedad transferorObj.
     * 
     * @return
     *     possible object is
     *     {@link TransferorObjType }
     *     
     */
    public TransferorObjType getTransferorObj() {
        return transferorObj;
    }

    /**
     * Define el valor de la propiedad transferorObj.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferorObjType }
     *     
     */
    public void setTransferorObj(TransferorObjType value) {
        this.transferorObj = value;
    }

    /**
     * Obtiene el valor de la propiedad transfereeObj.
     * 
     * @return
     *     possible object is
     *     {@link TransfereeObjType }
     *     
     */
    public TransfereeObjType getTransfereeObj() {
        return transfereeObj;
    }

    /**
     * Define el valor de la propiedad transfereeObj.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfereeObjType }
     *     
     */
    public void setTransfereeObj(TransfereeObjType value) {
        this.transfereeObj = value;
    }

    /**
     * Obtiene el valor de la propiedad transferorAcct.
     * 
     * @return
     *     possible object is
     *     {@link TransferorAcctType }
     *     
     */
    public TransferorAcctType getTransferorAcct() {
        return transferorAcct;
    }

    /**
     * Define el valor de la propiedad transferorAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferorAcctType }
     *     
     */
    public void setTransferorAcct(TransferorAcctType value) {
        this.transferorAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad transfereeAcct.
     * 
     * @return
     *     possible object is
     *     {@link TransfereeAcctType }
     *     
     */
    public TransfereeAcctType getTransfereeAcct() {
        return transfereeAcct;
    }

    /**
     * Define el valor de la propiedad transfereeAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfereeAcctType }
     *     
     */
    public void setTransfereeAcct(TransfereeAcctType value) {
        this.transfereeAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad srcBalanceID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSrcBalanceID() {
        return srcBalanceID;
    }

    /**
     * Define el valor de la propiedad srcBalanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSrcBalanceID(Long value) {
        this.srcBalanceID = value;
    }

    /**
     * Obtiene el valor de la propiedad srcBalanceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcBalanceType() {
        return srcBalanceType;
    }

    /**
     * Define el valor de la propiedad srcBalanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcBalanceType(String value) {
        this.srcBalanceType = value;
    }

    /**
     * Obtiene el valor de la propiedad destBalanceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestBalanceType() {
        return destBalanceType;
    }

    /**
     * Define el valor de la propiedad destBalanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestBalanceType(String value) {
        this.destBalanceType = value;
    }

    /**
     * Obtiene el valor de la propiedad transferAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferAmount() {
        return transferAmount;
    }

    /**
     * Define el valor de la propiedad transferAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferAmount(Long value) {
        this.transferAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad transferHandleFee.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransferHandleFee() {
        return transferHandleFee;
    }

    /**
     * Define el valor de la propiedad transferHandleFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransferHandleFee(Long value) {
        this.transferHandleFee = value;
    }

    /**
     * Obtiene el valor de la propiedad transfeeHandleFee.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransfeeHandleFee() {
        return transfeeHandleFee;
    }

    /**
     * Define el valor de la propiedad transfeeHandleFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransfeeHandleFee(Long value) {
        this.transfeeHandleFee = value;
    }

    /**
     * Gets the value of the freeUnitTransferorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitTransferorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitTransferorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitTransferorInfoType }
     * 
     * 
     */
    public List<FreeUnitTransferorInfoType> getFreeUnitTransferorInfo() {
        if (freeUnitTransferorInfo == null) {
            freeUnitTransferorInfo = new ArrayList<FreeUnitTransferorInfoType>();
        }
        return this.freeUnitTransferorInfo;
    }

    /**
     * Gets the value of the creditTransferorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the creditTransferorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditTransferorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditTransferorInfoType }
     * 
     * 
     */
    public List<CreditTransferorInfoType> getCreditTransferorInfo() {
        if (creditTransferorInfo == null) {
            creditTransferorInfo = new ArrayList<CreditTransferorInfoType>();
        }
        return this.creditTransferorInfo;
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
     * Obtiene el valor de la propiedad transferReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferReasonCode() {
        return transferReasonCode;
    }

    /**
     * Define el valor de la propiedad transferReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferReasonCode(String value) {
        this.transferReasonCode = value;
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

}
