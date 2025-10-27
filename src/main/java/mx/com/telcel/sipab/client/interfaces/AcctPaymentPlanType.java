
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcctPaymentPlanType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcctPaymentPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentPlanId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="paymentPlanType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="lbPaymentLimitTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica8Type" minOccurs="0"/&gt;
 *         &lt;element name="lbTrigerAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal10c0Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentChannelId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentPeriodType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica2Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctPaymentPlanType", propOrder = {
    "paymentPlanId",
    "paymentPlanType",
    "lbPaymentLimitTime",
    "lbTrigerAmount",
    "paymentAmount",
    "paymentChannelId",
    "paymentPeriodType",
    "paymentDate",
    "effDate",
    "expDate"
})
public class AcctPaymentPlanType {

    @XmlElement(required = true)
    protected BigDecimal paymentPlanId;
    @XmlElement(required = true)
    protected String paymentPlanType;
    protected String lbPaymentLimitTime;
    protected BigDecimal lbTrigerAmount;
    protected Long paymentAmount;
    protected BigDecimal paymentChannelId;
    protected String paymentPeriodType;
    protected String paymentDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;

    /**
     * Obtiene el valor de la propiedad paymentPlanId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentPlanId() {
        return paymentPlanId;
    }

    /**
     * Define el valor de la propiedad paymentPlanId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentPlanId(BigDecimal value) {
        this.paymentPlanId = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentPlanType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPlanType() {
        return paymentPlanType;
    }

    /**
     * Define el valor de la propiedad paymentPlanType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPlanType(String value) {
        this.paymentPlanType = value;
    }

    /**
     * Obtiene el valor de la propiedad lbPaymentLimitTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbPaymentLimitTime() {
        return lbPaymentLimitTime;
    }

    /**
     * Define el valor de la propiedad lbPaymentLimitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbPaymentLimitTime(String value) {
        this.lbPaymentLimitTime = value;
    }

    /**
     * Obtiene el valor de la propiedad lbTrigerAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLbTrigerAmount() {
        return lbTrigerAmount;
    }

    /**
     * Define el valor de la propiedad lbTrigerAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLbTrigerAmount(BigDecimal value) {
        this.lbTrigerAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Define el valor de la propiedad paymentAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentAmount(Long value) {
        this.paymentAmount = value;
    }

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
     * Obtiene el valor de la propiedad paymentPeriodType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPeriodType() {
        return paymentPeriodType;
    }

    /**
     * Define el valor de la propiedad paymentPeriodType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPeriodType(String value) {
        this.paymentPeriodType = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Define el valor de la propiedad paymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
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

}
