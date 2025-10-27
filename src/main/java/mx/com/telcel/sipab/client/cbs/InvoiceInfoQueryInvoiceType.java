
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceInfoQueryInvoiceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInfoQueryInvoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctKeyType"/&gt;
 *         &lt;element name="acctCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="custKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CustKeyType"/&gt;
 *         &lt;element name="subKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="primaryIdentity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="transType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica3Type"/&gt;
 *         &lt;element name="invoiceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="invoiceNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="billCycleID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="billCycleBeginTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type" minOccurs="0"/&gt;
 *         &lt;element name="billCycleEndTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type" minOccurs="0"/&gt;
 *         &lt;element name="invoiceAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="openAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="openTaxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="disputeAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="iVATaxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="openIVATaxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="retentionIVATaxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="openRetentionIVATaxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/&gt;
 *         &lt;element name="invoiceDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *         &lt;element name="dueDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *         &lt;element name="settleDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="invoiceDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}InvoiceDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chargeCodeGroupInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}ChargeCodeGroupInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="customerAddress" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="subscriberNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="invoicePath" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="totalRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}IntType" minOccurs="0"/&gt;
 *         &lt;element name="anacrValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAbiertaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInfoQueryInvoiceType", propOrder = {
    "acctKey",
    "acctCode",
    "custKey",
    "subKey",
    "primaryIdentity",
    "transType",
    "invoiceID",
    "invoiceNo",
    "billCycleID",
    "billCycleBeginTime",
    "billCycleEndTime",
    "invoiceAmount",
    "openAmount",
    "taxAmount",
    "openTaxAmount",
    "disputeAmount",
    "ivaTaxAmount",
    "openIVATaxAmount",
    "retentionIVATaxAmount",
    "openRetentionIVATaxAmount",
    "currencyID",
    "invoiceDate",
    "dueDate",
    "settleDate",
    "status",
    "invoiceDetail",
    "chargeCodeGroupInfo",
    "customerName",
    "customerAddress",
    "subscriberNo",
    "invoicePath",
    "reasonCode",
    "totalRowNum",
    "anacrValue"
})
public class InvoiceInfoQueryInvoiceType {

