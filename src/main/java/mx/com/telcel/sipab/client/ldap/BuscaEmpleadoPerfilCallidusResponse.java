
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
 *         &lt;element name="buscaEmpleadoPerfilCallidusReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "buscaEmpleadoPerfilCallidusReturn"
})
@XmlRootElement(name = "buscaEmpleadoPerfilCallidusResponse")
public class BuscaEmpleadoPerfilCallidusResponse {

    @XmlElement(required = true, nillable = true)
    protected String buscaEmpleadoPerfilCallidusReturn;

    /**
     * Obtiene el valor de la propiedad buscaEmpleadoPerfilCallidusReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuscaEmpleadoPerfilCallidusReturn() {
        return buscaEmpleadoPerfilCallidusReturn;
    }

    /**
     * Define el valor de la propiedad buscaEmpleadoPerfilCallidusReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuscaEmpleadoPerfilCallidusReturn(String value) {
        this.buscaEmpleadoPerfilCallidusReturn = value;
    }

}
