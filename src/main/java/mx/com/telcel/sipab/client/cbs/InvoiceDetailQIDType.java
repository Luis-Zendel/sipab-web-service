
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceDetailQIDType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceDetailQIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceDetailID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="serviceCategory" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica10Type"/&gt;
 *         &lt;element name="chargeCodeGroup" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="chargeCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="chargeAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="offeringID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}IdEnteroType" minOccurs="0"/&gt;
 *         &lt;element name="discountAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="openAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="iVATaxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="retentionIVATaxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="disputeAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceDetailQIDType", propOrder = {
    "invoiceDetailID",
    "serviceCategory",
    "chargeCodeGroup",
    "chargeCode",
    "chargeAmount",
    "offeringID",
    "discountAmt",
    "openAmount",
    "taxAmount",
    "ivaTaxAmount",
    "retentionIVATaxAmount",
    "disputeAmount",
    "currencyID",
    "status"
})
public class InvoiceDetailQIDType {

    protected long invoiceDetailID;
    @XmlElement(required = true)
    protected String serviceCategory;
    protected String chargeCodeGroup;
    protected String chargeCode;
    protected long chargeAmount;
    protected BigInteger offeringID;
    protected Long discountAmt;
    protected long openAmount;
    protected Long taxAmount;
    @XmlElement(name = "iVATaxAmount")
    protected Long ivaTaxAmount;
    protected Long retentionIVATaxAmount;
    protected Long disputeAmount;
    @XmlElement(required = true)
    protected BigInteger currencyID;
    @XmlElement(required = true)
    protected String status;

    /**
     * Obtiene el valor de la propiedad invoiceDetailID.
     * 
     */
    public long getInvoiceDetailID() {
        return invoiceDetailID;
    }

    /**
     * Define el valor de la propiedad invoiceDetailID.
     * 
     */
    public void setInvoiceDetailID(long value) {
        this.invoiceDetailID = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Define el valor de la propiedad serviceCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategory(String value) {
        this.serviceCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeCodeGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCodeGroup() {
        return chargeCodeGroup;
    }

    /**
     * Define el valor de la propiedad chargeCodeGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCodeGroup(String value) {
        this.chargeCodeGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * Define el valor de la propiedad chargeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCode(String value) {
        this.chargeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeAmount.
     * 
     */
    public long getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Define el valor de la propiedad chargeAmount.
     * 
     */
    public void setChargeAmount(long value) {
        this.chargeAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfferingID() {
        return offeringID;
    }

    /**
     * Define el valor de la propiedad offeringID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfferingID(BigInteger value) {
        this.offeringID = value;
    }

    /**
     * Obtiene el valor de la propiedad discountAmt.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountAmt() {
        return discountAmt;
    }

    /**
     * Define el valor de la propiedad discountAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountAmt(Long value) {
        this.discountAmt = value;
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

}
