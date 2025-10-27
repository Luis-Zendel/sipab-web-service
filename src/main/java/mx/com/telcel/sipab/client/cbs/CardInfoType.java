
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardPinNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="cardSequence" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfoType", propOrder = {
    "cardPinNumber",
    "cardSequence"
})
public class CardInfoType {

    protected String cardPinNumber;
    protected String cardSequence;

    /**
     * Obtiene el valor de la propiedad cardPinNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPinNumber() {
        return cardPinNumber;
    }

    /**
     * Define el valor de la propiedad cardPinNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPinNumber(String value) {
        this.cardPinNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad cardSequence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSequence() {
        return cardSequence;
    }

    /**
     * Define el valor de la propiedad cardSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSequence(String value) {
        this.cardSequence = value;
    }

}
