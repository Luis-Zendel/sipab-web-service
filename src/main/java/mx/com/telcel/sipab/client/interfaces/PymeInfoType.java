
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PymeInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PymeInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}FirstNameType"/&gt;
 *         &lt;element name="middleName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}MiddleNameType" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}LastNameType"/&gt;
 *         &lt;element name="nationality" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}NationalityType"/&gt;
 *         &lt;element name="nationalityType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type"/&gt;
 *         &lt;element name="nationalityCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}NationalityCodeType"/&gt;
 *         &lt;element name="gender" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}GenderITType"/&gt;
 *         &lt;element name="birthday" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BirthdayType"/&gt;
 *         &lt;element name="birthState" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BirthStateType"/&gt;
 *         &lt;element name="email" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}EmailType"/&gt;
 *         &lt;element name="marriedStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}MarriedStatusType" minOccurs="0"/&gt;
 *         &lt;element name="mobilePhone" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}MobilePhoneType" minOccurs="0"/&gt;
 *         &lt;element name="officePhone" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfficePhoneType"/&gt;
 *         &lt;element name="homePhone" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}HomePhoneType"/&gt;
 *         &lt;element name="occupation" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OccupationType" minOccurs="0"/&gt;
 *         &lt;element name="writtenLang" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}WrittenLangType"/&gt;
 *         &lt;element name="phoneticLang" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PhoneticLangType" minOccurs="0"/&gt;
 *         &lt;element name="industryType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IndustryType"/&gt;
 *         &lt;element name="industrySubType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IndustrySubType"/&gt;
 *         &lt;element name="regimenCapital" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RegimenCapitalType" minOccurs="0"/&gt;
 *         &lt;element name="regimenFiscal" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RegimenFiscalType"/&gt;
 *         &lt;element name="cFDIServicio" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CFDIServicioType"/&gt;
 *         &lt;element name="cFDIEquipo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CFDIEquipoType"/&gt;
 *         &lt;element name="rfc" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RfcITType"/&gt;
 *         &lt;element name="rfcStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RfcStatusType"/&gt;
 *         &lt;element name="curp" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CURPType"/&gt;
 *         &lt;element name="extension" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ExtensionITType" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CompanyNameType" minOccurs="0"/&gt;
 *         &lt;element name="corporateShortName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="facebookId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}FacebookIdType" minOccurs="0"/&gt;
 *         &lt;element name="instagramId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InstagramIdType" minOccurs="0"/&gt;
 *         &lt;element name="twitterId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}TwitterIdType" minOccurs="0"/&gt;
 *         &lt;element name="social4" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Social4Type" minOccurs="0"/&gt;
 *         &lt;element name="idNISI" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IdNISIType" minOccurs="0"/&gt;
 *         &lt;element name="emailForAppNotification" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="individualProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IndividualPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PymeInfoType", propOrder = {
    "firstName",
    "middleName",
    "lastName",
    "nationality",
    "nationalityType",
    "nationalityCode",
    "gender",
    "birthday",
    "birthState",
    "email",
    "marriedStatus",
    "mobilePhone",
    "officePhone",
    "homePhone",
    "occupation",
    "writtenLang",
    "phoneticLang",
    "industryType",
    "industrySubType",
    "regimenCapital",
    "regimenFiscal",
    "cfdiServicio",
    "cfdiEquipo",
    "rfc",
    "rfcStatus",
    "curp",
    "extension",
    "companyName",
    "corporateShortName",
    "facebookId",
    "instagramId",
    "twitterId",
    "social4",
    "idNISI",
    "emailForAppNotification",
    "individualProperty"
})
public class PymeInfoType {

    @XmlElement(required = true)
    protected String firstName;
    protected String middleName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String nationality;
    @XmlElement(required = true)
    protected String nationalityType;
    @XmlElement(required = true)
    protected String nationalityCode;
    @XmlElement(required = true)
    protected String gender;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(required = true)
    protected String birthState;
    @XmlElement(required = true)
    protected String email;
    protected String marriedStatus;
    protected String mobilePhone;
    @XmlElement(required = true)
    protected String officePhone;
    @XmlElement(required = true)
    protected String homePhone;
    protected String occupation;
    @XmlElement(required = true)
    protected String writtenLang;
    protected String phoneticLang;
    @XmlElement(required = true)
    protected String industryType;
    @XmlElement(required = true)
    protected String industrySubType;
    protected String regimenCapital;
    @XmlElement(required = true)
    protected String regimenFiscal;
    @XmlElement(name = "cFDIServicio", required = true)
    protected String cfdiServicio;
    @XmlElement(name = "cFDIEquipo", required = true)
    protected String cfdiEquipo;
    @XmlElement(required = true)
    protected String rfc;
    @XmlElement(required = true)
    protected String rfcStatus;
    @XmlElement(required = true)
    protected String curp;
    protected String extension;
    protected String companyName;
    protected String corporateShortName;
    protected String facebookId;
    protected String instagramId;
    protected String twitterId;
    protected String social4;
    protected String idNISI;
    protected String emailForAppNotification;
    protected List<IndividualPropertyType> individualProperty;

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
     * Obtiene el valor de la propiedad nationality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Define el valor de la propiedad nationality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalityType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityType() {
        return nationalityType;
    }

