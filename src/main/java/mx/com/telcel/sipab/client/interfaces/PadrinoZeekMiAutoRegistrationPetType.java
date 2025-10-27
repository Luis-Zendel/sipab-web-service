
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PadrinoZeekMiAutoRegistrationPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PadrinoZeekMiAutoRegistrationPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ahijadoSubsId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="padrinoSubsId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="rewardedOfferings" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingRecType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="promotions" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PromotionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PadrinoZeekMiAutoRegistrationPetType", propOrder = {
    "ahijadoSubsId",
    "padrinoSubsId",
    "rewardedOfferings",
    "promotions"
})
public class PadrinoZeekMiAutoRegistrationPetType {

    @XmlElement(required = true)
    protected BigDecimal ahijadoSubsId;
    @XmlElement(required = true)
    protected BigDecimal padrinoSubsId;
    protected List<OfferingRecType> rewardedOfferings;
    protected List<PromotionType> promotions;

    /**
     * Obtiene el valor de la propiedad ahijadoSubsId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAhijadoSubsId() {
        return ahijadoSubsId;
    }

    /**
     * Define el valor de la propiedad ahijadoSubsId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAhijadoSubsId(BigDecimal value) {
        this.ahijadoSubsId = value;
    }

    /**
     * Obtiene el valor de la propiedad padrinoSubsId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPadrinoSubsId() {
        return padrinoSubsId;
    }

    /**
     * Define el valor de la propiedad padrinoSubsId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPadrinoSubsId(BigDecimal value) {
        this.padrinoSubsId = value;
    }

    /**
     * Gets the value of the rewardedOfferings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rewardedOfferings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRewardedOfferings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferingRecType }
     * 
     * 
     */
    public List<OfferingRecType> getRewardedOfferings() {
        if (rewardedOfferings == null) {
            rewardedOfferings = new ArrayList<OfferingRecType>();
        }
        return this.rewardedOfferings;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the promotions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionType }
     * 
     * 
     */
    public List<PromotionType> getPromotions() {
        if (promotions == null) {
            promotions = new ArrayList<PromotionType>();
        }
        return this.promotions;
    }

}
