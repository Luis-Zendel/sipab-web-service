
package mx.com.telcel.sipab.client.tt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ControlDataResponseHeaderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ControlDataResponseHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="version" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica24Type"/&gt;
 *         &lt;element name="resultCode" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="resultDesc" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica1024Type"/&gt;
 *         &lt;element name="additionalProperty" type="{http://amx.com/mexico/telcel/esb/v1_2}BesAdditionalPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="msgLanguageCode" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsLanguageCodeType" minOccurs="0"/&gt;
 *         &lt;element name="messageUUID" type="{http://amx.com/mexico/telcel/esb/v1_2}MessageUUIDType"/&gt;
 *         &lt;element name="responseDate" type="{http://amx.com/mexico/telcel/esb/v1_2}DateTimeType"/&gt;
 *         &lt;element name="sendBy" type="{http://amx.com/mexico/telcel/esb/v1_2}SenderType"/&gt;
 *         &lt;element name="latency" type="{http://amx.com/mexico/telcel/esb/v1_2}LatencyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlDataResponseHeaderType", namespace = "http://amx.com/mexico/telcel/esb/v1_2", propOrder = {
    "version",
    "resultCode",
    "resultDesc",
    "additionalProperty",
    "msgLanguageCode",
    "messageUUID",
    "responseDate",
    "sendBy",
    "latency"
})
public class ControlDataResponseHeaderType {

    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected String version;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected String resultCode;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected String resultDesc;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected List<BesAdditionalPropertyType> additionalProperty;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected String msgLanguageCode;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected String messageUUID;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDate;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected String sendBy;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected int latency;

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
     * Obtiene el valor de la propiedad resultCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Define el valor de la propiedad resultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Obtiene el valor de la propiedad resultDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDesc() {
        return resultDesc;
    }

    /**
     * Define el valor de la propiedad resultDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDesc(String value) {
        this.resultDesc = value;
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
     * {@link BesAdditionalPropertyType }
     * 
     * 
     */
    public List<BesAdditionalPropertyType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<BesAdditionalPropertyType>();
        }
        return this.additionalProperty;
    }

    /**
     * Obtiene el valor de la propiedad msgLanguageCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgLanguageCode() {
        return msgLanguageCode;
    }

    /**
     * Define el valor de la propiedad msgLanguageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgLanguageCode(String value) {
        this.msgLanguageCode = value;
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

}
