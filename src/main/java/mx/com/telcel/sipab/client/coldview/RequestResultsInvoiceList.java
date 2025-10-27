
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para requestResultsInvoiceList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="requestResultsInvoiceList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://coldview.org/}abstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://coldview.org/}DebugData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}InvoiceDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestResultsInvoiceList", namespace = "", propOrder = {
    "debugData",
    "invoiceDetails"
})
public class RequestResultsInvoiceList
    extends AbstractResponse
{

    @XmlElement(name = "DebugData", namespace = "http://coldview.org/")
    protected VarDebugData debugData;
    @XmlElement(name = "InvoiceDetails", namespace = "http://coldview.org/")
    protected ArrayOfFacturaCFD invoiceDetails;

    /**
     * Obtiene el valor de la propiedad debugData.
     * 
     * @return
     *     possible object is
     *     {@link VarDebugData }
     *     
     */
    public VarDebugData getDebugData() {
        return debugData;
    }

    /**
     * Define el valor de la propiedad debugData.
     * 
     * @param value
     *     allowed object is
     *     {@link VarDebugData }
     *     
     */
    public void setDebugData(VarDebugData value) {
        this.debugData = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceDetails.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacturaCFD }
     *     
     */
    public ArrayOfFacturaCFD getInvoiceDetails() {
        return invoiceDetails;
    }

    /**
     * Define el valor de la propiedad invoiceDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacturaCFD }
     *     
     */
    public void setInvoiceDetails(ArrayOfFacturaCFD value) {
        this.invoiceDetails = value;
    }

}
