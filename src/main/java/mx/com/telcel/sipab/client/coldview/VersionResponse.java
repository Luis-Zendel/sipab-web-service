
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VersionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VersionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VersionResult" type="{}VersionResult" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionResponse", propOrder = {
    "versionResult"
})
public class VersionResponse {

    @XmlElement(name = "VersionResult")
    protected VersionResult versionResult;

    /**
     * Obtiene el valor de la propiedad versionResult.
     * 
     * @return
     *     possible object is
     *     {@link VersionResult }
     *     
     */
    public VersionResult getVersionResult() {
        return versionResult;
    }

    /**
     * Define el valor de la propiedad versionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionResult }
     *     
     */
    public void setVersionResult(VersionResult value) {
        this.versionResult = value;
    }

}
