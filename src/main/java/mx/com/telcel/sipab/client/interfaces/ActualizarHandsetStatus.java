
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActualizarHandsetStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActualizarHandsetStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/&gt;
 *         &lt;element name="actualizarHandsetStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ActualizarHandsetStatusPetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualizarHandsetStatus", propOrder = {
    "controlData",
    "actualizarHandsetStatus"
})
public class ActualizarHandsetStatus {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected ActualizarHandsetStatusPetType actualizarHandsetStatus;

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
     * Obtiene el valor de la propiedad actualizarHandsetStatus.
     * 
     * @return
     *     possible object is
     *     {@link ActualizarHandsetStatusPetType }
     *     
     */
    public ActualizarHandsetStatusPetType getActualizarHandsetStatus() {
        return actualizarHandsetStatus;
    }

    /**
     * Define el valor de la propiedad actualizarHandsetStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualizarHandsetStatusPetType }
     *     
     */
    public void setActualizarHandsetStatus(ActualizarHandsetStatusPetType value) {
        this.actualizarHandsetStatus = value;
    }

}
