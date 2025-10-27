
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CustBasicInfoBesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustBasicInfoBesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="custCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="custLevel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="custType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="custCreditLevel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="custShortName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="custProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustBasicInfoBesType", propOrder = {
    "custCode",
    "custLevel",
    "custType",
    "custCreditLevel",
    "custShortName",
    "custProperty"
})
public class CustBasicInfoBesType {

    protected String custCode;
    protected String custLevel;
    protected String custType;
    protected String custCreditLevel;
    protected String custShortName;
    protected List<BesCrmSimplePropertyType> custProperty;

    /**
     * Obtiene el valor de la propiedad custCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCode() {
        return custCode;
    }

    /**
     * Define el valor de la propiedad custCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCode(String value) {
        this.custCode = value;
    }

    /**
     * Obtiene el valor de la propiedad custLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLevel() {
        return custLevel;
    }

    /**
     * Define el valor de la propiedad custLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLevel(String value) {
        this.custLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad custType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Define el valor de la propiedad custType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Obtiene el valor de la propiedad custCreditLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCreditLevel() {
        return custCreditLevel;
    }

    /**
     * Define el valor de la propiedad custCreditLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCreditLevel(String value) {
        this.custCreditLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad custShortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustShortName() {
        return custShortName;
    }

    /**
     * Define el valor de la propiedad custShortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustShortName(String value) {
        this.custShortName = value;
    }

    /**
     * Gets the value of the custProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the custProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BesCrmSimplePropertyType }
     * 
     * 
     */
    public List<BesCrmSimplePropertyType> getCustProperty() {
        if (custProperty == null) {
            custProperty = new ArrayList<BesCrmSimplePropertyType>();
        }
        return this.custProperty;
    }

}
