
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExpiredModeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExpiredModeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="effectMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type"/&gt;
 *         &lt;element name="expireValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica400Type" minOccurs="0"/&gt;
 *         &lt;element name="isDefault" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="offerId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="expireMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpiredModeType", propOrder = {
    "effectMode",
    "expireValue",
    "isDefault",
    "offerId",
    "expireMode"
})
public class ExpiredModeType {

    @XmlElement(required = true)
    protected String effectMode;
    protected String expireValue;
    @XmlElement(required = true)
    protected String isDefault;
    protected BigDecimal offerId;
    @XmlElement(required = true)
    protected String expireMode;

    /**
     * Obtiene el valor de la propiedad effectMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectMode() {
        return effectMode;
    }

    /**
     * Define el valor de la propiedad effectMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectMode(String value) {
        this.effectMode = value;
    }

    /**
     * Obtiene el valor de la propiedad expireValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireValue() {
        return expireValue;
    }

    /**
     * Define el valor de la propiedad expireValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireValue(String value) {
        this.expireValue = value;
    }

    /**
     * Obtiene el valor de la propiedad isDefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * Define el valor de la propiedad isDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDefault(String value) {
        this.isDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad offerId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferId() {
        return offerId;
    }

    /**
     * Define el valor de la propiedad offerId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferId(BigDecimal value) {
        this.offerId = value;
    }

    /**
     * Obtiene el valor de la propiedad expireMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireMode() {
        return expireMode;
    }

    /**
     * Define el valor de la propiedad expireMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireMode(String value) {
        this.expireMode = value;
    }

}
