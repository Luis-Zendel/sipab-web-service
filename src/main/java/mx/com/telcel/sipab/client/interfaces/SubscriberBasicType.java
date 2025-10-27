
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
 * <p>Clase Java para SubscriberBasicType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubscriberBasicType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="subscriberId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="serviceNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="imsi" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="iccid" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="activeDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType"/&gt;
 *         &lt;element name="paymentType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="writtenLang" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaNumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="phoneticLang" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaNumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="promotionInfoFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="firstContactChannel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="statusTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="statusDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type" minOccurs="0"/&gt;
 *         &lt;element name="brandId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="networkType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type" minOccurs="0"/&gt;
 *         &lt;element name="primaryOfferingId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="primaryOfferingName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="portFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="subName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="custId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="usingCustId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="accountId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="subProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SimplePropertyCRMType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberBasicType", propOrder = {
    "beId",
    "subscriberId",
    "serviceNumber",
    "imsi",
    "iccid",
    "activeDate",
    "paymentType",
    "writtenLang",
    "phoneticLang",
    "promotionInfoFlag",
    "firstContactChannel",
    "status",
    "statusTime",
    "statusDetail",
    "brandId",
    "networkType",
    "primaryOfferingId",
    "primaryOfferingName",
    "portFlag",
    "subName",
    "custId",
    "usingCustId",
    "accountId",
    "subProperty"
})
public class SubscriberBasicType {

    protected BigDecimal beId;
    protected BigDecimal subscriberId;
    @XmlElement(required = true)
    protected String serviceNumber;
    protected String imsi;
    protected String iccid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activeDate;
    @XmlElement(required = true)
    protected String paymentType;
    protected String writtenLang;
    protected String phoneticLang;
    protected String promotionInfoFlag;
    protected String firstContactChannel;
    @XmlElement(required = true)
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusTime;
    protected String statusDetail;
    protected BigDecimal brandId;
    protected String networkType;
    @XmlElement(required = true)
    protected BigDecimal primaryOfferingId;
    protected String primaryOfferingName;
    protected String portFlag;
    protected String subName;
    protected BigDecimal custId;
    protected BigDecimal usingCustId;
    @XmlElement(required = true)
    protected BigDecimal accountId;
    protected List<SimplePropertyCRMType> subProperty;

    /**
     * Obtiene el valor de la propiedad beId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeId() {
        return beId;
    }

    /**
     * Define el valor de la propiedad beId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeId(BigDecimal value) {
        this.beId = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubscriberId() {
        return subscriberId;
    }

    /**
     * Define el valor de la propiedad subscriberId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubscriberId(BigDecimal value) {
        this.subscriberId = value;
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
     * Obtiene el valor de la propiedad imsi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Define el valor de la propiedad imsi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Obtiene el valor de la propiedad iccid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * Define el valor de la propiedad iccid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccid(String value) {
        this.iccid = value;
    }

    /**
     * Obtiene el valor de la propiedad activeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveDate() {
        return activeDate;
    }

    /**
     * Define el valor de la propiedad activeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveDate(XMLGregorianCalendar value) {
        this.activeDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Define el valor de la propiedad paymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad writtenLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrittenLang() {
        return writtenLang;
    }

    /**
     * Define el valor de la propiedad writtenLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrittenLang(String value) {
        this.writtenLang = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneticLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneticLang() {
        return phoneticLang;
    }

    /**
     * Define el valor de la propiedad phoneticLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneticLang(String value) {
        this.phoneticLang = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionInfoFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionInfoFlag() {
        return promotionInfoFlag;
    }

    /**
     * Define el valor de la propiedad promotionInfoFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionInfoFlag(String value) {
        this.promotionInfoFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad firstContactChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstContactChannel() {
        return firstContactChannel;
    }

    /**
     * Define el valor de la propiedad firstContactChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstContactChannel(String value) {
        this.firstContactChannel = value;
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
     * Obtiene el valor de la propiedad statusTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusTime() {
        return statusTime;
    }

    /**
     * Define el valor de la propiedad statusTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusTime(XMLGregorianCalendar value) {
        this.statusTime = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    /**
     * Define el valor de la propiedad statusDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDetail(String value) {
        this.statusDetail = value;
    }

    /**
     * Obtiene el valor de la propiedad brandId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBrandId() {
        return brandId;
    }

    /**
     * Define el valor de la propiedad brandId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBrandId(BigDecimal value) {
        this.brandId = value;
    }

    /**
     * Obtiene el valor de la propiedad networkType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Define el valor de la propiedad networkType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryOfferingId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimaryOfferingId() {
        return primaryOfferingId;
    }

    /**
     * Define el valor de la propiedad primaryOfferingId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimaryOfferingId(BigDecimal value) {
        this.primaryOfferingId = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryOfferingName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOfferingName() {
        return primaryOfferingName;
    }

    /**
     * Define el valor de la propiedad primaryOfferingName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOfferingName(String value) {
        this.primaryOfferingName = value;
    }

    /**
     * Obtiene el valor de la propiedad portFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortFlag() {
        return portFlag;
    }

    /**
     * Define el valor de la propiedad portFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortFlag(String value) {
        this.portFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad subName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubName() {
        return subName;
    }

    /**
     * Define el valor de la propiedad subName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubName(String value) {
        this.subName = value;
    }

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
     * Obtiene el valor de la propiedad usingCustId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsingCustId() {
        return usingCustId;
    }

    /**
     * Define el valor de la propiedad usingCustId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsingCustId(BigDecimal value) {
        this.usingCustId = value;
    }

    /**
     * Obtiene el valor de la propiedad accountId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountId() {
        return accountId;
    }

    /**
     * Define el valor de la propiedad accountId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountId(BigDecimal value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the subProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyCRMType }
     * 
     * 
     */
    public List<SimplePropertyCRMType> getSubProperty() {
        if (subProperty == null) {
            subProperty = new ArrayList<SimplePropertyCRMType>();
        }
        return this.subProperty;
    }

}
