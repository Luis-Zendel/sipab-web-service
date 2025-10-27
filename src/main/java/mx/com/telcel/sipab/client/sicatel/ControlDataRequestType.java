
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
 * <p>Clase Java para ControlDataRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ControlDataRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageUUID" type="{http://amx.com/mexico/telcel/esb/v1_1}MessageUUIDType"/&gt;
 *         &lt;element name="requestDate" type="{http://amx.com/mexico/telcel/esb/v1_1}DateTimeType"/&gt;
 *         &lt;element name="sendBy" type="{http://amx.com/mexico/telcel/esb/v1_1}SenderType"/&gt;
 *         &lt;element name="version" type="{http://amx.com/mexico/telcel/esb/v1_1}VersionType"/&gt;
 *         &lt;element name="ipClient" type="{http://amx.com/mexico/telcel/esb/v1_1}IPv4AddressType" minOccurs="0"/&gt;
 *         &lt;element name="ipServer" type="{http://amx.com/mexico/telcel/esb/v1_1}IPv4AddressType" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://amx.com/mexico/telcel/esb/v1_1}UserType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlDataRequestType", namespace = "http://amx.com/mexico/telcel/esb/v1_1", propOrder = {
    "messageUUID",
    "requestDate",
    "sendBy",
    "version",
    "ipClient",
    "ipServer",
    "user"
})
public class ControlDataRequestType {

    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1", required = true)
    protected String messageUUID;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1", required = true)
    protected String sendBy;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1", required = true)
    protected String version;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1")
    protected String ipClient;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1")
    protected String ipServer;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_1")
    protected String user;

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
     * Obtiene el valor de la propiedad requestDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Define el valor de la propiedad requestDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
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

    /**
     * Obtiene el valor de la propiedad ipClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpClient() {
        return ipClient;
    }

    /**
     * Define el valor de la propiedad ipClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpClient(String value) {
        this.ipClient = value;
    }

    /**
     * Obtiene el valor de la propiedad ipServer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpServer() {
        return ipServer;
    }

    /**
     * Define el valor de la propiedad ipServer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpServer(String value) {
        this.ipServer = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
