
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InstallmentDetailInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InstallmentDetailInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cycleSequence" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="remainingAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="currencyId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="cycleClass" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="cycleDueDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentDetailInfoType", propOrder = {
    "cycleSequence",
    "remainingAmount",
    "currencyId",
    "cycleClass",
    "cycleDueDate"
})
public class InstallmentDetailInfoType {

    protected BigDecimal cycleSequence;
    protected BigDecimal remainingAmount;
    protected BigDecimal currencyId;
    protected String cycleClass;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cycleDueDate;

    /**
     * Obtiene el valor de la propiedad cycleSequence.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleSequence() {
        return cycleSequence;
    }

    /**
     * Define el valor de la propiedad cycleSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleSequence(BigDecimal value) {
        this.cycleSequence = value;
    }

    /**
     * Obtiene el valor de la propiedad remainingAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * Define el valor de la propiedad remainingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingAmount(BigDecimal value) {
        this.remainingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyId() {
        return currencyId;
    }

    /**
     * Define el valor de la propiedad currencyId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyId(BigDecimal value) {
        this.currencyId = value;
    }

    /**
     * Obtiene el valor de la propiedad cycleClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleClass() {
        return cycleClass;
    }

    /**
     * Define el valor de la propiedad cycleClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleClass(String value) {
        this.cycleClass = value;
    }

    /**
     * Obtiene el valor de la propiedad cycleDueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCycleDueDate() {
        return cycleDueDate;
    }

    /**
     * Define el valor de la propiedad cycleDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCycleDueDate(XMLGregorianCalendar value) {
        this.cycleDueDate = value;
    }

}
