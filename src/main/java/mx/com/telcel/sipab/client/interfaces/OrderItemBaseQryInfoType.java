
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderItemBaseQryInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderItemBaseQryInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderItemId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type"/&gt;
 *         &lt;element name="orderId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type"/&gt;
 *         &lt;element name="itemType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type"/&gt;
 *         &lt;element name="itemId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type"/&gt;
 *         &lt;element name="actionType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type"/&gt;
 *         &lt;element name="actionReason" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal10Type" minOccurs="0"/&gt;
 *         &lt;element name="itemInstanceId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="pOrderItemId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="itemCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="itemName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type"/&gt;
 *         &lt;element name="statusDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType"/&gt;
 *         &lt;element name="classificationId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="subsId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="isMainItem" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="relMainItemId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="itemDesc" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica2048Type" minOccurs="0"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="itemSource" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type" minOccurs="0"/&gt;
 *         &lt;element name="fulfillmentStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type" minOccurs="0"/&gt;
 *         &lt;element name="fulfillmentStatusDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemBaseQryInfoType", propOrder = {
    "orderItemId",
    "orderId",
    "itemType",
    "itemId",
    "actionType",
    "actionReason",
    "quantity",
    "itemInstanceId",
    "pOrderItemId",
    "itemCode",
    "itemName",
    "status",
    "statusDate",
    "classificationId",
    "subsId",
    "isMainItem",
    "relMainItemId",
    "itemDesc",
    "effDate",
    "expDate",
    "itemSource",
    "fulfillmentStatus",
    "fulfillmentStatusDate"
})
public class OrderItemBaseQryInfoType {

    @XmlElement(required = true)
    protected BigDecimal orderItemId;
    @XmlElement(required = true)
    protected BigDecimal orderId;
    @XmlElement(required = true)
    protected String itemType;
    @XmlElement(required = true)
    protected BigDecimal itemId;
    @XmlElement(required = true)
    protected String actionType;
    protected String actionReason;
    protected BigDecimal quantity;
    protected BigDecimal itemInstanceId;
    protected BigDecimal pOrderItemId;
    protected String itemCode;
    protected String itemName;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    protected BigDecimal classificationId;
    protected BigDecimal subsId;
    @XmlElement(required = true)
    protected String isMainItem;
    protected BigDecimal relMainItemId;
    protected String itemDesc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    protected String itemSource;
    protected String fulfillmentStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fulfillmentStatusDate;

    /**
     * Obtiene el valor de la propiedad orderItemId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderItemId() {
        return orderItemId;
    }

    /**
     * Define el valor de la propiedad orderItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderItemId(BigDecimal value) {
        this.orderItemId = value;
    }

    /**
     * Obtiene el valor de la propiedad orderId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderId() {
        return orderId;
    }

    /**
     * Define el valor de la propiedad orderId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderId(BigDecimal value) {
        this.orderId = value;
    }

    /**
     * Obtiene el valor de la propiedad itemType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Define el valor de la propiedad itemType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Obtiene el valor de la propiedad itemId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemId() {
        return itemId;
    }

    /**
     * Define el valor de la propiedad itemId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemId(BigDecimal value) {
        this.itemId = value;
    }

    /**
     * Obtiene el valor de la propiedad actionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Define el valor de la propiedad actionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Obtiene el valor de la propiedad actionReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionReason() {
        return actionReason;
    }

    /**
     * Define el valor de la propiedad actionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionReason(String value) {
        this.actionReason = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad itemInstanceId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemInstanceId() {
        return itemInstanceId;
    }

    /**
     * Define el valor de la propiedad itemInstanceId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemInstanceId(BigDecimal value) {
        this.itemInstanceId = value;
    }

    /**
     * Obtiene el valor de la propiedad pOrderItemId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPOrderItemId() {
        return pOrderItemId;
    }

    /**
     * Define el valor de la propiedad pOrderItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPOrderItemId(BigDecimal value) {
        this.pOrderItemId = value;
    }

    /**
     * Obtiene el valor de la propiedad itemCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Define el valor de la propiedad itemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Obtiene el valor de la propiedad itemName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Define el valor de la propiedad itemName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
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
     * Obtiene el valor de la propiedad statusDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Define el valor de la propiedad statusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Obtiene el valor de la propiedad classificationId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClassificationId() {
        return classificationId;
    }

    /**
     * Define el valor de la propiedad classificationId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClassificationId(BigDecimal value) {
        this.classificationId = value;
    }

    /**
     * Obtiene el valor de la propiedad subsId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsId() {
        return subsId;
    }

    /**
     * Define el valor de la propiedad subsId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsId(BigDecimal value) {
        this.subsId = value;
    }

    /**
     * Obtiene el valor de la propiedad isMainItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMainItem() {
        return isMainItem;
    }

    /**
     * Define el valor de la propiedad isMainItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMainItem(String value) {
        this.isMainItem = value;
    }

    /**
     * Obtiene el valor de la propiedad relMainItemId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelMainItemId() {
        return relMainItemId;
    }

    /**
     * Define el valor de la propiedad relMainItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelMainItemId(BigDecimal value) {
        this.relMainItemId = value;
    }

    /**
     * Obtiene el valor de la propiedad itemDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * Define el valor de la propiedad itemDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDesc(String value) {
        this.itemDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad effDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDate() {
        return effDate;
    }

    /**
     * Define el valor de la propiedad effDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDate(XMLGregorianCalendar value) {
        this.effDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Define el valor de la propiedad expDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

    /**
     * Obtiene el valor de la propiedad itemSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSource() {
        return itemSource;
    }

    /**
     * Define el valor de la propiedad itemSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSource(String value) {
        this.itemSource = value;
    }

    /**
     * Obtiene el valor de la propiedad fulfillmentStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    /**
     * Define el valor de la propiedad fulfillmentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentStatus(String value) {
        this.fulfillmentStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad fulfillmentStatusDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFulfillmentStatusDate() {
        return fulfillmentStatusDate;
    }

    /**
     * Define el valor de la propiedad fulfillmentStatusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFulfillmentStatusDate(XMLGregorianCalendar value) {
        this.fulfillmentStatusDate = value;
    }

}
