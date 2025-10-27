
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ValidateResultType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ValidateResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validateItemId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="validateResult" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BoleanoType"/&gt;
 *         &lt;element name="level" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="promptId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="promptMessage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateResultType", propOrder = {
    "validateItemId",
    "validateResult",
    "level",
    "promptId",
    "promptMessage",
    "reason"
})
public class ValidateResultType {

    @XmlElement(required = true)
    protected String validateItemId;
    protected boolean validateResult;
    @XmlElement(required = true)
    protected String level;
    protected String promptId;
    protected String promptMessage;
    protected String reason;

    /**
     * Obtiene el valor de la propiedad validateItemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateItemId() {
        return validateItemId;
    }

    /**
     * Define el valor de la propiedad validateItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateItemId(String value) {
        this.validateItemId = value;
    }

    /**
     * Obtiene el valor de la propiedad validateResult.
     * 
     */
    public boolean isValidateResult() {
        return validateResult;
    }

    /**
     * Define el valor de la propiedad validateResult.
     * 
     */
    public void setValidateResult(boolean value) {
        this.validateResult = value;
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad promptId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptId() {
        return promptId;
    }

    /**
     * Define el valor de la propiedad promptId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptId(String value) {
        this.promptId = value;
    }

    /**
     * Obtiene el valor de la propiedad promptMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptMessage() {
        return promptMessage;
    }

    /**
     * Define el valor de la propiedad promptMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptMessage(String value) {
        this.promptMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad reason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Define el valor de la propiedad reason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
