
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceItemDetailInfoQueryUnpaidType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceItemDetailInfoQueryUnpaidType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InvoiceItemTaxInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="penaltyInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InvoiceItemPenaltyInfoType" minOccurs="0"/&gt;
 *         &lt;element name="waiveInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InvoiceItemWaiveInfoType" minOccurs="0"/&gt;
 *         &lt;element name="discountInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InvoiceItemDiscountInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feeSource" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OrderFeeSourceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceItemDetailInfoQueryUnpaidType", propOrder = {
    "taxInfo",
    "penaltyInfo",
    "waiveInfo",
    "discountInfo",
    "feeSource"
})
public class InvoiceItemDetailInfoQueryUnpaidType {

    protected List<InvoiceItemTaxInfoType> taxInfo;
    protected InvoiceItemPenaltyInfoType penaltyInfo;
    protected InvoiceItemWaiveInfoType waiveInfo;
    protected List<InvoiceItemDiscountInfoType> discountInfo;
    protected OrderFeeSourceType feeSource;

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceItemTaxInfoType }
     * 
     * 
     */
    public List<InvoiceItemTaxInfoType> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<InvoiceItemTaxInfoType>();
        }
        return this.taxInfo;
    }

    /**
     * Obtiene el valor de la propiedad penaltyInfo.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceItemPenaltyInfoType }
     *     
     */
    public InvoiceItemPenaltyInfoType getPenaltyInfo() {
        return penaltyInfo;
    }

    /**
     * Define el valor de la propiedad penaltyInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceItemPenaltyInfoType }
     *     
     */
    public void setPenaltyInfo(InvoiceItemPenaltyInfoType value) {
        this.penaltyInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad waiveInfo.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceItemWaiveInfoType }
     *     
     */
    public InvoiceItemWaiveInfoType getWaiveInfo() {
        return waiveInfo;
    }

    /**
     * Define el valor de la propiedad waiveInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceItemWaiveInfoType }
     *     
     */
    public void setWaiveInfo(InvoiceItemWaiveInfoType value) {
        this.waiveInfo = value;
    }

    /**
     * Gets the value of the discountInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the discountInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceItemDiscountInfoType }
     * 
     * 
     */
    public List<InvoiceItemDiscountInfoType> getDiscountInfo() {
        if (discountInfo == null) {
            discountInfo = new ArrayList<InvoiceItemDiscountInfoType>();
        }
        return this.discountInfo;
    }

    /**
     * Obtiene el valor de la propiedad feeSource.
     * 
     * @return
     *     possible object is
     *     {@link OrderFeeSourceType }
     *     
     */
    public OrderFeeSourceType getFeeSource() {
        return feeSource;
    }

    /**
     * Define el valor de la propiedad feeSource.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderFeeSourceType }
     *     
     */
    public void setFeeSource(OrderFeeSourceType value) {
        this.feeSource = value;
    }

}
