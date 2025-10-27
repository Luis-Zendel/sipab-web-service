
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetOrderDetailInfoRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetOrderDetailInfoRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OrderBaseQryInfoType" minOccurs="0"/&gt;
 *         &lt;element name="orderItems" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OrderItemBaseQryInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shippingInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ShippingInfoBussInterfaceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="orderInvoiceInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OrderInvoiceInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderDetailInfoRespType", propOrder = {
    "orderInfo",
    "orderItems",
    "shippingInfo",
    "orderInvoiceInfo"
})
public class GetOrderDetailInfoRespType {

    protected OrderBaseQryInfoType orderInfo;
    protected List<OrderItemBaseQryInfoType> orderItems;
    protected List<ShippingInfoBussInterfaceType> shippingInfo;
    protected OrderInvoiceInfoType orderInvoiceInfo;

    /**
     * Obtiene el valor de la propiedad orderInfo.
     * 
     * @return
     *     possible object is
     *     {@link OrderBaseQryInfoType }
     *     
     */
    public OrderBaseQryInfoType getOrderInfo() {
        return orderInfo;
    }

    /**
     * Define el valor de la propiedad orderInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderBaseQryInfoType }
     *     
     */
    public void setOrderInfo(OrderBaseQryInfoType value) {
        this.orderInfo = value;
    }

    /**
     * Gets the value of the orderItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the orderItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemBaseQryInfoType }
     * 
     * 
     */
    public List<OrderItemBaseQryInfoType> getOrderItems() {
        if (orderItems == null) {
            orderItems = new ArrayList<OrderItemBaseQryInfoType>();
        }
        return this.orderItems;
    }

    /**
     * Gets the value of the shippingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shippingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingInfoBussInterfaceType }
     * 
     * 
     */
    public List<ShippingInfoBussInterfaceType> getShippingInfo() {
        if (shippingInfo == null) {
            shippingInfo = new ArrayList<ShippingInfoBussInterfaceType>();
        }
        return this.shippingInfo;
    }

    /**
     * Obtiene el valor de la propiedad orderInvoiceInfo.
     * 
     * @return
     *     possible object is
     *     {@link OrderInvoiceInfoType }
     *     
     */
    public OrderInvoiceInfoType getOrderInvoiceInfo() {
        return orderInvoiceInfo;
    }

    /**
     * Define el valor de la propiedad orderInvoiceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInvoiceInfoType }
     *     
     */
    public void setOrderInvoiceInfo(OrderInvoiceInfoType value) {
        this.orderInvoiceInfo = value;
    }

}
