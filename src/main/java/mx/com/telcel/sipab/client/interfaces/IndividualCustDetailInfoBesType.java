
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IndividualCustDetailInfoBesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IndividualCustDetailInfoBesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="custBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CustBasicInfoBesType" minOccurs="0"/&gt;
 *         &lt;element name="individualBaseInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IndividualBaseInfoBesType" minOccurs="0"/&gt;
 *         &lt;element name="certificationInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CertificationInfoType" minOccurs="0"/&gt;
 *         &lt;element name="attachments" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AttachmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactPersons" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usageAddrs" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}UsageAddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualCustDetailInfoBesType", propOrder = {
    "custBasicInfo",
    "individualBaseInfo",
    "certificationInfo",
    "attachments",
    "contactPersons",
    "usageAddrs"
})
public class IndividualCustDetailInfoBesType {

    protected CustBasicInfoBesType custBasicInfo;
    protected IndividualBaseInfoBesType individualBaseInfo;
    protected CertificationInfoType certificationInfo;
    protected List<AttachmentType> attachments;
    protected List<ContactPersonType> contactPersons;
    protected List<UsageAddressType> usageAddrs;

    /**
     * Obtiene el valor de la propiedad custBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link CustBasicInfoBesType }
     *     
     */
    public CustBasicInfoBesType getCustBasicInfo() {
        return custBasicInfo;
    }

    /**
     * Define el valor de la propiedad custBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustBasicInfoBesType }
     *     
     */
    public void setCustBasicInfo(CustBasicInfoBesType value) {
        this.custBasicInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad individualBaseInfo.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBaseInfoBesType }
     *     
     */
    public IndividualBaseInfoBesType getIndividualBaseInfo() {
        return individualBaseInfo;
    }

    /**
     * Define el valor de la propiedad individualBaseInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBaseInfoBesType }
     *     
     */
    public void setIndividualBaseInfo(IndividualBaseInfoBesType value) {
        this.individualBaseInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad certificationInfo.
     * 
     * @return
     *     possible object is
     *     {@link CertificationInfoType }
     *     
     */
    public CertificationInfoType getCertificationInfo() {
        return certificationInfo;
    }

    /**
     * Define el valor de la propiedad certificationInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationInfoType }
     *     
     */
    public void setCertificationInfo(CertificationInfoType value) {
        this.certificationInfo = value;
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

    /**
     * Gets the value of the contactPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contactPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonType }
     * 
     * 
     */
    public List<ContactPersonType> getContactPersons() {
        if (contactPersons == null) {
            contactPersons = new ArrayList<ContactPersonType>();
        }
        return this.contactPersons;
    }

    /**
     * Gets the value of the usageAddrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the usageAddrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageAddrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageAddressType }
     * 
     * 
     */
    public List<UsageAddressType> getUsageAddrs() {
        if (usageAddrs == null) {
            usageAddrs = new ArrayList<UsageAddressType>();
        }
        return this.usageAddrs;
    }

}
