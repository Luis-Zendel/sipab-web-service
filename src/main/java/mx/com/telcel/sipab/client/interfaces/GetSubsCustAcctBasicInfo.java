
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetSubsCustAcctBasicInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetSubsCustAcctBasicInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/&gt;
 *         &lt;element name="getSubsCustAcctBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}GetSubsCustAcctBasicInfoPetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubsCustAcctBasicInfo", propOrder = {
    "controlData",
    "getSubsCustAcctBasicInfo"
})
public class GetSubsCustAcctBasicInfo {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected GetSubsCustAcctBasicInfoPetType getSubsCustAcctBasicInfo;

    /**
     * Obtiene el valor de la propiedad controlData.
     * 
     * @return
     *     possible object is
     *     {@link ControlDataRequestHeaderType }
     *     
     */
    public ControlDataRequestHeaderType getControlData() {
        return controlData;
    }

    /**
     * Define el valor de la propiedad controlData.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlDataRequestHeaderType }
     *     
     */
    public void setControlData(ControlDataRequestHeaderType value) {
        this.controlData = value;
    }

    /**
     * Obtiene el valor de la propiedad getSubsCustAcctBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link GetSubsCustAcctBasicInfoPetType }
     *     
     */
    public GetSubsCustAcctBasicInfoPetType getGetSubsCustAcctBasicInfo() {
        return getSubsCustAcctBasicInfo;
    }

    /**
     * Define el valor de la propiedad getSubsCustAcctBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubsCustAcctBasicInfoPetType }
     *     
     */
    public void setGetSubsCustAcctBasicInfo(GetSubsCustAcctBasicInfoPetType value) {
        this.getSubsCustAcctBasicInfo = value;
    }

}
