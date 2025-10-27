
package mx.com.telcel.sipab.client.tt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BesCbsRequestHeaderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BesCbsRequestHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ownershipInfo" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsOwnershipInfoType" minOccurs="0"/&gt;
 *         &lt;element name="operatorInfo" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsOperatorInfoType" minOccurs="0"/&gt;
 *         &lt;element name="accessMode" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaType" minOccurs="0"/&gt;
 *         &lt;element name="msgLanguageCode" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaType" minOccurs="0"/&gt;
 *         &lt;element name="timeFormat" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsTimeFormatType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BesCbsRequestHeaderType", namespace = "http://amx.com/mexico/telcel/esb/v1_2", propOrder = {
    "ownershipInfo",
    "operatorInfo",
    "accessMode",
    "msgLanguageCode",
    "timeFormat"
})
public class BesCbsRequestHeaderType {

    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected BesCbsOwnershipInfoType ownershipInfo;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected BesCbsOperatorInfoType operatorInfo;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected String accessMode;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected String msgLanguageCode;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected BesCbsTimeFormatType timeFormat;

    /**
     * Obtiene el valor de la propiedad ownershipInfo.
     * 
     * @return
     *     possible object is
     *     {@link BesCbsOwnershipInfoType }
     *     
     */
    public BesCbsOwnershipInfoType getOwnershipInfo() {
        return ownershipInfo;
    }

    /**
     * Define el valor de la propiedad ownershipInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCbsOwnershipInfoType }
     *     
     */
    public void setOwnershipInfo(BesCbsOwnershipInfoType value) {
        this.ownershipInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorInfo.
     * 
     * @return
     *     possible object is
     *     {@link BesCbsOperatorInfoType }
     *     
     */
    public BesCbsOperatorInfoType getOperatorInfo() {
        return operatorInfo;
    }

    /**
     * Define el valor de la propiedad operatorInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCbsOperatorInfoType }
     *     
     */
    public void setOperatorInfo(BesCbsOperatorInfoType value) {
        this.operatorInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad accessMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessMode() {
        return accessMode;
    }

    /**
     * Define el valor de la propiedad accessMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessMode(String value) {
        this.accessMode = value;
    }

    /**
     * Obtiene el valor de la propiedad msgLanguageCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgLanguageCode() {
        return msgLanguageCode;
    }

    /**
     * Define el valor de la propiedad msgLanguageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgLanguageCode(String value) {
        this.msgLanguageCode = value;
    }

    /**
     * Obtiene el valor de la propiedad timeFormat.
     * 
     * @return
     *     possible object is
     *     {@link BesCbsTimeFormatType }
     *     
     */
    public BesCbsTimeFormatType getTimeFormat() {
        return timeFormat;
    }

    /**
     * Define el valor de la propiedad timeFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCbsTimeFormatType }
     *     
     */
    public void setTimeFormat(BesCbsTimeFormatType value) {
        this.timeFormat = value;
    }

}
