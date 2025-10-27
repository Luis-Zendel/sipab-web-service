
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaperLessNotificationForContract complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaperLessNotificationForContract"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/&gt;
 *         &lt;element name="paperLessNotificationForContract" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PaperLessNotificationForContractPetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaperLessNotificationForContract", propOrder = {
    "controlData",
    "paperLessNotificationForContract"
})
public class PaperLessNotificationForContract {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected PaperLessNotificationForContractPetType paperLessNotificationForContract;

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
     * Obtiene el valor de la propiedad paperLessNotificationForContract.
     * 
     * @return
     *     possible object is
     *     {@link PaperLessNotificationForContractPetType }
     *     
     */
    public PaperLessNotificationForContractPetType getPaperLessNotificationForContract() {
        return paperLessNotificationForContract;
    }

    /**
     * Define el valor de la propiedad paperLessNotificationForContract.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperLessNotificationForContractPetType }
     *     
     */
    public void setPaperLessNotificationForContract(PaperLessNotificationForContractPetType value) {
        this.paperLessNotificationForContract = value;
    }

}
