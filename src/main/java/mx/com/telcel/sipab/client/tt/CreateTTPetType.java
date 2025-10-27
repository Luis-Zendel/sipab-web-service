
package mx.com.telcel.sipab.client.tt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreateTTPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateTTPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalSystem" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica2Type"/&gt;
 *         &lt;element name="customerName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="customerType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="accessNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type"/&gt;
 *         &lt;element name="acctNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica60Type"/&gt;
 *         &lt;element name="troubleTitle" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica200Type"/&gt;
 *         &lt;element name="troubleType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica60Type"/&gt;
 *         &lt;element name="faultLocation" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="mobileNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica60Type" minOccurs="0"/&gt;
 *         &lt;element name="ttDescription" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica4000Type"/&gt;
 *         &lt;element name="accessoryInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="acceptTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type"/&gt;
 *         &lt;element name="cURP" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica18Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentChannel" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="primaryOffering" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="susbcriptionRegion" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica2Type" minOccurs="0"/&gt;
 *         &lt;element name="contactNumber2" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica15Type" minOccurs="0"/&gt;
 *         &lt;element name="activationDateofProduct" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="problemProduct" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="problemExampleDates" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica150Type" minOccurs="0"/&gt;
 *         &lt;element name="billCycle" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="coordinates" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="street" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="betweenStreets" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type" minOccurs="0"/&gt;
 *         &lt;element name="neighborhood" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="municipality" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica40Type" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica6Type" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica40Type" minOccurs="0"/&gt;
 *         &lt;element name="internalFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="donorCarrier" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="donorNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="donorRegion" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="donorPlace" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="recipientCarrier" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="recipientNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="recipientRegion" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="recipientPlace" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="errorCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="activationTransationId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="listenedRecording" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica35Type" minOccurs="0"/&gt;
 *         &lt;element name="iMEI" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica40Type" minOccurs="0"/&gt;
 *         &lt;element name="technology" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="sIMVersion" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="deviceSoftwareVersion" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="model" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="brand" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="frequency" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="acceptStaffNo" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="duplicateFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="commonPhrases" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica60Type" minOccurs="0"/&gt;
 *         &lt;element name="destinationnode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica70Type" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica70Type" minOccurs="0"/&gt;
 *         &lt;element name="exampleLines" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="workOrder" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="sAMSDialog" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="affectedNetworkElement" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type" minOccurs="0"/&gt;
 *         &lt;element name="cI" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type"/&gt;
 *         &lt;element name="reason" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica100Type"/&gt;
 *         &lt;element name="externalSystemCaseID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica30Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTTPetType", propOrder = {
    "externalSystem",
    "customerName",
    "customerType",
    "accessNumber",
    "acctNumber",
    "troubleTitle",
    "troubleType",
    "faultLocation",
    "mobileNo",
    "ttDescription",
    "accessoryInfo",
    "acceptTime",
    "curp",
    "paymentChannel",
    "primaryOffering",
    "susbcriptionRegion",
    "contactNumber2",
    "activationDateofProduct",
    "problemProduct",
    "problemExampleDates",
    "billCycle",
    "coordinates",
    "street",
    "betweenStreets",
    "neighborhood",
    "municipality",
    "state",
    "region",
    "zipCode",
    "country",
    "internalFlag",
    "donorCarrier",
    "donorNumber",
    "donorRegion",
    "donorPlace",
    "recipientCarrier",
    "recipientNumber",
    "recipientRegion",
    "recipientPlace",
    "errorCode",
    "activationTransationId",
    "listenedRecording",
    "imei",
    "technology",
    "simVersion",
    "deviceSoftwareVersion",
    "model",
    "brand",
    "frequency",
    "acceptStaffNo",
    "duplicateFlag",
    "commonPhrases",
    "destinationnode",
    "destination",
    "exampleLines",
    "workOrder",
    "samsDialog",
    "affectedNetworkElement",
    "ci",
    "reason",
    "externalSystemCaseID"
})
public class CreateTTPetType {

