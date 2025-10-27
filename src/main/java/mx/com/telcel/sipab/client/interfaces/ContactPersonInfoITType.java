
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContactPersonInfoITType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContactPersonInfoITType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactPersonId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ContactPersonIdType" minOccurs="0"/&gt;
 *         &lt;element name="addressInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AddressInfoType" minOccurs="0"/&gt;
 *         &lt;element name="contactPersonType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ContactPerson2Type"/&gt;
 *         &lt;element name="title" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}TitleType" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}FirstNameType" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}MiddleNameType" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}LastNameType" minOccurs="0"/&gt;
 *         &lt;element name="homePhone" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}HomePhoneType" minOccurs="0"/&gt;
 *         &lt;element name="officePhone" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfficePhoneType" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhone" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}MobilePhoneType" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}EmailType" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}FaxType" minOccurs="0"/&gt;
 *         &lt;element name="idType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IdTypeITType" minOccurs="0"/&gt;
 *         &lt;element name="idNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IdNumberITType" minOccurs="0"/&gt;
 *         &lt;element name="idExpirationDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IdExpirationDateType" minOccurs="0"/&gt;
 *         &lt;element name="homePhoneExt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}HomePhoneExtType" minOccurs="0"/&gt;
 *         &lt;element name="officePhoneExt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfficePhoneExtType" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhoneExt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}MobilePhoneExtType" minOccurs="0"/&gt;
 *         &lt;element name="position" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PositionType" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CommentsType" minOccurs="0"/&gt;
 *         &lt;element name="receiveNotificationsFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ReceiveNotificationsFlagType" minOccurs="0"/&gt;
 *         &lt;element name="reportingPeriod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ReportingPeriodType" minOccurs="0"/&gt;
 *         &lt;element name="birthday" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BirthdayType" minOccurs="0"/&gt;
 *         &lt;element name="birthState" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BirthStateITType" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}GenderITType" minOccurs="0"/&gt;
 *         &lt;element name="availabilitySchedule" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="contactName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="curp" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CURPType" minOccurs="0"/&gt;
 *         &lt;element name="vipFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}VipFlagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactPersonInfoITType", propOrder = {
    "contactPersonId",
    "addressInfo",
    "contactPersonType",
    "title",
    "firstName",
    "middleName",
    "lastName",
    "homePhone",
    "officePhone",
    "mobilePhone",
    "email",
    "fax",
    "idType",
    "idNumber",
    "idExpirationDate",
    "homePhoneExt",
    "officePhoneExt",
    "mobilePhoneExt",
    "position",
    "comments",
    "receiveNotificationsFlag",
    "reportingPeriod",
    "birthday",
    "birthState",
    "gender",
    "availabilitySchedule",
    "contactName",
    "curp",
    "vipFlag"
})
public class ContactPersonInfoITType {

    protected BigDecimal contactPersonId;
    protected AddressInfoType addressInfo;
    @XmlElement(required = true)
    protected String contactPersonType;
    protected String title;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String homePhone;
    protected String officePhone;
    protected String mobilePhone;
    protected String email;
    protected String fax;
    protected String idType;
    protected String idNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar idExpirationDate;
    protected String homePhoneExt;
    protected String officePhoneExt;
    protected String mobilePhoneExt;
    protected String position;
    protected String comments;
    protected String receiveNotificationsFlag;
    protected String reportingPeriod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    protected String birthState;
    protected String gender;
    protected String availabilitySchedule;
    protected String contactName;
    protected String curp;
    protected String vipFlag;

    /**
     * Obtiene el valor de la propiedad contactPersonId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContactPersonId() {
        return contactPersonId;
    }

    /**
     * Define el valor de la propiedad contactPersonId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContactPersonId(BigDecimal value) {
        this.contactPersonId = value;
    }

    /**
     * Obtiene el valor de la propiedad addressInfo.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddressInfo() {
        return addressInfo;
    }

    /**
     * Define el valor de la propiedad addressInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddressInfo(AddressInfoType value) {
        this.addressInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad contactPersonType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersonType() {
        return contactPersonType;
    }

    /**
     * Define el valor de la propiedad contactPersonType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersonType(String value) {
        this.contactPersonType = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define el valor de la propiedad firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Obtiene el valor de la propiedad middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Define el valor de la propiedad middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad homePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Define el valor de la propiedad homePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad officePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Define el valor de la propiedad officePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad mobilePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Define el valor de la propiedad mobilePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
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
     * Obtiene el valor de la propiedad fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Define el valor de la propiedad fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Obtiene el valor de la propiedad idType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Define el valor de la propiedad idType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Obtiene el valor de la propiedad idNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Define el valor de la propiedad idNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad idExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdExpirationDate() {
        return idExpirationDate;
    }

    /**
     * Define el valor de la propiedad idExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdExpirationDate(XMLGregorianCalendar value) {
        this.idExpirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad homePhoneExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhoneExt() {
        return homePhoneExt;
    }

    /**
     * Define el valor de la propiedad homePhoneExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhoneExt(String value) {
        this.homePhoneExt = value;
    }

    /**
     * Obtiene el valor de la propiedad officePhoneExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhoneExt() {
        return officePhoneExt;
    }

    /**
     * Define el valor de la propiedad officePhoneExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhoneExt(String value) {
        this.officePhoneExt = value;
    }

    /**
     * Obtiene el valor de la propiedad mobilePhoneExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneExt() {
        return mobilePhoneExt;
    }

    /**
     * Define el valor de la propiedad mobilePhoneExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneExt(String value) {
        this.mobilePhoneExt = value;
    }

    /**
     * Obtiene el valor de la propiedad position.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Define el valor de la propiedad position.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Obtiene el valor de la propiedad comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad receiveNotificationsFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveNotificationsFlag() {
        return receiveNotificationsFlag;
    }

    /**
     * Define el valor de la propiedad receiveNotificationsFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveNotificationsFlag(String value) {
        this.receiveNotificationsFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad reportingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingPeriod() {
        return reportingPeriod;
    }

    /**
     * Define el valor de la propiedad reportingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingPeriod(String value) {
        this.reportingPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad birthday.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Define el valor de la propiedad birthday.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Obtiene el valor de la propiedad birthState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthState() {
        return birthState;
    }

    /**
     * Define el valor de la propiedad birthState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthState(String value) {
        this.birthState = value;
    }

    /**
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Obtiene el valor de la propiedad availabilitySchedule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilitySchedule() {
        return availabilitySchedule;
    }

    /**
     * Define el valor de la propiedad availabilitySchedule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilitySchedule(String value) {
        this.availabilitySchedule = value;
    }

    /**
     * Obtiene el valor de la propiedad contactName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Define el valor de la propiedad contactName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurp() {
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
    public void setCurp(String value) {
        this.curp = value;
    }

    /**
     * Obtiene el valor de la propiedad vipFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVipFlag() {
        return vipFlag;
    }

    /**
     * Define el valor de la propiedad vipFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipFlag(String value) {
        this.vipFlag = value;
    }

}
