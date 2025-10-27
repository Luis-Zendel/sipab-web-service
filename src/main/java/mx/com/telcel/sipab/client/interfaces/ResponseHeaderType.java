
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseHeaderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="retCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type"/&gt;
 *         &lt;element name="retMessage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="retReason" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="retSuggestion" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeaderType", propOrder = {
    "retCode",
    "retMessage",
    "retReason",
    "retSuggestion"
})
public class ResponseHeaderType {

    @XmlElement(required = true)
    protected String retCode;
    protected String retMessage;
    protected String retReason;
    protected String retSuggestion;

    /**
     * Obtiene el valor de la propiedad retCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetCode() {
        return retCode;
    }

    /**
     * Define el valor de la propiedad retCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetCode(String value) {
        this.retCode = value;
    }

    /**
     * Obtiene el valor de la propiedad retMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetMessage() {
        return retMessage;
    }

    /**
     * Define el valor de la propiedad retMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetMessage(String value) {
        this.retMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad retReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetReason() {
        return retReason;
    }

    /**
     * Define el valor de la propiedad retReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetReason(String value) {
        this.retReason = value;
    }

    /**
     * Obtiene el valor de la propiedad retSuggestion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetSuggestion() {
        return retSuggestion;
    }

    /**
     * Define el valor de la propiedad retSuggestion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetSuggestion(String value) {
        this.retSuggestion = value;
    }

}
