
package mx.com.telcel.sipab.client.tt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BesCbsTimeFormatType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BesCbsTimeFormatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeType" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaType"/&gt;
 *         &lt;element name="timeZoneID" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsTimeZoneType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BesCbsTimeFormatType", namespace = "http://amx.com/mexico/telcel/esb/v1_2", propOrder = {
    "timeType",
    "timeZoneID"
})
public class BesCbsTimeFormatType {

    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected String timeType;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected String timeZoneID;

    /**
     * Obtiene el valor de la propiedad timeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeType() {
        return timeType;
    }

    /**
     * Define el valor de la propiedad timeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeType(String value) {
        this.timeType = value;
    }

    /**
     * Obtiene el valor de la propiedad timeZoneID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }

    /**
     * Define el valor de la propiedad timeZoneID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneID(String value) {
        this.timeZoneID = value;
    }

}
