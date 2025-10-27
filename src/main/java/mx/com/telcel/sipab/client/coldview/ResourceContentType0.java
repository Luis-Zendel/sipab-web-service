
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resourceContentType0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resourceContentType0"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localExtraElement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceContentType0", namespace = "", propOrder = {
    "localExtraElement"
})
public class ResourceContentType0 {

    protected String localExtraElement;

    /**
     * Obtiene el valor de la propiedad localExtraElement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalExtraElement() {
        return localExtraElement;
    }

    /**
     * Define el valor de la propiedad localExtraElement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalExtraElement(String value) {
        this.localExtraElement = value;
    }

}
