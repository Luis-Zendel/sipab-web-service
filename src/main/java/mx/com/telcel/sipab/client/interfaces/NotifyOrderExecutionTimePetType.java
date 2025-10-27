
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotifyOrderExecutionTimePetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotifyOrderExecutionTimePetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Entero20Type"/&gt;
 *         &lt;element name="senderID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Entero20Type"/&gt;
 *         &lt;element name="sequenceNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Entero20Type"/&gt;
 *         &lt;element name="executionDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="serviceNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="eventCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica3Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyOrderExecutionTimePetType", propOrder = {
    "messageType",
    "senderID",
    "sequenceNumber",
    "executionDate",
    "serviceNumber",
    "eventCode"
})
public class NotifyOrderExecutionTimePetType {

    @XmlElement(required = true)
    protected BigInteger messageType;
    @XmlElement(required = true)
    protected BigInteger senderID;
    @XmlElement(required = true)
    protected BigInteger sequenceNumber;
    @XmlElement(required = true)
    protected String executionDate;
    @XmlElement(required = true)
    protected String serviceNumber;
    protected String eventCode;

    /**
     * Obtiene el valor de la propiedad messageType.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMessageType() {
        return messageType;
    }

    /**
     * Define el valor de la propiedad messageType.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMessageType(BigInteger value) {
        this.messageType = value;
    }

    /**
     * Obtiene el valor de la propiedad senderID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSenderID() {
        return senderID;
    }

    /**
     * Define el valor de la propiedad senderID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSenderID(BigInteger value) {
        this.senderID = value;
    }

    /**
     * Obtiene el valor de la propiedad sequenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Define el valor de la propiedad sequenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad executionDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionDate() {
        return executionDate;
    }

    /**
     * Define el valor de la propiedad executionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionDate(String value) {
        this.executionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Define el valor de la propiedad serviceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad eventCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCode() {
        return eventCode;
    }

    /**
     * Define el valor de la propiedad eventCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCode(String value) {
        this.eventCode = value;
    }

}
