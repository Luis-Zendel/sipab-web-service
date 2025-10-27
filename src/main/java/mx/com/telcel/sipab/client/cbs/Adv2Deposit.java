
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Adv2Deposit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Adv2Deposit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/&gt;
 *         &lt;element name="adv2Deposit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Adv2DepositPetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adv2Deposit", propOrder = {
    "controlData",
    "adv2Deposit"
})
public class Adv2Deposit {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected Adv2DepositPetType adv2Deposit;

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
     * Obtiene el valor de la propiedad adv2Deposit.
     * 
     * @return
     *     possible object is
     *     {@link Adv2DepositPetType }
     *     
     */
    public Adv2DepositPetType getAdv2Deposit() {
        return adv2Deposit;
    }

    /**
     * Define el valor de la propiedad adv2Deposit.
     * 
     * @param value
     *     allowed object is
     *     {@link Adv2DepositPetType }
     *     
     */
    public void setAdv2Deposit(Adv2DepositPetType value) {
        this.adv2Deposit = value;
    }

}
