
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelDocumentCFDIResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelDocumentCFDIResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResCancelDocumentCFDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelDocumentCFDIResponse", propOrder = {
    "resCancelDocumentCFDI"
})
public class CancelDocumentCFDIResponse {

    @XmlElement(name = "ResCancelDocumentCFDI")
    protected String resCancelDocumentCFDI;

    /**
     * Obtiene el valor de la propiedad resCancelDocumentCFDI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResCancelDocumentCFDI() {
        return resCancelDocumentCFDI;
    }

    /**
     * Define el valor de la propiedad resCancelDocumentCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResCancelDocumentCFDI(String value) {
        this.resCancelDocumentCFDI = value;
    }

}
