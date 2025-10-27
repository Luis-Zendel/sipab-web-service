
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransferBalanceRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransferBalanceRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transferor" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransferorType" minOccurs="0"/&gt;
 *         &lt;element name="transferee" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TransfereeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferBalanceRespType", propOrder = {
    "transferor",
    "transferee"
})
public class TransferBalanceRespType {

    protected TransferorType transferor;
    protected TransfereeType transferee;

    /**
     * Obtiene el valor de la propiedad transferor.
     * 
     * @return
     *     possible object is
     *     {@link TransferorType }
     *     
     */
    public TransferorType getTransferor() {
        return transferor;
    }

    /**
     * Define el valor de la propiedad transferor.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferorType }
     *     
     */
    public void setTransferor(TransferorType value) {
        this.transferor = value;
    }

    /**
     * Obtiene el valor de la propiedad transferee.
     * 
     * @return
     *     possible object is
     *     {@link TransfereeType }
     *     
     */
    public TransfereeType getTransferee() {
        return transferee;
    }

    /**
     * Define el valor de la propiedad transferee.
     * 
     * @param value
     *     allowed object is
     *     {@link TransfereeType }
     *     
     */
    public void setTransferee(TransfereeType value) {
        this.transferee = value;
    }

}
