
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ItemListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ItemListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="itemTxt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="family" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="itemCos" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="itemEffdt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="itemEfexp" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="itemTng" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="offeringInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemListType", propOrder = {
    "itemId",
    "itemTxt",
    "family",
    "itemCos",
    "status",
    "itemEffdt",
    "itemEfexp",
    "itemTng",
    "offeringInstId"
})
public class ItemListType {

    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String itemTxt;
    protected String family;
    protected BigDecimal itemCos;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar itemEffdt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar itemEfexp;
    protected String itemTng;
    protected String offeringInstId;

    /**
     * Obtiene el valor de la propiedad itemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Define el valor de la propiedad itemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Obtiene el valor de la propiedad itemTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTxt() {
        return itemTxt;
    }

    /**
     * Define el valor de la propiedad itemTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTxt(String value) {
        this.itemTxt = value;
    }

    /**
     * Obtiene el valor de la propiedad family.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Define el valor de la propiedad family.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * Obtiene el valor de la propiedad itemCos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemCos() {
        return itemCos;
    }

    /**
     * Define el valor de la propiedad itemCos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemCos(BigDecimal value) {
        this.itemCos = value;
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
     * Obtiene el valor de la propiedad itemEffdt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItemEffdt() {
        return itemEffdt;
    }

    /**
     * Define el valor de la propiedad itemEffdt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItemEffdt(XMLGregorianCalendar value) {
        this.itemEffdt = value;
    }

    /**
     * Obtiene el valor de la propiedad itemEfexp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItemEfexp() {
        return itemEfexp;
    }

    /**
     * Define el valor de la propiedad itemEfexp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItemEfexp(XMLGregorianCalendar value) {
        this.itemEfexp = value;
    }

    /**
     * Obtiene el valor de la propiedad itemTng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTng() {
        return itemTng;
    }

    /**
     * Define el valor de la propiedad itemTng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTng(String value) {
        this.itemTng = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringInstId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingInstId() {
        return offeringInstId;
    }

    /**
     * Define el valor de la propiedad offeringInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingInstId(String value) {
        this.offeringInstId = value;
    }

}
