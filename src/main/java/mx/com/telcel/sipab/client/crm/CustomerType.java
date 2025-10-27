
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CustomerType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustomerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="custBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CustomerBasicType"/&gt;
 *         &lt;element name="certificationInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}PartyCertificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="individualInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}IndividualBaseType" minOccurs="0"/&gt;
 *         &lt;element name="addressInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}AddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactPersonInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="attachments" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}AttachmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", propOrder = {
    "customerId",
    "custBasicInfo",
    "certificationInfo",
    "individualInfo",
    "addressInfo",
    "contactPersonInfo",
    "attachments"
})
public class CustomerType {

    protected BigDecimal customerId;
    @XmlElement(required = true)
    protected CustomerBasicType custBasicInfo;
    protected List<PartyCertificationType> certificationInfo;
    protected IndividualBaseType individualInfo;
    protected List<AddressType> addressInfo;
    protected List<ContactPersonType> contactPersonInfo;
    protected List<AttachmentType> attachments;

    /**
     * Obtiene el valor de la propiedad customerId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomerId(BigDecimal value) {
        this.customerId = value;
    }

    /**
     * Obtiene el valor de la propiedad custBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBasicType }
     *     
     */
    public CustomerBasicType getCustBasicInfo() {
        return custBasicInfo;
    }

    /**
     * Define el valor de la propiedad custBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBasicType }
     *     
     */
    public void setCustBasicInfo(CustomerBasicType value) {
        this.custBasicInfo = value;
    }

    /**
     * Gets the value of the certificationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the certificationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyCertificationType }
     * 
     * 
     */
    public List<PartyCertificationType> getCertificationInfo() {
        if (certificationInfo == null) {
            certificationInfo = new ArrayList<PartyCertificationType>();
        }
        return this.certificationInfo;
    }

    /**
     * Obtiene el valor de la propiedad individualInfo.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBaseType }
     *     
     */
    public IndividualBaseType getIndividualInfo() {
        return individualInfo;
    }

    /**
     * Define el valor de la propiedad individualInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBaseType }
     *     
     */
    public void setIndividualInfo(IndividualBaseType value) {
        this.individualInfo = value;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addressInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getAddressInfo() {
        if (addressInfo == null) {
            addressInfo = new ArrayList<AddressType>();
        }
        return this.addressInfo;
    }

    /**
     * Gets the value of the contactPersonInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contactPersonInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPersonInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonType }
     * 
     * 
     */
    public List<ContactPersonType> getContactPersonInfo() {
        if (contactPersonInfo == null) {
            contactPersonInfo = new ArrayList<ContactPersonType>();
        }
        return this.contactPersonInfo;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<AttachmentType>();
        }
        return this.attachments;
    }

}
