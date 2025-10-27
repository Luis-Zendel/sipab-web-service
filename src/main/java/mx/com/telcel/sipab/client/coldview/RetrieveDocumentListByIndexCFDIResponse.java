
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetrieveDocumentListByIndexCFDIResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetrieveDocumentListByIndexCFDIResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestResultsInvoiceList" type="{}requestResultsInvoiceList" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveDocumentListByIndexCFDIResponse", propOrder = {
    "requestResultsInvoiceList"
})
public class RetrieveDocumentListByIndexCFDIResponse {

    @XmlElement(name = "RequestResultsInvoiceList")
    protected RequestResultsInvoiceList requestResultsInvoiceList;

    /**
     * Obtiene el valor de la propiedad requestResultsInvoiceList.
     * 
     * @return
     *     possible object is
     *     {@link RequestResultsInvoiceList }
     *     
     */
    public RequestResultsInvoiceList getRequestResultsInvoiceList() {
        return requestResultsInvoiceList;
    }

    /**
     * Define el valor de la propiedad requestResultsInvoiceList.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestResultsInvoiceList }
     *     
     */
    public void setRequestResultsInvoiceList(RequestResultsInvoiceList value) {
        this.requestResultsInvoiceList = value;
    }

}
