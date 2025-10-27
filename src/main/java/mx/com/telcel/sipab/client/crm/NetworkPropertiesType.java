
package mx.com.telcel.sipab.client.crm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NetworkPropertiesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NetworkPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="propBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}PropBasicInfoType"/&gt;
 *         &lt;element name="subProps" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}PropInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkPropertiesType", propOrder = {
    "propBasicInfo",
    "subProps"
})
public class NetworkPropertiesType {

    @XmlElement(required = true)
    protected PropBasicInfoType propBasicInfo;
    protected PropInfoType subProps;

    /**
     * Obtiene el valor de la propiedad propBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link PropBasicInfoType }
     *     
     */
    public PropBasicInfoType getPropBasicInfo() {
        return propBasicInfo;
    }

    /**
     * Define el valor de la propiedad propBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PropBasicInfoType }
     *     
     */
    public void setPropBasicInfo(PropBasicInfoType value) {
        this.propBasicInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad subProps.
     * 
     * @return
     *     possible object is
     *     {@link PropInfoType }
     *     
     */
    public PropInfoType getSubProps() {
        return subProps;
    }

    /**
     * Define el valor de la propiedad subProps.
     * 
     * @param value
     *     allowed object is
     *     {@link PropInfoType }
     *     
     */
    public void setSubProps(PropInfoType value) {
        this.subProps = value;
    }

}
