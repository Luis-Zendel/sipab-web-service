
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OldLifeCycleStatusType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OldLifeCycleStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statusName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="statusExpireTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *         &lt;element name="statusIndex" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OldLifeCycleStatusType", propOrder = {
    "statusName",
    "statusExpireTime",
    "statusIndex"
})
public class OldLifeCycleStatusType {

    @XmlElement(required = true)
    protected String statusName;
    @XmlElement(required = true)
    protected String statusExpireTime;
    @XmlElement(required = true)
    protected String statusIndex;

    /**
     * Obtiene el valor de la propiedad statusName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Define el valor de la propiedad statusName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Obtiene el valor de la propiedad statusExpireTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusExpireTime() {
        return statusExpireTime;
    }

    /**
     * Define el valor de la propiedad statusExpireTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusExpireTime(String value) {
        this.statusExpireTime = value;
    }

    /**
     * Obtiene el valor de la propiedad statusIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusIndex() {
        return statusIndex;
    }

    /**
     * Define el valor de la propiedad statusIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusIndex(String value) {
        this.statusIndex = value;
    }

}
