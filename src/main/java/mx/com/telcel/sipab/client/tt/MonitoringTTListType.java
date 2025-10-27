
package mx.com.telcel.sipab.client.tt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MonitoringTTListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MonitoringTTListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cI" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type"/&gt;
 *         &lt;element name="reason" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type"/&gt;
 *         &lt;element name="troubleType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica255Type"/&gt;
 *         &lt;element name="nodeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="troubleTitle" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica2000Type" minOccurs="0"/&gt;
 *         &lt;element name="ttDescription" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica4000Type"/&gt;
 *         &lt;element name="workItemHandlingrole" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica70Type" minOccurs="0"/&gt;
 *         &lt;element name="workItemHandlingStaff" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="workItemHandlingcomment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="workItemCreateTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="servReqSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="acceptTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type"/&gt;
 *         &lt;element name="endAcceptTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type"/&gt;
 *         &lt;element name="acceptStaffNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="duplicateFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="externalSystemCaseID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type"/&gt;
 *         &lt;element name="processState" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica255Type" minOccurs="0"/&gt;
 *         &lt;element name="workItemCompleteTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handleNodeRole" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica70Type" minOccurs="0"/&gt;
 *         &lt;element name="hanldeNodeStaff" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="handleNodeComment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="handleNodeCreateTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="handleNodeCompleteTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringTTListType", propOrder = {
    "ci",
    "reason",
    "troubleType",
    "nodeName",
    "troubleTitle",
    "ttDescription",
    "workItemHandlingrole",
    "workItemHandlingStaff",
    "workItemHandlingcomment",
    "workItemCreateTime",
    "servReqSerialNo",
    "acceptTime",
    "endAcceptTime",
    "acceptStaffNo",
    "duplicateFlag",
    "externalSystemCaseID",
    "processState",
    "workItemCompleteTime",
    "handleNodeRole",
    "hanldeNodeStaff",
    "handleNodeComment",
    "handleNodeCreateTime",
    "handleNodeCompleteTime"
})
public class MonitoringTTListType {

    @XmlElement(name = "cI", required = true)
    protected String ci;
    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    protected String troubleType;
    protected String nodeName;
    protected String troubleTitle;
    @XmlElement(required = true)
    protected String ttDescription;
    protected String workItemHandlingrole;
    protected String workItemHandlingStaff;
    protected String workItemHandlingcomment;
    protected String workItemCreateTime;
    @XmlElement(required = true)
    protected String servReqSerialNo;
    @XmlElement(required = true)
    protected String acceptTime;
    @XmlElement(required = true)
    protected String endAcceptTime;
    @XmlElement(required = true)
    protected String acceptStaffNo;
    protected String duplicateFlag;
    @XmlElement(required = true)
    protected String externalSystemCaseID;
    protected String processState;
    protected String workItemCompleteTime;
    protected String handleNodeRole;
    protected String hanldeNodeStaff;
    protected String handleNodeComment;
    protected String handleNodeCreateTime;
    protected String handleNodeCompleteTime;

    /**
     * Obtiene el valor de la propiedad ci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCI() {
        return ci;
    }

    /**
     * Define el valor de la propiedad ci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCI(String value) {
        this.ci = value;
    }

    /**
     * Obtiene el valor de la propiedad reason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Define el valor de la propiedad reason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
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
     * Obtiene el valor de la propiedad troubleTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTroubleTitle() {
        return troubleTitle;
    }

    /**
     * Define el valor de la propiedad troubleTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTroubleTitle(String value) {
        this.troubleTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad ttDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtDescription() {
        return ttDescription;
    }

    /**
     * Define el valor de la propiedad ttDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtDescription(String value) {
        this.ttDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad workItemHandlingrole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemHandlingrole() {
        return workItemHandlingrole;
    }

    /**
     * Define el valor de la propiedad workItemHandlingrole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemHandlingrole(String value) {
        this.workItemHandlingrole = value;
    }

    /**
     * Obtiene el valor de la propiedad workItemHandlingStaff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemHandlingStaff() {
        return workItemHandlingStaff;
    }

    /**
     * Define el valor de la propiedad workItemHandlingStaff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemHandlingStaff(String value) {
        this.workItemHandlingStaff = value;
    }

    /**
     * Obtiene el valor de la propiedad workItemHandlingcomment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemHandlingcomment() {
        return workItemHandlingcomment;
    }

    /**
     * Define el valor de la propiedad workItemHandlingcomment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemHandlingcomment(String value) {
        this.workItemHandlingcomment = value;
    }

    /**
     * Obtiene el valor de la propiedad workItemCreateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemCreateTime() {
        return workItemCreateTime;
    }

    /**
     * Define el valor de la propiedad workItemCreateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemCreateTime(String value) {
        this.workItemCreateTime = value;
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
     * Obtiene el valor de la propiedad endAcceptTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAcceptTime() {
        return endAcceptTime;
    }

    /**
     * Define el valor de la propiedad endAcceptTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAcceptTime(String value) {
        this.endAcceptTime = value;
    }

    /**
     * Obtiene el valor de la propiedad acceptStaffNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptStaffNo() {
        return acceptStaffNo;
    }

    /**
     * Define el valor de la propiedad acceptStaffNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptStaffNo(String value) {
        this.acceptStaffNo = value;
    }

    /**
     * Obtiene el valor de la propiedad duplicateFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateFlag() {
        return duplicateFlag;
    }

    /**
     * Define el valor de la propiedad duplicateFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateFlag(String value) {
        this.duplicateFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad externalSystemCaseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSystemCaseID() {
        return externalSystemCaseID;
    }

    /**
     * Define el valor de la propiedad externalSystemCaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSystemCaseID(String value) {
        this.externalSystemCaseID = value;
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
     * Obtiene el valor de la propiedad workItemCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemCompleteTime() {
        return workItemCompleteTime;
    }

    /**
     * Define el valor de la propiedad workItemCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemCompleteTime(String value) {
        this.workItemCompleteTime = value;
    }

    /**
     * Obtiene el valor de la propiedad handleNodeRole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleNodeRole() {
        return handleNodeRole;
    }

    /**
     * Define el valor de la propiedad handleNodeRole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleNodeRole(String value) {
        this.handleNodeRole = value;
    }

    /**
     * Obtiene el valor de la propiedad hanldeNodeStaff.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHanldeNodeStaff() {
        return hanldeNodeStaff;
    }

    /**
     * Define el valor de la propiedad hanldeNodeStaff.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHanldeNodeStaff(String value) {
        this.hanldeNodeStaff = value;
    }

    /**
     * Obtiene el valor de la propiedad handleNodeComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleNodeComment() {
        return handleNodeComment;
    }

    /**
     * Define el valor de la propiedad handleNodeComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleNodeComment(String value) {
        this.handleNodeComment = value;
    }

    /**
     * Obtiene el valor de la propiedad handleNodeCreateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleNodeCreateTime() {
        return handleNodeCreateTime;
    }

    /**
     * Define el valor de la propiedad handleNodeCreateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleNodeCreateTime(String value) {
        this.handleNodeCreateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad handleNodeCompleteTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleNodeCompleteTime() {
        return handleNodeCompleteTime;
    }

    /**
     * Define el valor de la propiedad handleNodeCompleteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleNodeCompleteTime(String value) {
        this.handleNodeCompleteTime = value;
    }

}
