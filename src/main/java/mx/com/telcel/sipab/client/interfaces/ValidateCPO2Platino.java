
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ValidateCPO2Platino complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ValidateCPO2Platino"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/&gt;
 *         &lt;element name="validateCPO2Platino" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ValidateCPO2PlatinoPetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCPO2Platino", propOrder = {
    "controlData",
    "validateCPO2Platino"
})
public class ValidateCPO2Platino {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected ValidateCPO2PlatinoPetType validateCPO2Platino;

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
     * Obtiene el valor de la propiedad validateCPO2Platino.
     * 
     * @return
     *     possible object is
     *     {@link ValidateCPO2PlatinoPetType }
     *     
     */
    public ValidateCPO2PlatinoPetType getValidateCPO2Platino() {
        return validateCPO2Platino;
    }

    /**
     * Define el valor de la propiedad validateCPO2Platino.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateCPO2PlatinoPetType }
     *     
     */
    public void setValidateCPO2Platino(ValidateCPO2PlatinoPetType value) {
        this.validateCPO2Platino = value;
    }

}