    /**
     * Define el valor de la propiedad nationalityType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityType(String value) {
        this.nationalityType = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Define el valor de la propiedad nationalityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityCode(String value) {
        this.nationalityCode = value;
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
     * Obtiene el valor de la propiedad marriedStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriedStatus() {
        return marriedStatus;
    }

    /**
     * Define el valor de la propiedad marriedStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriedStatus(String value) {
        this.marriedStatus = value;
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
     * Obtiene el valor de la propiedad occupation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Define el valor de la propiedad occupation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Obtiene el valor de la propiedad writtenLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrittenLang() {
        return writtenLang;
    }

    /**
     * Define el valor de la propiedad writtenLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrittenLang(String value) {
        this.writtenLang = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneticLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneticLang() {
        return phoneticLang;
    }

    /**
     * Define el valor de la propiedad phoneticLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneticLang(String value) {
        this.phoneticLang = value;
    }

    /**
     * Obtiene el valor de la propiedad industryType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryType() {
        return industryType;
    }

    /**
     * Define el valor de la propiedad industryType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryType(String value) {
        this.industryType = value;
    }

    /**
     * Obtiene el valor de la propiedad industrySubType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustrySubType() {
        return industrySubType;
    }

    /**
     * Define el valor de la propiedad industrySubType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustrySubType(String value) {
        this.industrySubType = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenCapital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenCapital() {
        return regimenCapital;
    }

    /**
     * Define el valor de la propiedad regimenCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenCapital(String value) {
        this.regimenCapital = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    /**
     * Define el valor de la propiedad regimenFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscal(String value) {
        this.regimenFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFDIServicio() {
        return cfdiServicio;
    }

    /**
     * Define el valor de la propiedad cfdiServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFDIServicio(String value) {
        this.cfdiServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiEquipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFDIEquipo() {
        return cfdiEquipo;
    }

    /**
     * Define el valor de la propiedad cfdiEquipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFDIEquipo(String value) {
        this.cfdiEquipo = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcStatus() {
        return rfcStatus;
    }

    /**
     * Define el valor de la propiedad rfcStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcStatus(String value) {
        this.rfcStatus = value;
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
     * Obtiene el valor de la propiedad extension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Define el valor de la propiedad extension.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Obtiene el valor de la propiedad companyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Define el valor de la propiedad companyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Obtiene el valor de la propiedad corporateShortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateShortName() {
        return corporateShortName;
    }

    /**
     * Define el valor de la propiedad corporateShortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateShortName(String value) {
        this.corporateShortName = value;
    }

    /**
     * Obtiene el valor de la propiedad facebookId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebookId() {
        return facebookId;
    }

    /**
     * Define el valor de la propiedad facebookId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebookId(String value) {
        this.facebookId = value;
    }

    /**
     * Obtiene el valor de la propiedad instagramId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstagramId() {
        return instagramId;
    }

    /**
     * Define el valor de la propiedad instagramId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstagramId(String value) {
        this.instagramId = value;
    }

    /**
     * Obtiene el valor de la propiedad twitterId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwitterId() {
        return twitterId;
    }

    /**
     * Define el valor de la propiedad twitterId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwitterId(String value) {
        this.twitterId = value;
    }

    /**
     * Obtiene el valor de la propiedad social4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocial4() {
        return social4;
    }

    /**
     * Define el valor de la propiedad social4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocial4(String value) {
        this.social4 = value;
    }

    /**
     * Obtiene el valor de la propiedad idNISI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNISI() {
        return idNISI;
    }

    /**
     * Define el valor de la propiedad idNISI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNISI(String value) {
        this.idNISI = value;
    }

    /**
     * Obtiene el valor de la propiedad emailForAppNotification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailForAppNotification() {
        return emailForAppNotification;
    }

    /**
     * Define el valor de la propiedad emailForAppNotification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailForAppNotification(String value) {
        this.emailForAppNotification = value;
    }

    /**
     * Gets the value of the individualProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the individualProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPropertyType }
     * 
     * 
     */
    public List<IndividualPropertyType> getIndividualProperty() {
        if (individualProperty == null) {
            individualProperty = new ArrayList<IndividualPropertyType>();
        }
        return this.individualProperty;
    }

}
