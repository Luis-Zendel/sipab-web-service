
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelDocumentsCFDI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelDocumentsCFDI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CVResourceConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="PWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="System" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ToCancel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelDocumentsCFDI", propOrder = {
    "cvResourceConfig",
    "user",
    "pwd",
    "system",
    "month",
    "toCancel"
})
public class CancelDocumentsCFDI {

    @XmlElement(name = "CVResourceConfig")
    protected String cvResourceConfig;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "PWD")
    protected String pwd;
    @XmlElement(name = "System")
    protected String system;
    @XmlElement(name = "Month")
    protected String month;
    @XmlElement(name = "ToCancel")
    protected String toCancel;

    /**
     * Obtiene el valor de la propiedad cvResourceConfig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVResourceConfig() {
        return cvResourceConfig;
    }

    /**
     * Define el valor de la propiedad cvResourceConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVResourceConfig(String value) {
        this.cvResourceConfig = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad pwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPWD() {
        return pwd;
    }

    /**
     * Define el valor de la propiedad pwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPWD(String value) {
        this.pwd = value;
    }

    /**
     * Obtiene el valor de la propiedad system.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Define el valor de la propiedad system.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

    /**
     * Obtiene el valor de la propiedad month.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonth() {
        return month;
    }

    /**
     * Define el valor de la propiedad month.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Obtiene el valor de la propiedad toCancel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCancel() {
        return toCancel;
    }

    /**
     * Define el valor de la propiedad toCancel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCancel(String value) {
        this.toCancel = value;
    }

}
