
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentDetailType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applyType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="applyAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="invoiceNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="invoiceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="invoiceDetailID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="chargeCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="chargeAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="taxList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TaxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="discountAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="billCycleId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailType", propOrder = {
    "applyType",
    "applyAmount",
    "invoiceNo",
    "invoiceID",
    "invoiceDetailID",
    "chargeCode",
    "chargeAmount",
    "taxList",
    "discountAmount",
    "billCycleId",
    "invoiceDate"
})
public class PaymentDetailType {

    @XmlElement(required = true)
    protected String applyType;
    protected long applyAmount;
    protected String invoiceNo;
    protected Long invoiceID;
    protected Long invoiceDetailID;
    protected String chargeCode;
    protected Long chargeAmount;
    protected List<TaxType> taxList;
    protected Long discountAmount;
    protected Integer billCycleId;
    protected String invoiceDate;

    /**
     * Obtiene el valor de la propiedad applyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyType() {
        return applyType;
    }

    /**
     * Define el valor de la propiedad applyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyType(String value) {
        this.applyType = value;
    }

    /**
     * Obtiene el valor de la propiedad applyAmount.
     * 
     */
    public long getApplyAmount() {
        return applyAmount;
    }

    /**
     * Define el valor de la propiedad applyAmount.
     * 
     */
    public void setApplyAmount(long value) {
        this.applyAmount = value;
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
     * Obtiene el valor de la propiedad invoiceID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvoiceID() {
        return invoiceID;
    }

    /**
     * Define el valor de la propiedad invoiceID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvoiceID(Long value) {
        this.invoiceID = value;
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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Define el valor de la propiedad chargeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChargeAmount(Long value) {
        this.chargeAmount = value;
    }

    /**
     * Gets the value of the taxList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taxList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * 
     * 
     */
    public List<TaxType> getTaxList() {
        if (taxList == null) {
            taxList = new ArrayList<TaxType>();
        }
        return this.taxList;
    }

    /**
     * Obtiene el valor de la propiedad discountAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Define el valor de la propiedad discountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountAmount(Long value) {
        this.discountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad billCycleId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillCycleId() {
        return billCycleId;
    }

    /**
     * Define el valor de la propiedad billCycleId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillCycleId(Integer value) {
        this.billCycleId = value;
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

}
