
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Adv2DepositResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Adv2DepositResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataResponseHeaderType"/&gt;
 *         &lt;element name="detailResponse" type="{http://amx.com/mexico/telcel/esb/v1_2}DetailResponseType"/&gt;
 *         &lt;element name="adv2DepositResponse" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Adv2DepositRespType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adv2DepositResponse", propOrder = {
    "controlData",
    "detailResponse",
    "adv2DepositResponse"
})
public class Adv2DepositResponse {

    @XmlElement(required = true)
    protected ControlDataResponseHeaderType controlData;
    @XmlElement(required = true)
    protected DetailResponseType detailResponse;
    protected Adv2DepositRespType adv2DepositResponse;

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
     * Obtiene el valor de la propiedad adv2DepositResponse.
     * 
     * @return
     *     possible object is
     *     {@link Adv2DepositRespType }
     *     
     */
    public Adv2DepositRespType getAdv2DepositResponse() {
        return adv2DepositResponse;
    }

    /**
     * Define el valor de la propiedad adv2DepositResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link Adv2DepositRespType }
     *     
     */
    public void setAdv2DepositResponse(Adv2DepositRespType value) {
        this.adv2DepositResponse = value;
    }

}
