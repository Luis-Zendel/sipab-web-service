
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RedoOfferInfoListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RedoOfferInfoListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offeringid" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OfferingKeyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedoOfferInfoListType", propOrder = {
    "offeringid"
})
public class RedoOfferInfoListType {

    @XmlElement(required = true)
    protected OfferingKeyType offeringid;

    /**
     * Obtiene el valor de la propiedad offeringid.
     * 
     * @return
     *     possible object is
     *     {@link OfferingKeyType }
     *     
     */
    public OfferingKeyType getOfferingid() {
        return offeringid;
    }

    /**
     * Define el valor de la propiedad offeringid.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferingKeyType }
     *     
     */
    public void setOfferingid(OfferingKeyType value) {
        this.offeringid = value;
    }

}
