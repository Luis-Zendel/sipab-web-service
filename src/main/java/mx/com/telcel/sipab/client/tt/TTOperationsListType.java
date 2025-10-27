
package mx.com.telcel.sipab.client.tt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TTOperationsListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TTOperationsListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acceptTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="accessNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="handlingrole" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica70Type" minOccurs="0"/&gt;
 *         &lt;element name="handlingStaffNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="handlingTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="nodeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="operationType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica40Type" minOccurs="0"/&gt;
 *         &lt;element name="processState" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica255Type" minOccurs="0"/&gt;
 *         &lt;element name="servReqSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="troubleType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica255Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTOperationsListType", propOrder = {
    "acceptTime",
    "accessNumber",
    "handlingrole",
    "handlingStaffNo",
    "handlingTime",
    "nodeName",
    "operationType",
    "processState",
    "servReqSerialNo",
    "troubleType"
})
public class TTOperationsListType {

    protected String acceptTime;
    protected String accessNumber;
    protected String handlingrole;
    protected String handlingStaffNo;
    protected String handlingTime;
    protected String nodeName;
    protected String operationType;
    protected String processState;
    protected String servReqSerialNo;
    @XmlElement(required = true)
    protected String troubleType;

    /**
     * Obtiene el valor de la propiedad acceptTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptTime() {
        return acceptTime;
    }

    /**
     * Define el valor de la propiedad acceptTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptTime(String value) {
        this.acceptTime = value;
    }

    /**
     * Obtiene el valor de la propiedad accessNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessNumber() {
        return accessNumber;
    }

    /**
     * Define el valor de la propiedad accessNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessNumber(String value) {
        this.accessNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad handlingrole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingrole() {
        return handlingrole;
    }

    /**
     * Define el valor de la propiedad handlingrole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingrole(String value) {
        this.handlingrole = value;
    }

    /**
     * Obtiene el valor de la propiedad handlingStaffNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingStaffNo() {
        return handlingStaffNo;
    }

    /**
     * Define el valor de la propiedad handlingStaffNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingStaffNo(String value) {
        this.handlingStaffNo = value;
    }

    /**
     * Obtiene el valor de la propiedad handlingTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingTime() {
        return handlingTime;
    }

    /**
     * Define el valor de la propiedad handlingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingTime(String value) {
        this.handlingTime = value;
    }

    /**
     * Obtiene el valor de la propiedad nodeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Define el valor de la propiedad nodeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Obtiene el valor de la propiedad operationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Define el valor de la propiedad operationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Obtiene el valor de la propiedad processState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessState() {
        return processState;
    }

    /**
     * Define el valor de la propiedad processState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessState(String value) {
        this.processState = value;
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
     * Obtiene el valor de la propiedad troubleType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTroubleType() {
        return troubleType;
    }

    /**
     * Define el valor de la propiedad troubleType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTroubleType(String value) {
        this.troubleType = value;
    }

}
