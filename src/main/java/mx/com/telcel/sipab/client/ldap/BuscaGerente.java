
package mx.com.telcel.sipab.client.ldap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_app" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password_app" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numero_de_empleado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idApp",
    "passwordApp",
    "numeroDeEmpleado"
})
@XmlRootElement(name = "buscaGerente")
public class BuscaGerente {

    @XmlElement(name = "id_app", required = true, nillable = true)
    protected String idApp;
    @XmlElement(name = "password_app", required = true, nillable = true)
    protected String passwordApp;
    @XmlElement(name = "numero_de_empleado", required = true, nillable = true)
    protected String numeroDeEmpleado;

    /**
     * Obtiene el valor de la propiedad idApp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdApp() {
        return idApp;
    }

    /**
     * Define el valor de la propiedad idApp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdApp(String value) {
        this.idApp = value;
    }

    /**
     * Obtiene el valor de la propiedad passwordApp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordApp() {
        return passwordApp;
    }

    /**
     * Define el valor de la propiedad passwordApp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordApp(String value) {
        this.passwordApp = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDeEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeEmpleado() {
        return numeroDeEmpleado;
    }

    /**
     * Define el valor de la propiedad numeroDeEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeEmpleado(String value) {
        this.numeroDeEmpleado = value;
    }

}
