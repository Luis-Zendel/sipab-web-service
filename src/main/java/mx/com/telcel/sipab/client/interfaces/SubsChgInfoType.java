
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubsChgInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubsChgInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subsVoiceLang" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaNumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="subsWrittenLang" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaNumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="promotionInfoFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="firstContactChannel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="subProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SimplePropertyCRMType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsChgInfoType", propOrder = {
    "subsVoiceLang",
    "subsWrittenLang",
    "promotionInfoFlag",
    "firstContactChannel",
    "subProperty"
})
public class SubsChgInfoType {

    protected String subsVoiceLang;
    protected String subsWrittenLang;
    protected String promotionInfoFlag;
    protected String firstContactChannel;
    protected List<SimplePropertyCRMType> subProperty;

    /**
     * Obtiene el valor de la propiedad subsVoiceLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsVoiceLang() {
        return subsVoiceLang;
    }

    /**
     * Define el valor de la propiedad subsVoiceLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsVoiceLang(String value) {
        this.subsVoiceLang = value;
    }

    /**
     * Obtiene el valor de la propiedad subsWrittenLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsWrittenLang() {
        return subsWrittenLang;
    }

    /**
     * Define el valor de la propiedad subsWrittenLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsWrittenLang(String value) {
        this.subsWrittenLang = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionInfoFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionInfoFlag() {
        return promotionInfoFlag;
    }

    /**
     * Define el valor de la propiedad promotionInfoFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionInfoFlag(String value) {
        this.promotionInfoFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad firstContactChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstContactChannel() {
        return firstContactChannel;
    }

    /**
     * Define el valor de la propiedad firstContactChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstContactChannel(String value) {
        this.firstContactChannel = value;
    }

    /**
     * Gets the value of the subProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyCRMType }
     * 
     * 
     */
    public List<SimplePropertyCRMType> getSubProperty() {
        if (subProperty == null) {
            subProperty = new ArrayList<SimplePropertyCRMType>();
        }
        return this.subProperty;
    }

}
