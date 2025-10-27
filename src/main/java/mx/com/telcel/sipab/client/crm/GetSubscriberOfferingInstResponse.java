
package mx.com.telcel.sipab.client.crm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetSubscriberOfferingInstResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetSubscriberOfferingInstResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataResponseHeaderType"/&gt;
 *         &lt;element name="detailResponse" type="{http://amx.com/mexico/telcel/esb/v1_2}DetailResponseType"/&gt;
 *         &lt;element name="getSubscriberOfferingInstResponse" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}GetSubscriberOfferingInstRespType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubscriberOfferingInstResponse", propOrder = {
    "controlData",
    "detailResponse",
    "getSubscriberOfferingInstResponse"
})
public class GetSubscriberOfferingInstResponse {

    @XmlElement(required = true)
    protected ControlDataResponseHeaderType controlData;
    @XmlElement(required = true)
    protected DetailResponseType detailResponse;
    @XmlElement(required = true)
    protected GetSubscriberOfferingInstRespType getSubscriberOfferingInstResponse;

    /**
     * Obtiene el valor de la propiedad controlData.
     * 
     * @return
     *     possible object is
     *     {@link ControlDataResponseHeaderType }
     *     
     */
    public ControlDataResponseHeaderType getControlData() {
        return controlData;
    }

    /**
     * Define el valor de la propiedad controlData.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlDataResponseHeaderType }
     *     
     */
    public void setControlData(ControlDataResponseHeaderType value) {
        this.controlData = value;
    }

    /**
     * Obtiene el valor de la propiedad detailResponse.
     * 
     * @return
     *     possible object is
     *     {@link DetailResponseType }
     *     
     */
    public DetailResponseType getDetailResponse() {
        return detailResponse;
    }

    /**
     * Define el valor de la propiedad detailResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailResponseType }
     *     
     */
    public void setDetailResponse(DetailResponseType value) {
        this.detailResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad getSubscriberOfferingInstResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetSubscriberOfferingInstRespType }
     *     
     */
    public GetSubscriberOfferingInstRespType getGetSubscriberOfferingInstResponse() {
        return getSubscriberOfferingInstResponse;
    }

    /**
     * Define el valor de la propiedad getSubscriberOfferingInstResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubscriberOfferingInstRespType }
     *     
     */
    public void setGetSubscriberOfferingInstResponse(GetSubscriberOfferingInstRespType value) {
        this.getSubscriberOfferingInstResponse = value;
    }

}
