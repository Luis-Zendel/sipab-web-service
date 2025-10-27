
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cvDocumentDataType0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cvDocumentDataType0"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PDFStream" type="{}stringDataContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cvDocumentDataType0", namespace = "", propOrder = {
    "pdfStream"
})
public class CvDocumentDataType0 {

    @XmlElement(name = "PDFStream")
    protected String pdfStream;

    /**
     * Obtiene el valor de la propiedad pdfStream.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDFStream() {
        return pdfStream;
    }

    /**
     * Define el valor de la propiedad pdfStream.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDFStream(String value) {
        this.pdfStream = value;
    }

}
