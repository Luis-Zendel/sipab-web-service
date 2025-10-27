
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para informationResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="informationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://coldview.org/}abstractResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfigFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LogName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResourceFilesEncoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResourcesFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informationResponse", propOrder = {
    "configFolder",
    "logLevel",
    "logName",
    "resourceFilesEncoding",
    "resourcesFolder"
})
public class InformationResponse2
    extends AbstractResponse
{

    @XmlElement(name = "ConfigFolder", namespace = "")
    protected String configFolder;
    @XmlElement(name = "LogLevel", namespace = "")
    protected String logLevel;
    @XmlElement(name = "LogName", namespace = "")
    protected String logName;
    @XmlElement(name = "ResourceFilesEncoding", namespace = "")
    protected String resourceFilesEncoding;
    @XmlElement(name = "ResourcesFolder", namespace = "")
    protected String resourcesFolder;

    /**
     * Obtiene el valor de la propiedad configFolder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigFolder() {
        return configFolder;
    }

    /**
     * Define el valor de la propiedad configFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigFolder(String value) {
        this.configFolder = value;
    }

    /**
     * Obtiene el valor de la propiedad logLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * Define el valor de la propiedad logLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogLevel(String value) {
        this.logLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad logName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogName() {
        return logName;
    }

    /**
     * Define el valor de la propiedad logName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogName(String value) {
        this.logName = value;
    }

    /**
     * Obtiene el valor de la propiedad resourceFilesEncoding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceFilesEncoding() {
        return resourceFilesEncoding;
    }

    /**
     * Define el valor de la propiedad resourceFilesEncoding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceFilesEncoding(String value) {
        this.resourceFilesEncoding = value;
    }

    /**
     * Obtiene el valor de la propiedad resourcesFolder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourcesFolder() {
        return resourcesFolder;
    }

    /**
     * Define el valor de la propiedad resourcesFolder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourcesFolder(String value) {
        this.resourcesFolder = value;
    }

}
