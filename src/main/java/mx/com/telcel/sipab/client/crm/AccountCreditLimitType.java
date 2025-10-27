
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountCreditLimitType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountCreditLimitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limitClass" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica8Type"/&gt;
 *         &lt;element name="amount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType"/&gt;
 *         &lt;element name="creditLimitId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountCreditLimitType", propOrder = {
    "limitClass",
    "amount",
    "effDate",
    "expDate",
    "creditLimitId"
})
public class AccountCreditLimitType {

    @XmlElement(required = true)
    protected String limitClass;
    @XmlElement(required = true)
    protected BigDecimal amount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    @XmlElement(required = true)
    protected BigDecimal creditLimitId;

    /**
     * Obtiene el valor de la propiedad limitClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitClass() {
        return limitClass;
    }

    /**
     * Define el valor de la propiedad limitClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitClass(String value) {
        this.limitClass = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
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
     * Obtiene el valor de la propiedad creditLimitId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimitId() {
        return creditLimitId;
    }

    /**
     * Define el valor de la propiedad creditLimitId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimitId(BigDecimal value) {
        this.creditLimitId = value;
    }

}
