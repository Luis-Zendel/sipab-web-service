
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetrieveDocumentByIndexCFDI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetrieveDocumentByIndexCFDI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CVResourceConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="PWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Factura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ContenedorCV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="TipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveDocumentByIndexCFDI", propOrder = {
    "cvResourceConfig",
    "user",
    "pwd",
    "uuid",
    "factura",
    "contenedorCV",
    "tipoDoc"
})
public class RetrieveDocumentByIndexCFDI {

    @XmlElement(name = "CVResourceConfig")
    protected String cvResourceConfig;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "PWD")
    protected String pwd;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "Factura")
    protected String factura;
    @XmlElement(name = "ContenedorCV")
    protected String contenedorCV;
    @XmlElement(name = "TipoDoc")
    protected String tipoDoc;

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
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactura(String value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad contenedorCV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenedorCV() {
        return contenedorCV;
    }

    /**
     * Define el valor de la propiedad contenedorCV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenedorCV(String value) {
        this.contenedorCV = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Define el valor de la propiedad tipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDoc(String value) {
        this.tipoDoc = value;
    }

}
