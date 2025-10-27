
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ShippingInfoBussInterfaceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ShippingInfoBussInterfaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shippingId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="shippingCarrierId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="shippingModeId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="shippingTimeLimit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="shippingFromDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="shippingToDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="printInvoiceFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="fulfillmentCenter" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica255Type" minOccurs="0"/&gt;
 *         &lt;element name="shippingStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="addressInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AddressInfoType"/&gt;
 *         &lt;element name="contactPersonInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ContactPersonInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingInfoBussInterfaceType", propOrder = {
    "shippingId",
    "shippingCarrierId",
    "shippingModeId",
    "shippingTimeLimit",
    "shippingFromDate",
    "shippingToDate",
    "printInvoiceFlag",
    "fulfillmentCenter",
    "remark",
    "shippingStatus",
    "addressInfo",
    "contactPersonInfo"
})
public class ShippingInfoBussInterfaceType {

    protected BigDecimal shippingId;
    protected BigDecimal shippingCarrierId;
    @XmlElement(required = true)
    protected String shippingModeId;
    protected String shippingTimeLimit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippingFromDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippingToDate;
    protected String printInvoiceFlag;
    protected String fulfillmentCenter;
    protected String remark;
    protected String shippingStatus;
    @XmlElement(required = true)
    protected AddressInfoType addressInfo;
    @XmlElement(required = true)
    protected ContactPersonInfoType contactPersonInfo;

    /**
     * Obtiene el valor de la propiedad shippingId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingId() {
        return shippingId;
    }

    /**
     * Define el valor de la propiedad shippingId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingId(BigDecimal value) {
        this.shippingId = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingCarrierId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingCarrierId() {
        return shippingCarrierId;
    }

    /**
     * Define el valor de la propiedad shippingCarrierId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingCarrierId(BigDecimal value) {
        this.shippingCarrierId = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingModeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingModeId() {
        return shippingModeId;
    }

    /**
     * Define el valor de la propiedad shippingModeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingModeId(String value) {
        this.shippingModeId = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingTimeLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingTimeLimit() {
        return shippingTimeLimit;
    }

    /**
     * Define el valor de la propiedad shippingTimeLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingTimeLimit(String value) {
        this.shippingTimeLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingFromDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippingFromDate() {
        return shippingFromDate;
    }

    /**
     * Define el valor de la propiedad shippingFromDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippingFromDate(XMLGregorianCalendar value) {
        this.shippingFromDate = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingToDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippingToDate() {
        return shippingToDate;
    }

    /**
     * Define el valor de la propiedad shippingToDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippingToDate(XMLGregorianCalendar value) {
        this.shippingToDate = value;
    }

    /**
     * Obtiene el valor de la propiedad printInvoiceFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintInvoiceFlag() {
        return printInvoiceFlag;
    }

    /**
     * Define el valor de la propiedad printInvoiceFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintInvoiceFlag(String value) {
        this.printInvoiceFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad fulfillmentCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentCenter() {
        return fulfillmentCenter;
    }

    /**
     * Define el valor de la propiedad fulfillmentCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentCenter(String value) {
        this.fulfillmentCenter = value;
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
     * Obtiene el valor de la propiedad shippingStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingStatus() {
        return shippingStatus;
    }

    /**
     * Define el valor de la propiedad shippingStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingStatus(String value) {
        this.shippingStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad addressInfo.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddressInfo() {
        return addressInfo;
    }

    /**
     * Define el valor de la propiedad addressInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddressInfo(AddressInfoType value) {
        this.addressInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad contactPersonInfo.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonInfoType }
     *     
     */
    public ContactPersonInfoType getContactPersonInfo() {
        return contactPersonInfo;
    }

    /**
     * Define el valor de la propiedad contactPersonInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonInfoType }
     *     
     */
    public void setContactPersonInfo(ContactPersonInfoType value) {
        this.contactPersonInfo = value;
    }

}
