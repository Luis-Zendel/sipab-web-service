
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetSubsOfferingInstsRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetSubsOfferingInstsRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriberBasic" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SubscriberBasicType" minOccurs="0"/&gt;
 *         &lt;element name="offeringInsts" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingInstsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubsOfferingInstsRespType", propOrder = {
    "subscriberBasic",
    "offeringInsts"
})
public class GetSubsOfferingInstsRespType {

    protected SubscriberBasicType subscriberBasic;
    protected List<OfferingInstsType> offeringInsts;

    /**
     * Obtiene el valor de la propiedad subscriberBasic.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberBasicType }
     *     
     */
    public SubscriberBasicType getSubscriberBasic() {
        return subscriberBasic;
    }

    /**
     * Define el valor de la propiedad subscriberBasic.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberBasicType }
     *     
     */
    public void setSubscriberBasic(SubscriberBasicType value) {
        this.subscriberBasic = value;
    }

    /**
     * Gets the value of the offeringInsts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the offeringInsts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferingInsts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferingInstsType }
     * 
     * 
     */
    public List<OfferingInstsType> getOfferingInsts() {
        if (offeringInsts == null) {
            offeringInsts = new ArrayList<OfferingInstsType>();
        }
        return this.offeringInsts;
    }

}
