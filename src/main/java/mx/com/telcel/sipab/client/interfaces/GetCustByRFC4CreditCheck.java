
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetCustByRFC4CreditCheck complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetCustByRFC4CreditCheck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/&gt;
 *         &lt;element name="getCustByRFC4CreditCheck" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}GetCustByRFC4CreditCheckPetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustByRFC4CreditCheck", propOrder = {
    "controlData",
    "getCustByRFC4CreditCheck"
})
public class GetCustByRFC4CreditCheck {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected GetCustByRFC4CreditCheckPetType getCustByRFC4CreditCheck;

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
     * Obtiene el valor de la propiedad getCustByRFC4CreditCheck.
     * 
     * @return
     *     possible object is
     *     {@link GetCustByRFC4CreditCheckPetType }
     *     
     */
    public GetCustByRFC4CreditCheckPetType getGetCustByRFC4CreditCheck() {
        return getCustByRFC4CreditCheck;
    }

    /**
     * Define el valor de la propiedad getCustByRFC4CreditCheck.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustByRFC4CreditCheckPetType }
     *     
     */
    public void setGetCustByRFC4CreditCheck(GetCustByRFC4CreditCheckPetType value) {
        this.getCustByRFC4CreditCheck = value;
    }

}
