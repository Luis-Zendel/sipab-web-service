
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotifyFinalDeliveryStatusPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotifyFinalDeliveryStatusPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderNo" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="trackingNo" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="trackingStatus" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="trackingStatusDescription" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="eventCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyFinalDeliveryStatusPetType", propOrder = {
    "orderNo",
    "trackingNo",
    "trackingStatus",
    "trackingStatusDescription",
    "eventCode"
})
public class NotifyFinalDeliveryStatusPetType {

    @XmlElement(required = true)
    protected String orderNo;
    @XmlElement(required = true)
    protected String trackingNo;
    @XmlElement(required = true)
    protected String trackingStatus;
    protected String trackingStatusDescription;
    protected String eventCode;

    /**
     * Obtiene el valor de la propiedad orderNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Define el valor de la propiedad orderNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNo() {
        return trackingNo;
    }

    /**
     * Define el valor de la propiedad trackingNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNo(String value) {
        this.trackingNo = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingStatus() {
        return trackingStatus;
    }

    /**
     * Define el valor de la propiedad trackingStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingStatus(String value) {
        this.trackingStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingStatusDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingStatusDescription() {
        return trackingStatusDescription;
    }

    /**
     * Define el valor de la propiedad trackingStatusDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingStatusDescription(String value) {
        this.trackingStatusDescription = value;
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
