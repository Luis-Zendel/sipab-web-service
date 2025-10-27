
package mx.com.telcel.sipab.client.tt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryTTListPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryTTListPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalSystem" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica2Type"/&gt;
 *         &lt;element name="handlingStaff" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="servReqSerialNo" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type"/&gt;
 *         &lt;element name="endTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTTListPetType", propOrder = {
    "externalSystem",
    "handlingStaff",
    "servReqSerialNo",
    "startTime",
    "endTime"
})
public class QueryTTListPetType {

    @XmlElement(required = true)
    protected String externalSystem;
    protected String handlingStaff;
    protected String servReqSerialNo;
    @XmlElement(required = true)
    protected String startTime;
    @XmlElement(required = true)
    protected String endTime;

    /**
     * Obtiene el valor de la propiedad externalSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSystem() {
        return externalSystem;
    }

    /**
     * Define el valor de la propiedad externalSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSystem(String value) {
        this.externalSystem = value;
    }

    /**
     * Obtiene el valor de la propiedad handlingStaff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingStaff() {
        return handlingStaff;
    }

    /**
     * Define el valor de la propiedad handlingStaff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingStaff(String value) {
        this.handlingStaff = value;
    }

    /**
     * Obtiene el valor de la propiedad servReqSerialNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServReqSerialNo() {
        return servReqSerialNo;
    }

    /**
     * Define el valor de la propiedad servReqSerialNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServReqSerialNo(String value) {
        this.servReqSerialNo = value;
    }

    /**
     * Obtiene el valor de la propiedad startTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Define el valor de la propiedad startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Obtiene el valor de la propiedad endTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Define el valor de la propiedad endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

}
