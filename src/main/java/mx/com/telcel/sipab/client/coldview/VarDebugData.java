
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para varDebugData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="varDebugData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CVConnectionServicesConnected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVDocumentCreationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVFoundationClassLastMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVIntermediateFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVIssueHandlerReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVIssueOpenStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVPageAddressedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVPageSequenceInContainer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVUserValidated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestEndOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestInitiatedOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resourceContent" type="{}resourceContentType0" minOccurs="0"/&gt;
 *         &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="searchParameter" type="{}arrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="searchQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "varDebugData", namespace = "", propOrder = {
    "cvConnectionServicesConnected",
    "cvDocumentCreationStatus",
    "cvFoundationClassLastMessage",
    "cvIntermediateFilePath",
    "cvIssueHandlerReceived",
    "cvIssueOpenStatus",
    "cvPageAddressedStatus",
    "cvPageSequenceInContainer",
    "cvUserValidated",
    "requestEndOn",
    "requestInitiatedOn",
    "resourceContent",
    "resourceName",
    "searchParameter",
    "searchQuery"
})
public class VarDebugData {

    @XmlElement(name = "CVConnectionServicesConnected")
    protected String cvConnectionServicesConnected;
    @XmlElement(name = "CVDocumentCreationStatus")
    protected String cvDocumentCreationStatus;
    @XmlElement(name = "CVFoundationClassLastMessage")
    protected String cvFoundationClassLastMessage;
    @XmlElement(name = "CVIntermediateFilePath")
    protected String cvIntermediateFilePath;
    @XmlElement(name = "CVIssueHandlerReceived")
    protected String cvIssueHandlerReceived;
    @XmlElement(name = "CVIssueOpenStatus")
    protected String cvIssueOpenStatus;
    @XmlElement(name = "CVPageAddressedStatus")
    protected String cvPageAddressedStatus;
    @XmlElement(name = "CVPageSequenceInContainer")
    protected String cvPageSequenceInContainer;
    @XmlElement(name = "CVUserValidated")
    protected String cvUserValidated;
    protected String requestEndOn;
    protected String requestInitiatedOn;
    protected ResourceContentType0 resourceContent;
    protected String resourceName;
    protected ArrayOfString searchParameter;
    protected String searchQuery;

    /**
     * Obtiene el valor de la propiedad cvConnectionServicesConnected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVConnectionServicesConnected() {
        return cvConnectionServicesConnected;
    }

    /**
     * Define el valor de la propiedad cvConnectionServicesConnected.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVConnectionServicesConnected(String value) {
        this.cvConnectionServicesConnected = value;
    }

    /**
     * Obtiene el valor de la propiedad cvDocumentCreationStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVDocumentCreationStatus() {
        return cvDocumentCreationStatus;
    }

    /**
     * Define el valor de la propiedad cvDocumentCreationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVDocumentCreationStatus(String value) {
        this.cvDocumentCreationStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad cvFoundationClassLastMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVFoundationClassLastMessage() {
        return cvFoundationClassLastMessage;
    }

    /**
     * Define el valor de la propiedad cvFoundationClassLastMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVFoundationClassLastMessage(String value) {
        this.cvFoundationClassLastMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad cvIntermediateFilePath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVIntermediateFilePath() {
        return cvIntermediateFilePath;
    }

    /**
     * Define el valor de la propiedad cvIntermediateFilePath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVIntermediateFilePath(String value) {
        this.cvIntermediateFilePath = value;
    }

    /**
     * Obtiene el valor de la propiedad cvIssueHandlerReceived.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVIssueHandlerReceived() {
        return cvIssueHandlerReceived;
    }

    /**
     * Define el valor de la propiedad cvIssueHandlerReceived.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVIssueHandlerReceived(String value) {
        this.cvIssueHandlerReceived = value;
    }

    /**
     * Obtiene el valor de la propiedad cvIssueOpenStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVIssueOpenStatus() {
        return cvIssueOpenStatus;
    }

    /**
     * Define el valor de la propiedad cvIssueOpenStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVIssueOpenStatus(String value) {
        this.cvIssueOpenStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad cvPageAddressedStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVPageAddressedStatus() {
        return cvPageAddressedStatus;
    }

    /**
     * Define el valor de la propiedad cvPageAddressedStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVPageAddressedStatus(String value) {
        this.cvPageAddressedStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad cvPageSequenceInContainer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVPageSequenceInContainer() {
        return cvPageSequenceInContainer;
    }

    /**
     * Define el valor de la propiedad cvPageSequenceInContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVPageSequenceInContainer(String value) {
        this.cvPageSequenceInContainer = value;
    }

    /**
     * Obtiene el valor de la propiedad cvUserValidated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVUserValidated() {
        return cvUserValidated;
    }

    /**
     * Define el valor de la propiedad cvUserValidated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVUserValidated(String value) {
        this.cvUserValidated = value;
    }

    /**
     * Obtiene el valor de la propiedad requestEndOn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestEndOn() {
        return requestEndOn;
    }

    /**
     * Define el valor de la propiedad requestEndOn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestEndOn(String value) {
        this.requestEndOn = value;
    }

    /**
     * Obtiene el valor de la propiedad requestInitiatedOn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestInitiatedOn() {
        return requestInitiatedOn;
    }

    /**
     * Define el valor de la propiedad requestInitiatedOn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestInitiatedOn(String value) {
        this.requestInitiatedOn = value;
    }

    /**
     * Obtiene el valor de la propiedad resourceContent.
     * 
     * @return
     *     possible object is
     *     {@link ResourceContentType0 }
     *     
     */
    public ResourceContentType0 getResourceContent() {
        return resourceContent;
    }

    /**
     * Define el valor de la propiedad resourceContent.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceContentType0 }
     *     
     */
    public void setResourceContent(ResourceContentType0 value) {
        this.resourceContent = value;
    }

    /**
     * Obtiene el valor de la propiedad resourceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Define el valor de la propiedad resourceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * Obtiene el valor de la propiedad searchParameter.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSearchParameter() {
        return searchParameter;
    }

    /**
     * Define el valor de la propiedad searchParameter.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSearchParameter(ArrayOfString value) {
        this.searchParameter = value;
    }

    /**
     * Obtiene el valor de la propiedad searchQuery.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchQuery() {
        return searchQuery;
    }

    /**
     * Define el valor de la propiedad searchQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchQuery(String value) {
        this.searchQuery = value;
    }

}
