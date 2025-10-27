
package mx.com.telcel.sipab.client.tt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryMonitoringTTPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryMonitoringTTPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalSystem" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica2Type"/&gt;
 *         &lt;element name="node" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
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
@XmlType(name = "QueryMonitoringTTPetType", propOrder = {
    "externalSystem",
    "node",
    "startTime",
    "endTime"
})
public class QueryMonitoringTTPetType {

    @XmlElement(required = true)
    protected String externalSystem;
    protected String node;
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
     * Obtiene el valor de la propiedad node.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Define el valor de la propiedad node.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
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
