
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountPaymentChannelType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountPaymentChannelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentChannelId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type"/&gt;
 *         &lt;element name="bankCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="bankAcctType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica4Type"/&gt;
 *         &lt;element name="bankAcctCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="bankAcctName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="bankAcctExpDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="paymentCardType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaNumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal5c0Type" minOccurs="0"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType"/&gt;
 *         &lt;element name="autopayPlan" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}AcctPaymentPlanType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountPaymentChannelType", propOrder = {
    "paymentChannelId",
    "bankCode",
    "bankAcctType",
    "bankAcctCode",
    "bankAcctName",
    "bankAcctExpDate",
    "paymentCardType",
    "priority",
    "effDate",
    "expDate",
    "autopayPlan"
})
public class AccountPaymentChannelType {

    @XmlElement(required = true)
    protected BigDecimal paymentChannelId;
    protected String bankCode;
    @XmlElement(required = true)
    protected String bankAcctType;
    @XmlElement(required = true)
    protected String bankAcctCode;
    protected String bankAcctName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bankAcctExpDate;
    protected String paymentCardType;
    protected BigDecimal priority;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    protected AcctPaymentPlanType autopayPlan;

    /**
     * Obtiene el valor de la propiedad paymentChannelId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentChannelId() {
        return paymentChannelId;
    }

    /**
     * Define el valor de la propiedad paymentChannelId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentChannelId(BigDecimal value) {
        this.paymentChannelId = value;
    }

    /**
     * Obtiene el valor de la propiedad bankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Define el valor de la propiedad bankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bankAcctType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctType() {
        return bankAcctType;
    }

    /**
     * Define el valor de la propiedad bankAcctType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctType(String value) {
        this.bankAcctType = value;
    }

    /**
     * Obtiene el valor de la propiedad bankAcctCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctCode() {
        return bankAcctCode;
    }

    /**
     * Define el valor de la propiedad bankAcctCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctCode(String value) {
        this.bankAcctCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bankAcctName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctName() {
        return bankAcctName;
    }

    /**
     * Define el valor de la propiedad bankAcctName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctName(String value) {
        this.bankAcctName = value;
    }

    /**
     * Obtiene el valor de la propiedad bankAcctExpDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBankAcctExpDate() {
        return bankAcctExpDate;
    }

    /**
     * Define el valor de la propiedad bankAcctExpDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBankAcctExpDate(XMLGregorianCalendar value) {
        this.bankAcctExpDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentCardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCardType() {
        return paymentCardType;
    }

    /**
     * Define el valor de la propiedad paymentCardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCardType(String value) {
        this.paymentCardType = value;
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriority(BigDecimal value) {
        this.priority = value;
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
     * Obtiene el valor de la propiedad autopayPlan.
     * 
     * @return
     *     possible object is
     *     {@link AcctPaymentPlanType }
     *     
     */
    public AcctPaymentPlanType getAutopayPlan() {
        return autopayPlan;
    }

    /**
     * Define el valor de la propiedad autopayPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctPaymentPlanType }
     *     
     */
    public void setAutopayPlan(AcctPaymentPlanType value) {
        this.autopayPlan = value;
    }

}
