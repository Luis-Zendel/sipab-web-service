
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FeeItemDetailInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FeeItemDetailInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InvoiceItemTaxInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="waiveInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InvoiceItemWaiveInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="discountInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InvoiceItemDiscountInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feeSource" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OrderFeeSourceType" minOccurs="0"/&gt;
 *         &lt;element name="extPropInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeItemDetailInfoType", propOrder = {
    "taxInfo",
    "waiveInfo",
    "discountInfo",
    "feeSource",
    "extPropInfo"
})
public class FeeItemDetailInfoType {

    protected List<InvoiceItemTaxInfoType> taxInfo;
    protected List<InvoiceItemWaiveInfoType> waiveInfo;
    protected List<InvoiceItemDiscountInfoType> discountInfo;
    protected OrderFeeSourceType feeSource;
    protected List<BesCrmSimplePropertyType> extPropInfo;

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
     * Gets the value of the waiveInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the waiveInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaiveInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceItemWaiveInfoType }
     * 
     * 
     */
    public List<InvoiceItemWaiveInfoType> getWaiveInfo() {
        if (waiveInfo == null) {
            waiveInfo = new ArrayList<InvoiceItemWaiveInfoType>();
        }
        return this.waiveInfo;
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

    /**
     * Gets the value of the extPropInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extPropInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtPropInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BesCrmSimplePropertyType }
     * 
     * 
     */
    public List<BesCrmSimplePropertyType> getExtPropInfo() {
        if (extPropInfo == null) {
            extPropInfo = new ArrayList<BesCrmSimplePropertyType>();
        }
        return this.extPropInfo;
    }

}
