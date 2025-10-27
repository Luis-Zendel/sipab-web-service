
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromotionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="promotionBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PromotionBasicInfoType" minOccurs="0"/&gt;
 *         &lt;element name="promotionItem" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PromotionItemType" minOccurs="0"/&gt;
 *         &lt;element name="extInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionType", propOrder = {
    "operType",
    "promotionBasicInfo",
    "promotionItem",
    "extInfo"
})
public class PromotionType {

    protected String operType;
    protected PromotionBasicInfoType promotionBasicInfo;
    protected PromotionItemType promotionItem;
    protected List<BesCrmSimplePropertyType> extInfo;

    /**
     * Obtiene el valor de la propiedad operType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperType() {
        return operType;
    }

    /**
     * Define el valor de la propiedad operType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperType(String value) {
        this.operType = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link PromotionBasicInfoType }
     *     
     */
    public PromotionBasicInfoType getPromotionBasicInfo() {
        return promotionBasicInfo;
    }

    /**
     * Define el valor de la propiedad promotionBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionBasicInfoType }
     *     
     */
    public void setPromotionBasicInfo(PromotionBasicInfoType value) {
        this.promotionBasicInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionItem.
     * 
     * @return
     *     possible object is
     *     {@link PromotionItemType }
     *     
     */
    public PromotionItemType getPromotionItem() {
        return promotionItem;
    }

    /**
     * Define el valor de la propiedad promotionItem.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionItemType }
     *     
     */
    public void setPromotionItem(PromotionItemType value) {
        this.promotionItem = value;
    }

    /**
     * Gets the value of the extInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BesCrmSimplePropertyType }
     * 
     * 
     */
    public List<BesCrmSimplePropertyType> getExtInfo() {
        if (extInfo == null) {
            extInfo = new ArrayList<BesCrmSimplePropertyType>();
        }
        return this.extInfo;
    }

}
