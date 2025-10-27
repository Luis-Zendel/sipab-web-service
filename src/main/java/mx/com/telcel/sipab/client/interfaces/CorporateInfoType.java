
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
 * <p>Clase Java para CorporateInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CorporateInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="corporateName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CorporateNameType"/&gt;
 *         &lt;element name="corporateShortName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CorporateShortNameType" minOccurs="0"/&gt;
 *         &lt;element name="nationalityType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}NationalityType"/&gt;
 *         &lt;element name="nationalityCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}NationalityCodeType"/&gt;
 *         &lt;element name="startOperationsDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}StartOperationsDateType" minOccurs="0"/&gt;
 *         &lt;element name="rfc" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RfcITType"/&gt;
 *         &lt;element name="idCIF" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IdCIFType" minOccurs="0"/&gt;
 *         &lt;element name="sporadicSAPId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SporadicSAPIdType" minOccurs="0"/&gt;
 *         &lt;element name="holdingGroupName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}HoldingGroupNameType" minOccurs="0"/&gt;
 *         &lt;element name="salesSegment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SalesSegmentType"/&gt;
 *         &lt;element name="industryType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IndustryType" minOccurs="0"/&gt;
 *         &lt;element name="industrySubType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IndustrySubType" minOccurs="0"/&gt;
 *         &lt;element name="mobileNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}MobileNumberType"/&gt;
 *         &lt;element name="ext" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ExtType" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}EmailType"/&gt;
 *         &lt;element name="website" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}WebsiteType" minOccurs="0"/&gt;
 *         &lt;element name="writtenLang" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}WrittenLangType"/&gt;
 *         &lt;element name="remarks" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RemarksType" minOccurs="0"/&gt;
 *         &lt;element name="regimenCapital" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RegimenCapitalType" minOccurs="0"/&gt;
 *         &lt;element name="regimenFiscal" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RegimenFiscalType"/&gt;
 *         &lt;element name="cFDIServicio" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CFDIServicioType"/&gt;
 *         &lt;element name="cFDIEquipo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CFDIEquipoType"/&gt;
 *         &lt;element name="rfcStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RfcStatusType"/&gt;
 *         &lt;element name="idNISI" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IdNISIType" minOccurs="0"/&gt;
 *         &lt;element name="rfcBiddingFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RfcBiddingFlagType" minOccurs="0"/&gt;
 *         &lt;element name="rfpExpirationDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RfpExpirationDateType" minOccurs="0"/&gt;
 *         &lt;element name="emailForAppNotification" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="corporateProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CorporatePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateInfoType", propOrder = {
    "corporateName",
    "corporateShortName",
    "nationalityType",
    "nationalityCode",
    "startOperationsDate",
    "rfc",
    "idCIF",
    "sporadicSAPId",
    "holdingGroupName",
    "salesSegment",
    "industryType",
    "industrySubType",
    "mobileNumber",
    "ext",
    "email",
    "website",
    "writtenLang",
    "remarks",
    "regimenCapital",
    "regimenFiscal",
    "cfdiServicio",
    "cfdiEquipo",
    "rfcStatus",
    "idNISI",
    "rfcBiddingFlag",
    "rfpExpirationDate",
    "emailForAppNotification",
    "corporateProperty"
})
public class CorporateInfoType {

    @XmlElement(required = true)
    protected String corporateName;
    protected String corporateShortName;
    @XmlElement(required = true)
    protected String nationalityType;
    @XmlElement(required = true)
    protected String nationalityCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startOperationsDate;
    @XmlElement(required = true)
    protected String rfc;
    protected String idCIF;
    protected String sporadicSAPId;
    protected String holdingGroupName;
    @XmlElement(required = true)
    protected String salesSegment;
    protected String industryType;
    protected String industrySubType;
    @XmlElement(required = true)
    protected String mobileNumber;
    protected String ext;
    @XmlElement(required = true)
    protected String email;
    protected String website;
    @XmlElement(required = true)
    protected String writtenLang;
    protected String remarks;
    protected String regimenCapital;
    @XmlElement(required = true)
    protected String regimenFiscal;
    @XmlElement(name = "cFDIServicio", required = true)
    protected String cfdiServicio;
    @XmlElement(name = "cFDIEquipo", required = true)
    protected String cfdiEquipo;
    @XmlElement(required = true)
    protected String rfcStatus;
    protected String idNISI;
    protected String rfcBiddingFlag;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rfpExpirationDate;
    protected String emailForAppNotification;
    protected List<CorporatePropertyType> corporateProperty;

    /**
     * Obtiene el valor de la propiedad corporateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * Define el valor de la propiedad corporateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateName(String value) {
        this.corporateName = value;
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
     * Obtiene el valor de la propiedad startOperationsDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartOperationsDate() {
        return startOperationsDate;
    }

    /**
     * Define el valor de la propiedad startOperationsDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartOperationsDate(XMLGregorianCalendar value) {
        this.startOperationsDate = value;
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
     * Obtiene el valor de la propiedad idCIF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCIF() {
        return idCIF;
    }

    /**
     * Define el valor de la propiedad idCIF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCIF(String value) {
        this.idCIF = value;
    }

    /**
     * Obtiene el valor de la propiedad sporadicSAPId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSporadicSAPId() {
        return sporadicSAPId;
    }

    /**
     * Define el valor de la propiedad sporadicSAPId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSporadicSAPId(String value) {
        this.sporadicSAPId = value;
    }

    /**
     * Obtiene el valor de la propiedad holdingGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldingGroupName() {
        return holdingGroupName;
    }

    /**
     * Define el valor de la propiedad holdingGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldingGroupName(String value) {
        this.holdingGroupName = value;
    }

    /**
     * Obtiene el valor de la propiedad salesSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesSegment() {
        return salesSegment;
    }

    /**
     * Define el valor de la propiedad salesSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesSegment(String value) {
        this.salesSegment = value;
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
     * Obtiene el valor de la propiedad mobileNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Define el valor de la propiedad mobileNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad ext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt() {
        return ext;
    }

    /**
     * Define el valor de la propiedad ext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt(String value) {
        this.ext = value;
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
     * Obtiene el valor de la propiedad website.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Define el valor de la propiedad website.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
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
     * Obtiene el valor de la propiedad remarks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Define el valor de la propiedad remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
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
     * Obtiene el valor de la propiedad rfcBiddingFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcBiddingFlag() {
        return rfcBiddingFlag;
    }

    /**
     * Define el valor de la propiedad rfcBiddingFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcBiddingFlag(String value) {
        this.rfcBiddingFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad rfpExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRfpExpirationDate() {
        return rfpExpirationDate;
    }

    /**
     * Define el valor de la propiedad rfpExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRfpExpirationDate(XMLGregorianCalendar value) {
        this.rfpExpirationDate = value;
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
     * Gets the value of the corporateProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the corporateProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporatePropertyType }
     * 
     * 
     */
    public List<CorporatePropertyType> getCorporateProperty() {
        if (corporateProperty == null) {
            corporateProperty = new ArrayList<CorporatePropertyType>();
        }
        return this.corporateProperty;
    }

}
