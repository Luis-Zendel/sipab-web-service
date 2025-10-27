
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PadrinoZeekMiAutoRegistration complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PadrinoZeekMiAutoRegistration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/&gt;
 *         &lt;element name="padrinoZeekMiAutoRegistration" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PadrinoZeekMiAutoRegistrationPetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PadrinoZeekMiAutoRegistration", propOrder = {
    "controlData",
    "padrinoZeekMiAutoRegistration"
})
public class PadrinoZeekMiAutoRegistration {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected PadrinoZeekMiAutoRegistrationPetType padrinoZeekMiAutoRegistration;

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
     * Obtiene el valor de la propiedad padrinoZeekMiAutoRegistration.
     * 
     * @return
     *     possible object is
     *     {@link PadrinoZeekMiAutoRegistrationPetType }
     *     
     */
    public PadrinoZeekMiAutoRegistrationPetType getPadrinoZeekMiAutoRegistration() {
        return padrinoZeekMiAutoRegistration;
    }

    /**
     * Define el valor de la propiedad padrinoZeekMiAutoRegistration.
     * 
     * @param value
     *     allowed object is
     *     {@link PadrinoZeekMiAutoRegistrationPetType }
     *     
     */
    public void setPadrinoZeekMiAutoRegistration(PadrinoZeekMiAutoRegistrationPetType value) {
        this.padrinoZeekMiAutoRegistration = value;
    }

}
