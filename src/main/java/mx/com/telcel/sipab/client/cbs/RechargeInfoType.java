
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RechargeInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RechargeInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="cardPayment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CardPaymentType"/&gt;
 *           &lt;element name="cashPayment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CashPayment2Type" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargeInfoType", propOrder = {
    "cardPayment",
    "cashPayment"
})
public class RechargeInfoType {

    protected CardPaymentType cardPayment;
    protected List<CashPayment2Type> cashPayment;

    /**
     * Obtiene el valor de la propiedad cardPayment.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentType }
     *     
     */
    public CardPaymentType getCardPayment() {
        return cardPayment;
    }

    /**
     * Define el valor de la propiedad cardPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentType }
     *     
     */
    public void setCardPayment(CardPaymentType value) {
        this.cardPayment = value;
    }

    /**
     * Gets the value of the cashPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cashPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashPayment2Type }
     * 
     * 
     */
    public List<CashPayment2Type> getCashPayment() {
        if (cashPayment == null) {
            cashPayment = new ArrayList<CashPayment2Type>();
        }
        return this.cashPayment;
    }

}
