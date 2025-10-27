
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resRetrieveDocByIndex complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resRetrieveDocByIndex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://coldview.org/}abstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://coldview.org/}CVDocumentData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}DATAPARSEStream" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resRetrieveDocByIndex", namespace = "", propOrder = {
    "cvDocumentData",
    "dataparseStream"
})
public class ResRetrieveDocByIndex
    extends AbstractResponse
{

    @XmlElement(name = "CVDocumentData", namespace = "http://coldview.org/")
    protected CvDocumentDataType0 cvDocumentData;
    @XmlElement(name = "DATAPARSEStream", namespace = "http://coldview.org/")
    protected DataparseStreamType0 dataparseStream;

    /**
     * Obtiene el valor de la propiedad cvDocumentData.
     * 
     * @return
     *     possible object is
     *     {@link CvDocumentDataType0 }
     *     
     */
    public CvDocumentDataType0 getCVDocumentData() {
        return cvDocumentData;
    }

    /**
     * Define el valor de la propiedad cvDocumentData.
     * 
     * @param value
     *     allowed object is
     *     {@link CvDocumentDataType0 }
     *     
     */
    public void setCVDocumentData(CvDocumentDataType0 value) {
        this.cvDocumentData = value;
    }

    /**
     * Obtiene el valor de la propiedad dataparseStream.
     * 
     * @return
     *     possible object is
     *     {@link DataparseStreamType0 }
     *     
     */
    public DataparseStreamType0 getDATAPARSEStream() {
        return dataparseStream;
    }

    /**
     * Define el valor de la propiedad dataparseStream.
     * 
     * @param value
     *     allowed object is
     *     {@link DataparseStreamType0 }
     *     
     */
    public void setDATAPARSEStream(DataparseStreamType0 value) {
        this.dataparseStream = value;
    }

}
