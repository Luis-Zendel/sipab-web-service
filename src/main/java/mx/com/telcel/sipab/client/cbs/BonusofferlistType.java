
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BonusofferlistType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BonusofferlistType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="offeringid" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OfferingKeyType"/&gt;
 *         &lt;element name="ownerType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="ownerKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="effectiveTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *         &lt;element name="expireTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BonusofferlistType", propOrder = {
    "offeringid",
    "ownerType",
    "ownerKey",
    "effectiveTime",
    "expireTime"
})
public class BonusofferlistType {

    @XmlElement(required = true)
    protected OfferingKeyType offeringid;
    @XmlElement(required = true)
    protected String ownerType;
    @XmlElement(required = true)
    protected String ownerKey;
    @XmlElement(required = true)
    protected String effectiveTime;
    @XmlElement(required = true)
    protected String expireTime;

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

    /**
     * Obtiene el valor de la propiedad ownerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Define el valor de la propiedad ownerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerType(String value) {
        this.ownerType = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerKey() {
        return ownerKey;
    }

    /**
     * Define el valor de la propiedad ownerKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerKey(String value) {
        this.ownerKey = value;
    }

    /**
     * Obtiene el valor de la propiedad effectiveTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Define el valor de la propiedad effectiveTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveTime(String value) {
        this.effectiveTime = value;
    }

    /**
     * Obtiene el valor de la propiedad expireTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * Define el valor de la propiedad expireTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireTime(String value) {
        this.expireTime = value;
    }

}
