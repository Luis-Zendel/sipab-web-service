
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderBaseQryInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderBaseQryInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type"/&gt;
 *         &lt;element name="serviceNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type"/&gt;
 *         &lt;element name="statusDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType"/&gt;
 *         &lt;element name="accessChannelType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="createOperId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type"/&gt;
 *         &lt;element name="createDeptId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type"/&gt;
 *         &lt;element name="createTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType"/&gt;
 *         &lt;element name="remark" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}String4000Type" minOccurs="0"/&gt;
 *         &lt;element name="orderType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="reqApplyTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="businessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="completionDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="orderProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SimplePropertyCRMType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBaseQryInfoType", propOrder = {
    "orderId",
    "serviceNumber",
    "status",
    "statusDate",
    "accessChannelType",
    "createOperId",
    "createDeptId",
    "createTime",
    "remark",
    "orderType",
    "reqApplyTime",
    "businessCode",
    "completionDate",
    "orderProperty"
})
public class OrderBaseQryInfoType {

    @XmlElement(required = true)
    protected BigDecimal orderId;
    protected String serviceNumber;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(required = true)
    protected String accessChannelType;
    @XmlElement(required = true)
    protected BigDecimal createOperId;
    @XmlElement(required = true)
    protected BigDecimal createDeptId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    protected String remark;
    @XmlElement(required = true)
    protected String orderType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqApplyTime;
    protected String businessCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionDate;
    protected List<SimplePropertyCRMType> orderProperty;

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
     * Obtiene el valor de la propiedad serviceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Define el valor de la propiedad serviceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
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
     * Obtiene el valor de la propiedad accessChannelType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessChannelType() {
        return accessChannelType;
    }

    /**
     * Define el valor de la propiedad accessChannelType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessChannelType(String value) {
        this.accessChannelType = value;
    }

    /**
     * Obtiene el valor de la propiedad createOperId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreateOperId() {
        return createOperId;
    }

    /**
     * Define el valor de la propiedad createOperId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreateOperId(BigDecimal value) {
        this.createOperId = value;
    }

    /**
     * Obtiene el valor de la propiedad createDeptId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreateDeptId() {
        return createDeptId;
    }

    /**
     * Define el valor de la propiedad createDeptId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreateDeptId(BigDecimal value) {
        this.createDeptId = value;
    }

    /**
     * Obtiene el valor de la propiedad createTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Define el valor de la propiedad createTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
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
     * Obtiene el valor de la propiedad orderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Define el valor de la propiedad orderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Obtiene el valor de la propiedad reqApplyTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqApplyTime() {
        return reqApplyTime;
    }

    /**
     * Define el valor de la propiedad reqApplyTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqApplyTime(XMLGregorianCalendar value) {
        this.reqApplyTime = value;
    }

    /**
     * Obtiene el valor de la propiedad businessCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * Define el valor de la propiedad businessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCode(String value) {
        this.businessCode = value;
    }

    /**
     * Obtiene el valor de la propiedad completionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDate() {
        return completionDate;
    }

    /**
     * Define el valor de la propiedad completionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDate(XMLGregorianCalendar value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the orderProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the orderProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyCRMType }
     * 
     * 
     */
    public List<SimplePropertyCRMType> getOrderProperty() {
        if (orderProperty == null) {
            orderProperty = new ArrayList<SimplePropertyCRMType>();
        }
        return this.orderProperty;
    }

}
