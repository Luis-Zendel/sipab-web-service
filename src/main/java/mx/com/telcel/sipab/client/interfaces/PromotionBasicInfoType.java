
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionBasicInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionBasicInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="promotionId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica60Type"/&gt;
 *         &lt;element name="promotionCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="proSessionId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica40Type"/&gt;
 *         &lt;element name="promotionType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica9Type" minOccurs="0"/&gt;
 *         &lt;element name="extProp" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionBasicInfoType", propOrder = {
    "promotionId",
    "promotionCode",
    "proSessionId",
    "promotionType",
    "extProp"
})
public class PromotionBasicInfoType {

    @XmlElement(required = true)
    protected String promotionId;
    protected String promotionCode;
    @XmlElement(required = true)
    protected String proSessionId;
    protected String promotionType;
    protected BesCrmSimplePropertyType extProp;

    /**
     * Obtiene el valor de la propiedad promotionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionId() {
        return promotionId;
    }

    /**
     * Define el valor de la propiedad promotionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionId(String value) {
        this.promotionId = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Define el valor de la propiedad promotionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad proSessionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProSessionId() {
        return proSessionId;
    }

    /**
     * Define el valor de la propiedad proSessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProSessionId(String value) {
        this.proSessionId = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionType() {
        return promotionType;
    }

    /**
     * Define el valor de la propiedad promotionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionType(String value) {
        this.promotionType = value;
    }

    /**
     * Obtiene el valor de la propiedad extProp.
     * 
     * @return
     *     possible object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public BesCrmSimplePropertyType getExtProp() {
        return extProp;
    }

    /**
     * Define el valor de la propiedad extProp.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public void setExtProp(BesCrmSimplePropertyType value) {
        this.extProp = value;
    }

}
