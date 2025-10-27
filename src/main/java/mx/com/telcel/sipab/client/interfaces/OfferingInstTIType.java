
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OfferingInstTIType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OfferingInstTIType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offeringCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="shortName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type"/&gt;
 *         &lt;element name="offerShortDesc" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="monthlyFee" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="offerAct" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferingInstTIType", propOrder = {
    "offeringCode",
    "shortName",
    "offerShortDesc",
    "monthlyFee",
    "offerAct"
})
public class OfferingInstTIType {

    @XmlElement(required = true)
    protected String offeringCode;
    @XmlElement(required = true)
    protected String shortName;
    protected String offerShortDesc;
    protected BigDecimal monthlyFee;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offerAct;

    /**
     * Obtiene el valor de la propiedad offeringCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingCode() {
        return offeringCode;
    }

    /**
     * Define el valor de la propiedad offeringCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingCode(String value) {
        this.offeringCode = value;
    }

    /**
     * Obtiene el valor de la propiedad shortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Define el valor de la propiedad shortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Obtiene el valor de la propiedad offerShortDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferShortDesc() {
        return offerShortDesc;
    }

    /**
     * Define el valor de la propiedad offerShortDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferShortDesc(String value) {
        this.offerShortDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad monthlyFee.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlyFee() {
        return monthlyFee;
    }

    /**
     * Define el valor de la propiedad monthlyFee.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlyFee(BigDecimal value) {
        this.monthlyFee = value;
    }

    /**
     * Obtiene el valor de la propiedad offerAct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferAct() {
        return offerAct;
    }

    /**
     * Define el valor de la propiedad offerAct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferAct(XMLGregorianCalendar value) {
        this.offerAct = value;
    }

}