    @XmlElement(required = true)
    protected String acctKey;
    @XmlElement(required = true)
    protected String acctCode;
    @XmlElement(required = true)
    protected String custKey;
    protected String subKey;
    protected String primaryIdentity;
    @XmlElement(required = true)
    protected String transType;
    protected long invoiceID;
    @XmlElement(required = true)
    protected String invoiceNo;
    protected String billCycleID;
    protected String billCycleBeginTime;
    protected String billCycleEndTime;
    protected long invoiceAmount;
    protected long openAmount;
    protected Long taxAmount;
    protected Long openTaxAmount;
    protected Long disputeAmount;
    @XmlElement(name = "iVATaxAmount")
    protected Long ivaTaxAmount;
    protected Long openIVATaxAmount;
    protected Long retentionIVATaxAmount;
    protected Long openRetentionIVATaxAmount;
    @XmlElement(required = true)
    protected BigInteger currencyID;
    @XmlElement(required = true)
    protected String invoiceDate;
    @XmlElement(required = true)
    protected String dueDate;
    protected String settleDate;
    @XmlElement(required = true)
    protected String status;
    protected List<InvoiceDetailType> invoiceDetail;
    protected List<ChargeCodeGroupInfoType> chargeCodeGroupInfo;
    protected String customerName;
    protected String customerAddress;
    protected String subscriberNo;
    protected String invoicePath;
    protected String reasonCode;
    protected BigInteger totalRowNum;
    protected String anacrValue;

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
     * Obtiene el valor de la propiedad acctCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Define el valor de la propiedad acctCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCode(String value) {
        this.acctCode = value;
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
     * Obtiene el valor de la propiedad invoiceID.
     * 
     */
    public long getInvoiceID() {
        return invoiceID;
    }

    /**
     * Define el valor de la propiedad invoiceID.
     * 
     */
    public void setInvoiceID(long value) {
        this.invoiceID = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Define el valor de la propiedad invoiceNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    /**
     * Obtiene el valor de la propiedad billCycleID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleID() {
        return billCycleID;
    }

    /**
     * Define el valor de la propiedad billCycleID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleID(String value) {
        this.billCycleID = value;
    }

    /**
     * Obtiene el valor de la propiedad billCycleBeginTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleBeginTime() {
        return billCycleBeginTime;
    }

    /**
     * Define el valor de la propiedad billCycleBeginTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleBeginTime(String value) {
        this.billCycleBeginTime = value;
    }

    /**
     * Obtiene el valor de la propiedad billCycleEndTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleEndTime() {
        return billCycleEndTime;
    }

    /**
     * Define el valor de la propiedad billCycleEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleEndTime(String value) {
        this.billCycleEndTime = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceAmount.
     * 
     */
    public long getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Define el valor de la propiedad invoiceAmount.
     * 
     */
    public void setInvoiceAmount(long value) {
        this.invoiceAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad openAmount.
     * 
     */
    public long getOpenAmount() {
        return openAmount;
    }

    /**
     * Define el valor de la propiedad openAmount.
     * 
     */
    public void setOpenAmount(long value) {
        this.openAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxAmount(Long value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad openTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOpenTaxAmount() {
        return openTaxAmount;
    }

    /**
     * Define el valor de la propiedad openTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOpenTaxAmount(Long value) {
        this.openTaxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad disputeAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisputeAmount() {
        return disputeAmount;
    }

    /**
     * Define el valor de la propiedad disputeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisputeAmount(Long value) {
        this.disputeAmount = value;
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
     * Obtiene el valor de la propiedad openIVATaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOpenIVATaxAmount() {
        return openIVATaxAmount;
    }

    /**
     * Define el valor de la propiedad openIVATaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOpenIVATaxAmount(Long value) {
        this.openIVATaxAmount = value;
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
     * Obtiene el valor de la propiedad openRetentionIVATaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOpenRetentionIVATaxAmount() {
        return openRetentionIVATaxAmount;
    }

    /**
     * Define el valor de la propiedad openRetentionIVATaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOpenRetentionIVATaxAmount(Long value) {
        this.openRetentionIVATaxAmount = value;
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
     * Obtiene el valor de la propiedad invoiceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Define el valor de la propiedad invoiceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad dueDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Define el valor de la propiedad dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad settleDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleDate() {
        return settleDate;
    }

    /**
     * Define el valor de la propiedad settleDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleDate(String value) {
        this.settleDate = value;
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
     * Gets the value of the invoiceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceDetailType }
     * 
     * 
     */
    public List<InvoiceDetailType> getInvoiceDetail() {
        if (invoiceDetail == null) {
            invoiceDetail = new ArrayList<InvoiceDetailType>();
        }
        return this.invoiceDetail;
    }

    /**
     * Gets the value of the chargeCodeGroupInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chargeCodeGroupInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeCodeGroupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeCodeGroupInfoType }
     * 
     * 
     */
    public List<ChargeCodeGroupInfoType> getChargeCodeGroupInfo() {
        if (chargeCodeGroupInfo == null) {
            chargeCodeGroupInfo = new ArrayList<ChargeCodeGroupInfoType>();
        }
        return this.chargeCodeGroupInfo;
    }

    /**
     * Obtiene el valor de la propiedad customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define el valor de la propiedad customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtiene el valor de la propiedad customerAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Define el valor de la propiedad customerAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddress(String value) {
        this.customerAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNo() {
        return subscriberNo;
    }

    /**
     * Define el valor de la propiedad subscriberNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNo(String value) {
        this.subscriberNo = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicePath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicePath() {
        return invoicePath;
    }

    /**
     * Define el valor de la propiedad invoicePath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicePath(String value) {
        this.invoicePath = value;
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
     * Obtiene el valor de la propiedad totalRowNum.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRowNum() {
        return totalRowNum;
    }

    /**
     * Define el valor de la propiedad totalRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRowNum(BigInteger value) {
        this.totalRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad anacrValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnacrValue() {
        return anacrValue;
    }

    /**
     * Define el valor de la propiedad anacrValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnacrValue(String value) {
        this.anacrValue = value;
    }

}
