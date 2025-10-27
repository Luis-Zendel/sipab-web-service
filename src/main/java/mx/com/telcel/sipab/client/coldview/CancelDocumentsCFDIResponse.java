
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelDocumentsCFDIResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelDocumentsCFDIResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResCancelDocument" type="{}resCancelDocument" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelDocumentsCFDIResponse", propOrder = {
    "resCancelDocument"
})
public class CancelDocumentsCFDIResponse {

    @XmlElement(name = "ResCancelDocument")
    protected ResCancelDocument resCancelDocument;

    /**
     * Obtiene el valor de la propiedad resCancelDocument.
     * 
     * @return
     *     possible object is
     *     {@link ResCancelDocument }
     *     
     */
    public ResCancelDocument getResCancelDocument() {
        return resCancelDocument;
    }

    /**
     * Define el valor de la propiedad resCancelDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link ResCancelDocument }
     *     
     */
    public void setResCancelDocument(ResCancelDocument value) {
        this.resCancelDocument = value;
    }

}
