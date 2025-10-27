
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceInfo2Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInfo2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="invoiceDetailID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="adjustmentAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType" minOccurs="0"/&gt;
 *         &lt;element name="billingCycleID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="ReasonCodeInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInfo2Type", propOrder = {
    "invoiceNo",
    "invoiceDetailID",
    "adjustmentType",
    "adjustmentAmt",
    "currencyID",
    "billingCycleID",
    "dueDate",
    "uuid",
    "reasonCodeInfo"
})
public class InvoiceInfo2Type {

    protected String invoiceNo;
    protected Long invoiceDetailID;
    @XmlElement(required = true)
    protected String adjustmentType;
    protected long adjustmentAmt;
    protected BigInteger currencyID;
    protected String billingCycleID;
    protected String dueDate;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "ReasonCodeInfo")
    protected String reasonCodeInfo;

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
     * Obtiene el valor de la propiedad invoiceDetailID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvoiceDetailID() {
        return invoiceDetailID;
    }

    /**
     * Define el valor de la propiedad invoiceDetailID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvoiceDetailID(Long value) {
        this.invoiceDetailID = value;
    }

    /**
     * Obtiene el valor de la propiedad adjustmentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Define el valor de la propiedad adjustmentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentType(String value) {
        this.adjustmentType = value;
    }

    /**
     * Obtiene el valor de la propiedad adjustmentAmt.
     * 
     */
    public long getAdjustmentAmt() {
        return adjustmentAmt;
    }

    /**
     * Define el valor de la propiedad adjustmentAmt.
     * 
     */
    public void setAdjustmentAmt(long value) {
        this.adjustmentAmt = value;
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
     * Obtiene el valor de la propiedad billingCycleID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCycleID() {
        return billingCycleID;
    }

    /**
     * Define el valor de la propiedad billingCycleID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCycleID(String value) {
        this.billingCycleID = value;
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
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonCodeInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCodeInfo() {
        return reasonCodeInfo;
    }

    /**
     * Define el valor de la propiedad reasonCodeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCodeInfo(String value) {
        this.reasonCodeInfo = value;
    }

}
