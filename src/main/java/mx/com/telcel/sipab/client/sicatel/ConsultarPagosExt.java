
package mx.com.telcel.sipab.client.sicatel;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarPagosExt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarPagosExt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_1}ControlDataRequestType"/&gt;
 *         &lt;element name="consultarPagosExt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}ConsultarPagosExtPetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarPagosExt", propOrder = {
    "controlData",
    "consultarPagosExt"
})
public class ConsultarPagosExt {

    @XmlElement(required = true)
    protected ControlDataRequestType controlData;
    @XmlElement(required = true)
    protected ConsultarPagosExtPetType consultarPagosExt;

    /**
     * Obtiene el valor de la propiedad controlData.
     * 
     * @return
     *     possible object is
     *     {@link ControlDataRequestType }
     *     
     */
    public ControlDataRequestType getControlData() {
        return controlData;
    }

    /**
     * Define el valor de la propiedad controlData.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlDataRequestType }
     *     
     */
    public void setControlData(ControlDataRequestType value) {
        this.controlData = value;
    }

    /**
     * Obtiene el valor de la propiedad consultarPagosExt.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarPagosExtPetType }
     *     
     */
    public ConsultarPagosExtPetType getConsultarPagosExt() {
        return consultarPagosExt;
    }

    /**
     * Define el valor de la propiedad consultarPagosExt.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarPagosExtPetType }
     *     
     */
    public void setConsultarPagosExt(ConsultarPagosExtPetType value) {
        this.consultarPagosExt = value;
    }

}
