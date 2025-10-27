
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChangedOfferingsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChangedOfferingsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offeringId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type"/&gt;
 *         &lt;element name="effectiveMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}EffExpModeType"/&gt;
 *         &lt;element name="props" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PropInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="supplementOfferings" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingRespType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contract" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ContractRespType" minOccurs="0"/&gt;
 *         &lt;element name="subOfferings" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingRespType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="promotions" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PromotionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extOfferInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangedOfferingsType", propOrder = {
    "offeringId",
    "effectiveMode",
    "props",
    "supplementOfferings",
    "contract",
    "subOfferings",
    "promotions",
    "extOfferInfo"
})
public class ChangedOfferingsType {

    @XmlElement(required = true)
    protected BigDecimal offeringId;
    @XmlElement(required = true)
    protected EffExpModeType effectiveMode;
    protected List<PropInfoType> props;
    protected List<OfferingRespType> supplementOfferings;
    protected ContractRespType contract;
    protected List<OfferingRespType> subOfferings;
    protected List<PromotionType> promotions;
    protected BesCrmSimplePropertyType extOfferInfo;

    /**
     * Obtiene el valor de la propiedad offeringId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferingId() {
        return offeringId;
    }

    /**
     * Define el valor de la propiedad offeringId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferingId(BigDecimal value) {
        this.offeringId = value;
    }

    /**
     * Obtiene el valor de la propiedad effectiveMode.
     * 
     * @return
     *     possible object is
     *     {@link EffExpModeType }
     *     
     */
    public EffExpModeType getEffectiveMode() {
        return effectiveMode;
    }

    /**
     * Define el valor de la propiedad effectiveMode.
     * 
     * @param value
     *     allowed object is
     *     {@link EffExpModeType }
     *     
     */
    public void setEffectiveMode(EffExpModeType value) {
        this.effectiveMode = value;
    }

    /**
     * Gets the value of the props property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the props property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropInfoType }
     * 
     * 
     */
    public List<PropInfoType> getProps() {
        if (props == null) {
            props = new ArrayList<PropInfoType>();
        }
        return this.props;
    }

    /**
     * Gets the value of the supplementOfferings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supplementOfferings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplementOfferings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferingRespType }
     * 
     * 
     */
    public List<OfferingRespType> getSupplementOfferings() {
        if (supplementOfferings == null) {
            supplementOfferings = new ArrayList<OfferingRespType>();
        }
        return this.supplementOfferings;
    }

    /**
     * Obtiene el valor de la propiedad contract.
     * 
     * @return
     *     possible object is
     *     {@link ContractRespType }
     *     
     */
    public ContractRespType getContract() {
        return contract;
    }

    /**
     * Define el valor de la propiedad contract.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRespType }
     *     
     */
    public void setContract(ContractRespType value) {
        this.contract = value;
    }

    /**
     * Gets the value of the subOfferings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subOfferings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubOfferings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferingRespType }
     * 
     * 
     */
    public List<OfferingRespType> getSubOfferings() {
        if (subOfferings == null) {
            subOfferings = new ArrayList<OfferingRespType>();
        }
        return this.subOfferings;
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

    /**
     * Obtiene el valor de la propiedad extOfferInfo.
     * 
     * @return
     *     possible object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public BesCrmSimplePropertyType getExtOfferInfo() {
        return extOfferInfo;
    }

    /**
     * Define el valor de la propiedad extOfferInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public void setExtOfferInfo(BesCrmSimplePropertyType value) {
        this.extOfferInfo = value;
    }

}
