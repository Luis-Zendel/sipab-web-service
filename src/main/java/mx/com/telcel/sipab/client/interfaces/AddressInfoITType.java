
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AddressInfoITType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddressInfoITType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AddressIdType" minOccurs="0"/&gt;
 *         &lt;element name="preferenceFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PreferenceFlagType" minOccurs="0"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}EffDateType" minOccurs="0"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ExpDateType" minOccurs="0"/&gt;
 *         &lt;element name="addr" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AddrType" minOccurs="0"/&gt;
 *         &lt;element name="addressInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AddressInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfoITType", propOrder = {
    "addressId",
    "preferenceFlag",
    "effDate",
    "expDate",
    "addr",
    "addressInfo"
})
public class AddressInfoITType {

    protected BigDecimal addressId;
    @XmlSchemaType(name = "string")
    protected PreferenceFlagType preferenceFlag;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    protected BigDecimal addr;
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
     *     {@link PreferenceFlagType }
     *     
     */
    public PreferenceFlagType getPreferenceFlag() {
        return preferenceFlag;
    }

    /**
     * Define el valor de la propiedad preferenceFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceFlagType }
     *     
     */
    public void setPreferenceFlag(PreferenceFlagType value) {
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
     * Obtiene el valor de la propiedad addr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddr() {
        return addr;
    }

    /**
     * Define el valor de la propiedad addr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAddr(BigDecimal value) {
        this.addr = value;
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
