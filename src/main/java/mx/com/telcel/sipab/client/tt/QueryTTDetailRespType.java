
package mx.com.telcel.sipab.client.tt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryTTDetailRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryTTDetailRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servReqSerialNo" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="customerType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="customerCategory" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="custSubCategory" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="customerLevel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="accessNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="acctNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica60Type" minOccurs="0"/&gt;
 *         &lt;element name="additionalFaultyNbr" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica60Type" minOccurs="0"/&gt;
 *         &lt;element name="troubleTitle" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica200Type" minOccurs="0"/&gt;
 *         &lt;element name="troubleType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica255Type"/&gt;
 *         &lt;element name="faultLocation" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="acceptStaffNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="tenantId" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="occurrenceDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="deadline" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="mobileNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica60Type" minOccurs="0"/&gt;
 *         &lt;element name="contactNumber2" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica60Type" minOccurs="0"/&gt;
 *         &lt;element name="ttDescription" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="accessoryInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="acceptTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="expectFeedbackTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="processState" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica255Type" minOccurs="0"/&gt;
 *         &lt;element name="nodeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="workItemDeadLineTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="workItemId" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="workItemHandlingrole" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica70Type" minOccurs="0"/&gt;
 *         &lt;element name="workItemHandlingStaff" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="workItemHandlingcomment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="workItemCompleteTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="workOrder" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="sAMSDialog" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="affectedNetworkElement" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="cI" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="externalSystemCaseID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="handleNodeRole" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica70Type" minOccurs="0"/&gt;
 *         &lt;element name="hanldeNodeStaff" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
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
@XmlType(name = "QueryTTDetailRespType", propOrder = {
    "servReqSerialNo",
    "customerName",
    "customerType",
    "customerCategory",
    "custSubCategory",
    "customerLevel",
    "priority",
    "accessNumber",
    "acctNumber",
    "additionalFaultyNbr",
    "troubleTitle",
    "troubleType",
    "faultLocation",
    "acceptStaffNo",
    "tenantId",
    "occurrenceDate",
    "deadline",
    "mobileNo",
    "contactNumber2",
    "ttDescription",
    "email",
    "accessoryInfo",
    "acceptTime",
    "expectFeedbackTime",
    "processState",
    "nodeName",
    "workItemDeadLineTime",
    "workItemId",
    "workItemHandlingrole",
    "workItemHandlingStaff",
    "workItemHandlingcomment",
    "workItemCompleteTime",
    "workOrder",
    "samsDialog",
    "affectedNetworkElement",
    "ci",
    "reason",
    "externalSystemCaseID",
    "handleNodeRole",
    "hanldeNodeStaff",
    "handleNodeComment",
    "handleNodeCreateTime",
    "handleNodeCompleteTime"
})
public class QueryTTDetailRespType {

    protected String servReqSerialNo;
    protected String customerName;
    protected String customerType;
    protected String customerCategory;
    protected String custSubCategory;
    protected String customerLevel;
    protected String priority;
    protected String accessNumber;
    protected String acctNumber;
    protected String additionalFaultyNbr;
    protected String troubleTitle;
    @XmlElement(required = true)
    protected String troubleType;
    protected String faultLocation;
    protected String acceptStaffNo;
    protected String tenantId;
    protected String occurrenceDate;
    protected String deadline;
    protected String mobileNo;
    protected String contactNumber2;
    protected String ttDescription;
    protected String email;
    protected String accessoryInfo;
    protected String acceptTime;
    protected String expectFeedbackTime;
    protected String processState;
    protected String nodeName;
    protected String workItemDeadLineTime;
    protected String workItemId;
    protected String workItemHandlingrole;
    protected String workItemHandlingStaff;
    protected String workItemHandlingcomment;
    protected String workItemCompleteTime;
    protected String workOrder;
    @XmlElement(name = "sAMSDialog")
    protected String samsDialog;
    protected String affectedNetworkElement;
    @XmlElement(name = "cI")
    protected String ci;
    protected String reason;
    protected String externalSystemCaseID;
    protected String handleNodeRole;
    protected String hanldeNodeStaff;
    protected String handleNodeComment;
    protected String handleNodeCreateTime;
    protected String handleNodeCompleteTime;

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
     * Obtiene el valor de la propiedad customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define el valor de la propiedad customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtiene el valor de la propiedad customerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Define el valor de la propiedad customerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Obtiene el valor de la propiedad customerCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCategory() {
        return customerCategory;
    }

