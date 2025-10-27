
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelDocument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CVResourceConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="PWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Sistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="NroSerie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="NroFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelDocument", propOrder = {
    "cvResourceConfig",
    "user",
    "pwd",
    "sistema",
    "date",
    "nroSerie",
    "nroFolio"
})
public class CancelDocument {

    @XmlElement(name = "CVResourceConfig")
    protected String cvResourceConfig;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "PWD")
    protected String pwd;
    @XmlElement(name = "Sistema")
    protected String sistema;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "NroSerie")
    protected String nroSerie;
    @XmlElement(name = "NroFolio")
    protected String nroFolio;

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
     * Obtiene el valor de la propiedad sistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Define el valor de la propiedad sistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistema(String value) {
        this.sistema = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Obtiene el valor de la propiedad nroSerie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroSerie() {
        return nroSerie;
    }

    /**
     * Define el valor de la propiedad nroSerie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroSerie(String value) {
        this.nroSerie = value;
    }

    /**
     * Obtiene el valor de la propiedad nroFolio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroFolio() {
        return nroFolio;
    }

    /**
     * Define el valor de la propiedad nroFolio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroFolio(String value) {
        this.nroFolio = value;
    }

}
