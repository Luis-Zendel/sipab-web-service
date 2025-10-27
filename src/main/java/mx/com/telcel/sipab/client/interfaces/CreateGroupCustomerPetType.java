
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreateGroupCustomerPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateGroupCustomerPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="person" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PersonType"/&gt;
 *         &lt;element name="customerBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CustomerBasicInfoType"/&gt;
 *         &lt;element name="certificationInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CertificationInfoType" minOccurs="0"/&gt;
 *         &lt;element name="pymeInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PymeInfoType" minOccurs="0"/&gt;
 *         &lt;element name="corporateInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CorporateInfoType" minOccurs="0"/&gt;
 *         &lt;element name="serviceManager" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ServiceManagerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addressInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AddressInfoITType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="contactPersonInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ContactPersonInfoITType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateGroupCustomerPetType", propOrder = {
    "person",
    "customerBasicInfo",
    "certificationInfo",
    "pymeInfo",
    "corporateInfo",
    "serviceManager",
    "addressInfo",
    "contactPersonInfo"
})
public class CreateGroupCustomerPetType {

    @XmlElement(required = true)
    protected String person;
    @XmlElement(required = true)
    protected CustomerBasicInfoType customerBasicInfo;
    protected CertificationInfoType certificationInfo;
    protected PymeInfoType pymeInfo;
    protected CorporateInfoType corporateInfo;
    protected List<ServiceManagerType> serviceManager;
    @XmlElement(required = true)
    protected List<AddressInfoITType> addressInfo;
    protected List<ContactPersonInfoITType> contactPersonInfo;

    /**
     * Obtiene el valor de la propiedad person.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerson() {
        return person;
    }

    /**
     * Define el valor de la propiedad person.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerson(String value) {
        this.person = value;
    }

    /**
     * Obtiene el valor de la propiedad customerBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBasicInfoType }
     *     
     */
    public CustomerBasicInfoType getCustomerBasicInfo() {
        return customerBasicInfo;
    }

    /**
     * Define el valor de la propiedad customerBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBasicInfoType }
     *     
     */
    public void setCustomerBasicInfo(CustomerBasicInfoType value) {
        this.customerBasicInfo = value;
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
     * Obtiene el valor de la propiedad pymeInfo.
     * 
     * @return
     *     possible object is
     *     {@link PymeInfoType }
     *     
     */
    public PymeInfoType getPymeInfo() {
        return pymeInfo;
    }

    /**
     * Define el valor de la propiedad pymeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PymeInfoType }
     *     
     */
    public void setPymeInfo(PymeInfoType value) {
        this.pymeInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad corporateInfo.
     * 
     * @return
     *     possible object is
     *     {@link CorporateInfoType }
     *     
     */
    public CorporateInfoType getCorporateInfo() {
        return corporateInfo;
    }

    /**
     * Define el valor de la propiedad corporateInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateInfoType }
     *     
     */
    public void setCorporateInfo(CorporateInfoType value) {
        this.corporateInfo = value;
    }

    /**
     * Gets the value of the serviceManager property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serviceManager property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceManager().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceManagerType }
     * 
     * 
     */
    public List<ServiceManagerType> getServiceManager() {
        if (serviceManager == null) {
            serviceManager = new ArrayList<ServiceManagerType>();
        }
        return this.serviceManager;
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
     * {@link AddressInfoITType }
     * 
     * 
     */
    public List<AddressInfoITType> getAddressInfo() {
        if (addressInfo == null) {
            addressInfo = new ArrayList<AddressInfoITType>();
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
     * {@link ContactPersonInfoITType }
     * 
     * 
     */
    public List<ContactPersonInfoITType> getContactPersonInfo() {
        if (contactPersonInfo == null) {
            contactPersonInfo = new ArrayList<ContactPersonInfoITType>();
        }
        return this.contactPersonInfo;
    }

}
