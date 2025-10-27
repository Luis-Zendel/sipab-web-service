
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionItemType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rewardType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="rewardId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="rewardPurchaseSeq" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="discountMethod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Entero10dType" minOccurs="0"/&gt;
 *         &lt;element name="discountValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="relaOffer" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RelaOfferType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extProp" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionItemType", propOrder = {
    "rewardType",
    "rewardId",
    "rewardPurchaseSeq",
    "discountMethod",
    "discountValue",
    "relaOffer",
    "extProp"
})
public class PromotionItemType {

    @XmlElement(required = true)
    protected String rewardType;
    @XmlElement(required = true)
    protected String rewardId;
    protected String rewardPurchaseSeq;
    protected Integer discountMethod;
    protected String discountValue;
    protected List<RelaOfferType> relaOffer;
    protected List<BesCrmSimplePropertyType> extProp;

    /**
     * Obtiene el valor de la propiedad rewardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardType() {
        return rewardType;
    }

    /**
     * Define el valor de la propiedad rewardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardType(String value) {
        this.rewardType = value;
    }

    /**
     * Obtiene el valor de la propiedad rewardId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardId() {
        return rewardId;
    }

    /**
     * Define el valor de la propiedad rewardId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardId(String value) {
        this.rewardId = value;
    }

    /**
     * Obtiene el valor de la propiedad rewardPurchaseSeq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardPurchaseSeq() {
        return rewardPurchaseSeq;
    }

    /**
     * Define el valor de la propiedad rewardPurchaseSeq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardPurchaseSeq(String value) {
        this.rewardPurchaseSeq = value;
    }

    /**
     * Obtiene el valor de la propiedad discountMethod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiscountMethod() {
        return discountMethod;
    }

    /**
     * Define el valor de la propiedad discountMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiscountMethod(Integer value) {
        this.discountMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad discountValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountValue() {
        return discountValue;
    }

    /**
     * Define el valor de la propiedad discountValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountValue(String value) {
        this.discountValue = value;
    }

    /**
     * Gets the value of the relaOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relaOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelaOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelaOfferType }
     * 
     * 
     */
    public List<RelaOfferType> getRelaOffer() {
        if (relaOffer == null) {
            relaOffer = new ArrayList<RelaOfferType>();
        }
        return this.relaOffer;
    }

    /**
     * Gets the value of the extProp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extProp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtProp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BesCrmSimplePropertyType }
     * 
     * 
     */
    public List<BesCrmSimplePropertyType> getExtProp() {
        if (extProp == null) {
            extProp = new ArrayList<BesCrmSimplePropertyType>();
        }
        return this.extProp;
    }

}
