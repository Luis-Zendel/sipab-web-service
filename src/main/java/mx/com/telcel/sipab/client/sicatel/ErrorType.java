
package mx.com.telcel.sipab.client.sicatel;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Elemento corporativo complejo
 * 
 * <p>Clase Java para ErrorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://amx.com/mexico/telcel/esb/v1_1}CodeType"/&gt;
 *         &lt;element name="severityLevel" type="{http://amx.com/mexico/telcel/esb/v1_1}SeverityType"/&gt;
 *         &lt;element name="description" type="{http://amx.com/mexico/telcel/esb/v1_1}DescriptionType"/&gt;
 *         &lt;element name="actor" type="{http://amx.com/mexico/telcel/esb/v1_1}ActorType" minOccurs="0"/&gt;
 *         &lt;element name="businessMeaning" type="{http://amx.com/mexico/telcel/esb/v1_1}MeaningType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", namespace = "http://amx.com/mexico/telcel/esb/v1_1", propOrder = {
    "code",
    "severityLevel",
    "description",
    "actor",
    "businessMeaning"
})
public class ErrorType {

    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1", required = true)
    protected String code;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1")
    protected int severityLevel;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1", required = true)
    protected String description;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1")
    protected String actor;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1", required = true)
    protected String businessMeaning;

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad severityLevel.
     * 
     */
    public int getSeverityLevel() {
        return severityLevel;
    }

    /**
     * Define el valor de la propiedad severityLevel.
     * 
     */
    public void setSeverityLevel(int value) {
        this.severityLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad actor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActor() {
        return actor;
    }

    /**
     * Define el valor de la propiedad actor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActor(String value) {
        this.actor = value;
    }

    /**
     * Obtiene el valor de la propiedad businessMeaning.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessMeaning() {
        return businessMeaning;
    }

    /**
     * Define el valor de la propiedad businessMeaning.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessMeaning(String value) {
        this.businessMeaning = value;
    }

}
