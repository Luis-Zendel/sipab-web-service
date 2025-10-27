
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IdentityInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IdentityInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identityType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="identityValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="recycleMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="operType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityInfoType", propOrder = {
    "identityType",
    "identityValue",
    "recycleMode",
    "operType"
})
public class IdentityInfoType {

    @XmlElement(required = true)
    protected String identityType;
    @XmlElement(required = true)
    protected String identityValue;
    protected String recycleMode;
    @XmlElement(required = true)
    protected String operType;

    /**
     * Obtiene el valor de la propiedad identityType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * Define el valor de la propiedad identityType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityType(String value) {
        this.identityType = value;
    }

    /**
     * Obtiene el valor de la propiedad identityValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityValue() {
        return identityValue;
    }

    /**
     * Define el valor de la propiedad identityValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityValue(String value) {
        this.identityValue = value;
    }

    /**
     * Obtiene el valor de la propiedad recycleMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecycleMode() {
        return recycleMode;
    }

    /**
     * Define el valor de la propiedad recycleMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecycleMode(String value) {
        this.recycleMode = value;
    }

    /**
     * Obtiene el valor de la propiedad operType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperType() {
        return operType;
    }

    /**
     * Define el valor de la propiedad operType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperType(String value) {
        this.operType = value;
    }

}
