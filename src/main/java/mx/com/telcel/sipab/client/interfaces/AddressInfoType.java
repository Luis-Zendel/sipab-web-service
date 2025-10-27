
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AddressInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddressInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addrId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="addrClass" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type"/&gt;
 *         &lt;element name="addr1" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr2" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr3" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr4" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr5" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr6" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr7" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr8" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr9" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr10" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr11" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr12" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr13" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr14" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="addr15" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="usAddr" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type" minOccurs="0"/&gt;
 *         &lt;element name="addrProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SimplePropertyCRMType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressInfoType", propOrder = {
    "addrId",
    "addrClass",
    "addr1",
    "addr2",
    "addr3",
    "addr4",
    "addr5",
    "addr6",
    "addr7",
    "addr8",
    "addr9",
    "addr10",
    "addr11",
    "addr12",
    "addr13",
    "addr14",
    "addr15",
    "usAddr",
    "postalCode",
    "addrProperty"
})
public class AddressInfoType {

    protected Long addrId;
    @XmlElement(required = true)
    protected String addrClass;
    protected String addr1;
    protected String addr2;
    protected String addr3;
    protected String addr4;
    protected String addr5;
    protected String addr6;
    protected String addr7;
    protected String addr8;
    protected String addr9;
    protected String addr10;
    protected String addr11;
    protected String addr12;
    protected String addr13;
    protected String addr14;
    protected String addr15;
    protected String usAddr;
    protected String postalCode;
    protected List<SimplePropertyCRMType> addrProperty;

    /**
     * Obtiene el valor de la propiedad addrId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddrId() {
        return addrId;
    }

    /**
     * Define el valor de la propiedad addrId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddrId(Long value) {
        this.addrId = value;
    }

    /**
     * Obtiene el valor de la propiedad addrClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrClass() {
        return addrClass;
    }

    /**
     * Define el valor de la propiedad addrClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrClass(String value) {
        this.addrClass = value;
    }

    /**
     * Obtiene el valor de la propiedad addr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr1() {
        return addr1;
    }

    /**
     * Define el valor de la propiedad addr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr1(String value) {
        this.addr1 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr2() {
        return addr2;
    }

    /**
     * Define el valor de la propiedad addr2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr2(String value) {
        this.addr2 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr3() {
        return addr3;
    }

    /**
     * Define el valor de la propiedad addr3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr3(String value) {
        this.addr3 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr4() {
        return addr4;
    }

    /**
     * Define el valor de la propiedad addr4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr4(String value) {
        this.addr4 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr5() {
        return addr5;
    }

    /**
     * Define el valor de la propiedad addr5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr5(String value) {
        this.addr5 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr6() {
        return addr6;
    }

    /**
     * Define el valor de la propiedad addr6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr6(String value) {
        this.addr6 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr7() {
        return addr7;
    }

    /**
     * Define el valor de la propiedad addr7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr7(String value) {
        this.addr7 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr8() {
        return addr8;
    }

    /**
     * Define el valor de la propiedad addr8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr8(String value) {
        this.addr8 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr9() {
        return addr9;
    }

    /**
     * Define el valor de la propiedad addr9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr9(String value) {
        this.addr9 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr10() {
        return addr10;
    }

    /**
     * Define el valor de la propiedad addr10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr10(String value) {
        this.addr10 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr11.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr11() {
        return addr11;
    }

    /**
     * Define el valor de la propiedad addr11.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr11(String value) {
        this.addr11 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr12() {
        return addr12;
    }

    /**
     * Define el valor de la propiedad addr12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr12(String value) {
        this.addr12 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr13() {
        return addr13;
    }

    /**
     * Define el valor de la propiedad addr13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr13(String value) {
        this.addr13 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr14.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr14() {
        return addr14;
    }

    /**
     * Define el valor de la propiedad addr14.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr14(String value) {
        this.addr14 = value;
    }

    /**
     * Obtiene el valor de la propiedad addr15.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr15() {
        return addr15;
    }

    /**
     * Define el valor de la propiedad addr15.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr15(String value) {
        this.addr15 = value;
    }

    /**
     * Obtiene el valor de la propiedad usAddr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsAddr() {
        return usAddr;
    }

    /**
     * Define el valor de la propiedad usAddr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsAddr(String value) {
        this.usAddr = value;
    }

    /**
     * Obtiene el valor de la propiedad postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define el valor de la propiedad postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the addrProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addrProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddrProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyCRMType }
     * 
     * 
     */
    public List<SimplePropertyCRMType> getAddrProperty() {
        if (addrProperty == null) {
            addrProperty = new ArrayList<SimplePropertyCRMType>();
        }
        return this.addrProperty;
    }

}
