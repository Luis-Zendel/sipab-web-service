
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ControlDataRequestHeaderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ControlDataRequestHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica24Type"/&gt;
 *         &lt;element name="businessCode" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="messageUUID" type="{http://amx.com/mexico/telcel/esb/v1_2}MessageUUIDType"/&gt;
 *         &lt;element name="additionalProperty" type="{http://amx.com/mexico/telcel/esb/v1_2}BesAdditionalPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="requestDate" type="{http://amx.com/mexico/telcel/esb/v1_2}DateTimeType"/&gt;
 *         &lt;element name="sendBy" type="{http://amx.com/mexico/telcel/esb/v1_2}SenderType"/&gt;
 *         &lt;element name="ipClient" type="{http://amx.com/mexico/telcel/esb/v1_2}IPv4AddressType" minOccurs="0"/&gt;
 *         &lt;element name="ipServer" type="{http://amx.com/mexico/telcel/esb/v1_2}IPv4AddressType" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://amx.com/mexico/telcel/esb/v1_2}UserType" minOccurs="0"/&gt;
 *         &lt;element name="besCbsRequestHeader" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsRequestHeaderType" minOccurs="0"/&gt;
 *         &lt;element name="besCrmRequestHeader" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCrmRequestHeaderType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlDataRequestHeaderType", namespace = "http://amx.com/mexico/telcel/esb/v1_2", propOrder = {
    "version",
    "businessCode",
    "messageUUID",
    "additionalProperty",
    "requestDate",
    "sendBy",
    "ipClient",
    "ipServer",
    "user",
    "besCbsRequestHeader",
    "besCrmRequestHeader"
})
public class ControlDataRequestHeaderType {

    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected String version;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected String businessCode;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected String messageUUID;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected List<BesAdditionalPropertyType2> additionalProperty;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected String sendBy;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected String ipClient;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected String ipServer;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected String user;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected BesCbsRequestHeaderType besCbsRequestHeader;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected BesCrmRequestHeaderType besCrmRequestHeader;

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
     * Obtiene el valor de la propiedad businessCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * Define el valor de la propiedad businessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCode(String value) {
        this.businessCode = value;
    }

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
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BesAdditionalPropertyType2 }
     * 
     * 
     */
    public List<BesAdditionalPropertyType2> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<BesAdditionalPropertyType2>();
        }
        return this.additionalProperty;
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

    /**
     * Obtiene el valor de la propiedad besCbsRequestHeader.
     * 
     * @return
     *     possible object is
     *     {@link BesCbsRequestHeaderType }
     *     
     */
    public BesCbsRequestHeaderType getBesCbsRequestHeader() {
        return besCbsRequestHeader;
    }

    /**
     * Define el valor de la propiedad besCbsRequestHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCbsRequestHeaderType }
     *     
     */
    public void setBesCbsRequestHeader(BesCbsRequestHeaderType value) {
        this.besCbsRequestHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad besCrmRequestHeader.
     * 
     * @return
     *     possible object is
     *     {@link BesCrmRequestHeaderType }
     *     
     */
    public BesCrmRequestHeaderType getBesCrmRequestHeader() {
        return besCrmRequestHeader;
    }

    /**
     * Define el valor de la propiedad besCrmRequestHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCrmRequestHeaderType }
     *     
     */
    public void setBesCrmRequestHeader(BesCrmRequestHeaderType value) {
        this.besCrmRequestHeader = value;
    }

}