    @XmlElement(required = true)
    protected String externalSystem;
    protected String customerName;
    protected String customerType;
    @XmlElement(required = true)
    protected String accessNumber;
    @XmlElement(required = true)
    protected String acctNumber;
    @XmlElement(required = true)
    protected String troubleTitle;
    @XmlElement(required = true)
    protected String troubleType;
    protected String faultLocation;
    protected String mobileNo;
    @XmlElement(required = true)
    protected String ttDescription;
    protected String accessoryInfo;
    @XmlElement(required = true)
    protected String acceptTime;
    @XmlElement(name = "cURP")
    protected String curp;
    protected String paymentChannel;
    protected String primaryOffering;
    protected String susbcriptionRegion;
    protected String contactNumber2;
    protected String activationDateofProduct;
    protected String problemProduct;
    protected String problemExampleDates;
    protected String billCycle;
    protected String coordinates;
    protected String street;
    protected String betweenStreets;
    protected String neighborhood;
    protected String municipality;
    protected String state;
    protected String region;
    protected String zipCode;
    protected String country;
    protected String internalFlag;
    protected String donorCarrier;
    protected String donorNumber;
    protected String donorRegion;
    protected String donorPlace;
    protected String recipientCarrier;
    protected String recipientNumber;
    protected String recipientRegion;
    protected String recipientPlace;
    protected String errorCode;
    protected String activationTransationId;
    protected String listenedRecording;
    @XmlElement(name = "iMEI")
    protected String imei;
    protected String technology;
    @XmlElement(name = "sIMVersion")
    protected String simVersion;
    protected String deviceSoftwareVersion;
    protected String model;
    protected String brand;
    protected String frequency;
    @XmlElement(required = true)
    protected String acceptStaffNo;
    protected String duplicateFlag;
    protected String commonPhrases;
    protected String destinationnode;
    protected String destination;
    protected String exampleLines;
    protected String workOrder;
    @XmlElement(name = "sAMSDialog")
    protected String samsDialog;
    protected String affectedNetworkElement;
    @XmlElement(name = "cI", required = true)
    protected String ci;
    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    protected String externalSystemCaseID;

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
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURP(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentChannel() {
        return paymentChannel;
    }

    /**
     * Define el valor de la propiedad paymentChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentChannel(String value) {
        this.paymentChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryOffering.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOffering() {
        return primaryOffering;
    }

    /**
     * Define el valor de la propiedad primaryOffering.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOffering(String value) {
        this.primaryOffering = value;
    }

    /**
     * Obtiene el valor de la propiedad susbcriptionRegion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSusbcriptionRegion() {
        return susbcriptionRegion;
    }

    /**
     * Define el valor de la propiedad susbcriptionRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSusbcriptionRegion(String value) {
        this.susbcriptionRegion = value;
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
     * Obtiene el valor de la propiedad activationDateofProduct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationDateofProduct() {
        return activationDateofProduct;
    }

    /**
     * Define el valor de la propiedad activationDateofProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationDateofProduct(String value) {
        this.activationDateofProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad problemProduct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemProduct() {
        return problemProduct;
    }

    /**
     * Define el valor de la propiedad problemProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemProduct(String value) {
        this.problemProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad problemExampleDates.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemExampleDates() {
        return problemExampleDates;
    }

    /**
     * Define el valor de la propiedad problemExampleDates.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemExampleDates(String value) {
        this.problemExampleDates = value;
    }

    /**
     * Obtiene el valor de la propiedad billCycle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycle() {
        return billCycle;
    }

    /**
     * Define el valor de la propiedad billCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycle(String value) {
        this.billCycle = value;
    }

    /**
     * Obtiene el valor de la propiedad coordinates.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinates() {
        return coordinates;
    }

    /**
     * Define el valor de la propiedad coordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinates(String value) {
        this.coordinates = value;
    }

    /**
     * Obtiene el valor de la propiedad street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Define el valor de la propiedad street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Obtiene el valor de la propiedad betweenStreets.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetweenStreets() {
        return betweenStreets;
    }

    /**
     * Define el valor de la propiedad betweenStreets.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetweenStreets(String value) {
        this.betweenStreets = value;
    }

    /**
     * Obtiene el valor de la propiedad neighborhood.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * Define el valor de la propiedad neighborhood.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighborhood(String value) {
        this.neighborhood = value;
    }

    /**
     * Obtiene el valor de la propiedad municipality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * Define el valor de la propiedad municipality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipality(String value) {
        this.municipality = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad zipCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Define el valor de la propiedad zipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad internalFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalFlag() {
        return internalFlag;
    }

    /**
     * Define el valor de la propiedad internalFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalFlag(String value) {
        this.internalFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad donorCarrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonorCarrier() {
        return donorCarrier;
    }

    /**
     * Define el valor de la propiedad donorCarrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonorCarrier(String value) {
        this.donorCarrier = value;
    }

    /**
     * Obtiene el valor de la propiedad donorNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonorNumber() {
        return donorNumber;
    }

    /**
     * Define el valor de la propiedad donorNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonorNumber(String value) {
        this.donorNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad donorRegion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonorRegion() {
        return donorRegion;
    }

    /**
     * Define el valor de la propiedad donorRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonorRegion(String value) {
        this.donorRegion = value;
    }

    /**
     * Obtiene el valor de la propiedad donorPlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonorPlace() {
        return donorPlace;
    }

    /**
     * Define el valor de la propiedad donorPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonorPlace(String value) {
        this.donorPlace = value;
    }

    /**
     * Obtiene el valor de la propiedad recipientCarrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCarrier() {
        return recipientCarrier;
    }

    /**
     * Define el valor de la propiedad recipientCarrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientCarrier(String value) {
        this.recipientCarrier = value;
    }

    /**
     * Obtiene el valor de la propiedad recipientNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientNumber() {
        return recipientNumber;
    }

    /**
     * Define el valor de la propiedad recipientNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientNumber(String value) {
        this.recipientNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad recipientRegion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientRegion() {
        return recipientRegion;
    }

    /**
     * Define el valor de la propiedad recipientRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientRegion(String value) {
        this.recipientRegion = value;
    }

    /**
     * Obtiene el valor de la propiedad recipientPlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientPlace() {
        return recipientPlace;
    }

    /**
     * Define el valor de la propiedad recipientPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientPlace(String value) {
        this.recipientPlace = value;
    }

    /**
     * Obtiene el valor de la propiedad errorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Define el valor de la propiedad errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad activationTransationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationTransationId() {
        return activationTransationId;
    }

    /**
     * Define el valor de la propiedad activationTransationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationTransationId(String value) {
        this.activationTransationId = value;
    }

    /**
     * Obtiene el valor de la propiedad listenedRecording.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListenedRecording() {
        return listenedRecording;
    }

    /**
     * Define el valor de la propiedad listenedRecording.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListenedRecording(String value) {
        this.listenedRecording = value;
    }

    /**
     * Obtiene el valor de la propiedad imei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * Define el valor de la propiedad imei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEI(String value) {
        this.imei = value;
    }

    /**
     * Obtiene el valor de la propiedad technology.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnology() {
        return technology;
    }

    /**
     * Define el valor de la propiedad technology.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnology(String value) {
        this.technology = value;
    }

    /**
     * Obtiene el valor de la propiedad simVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIMVersion() {
        return simVersion;
    }

    /**
     * Define el valor de la propiedad simVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIMVersion(String value) {
        this.simVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceSoftwareVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSoftwareVersion() {
        return deviceSoftwareVersion;
    }

    /**
     * Define el valor de la propiedad deviceSoftwareVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSoftwareVersion(String value) {
        this.deviceSoftwareVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad model.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Define el valor de la propiedad model.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Obtiene el valor de la propiedad brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Define el valor de la propiedad brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Obtiene el valor de la propiedad frequency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Define el valor de la propiedad frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
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
     * Obtiene el valor de la propiedad commonPhrases.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonPhrases() {
        return commonPhrases;
    }

    /**
     * Define el valor de la propiedad commonPhrases.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonPhrases(String value) {
        this.commonPhrases = value;
    }

    /**
     * Obtiene el valor de la propiedad destinationnode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationnode() {
        return destinationnode;
    }

    /**
     * Define el valor de la propiedad destinationnode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationnode(String value) {
        this.destinationnode = value;
    }

    /**
     * Obtiene el valor de la propiedad destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Define el valor de la propiedad destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Obtiene el valor de la propiedad exampleLines.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExampleLines() {
        return exampleLines;
    }

    /**
     * Define el valor de la propiedad exampleLines.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExampleLines(String value) {
        this.exampleLines = value;
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

}
