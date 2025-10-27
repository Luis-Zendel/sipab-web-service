
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServiceContractInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ServiceContractInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriberId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="contractStartDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="contractEndDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="totalPeriod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Entero10dType" minOccurs="0"/&gt;
 *         &lt;element name="remainingPeriod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Entero10dType" minOccurs="0"/&gt;
 *         &lt;element name="property" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SimplePropertyCRMType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceContractInfoType", propOrder = {
    "subscriberId",
    "contractStartDate",
    "contractEndDate",
    "totalPeriod",
    "remainingPeriod",
    "property"
})
public class ServiceContractInfoType {

    protected BigDecimal subscriberId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractEndDate;
    protected Integer totalPeriod;
    protected Integer remainingPeriod;
    protected List<SimplePropertyCRMType> property;

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
     * Obtiene el valor de la propiedad contractStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractStartDate() {
        return contractStartDate;
    }

    /**
     * Define el valor de la propiedad contractStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractStartDate(XMLGregorianCalendar value) {
        this.contractStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad contractEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Define el valor de la propiedad contractEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPeriod() {
        return totalPeriod;
    }

    /**
     * Define el valor de la propiedad totalPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPeriod(Integer value) {
        this.totalPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad remainingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemainingPeriod() {
        return remainingPeriod;
    }

    /**
     * Define el valor de la propiedad remainingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemainingPeriod(Integer value) {
        this.remainingPeriod = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyCRMType }
     * 
     * 
     */
    public List<SimplePropertyCRMType> getProperty() {
        if (property == null) {
            property = new ArrayList<SimplePropertyCRMType>();
        }
        return this.property;
    }

}
