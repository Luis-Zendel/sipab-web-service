
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LockOrUnlockIMEIServiceRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LockOrUnlockIMEIServiceRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createOrderResponse" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CreateOrderResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockOrUnlockIMEIServiceRespType", propOrder = {
    "createOrderResponse"
})
public class LockOrUnlockIMEIServiceRespType {

    @XmlElement(required = true)
    protected CreateOrderResponseType createOrderResponse;

    /**
     * Obtiene el valor de la propiedad createOrderResponse.
     * 
     * @return
     *     possible object is
     *     {@link CreateOrderResponseType }
     *     
     */
    public CreateOrderResponseType getCreateOrderResponse() {
        return createOrderResponse;
    }

    /**
     * Define el valor de la propiedad createOrderResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOrderResponseType }
     *     
     */
    public void setCreateOrderResponse(CreateOrderResponseType value) {
        this.createOrderResponse = value;
    }

}
