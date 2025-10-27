
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceInfoBasicType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInfoBasicType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billCycleBeginTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="billCycleEndTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="dueDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="openAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="anacrValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInfoBasicType", propOrder = {
    "billCycleBeginTime",
    "billCycleEndTime",
    "dueDate",
    "openAmount",
    "anacrValue"
})
public class InvoiceInfoBasicType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billCycleBeginTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billCycleEndTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    protected BigDecimal openAmount;
    protected String anacrValue;

    /**
     * Obtiene el valor de la propiedad billCycleBeginTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillCycleBeginTime() {
        return billCycleBeginTime;
    }

    /**
     * Define el valor de la propiedad billCycleBeginTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillCycleBeginTime(XMLGregorianCalendar value) {
        this.billCycleBeginTime = value;
    }

    /**
     * Obtiene el valor de la propiedad billCycleEndTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillCycleEndTime() {
        return billCycleEndTime;
    }

    /**
     * Define el valor de la propiedad billCycleEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillCycleEndTime(XMLGregorianCalendar value) {
        this.billCycleEndTime = value;
    }

    /**
     * Obtiene el valor de la propiedad dueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Define el valor de la propiedad dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad openAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenAmount() {
        return openAmount;
    }

    /**
     * Define el valor de la propiedad openAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenAmount(BigDecimal value) {
        this.openAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad anacrValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnacrValue() {
        return anacrValue;
    }

    /**
     * Define el valor de la propiedad anacrValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnacrValue(String value) {
        this.anacrValue = value;
    }

}
