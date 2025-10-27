
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionInformationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="custKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="subKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="primaryIdentity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="accountBalance" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}NumberLong19Type"/&gt;
 *         &lt;element name="transType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica3Type"/&gt;
 *         &lt;element name="channelID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica8Type" minOccurs="0"/&gt;
 *         &lt;element name="transAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}NumberLong19Type"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}NumberLong19Type"/&gt;
 *         &lt;element name="iVATaxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="retentionIVATaxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica4Type"/&gt;
 *         &lt;element name="transTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica14Type"/&gt;
 *         &lt;element name="transID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}NumberLong19Type"/&gt;
 *         &lt;element name="srcTransID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="extTransID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="operID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}NumberLong19Type" minOccurs="0"/&gt;
 *         &lt;element name="deptID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}NumberLong19Type" minOccurs="0"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica16Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="remark" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
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
@XmlType(name = "TransactionInformationType", propOrder = {
    "acctKey",
    "custKey",
    "subKey",
    "primaryIdentity",
    "accountBalance",
    "transType",
    "channelID",
    "transAmount",
    "taxAmount",
    "ivaTaxAmount",
    "retentionIVATaxAmount",
    "currencyID",
    "transTime",
    "transID",
    "srcTransID",
    "extTransID",
    "operID",
    "deptID",
    "reasonCode",
    "status",
    "remark",
    "additionalProperty"
})
public class TransactionInformationType {

    @XmlElement(required = true)
    protected String acctKey;
    @XmlElement(required = true)
    protected String custKey;
    protected String subKey;
    protected String primaryIdentity;
    protected long accountBalance;
    @XmlElement(required = true)
    protected String transType;
    protected String channelID;
    protected long transAmount;
    protected long taxAmount;
    @XmlElement(name = "iVATaxAmount")
    protected Long ivaTaxAmount;
    protected Long retentionIVATaxAmount;
    @XmlElement(required = true)
    protected String currencyID;
    @XmlElement(required = true)
    protected String transTime;
    protected long transID;
    protected String srcTransID;
    protected String extTransID;
    protected Long operID;
    protected Long deptID;
    protected String reasonCode;
    @XmlElement(required = true)
    protected String status;
    protected String remark;
    protected List<SimplePropertyType> additionalProperty;

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
     * Obtiene el valor de la propiedad custKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustKey() {
        return custKey;
    }

    /**
     * Define el valor de la propiedad custKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustKey(String value) {
        this.custKey = value;
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
     * Obtiene el valor de la propiedad accountBalance.
     * 
     */
    public long getAccountBalance() {
        return accountBalance;
    }

    /**
     * Define el valor de la propiedad accountBalance.
     * 
     */
    public void setAccountBalance(long value) {
        this.accountBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad transType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransType() {
        return transType;
    }

    /**
     * Define el valor de la propiedad transType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransType(String value) {
        this.transType = value;
    }

    /**
     * Obtiene el valor de la propiedad channelID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * Define el valor de la propiedad channelID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelID(String value) {
        this.channelID = value;
    }

    /**
     * Obtiene el valor de la propiedad transAmount.
     * 
     */
    public long getTransAmount() {
        return transAmount;
    }

    /**
     * Define el valor de la propiedad transAmount.
     * 
     */
    public void setTransAmount(long value) {
        this.transAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     */
    public long getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     */
    public void setTaxAmount(long value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad ivaTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIVATaxAmount() {
        return ivaTaxAmount;
    }

    /**
     * Define el valor de la propiedad ivaTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIVATaxAmount(Long value) {
        this.ivaTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad retentionIVATaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetentionIVATaxAmount() {
        return retentionIVATaxAmount;
    }

    /**
     * Define el valor de la propiedad retentionIVATaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetentionIVATaxAmount(Long value) {
        this.retentionIVATaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyID() {
        return currencyID;
    }

    /**
     * Define el valor de la propiedad currencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyID(String value) {
        this.currencyID = value;
    }

    /**
     * Obtiene el valor de la propiedad transTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransTime() {
        return transTime;
    }

    /**
     * Define el valor de la propiedad transTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransTime(String value) {
        this.transTime = value;
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
     * Obtiene el valor de la propiedad srcTransID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcTransID() {
        return srcTransID;
    }

    /**
     * Define el valor de la propiedad srcTransID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcTransID(String value) {
        this.srcTransID = value;
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
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
