
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
 * <p>Clase Java para GetOrdersPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetOrdersPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="custId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *           &lt;element name="orderIdList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" maxOccurs="100"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="fromDate" type="{http://amx.com/mexico/telcel/esb/v1_2}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="toDate" type="{http://amx.com/mexico/telcel/esb/v1_2}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="includeHistory" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="channelType" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCrmChannelType" minOccurs="0"/&gt;
 *         &lt;element name="businessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="pageInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PageBaseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrdersPetType", propOrder = {
    "custId",
    "orderIdList",
    "fromDate",
    "toDate",
    "status",
    "includeHistory",
    "channelType",
    "businessCode",
    "pageInfo"
})
public class GetOrdersPetType {

    protected BigDecimal custId;
    protected List<BigDecimal> orderIdList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    protected String status;
    protected String includeHistory;
    protected String channelType;
    protected String businessCode;
    @XmlElement(required = true)
    protected PageBaseType pageInfo;

    /**
     * Obtiene el valor de la propiedad custId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustId() {
        return custId;
    }

    /**
     * Define el valor de la propiedad custId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustId(BigDecimal value) {
        this.custId = value;
    }

    /**
     * Gets the value of the orderIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the orderIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getOrderIdList() {
        if (orderIdList == null) {
            orderIdList = new ArrayList<BigDecimal>();
        }
        return this.orderIdList;
    }

    /**
     * Obtiene el valor de la propiedad fromDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Define el valor de la propiedad fromDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Obtiene el valor de la propiedad toDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Define el valor de la propiedad toDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
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
     * Obtiene el valor de la propiedad includeHistory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeHistory() {
        return includeHistory;
    }

    /**
     * Define el valor de la propiedad includeHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeHistory(String value) {
        this.includeHistory = value;
    }

    /**
     * Obtiene el valor de la propiedad channelType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Define el valor de la propiedad channelType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
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
     * Obtiene el valor de la propiedad pageInfo.
     * 
     * @return
     *     possible object is
     *     {@link PageBaseType }
     *     
     */
    public PageBaseType getPageInfo() {
        return pageInfo;
    }

    /**
     * Define el valor de la propiedad pageInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PageBaseType }
     *     
     */
    public void setPageInfo(PageBaseType value) {
        this.pageInfo = value;
    }

}
