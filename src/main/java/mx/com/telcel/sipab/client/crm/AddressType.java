
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AddressType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="preferenceFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="addrType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="addressInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}AddressInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressId",
    "preferenceFlag",
    "effDate",
    "expDate",
    "addrType",
    "addressInfo"
})
public class AddressType {

    protected BigDecimal addressId;
    protected String preferenceFlag;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    protected BigDecimal addrType;
    @XmlElement(required = true)
    protected AddressInfoType addressInfo;

    /**
     * Obtiene el valor de la propiedad addressId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddressId() {
        return addressId;
    }

    /**
     * Define el valor de la propiedad addressId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAddressId(BigDecimal value) {
        this.addressId = value;
    }

    /**
     * Obtiene el valor de la propiedad preferenceFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferenceFlag() {
        return preferenceFlag;
    }

    /**
     * Define el valor de la propiedad preferenceFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferenceFlag(String value) {
        this.preferenceFlag = value;
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
     * Obtiene el valor de la propiedad addrType.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddrType() {
        return addrType;
    }

    /**
     * Define el valor de la propiedad addrType.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAddrType(BigDecimal value) {
        this.addrType = value;
    }

    /**
     * Obtiene el valor de la propiedad addressInfo.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddressInfo() {
        return addressInfo;
    }

    /**
     * Define el valor de la propiedad addressInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddressInfo(AddressInfoType value) {
        this.addressInfo = value;
    }

}
