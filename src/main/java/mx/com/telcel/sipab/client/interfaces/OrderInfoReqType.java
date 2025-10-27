
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderInfoReqType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderInfoReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderBaseInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OrderBasicInfoType" minOccurs="0"/&gt;
 *         &lt;element name="deliveryInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DeliveryInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feeItemInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OrderInvoiceInfoType" minOccurs="0"/&gt;
 *         &lt;element name="orderPayment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PaymentInfoOrderInfoType" minOccurs="0"/&gt;
 *         &lt;element name="orderDocuments" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AttachmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesAdditionalPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInfoReqType", propOrder = {
    "orderBaseInfo",
    "deliveryInfo",
    "feeItemInfo",
    "orderPayment",
    "orderDocuments",
    "additionalProperty"
})
public class OrderInfoReqType {

    protected OrderBasicInfoType orderBaseInfo;
    protected List<DeliveryInfoType> deliveryInfo;
    protected OrderInvoiceInfoType feeItemInfo;
    protected PaymentInfoOrderInfoType orderPayment;
    protected List<AttachmentType> orderDocuments;
    protected List<BesAdditionalPropertyType> additionalProperty;

    /**
     * Obtiene el valor de la propiedad orderBaseInfo.
     * 
     * @return
     *     possible object is
     *     {@link OrderBasicInfoType }
     *     
     */
    public OrderBasicInfoType getOrderBaseInfo() {
        return orderBaseInfo;
    }

    /**
     * Define el valor de la propiedad orderBaseInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderBasicInfoType }
     *     
     */
    public void setOrderBaseInfo(OrderBasicInfoType value) {
        this.orderBaseInfo = value;
    }

    /**
     * Gets the value of the deliveryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInfoType }
     * 
     * 
     */
    public List<DeliveryInfoType> getDeliveryInfo() {
        if (deliveryInfo == null) {
            deliveryInfo = new ArrayList<DeliveryInfoType>();
        }
        return this.deliveryInfo;
    }

    /**
     * Obtiene el valor de la propiedad feeItemInfo.
     * 
     * @return
     *     possible object is
     *     {@link OrderInvoiceInfoType }
     *     
     */
    public OrderInvoiceInfoType getFeeItemInfo() {
        return feeItemInfo;
    }

    /**
     * Define el valor de la propiedad feeItemInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInvoiceInfoType }
     *     
     */
    public void setFeeItemInfo(OrderInvoiceInfoType value) {
        this.feeItemInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad orderPayment.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoOrderInfoType }
     *     
     */
    public PaymentInfoOrderInfoType getOrderPayment() {
        return orderPayment;
    }

    /**
     * Define el valor de la propiedad orderPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoOrderInfoType }
     *     
     */
    public void setOrderPayment(PaymentInfoOrderInfoType value) {
        this.orderPayment = value;
    }

    /**
     * Gets the value of the orderDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the orderDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getOrderDocuments() {
        if (orderDocuments == null) {
            orderDocuments = new ArrayList<AttachmentType>();
        }
        return this.orderDocuments;
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
     * {@link BesAdditionalPropertyType }
     * 
     * 
     */
    public List<BesAdditionalPropertyType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<BesAdditionalPropertyType>();
        }
        return this.additionalProperty;
    }

}
