
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetrieveDocumentByIndexCFDI_CPResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetrieveDocumentByIndexCFDI_CPResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResRetrieveDocByIndex" type="{}resRetrieveDocByIndex" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveDocumentByIndexCFDI_CPResponse", propOrder = {
    "resRetrieveDocByIndex"
})
public class RetrieveDocumentByIndexCFDICPResponse {

    @XmlElement(name = "ResRetrieveDocByIndex")
    protected ResRetrieveDocByIndex resRetrieveDocByIndex;

    /**
     * Obtiene el valor de la propiedad resRetrieveDocByIndex.
     * 
     * @return
     *     possible object is
     *     {@link ResRetrieveDocByIndex }
     *     
     */
    public ResRetrieveDocByIndex getResRetrieveDocByIndex() {
        return resRetrieveDocByIndex;
    }

    /**
     * Define el valor de la propiedad resRetrieveDocByIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link ResRetrieveDocByIndex }
     *     
     */
    public void setResRetrieveDocByIndex(ResRetrieveDocByIndex value) {
        this.resRetrieveDocByIndex = value;
    }

}
