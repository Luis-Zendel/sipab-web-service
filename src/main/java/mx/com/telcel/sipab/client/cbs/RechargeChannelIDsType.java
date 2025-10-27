
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RechargeChannelIDsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RechargeChannelIDsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rechargeChannelID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargeChannelIDsType", propOrder = {
    "rechargeChannelID"
})
public class RechargeChannelIDsType {

    protected String rechargeChannelID;

    /**
     * Obtiene el valor de la propiedad rechargeChannelID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeChannelID() {
        return rechargeChannelID;
    }

    /**
     * Define el valor de la propiedad rechargeChannelID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeChannelID(String value) {
        this.rechargeChannelID = value;
    }

}