    /**
     * Define el valor de la propiedad customerCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCategory(String value) {
        this.customerCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad custSubCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSubCategory() {
        return custSubCategory;
    }

    /**
     * Define el valor de la propiedad custSubCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSubCategory(String value) {
        this.custSubCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad customerLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLevel() {
        return customerLevel;
    }

    /**
     * Define el valor de la propiedad customerLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLevel(String value) {
        this.customerLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad priority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Define el valor de la propiedad priority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
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
     * Obtiene el valor de la propiedad acctNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNumber() {
        return acctNumber;
    }

    /**
     * Define el valor de la propiedad acctNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNumber(String value) {
        this.acctNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalFaultyNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalFaultyNbr() {
        return additionalFaultyNbr;
    }

    /**
     * Define el valor de la propiedad additionalFaultyNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalFaultyNbr(String value) {
        this.additionalFaultyNbr = value;
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
     * Obtiene el valor de la propiedad faultLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultLocation() {
        return faultLocation;
    }

    /**
     * Define el valor de la propiedad faultLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultLocation(String value) {
        this.faultLocation = value;
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
     * Obtiene el valor de la propiedad tenantId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Define el valor de la propiedad tenantId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenantId(String value) {
        this.tenantId = value;
    }

    /**
     * Obtiene el valor de la propiedad occurrenceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurrenceDate() {
        return occurrenceDate;
    }

    /**
     * Define el valor de la propiedad occurrenceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurrenceDate(String value) {
        this.occurrenceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad deadline.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * Define el valor de la propiedad deadline.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeadline(String value) {
        this.deadline = value;
    }

    /**
     * Obtiene el valor de la propiedad mobileNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Define el valor de la propiedad mobileNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

    /**
     * Obtiene el valor de la propiedad contactNumber2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber2() {
        return contactNumber2;
    }

    /**
     * Define el valor de la propiedad contactNumber2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber2(String value) {
        this.contactNumber2 = value;
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
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad accessoryInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessoryInfo() {
        return accessoryInfo;
    }

    /**
     * Define el valor de la propiedad accessoryInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessoryInfo(String value) {
        this.accessoryInfo = value;
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
     * Obtiene el valor de la propiedad expectFeedbackTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectFeedbackTime() {
        return expectFeedbackTime;
    }

    /**
     * Define el valor de la propiedad expectFeedbackTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectFeedbackTime(String value) {
        this.expectFeedbackTime = value;
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
     * Obtiene el valor de la propiedad workItemDeadLineTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemDeadLineTime() {
        return workItemDeadLineTime;
    }

    /**
     * Define el valor de la propiedad workItemDeadLineTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemDeadLineTime(String value) {
        this.workItemDeadLineTime = value;
    }

    /**
     * Obtiene el valor de la propiedad workItemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemId() {
        return workItemId;
    }

    /**
     * Define el valor de la propiedad workItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemId(String value) {
        this.workItemId = value;
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
     * Obtiene el valor de la propiedad workOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrder() {
        return workOrder;
    }

    /**
     * Define el valor de la propiedad workOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrder(String value) {
        this.workOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad samsDialog.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAMSDialog() {
        return samsDialog;
    }

    /**
     * Define el valor de la propiedad samsDialog.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAMSDialog(String value) {
        this.samsDialog = value;
    }

    /**
     * Obtiene el valor de la propiedad affectedNetworkElement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedNetworkElement() {
        return affectedNetworkElement;
    }

    /**
     * Define el valor de la propiedad affectedNetworkElement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedNetworkElement(String value) {
        this.affectedNetworkElement = value;
    }

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
