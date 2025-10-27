
package mx.com.telcel.sipab.client.crm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetSubscriberInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetSubscriberInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/&gt;
 *         &lt;element name="getSubscriberInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}GetSubscriberInfoPetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubscriberInfo", propOrder = {
    "controlData",
    "getSubscriberInfo"
})
public class GetSubscriberInfo {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected GetSubscriberInfoPetType getSubscriberInfo;

    /**
     * Obtiene el valor de la propiedad controlData.
     * 
     * @return
     *     possible object is
     *     {@link ControlDataRequestHeaderType }
     *     
     */
    public ControlDataRequestHeaderType getControlData() {
        return controlData;
    }

    /**
     * Define el valor de la propiedad controlData.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlDataRequestHeaderType }
     *     
     */
    public void setControlData(ControlDataRequestHeaderType value) {
        this.controlData = value;
    }

    /**
     * Obtiene el valor de la propiedad getSubscriberInfo.
     * 
     * @return
     *     possible object is
     *     {@link GetSubscriberInfoPetType }
     *     
     */
    public GetSubscriberInfoPetType getGetSubscriberInfo() {
        return getSubscriberInfo;
    }

    /**
     * Define el valor de la propiedad getSubscriberInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubscriberInfoPetType }
     *     
     */
    public void setGetSubscriberInfo(GetSubscriberInfoPetType value) {
        this.getSubscriberInfo = value;
    }

}
