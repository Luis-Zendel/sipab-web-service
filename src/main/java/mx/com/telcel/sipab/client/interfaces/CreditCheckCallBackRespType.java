
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreditCheckCallBackRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreditCheckCallBackRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica35Type"/&gt;
 *         &lt;element name="folioNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="trackingUniqueNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica15Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCheckCallBackRespType", propOrder = {
    "orderId",
    "folioNumber",
    "trackingUniqueNumber"
})
public class CreditCheckCallBackRespType {

    @XmlElement(required = true)
    protected String orderId;
    @XmlElement(required = true)
    protected String folioNumber;
    @XmlElement(required = true)
    protected String trackingUniqueNumber;

    /**
     * Obtiene el valor de la propiedad orderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Define el valor de la propiedad orderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Obtiene el valor de la propiedad folioNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioNumber() {
        return folioNumber;
    }

    /**
     * Define el valor de la propiedad folioNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioNumber(String value) {
        this.folioNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingUniqueNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUniqueNumber() {
        return trackingUniqueNumber;
    }

    /**
     * Define el valor de la propiedad trackingUniqueNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUniqueNumber(String value) {
        this.trackingUniqueNumber = value;
    }

}
