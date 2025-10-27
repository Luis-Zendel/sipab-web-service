
package mx.com.telcel.sipab.client.sicatel;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Elemento corporativo complejo
 * 
 * <p>Clase Java para ControlDataResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ControlDataResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageUUID" type="{http://amx.com/mexico/telcel/esb/v1_1}MessageUUIDType"/&gt;
 *         &lt;element name="responseDate" type="{http://amx.com/mexico/telcel/esb/v1_1}DateTimeType"/&gt;
 *         &lt;element name="sendBy" type="{http://amx.com/mexico/telcel/esb/v1_1}SenderType"/&gt;
 *         &lt;element name="latency" type="{http://amx.com/mexico/telcel/esb/v1_1}LatencyType"/&gt;
 *         &lt;element name="version" type="{http://amx.com/mexico/telcel/esb/v1_1}VersionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlDataResponseType", namespace = "http://amx.com/mexico/telcel/esb/v1_1", propOrder = {
    "messageUUID",
    "responseDate",
    "sendBy",
    "latency",
    "version"
})
public class ControlDataResponseType {

    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1", required = true)
    protected String messageUUID;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDate;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1", required = true)
    protected String sendBy;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1")
    protected int latency;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1", required = true)
    protected String version;

    /**
     * Obtiene el valor de la propiedad messageUUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageUUID() {
        return messageUUID;
    }

    /**
     * Define el valor de la propiedad messageUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageUUID(String value) {
        this.messageUUID = value;
    }

    /**
     * Obtiene el valor de la propiedad responseDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDate() {
        return responseDate;
    }

    /**
     * Define el valor de la propiedad responseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDate(XMLGregorianCalendar value) {
        this.responseDate = value;
    }

    /**
     * Obtiene el valor de la propiedad sendBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendBy() {
        return sendBy;
    }

    /**
     * Define el valor de la propiedad sendBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendBy(String value) {
        this.sendBy = value;
    }

    /**
     * Obtiene el valor de la propiedad latency.
     * 
     */
    public int getLatency() {
        return latency;
    }

    /**
     * Define el valor de la propiedad latency.
     * 
     */
    public void setLatency(int value) {
        this.latency = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
