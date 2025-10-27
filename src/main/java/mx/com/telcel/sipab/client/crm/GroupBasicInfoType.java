
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GroupBasicInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GroupBasicInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="groupCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="groupName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica256Type"/&gt;
 *         &lt;element name="subsType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyGroupId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyCustId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="serviceNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal10c0Type" minOccurs="0"/&gt;
 *         &lt;element name="parentGroupId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="maxNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal10c0Type" minOccurs="0"/&gt;
 *         &lt;element name="limitValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="groupLimitType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="isSupportShortNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica3Type" minOccurs="0"/&gt;
 *         &lt;element name="usingCustRoleId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="subsId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica16Type" minOccurs="0"/&gt;
 *         &lt;element name="statusDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="statusDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica16Type" minOccurs="0"/&gt;
 *         &lt;element name="primaryOfferingName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica24Type" minOccurs="0"/&gt;
 *         &lt;element name="isOpenShortnum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica3Type" minOccurs="0"/&gt;
 *         &lt;element name="acctId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="brand" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="cugType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica3Type" minOccurs="0"/&gt;
 *         &lt;element name="createTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="extGroupId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="groupType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="memberPayMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="offeringId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="parentGroupRelType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica3Type" minOccurs="0"/&gt;
 *         &lt;element name="prodCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="prodId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="prodInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="employeeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica24Type" minOccurs="0"/&gt;
 *         &lt;element name="createDeptId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="createProleId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="createProleType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="modifyDeptId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="modifyProleId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="modifyProleType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="modifyTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="ownerOrgId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="ownerPartyRoleId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="ownerPartyRoleType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="regionCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="regionId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="salesChannelId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="salesChannelType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="salesId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="vpmnCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="additionalInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}SimplePropertyCRMType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupBasicInfoType", propOrder = {
    "groupId",
    "groupCode",
    "groupName",
    "subsType",
    "thirdPartyGroupId",
    "thirdPartyCustId",
    "serviceNumber",
    "parentGroupId",
    "maxNum",
    "limitValue",
    "groupLimitType",
    "isSupportShortNo",
    "usingCustRoleId",
    "subsId",
    "status",
    "statusDate",
    "statusDetail",
    "primaryOfferingName",
    "isOpenShortnum",
    "acctId",
    "brand",
    "cugType",
    "createTime",
    "effDate",
    "expDate",
    "extGroupId",
    "groupType",
    "memberPayMode",
    "offeringId",
    "parentGroupRelType",
    "prodCode",
    "prodId",
    "prodInstId",
    "employeeName",
    "createDeptId",
    "createProleId",
    "createProleType",
    "modifyDeptId",
    "modifyProleId",
    "modifyProleType",
    "modifyTime",
    "ownerOrgId",
    "ownerPartyRoleId",
    "ownerPartyRoleType",
    "regionCode",
    "regionId",
    "salesChannelId",
    "salesChannelType",
    "salesId",
    "vpmnCode",
    "additionalInfo"
})
public class GroupBasicInfoType {

    protected BigDecimal groupId;
    protected BigDecimal groupCode;
    @XmlElement(required = true)
    protected String groupName;
    protected String subsType;
    protected String thirdPartyGroupId;
    protected String thirdPartyCustId;
    protected BigDecimal serviceNumber;
    protected BigDecimal parentGroupId;
    protected BigDecimal maxNum;
    protected String limitValue;
    protected String groupLimitType;
    protected String isSupportShortNo;
    protected BigDecimal usingCustRoleId;
    protected BigDecimal subsId;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    protected String statusDetail;
    protected String primaryOfferingName;
    protected String isOpenShortnum;
    protected BigDecimal acctId;
    protected BigDecimal brand;
    protected String cugType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    protected String extGroupId;
    protected String groupType;
    protected String memberPayMode;
    protected BigDecimal offeringId;
    protected String parentGroupRelType;
    protected String prodCode;
    protected BigDecimal prodId;
    protected BigDecimal prodInstId;
    protected String employeeName;
    protected BigDecimal createDeptId;
    protected BigDecimal createProleId;
    protected String createProleType;
    protected BigDecimal modifyDeptId;
    protected BigDecimal modifyProleId;
    protected String modifyProleType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;
    protected String ownerOrgId;
    protected BigDecimal ownerPartyRoleId;
    protected String ownerPartyRoleType;
    protected String regionCode;
    protected BigDecimal regionId;
    protected String salesChannelId;
    protected String salesChannelType;
    protected BigDecimal salesId;
    protected BigDecimal vpmnCode;
    protected SimplePropertyCRMType additionalInfo;

    /**
     * Obtiene el valor de la propiedad groupId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGroupId() {
        return groupId;
    }

    /**
     * Define el valor de la propiedad groupId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGroupId(BigDecimal value) {
        this.groupId = value;
    }

    /**
     * Obtiene el valor de la propiedad groupCode.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGroupCode() {
        return groupCode;
    }

    /**
     * Define el valor de la propiedad groupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGroupCode(BigDecimal value) {
        this.groupCode = value;
    }

    /**
     * Obtiene el valor de la propiedad groupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Define el valor de la propiedad groupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Obtiene el valor de la propiedad subsType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsType() {
        return subsType;
    }

    /**
     * Define el valor de la propiedad subsType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsType(String value) {
        this.subsType = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdPartyGroupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyGroupId() {
        return thirdPartyGroupId;
    }

    /**
     * Define el valor de la propiedad thirdPartyGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyGroupId(String value) {
        this.thirdPartyGroupId = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdPartyCustId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyCustId() {
        return thirdPartyCustId;
    }

    /**
     * Define el valor de la propiedad thirdPartyCustId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyCustId(String value) {
        this.thirdPartyCustId = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Define el valor de la propiedad serviceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceNumber(BigDecimal value) {
        this.serviceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad parentGroupId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParentGroupId() {
        return parentGroupId;
    }

    /**
     * Define el valor de la propiedad parentGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParentGroupId(BigDecimal value) {
        this.parentGroupId = value;
    }

    /**
     * Obtiene el valor de la propiedad maxNum.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNum() {
        return maxNum;
    }

    /**
     * Define el valor de la propiedad maxNum.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxNum(BigDecimal value) {
        this.maxNum = value;
    }

    /**
     * Obtiene el valor de la propiedad limitValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitValue() {
        return limitValue;
    }

    /**
     * Define el valor de la propiedad limitValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitValue(String value) {
        this.limitValue = value;
    }

    /**
     * Obtiene el valor de la propiedad groupLimitType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLimitType() {
        return groupLimitType;
    }

    /**
     * Define el valor de la propiedad groupLimitType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLimitType(String value) {
        this.groupLimitType = value;
    }

    /**
     * Obtiene el valor de la propiedad isSupportShortNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSupportShortNo() {
        return isSupportShortNo;
    }

    /**
     * Define el valor de la propiedad isSupportShortNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSupportShortNo(String value) {
        this.isSupportShortNo = value;
    }

    /**
     * Obtiene el valor de la propiedad usingCustRoleId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsingCustRoleId() {
        return usingCustRoleId;
    }

    /**
     * Define el valor de la propiedad usingCustRoleId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsingCustRoleId(BigDecimal value) {
        this.usingCustRoleId = value;
    }

    /**
     * Obtiene el valor de la propiedad subsId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsId() {
        return subsId;
    }

    /**
     * Define el valor de la propiedad subsId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsId(BigDecimal value) {
        this.subsId = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Define el valor de la propiedad statusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    /**
     * Define el valor de la propiedad statusDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDetail(String value) {
        this.statusDetail = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryOfferingName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOfferingName() {
        return primaryOfferingName;
    }

    /**
     * Define el valor de la propiedad primaryOfferingName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOfferingName(String value) {
        this.primaryOfferingName = value;
    }

    /**
     * Obtiene el valor de la propiedad isOpenShortnum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOpenShortnum() {
        return isOpenShortnum;
    }

    /**
     * Define el valor de la propiedad isOpenShortnum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOpenShortnum(String value) {
        this.isOpenShortnum = value;
    }

    /**
     * Obtiene el valor de la propiedad acctId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctId() {
        return acctId;
    }

    /**
     * Define el valor de la propiedad acctId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcctId(BigDecimal value) {
        this.acctId = value;
    }

    /**
     * Obtiene el valor de la propiedad brand.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBrand() {
        return brand;
    }

    /**
     * Define el valor de la propiedad brand.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBrand(BigDecimal value) {
        this.brand = value;
    }

    /**
     * Obtiene el valor de la propiedad cugType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCugType() {
        return cugType;
    }

    /**
     * Define el valor de la propiedad cugType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCugType(String value) {
        this.cugType = value;
    }

    /**
     * Obtiene el valor de la propiedad createTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Define el valor de la propiedad createTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Obtiene el valor de la propiedad effDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDate() {
        return effDate;
    }

    /**
     * Define el valor de la propiedad effDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDate(XMLGregorianCalendar value) {
        this.effDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Define el valor de la propiedad expDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

    /**
     * Obtiene el valor de la propiedad extGroupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtGroupId() {
        return extGroupId;
    }

    /**
     * Define el valor de la propiedad extGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtGroupId(String value) {
        this.extGroupId = value;
    }

    /**
     * Obtiene el valor de la propiedad groupType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Define el valor de la propiedad groupType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * Obtiene el valor de la propiedad memberPayMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberPayMode() {
        return memberPayMode;
    }

    /**
     * Define el valor de la propiedad memberPayMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberPayMode(String value) {
        this.memberPayMode = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferingId() {
        return offeringId;
    }

    /**
     * Define el valor de la propiedad offeringId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferingId(BigDecimal value) {
        this.offeringId = value;
    }

    /**
     * Obtiene el valor de la propiedad parentGroupRelType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGroupRelType() {
        return parentGroupRelType;
    }

    /**
     * Define el valor de la propiedad parentGroupRelType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGroupRelType(String value) {
        this.parentGroupRelType = value;
    }

    /**
     * Obtiene el valor de la propiedad prodCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdCode() {
        return prodCode;
    }

    /**
     * Define el valor de la propiedad prodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdCode(String value) {
        this.prodCode = value;
    }

    /**
     * Obtiene el valor de la propiedad prodId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProdId() {
        return prodId;
    }

    /**
     * Define el valor de la propiedad prodId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProdId(BigDecimal value) {
        this.prodId = value;
    }

    /**
     * Obtiene el valor de la propiedad prodInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProdInstId() {
        return prodInstId;
    }

    /**
     * Define el valor de la propiedad prodInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProdInstId(BigDecimal value) {
        this.prodInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Define el valor de la propiedad employeeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeName(String value) {
        this.employeeName = value;
    }

    /**
     * Obtiene el valor de la propiedad createDeptId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreateDeptId() {
        return createDeptId;
    }

    /**
     * Define el valor de la propiedad createDeptId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreateDeptId(BigDecimal value) {
        this.createDeptId = value;
    }

    /**
     * Obtiene el valor de la propiedad createProleId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreateProleId() {
        return createProleId;
    }

    /**
     * Define el valor de la propiedad createProleId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreateProleId(BigDecimal value) {
        this.createProleId = value;
    }

    /**
     * Obtiene el valor de la propiedad createProleType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateProleType() {
        return createProleType;
    }

    /**
     * Define el valor de la propiedad createProleType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateProleType(String value) {
        this.createProleType = value;
    }

    /**
     * Obtiene el valor de la propiedad modifyDeptId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getModifyDeptId() {
        return modifyDeptId;
    }

    /**
     * Define el valor de la propiedad modifyDeptId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setModifyDeptId(BigDecimal value) {
        this.modifyDeptId = value;
    }

    /**
     * Obtiene el valor de la propiedad modifyProleId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getModifyProleId() {
        return modifyProleId;
    }

    /**
     * Define el valor de la propiedad modifyProleId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setModifyProleId(BigDecimal value) {
        this.modifyProleId = value;
    }

    /**
     * Obtiene el valor de la propiedad modifyProleType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyProleType() {
        return modifyProleType;
    }

    /**
     * Define el valor de la propiedad modifyProleType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyProleType(String value) {
        this.modifyProleType = value;
    }

    /**
     * Obtiene el valor de la propiedad modifyTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyTime() {
        return modifyTime;
    }

    /**
     * Define el valor de la propiedad modifyTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyTime(XMLGregorianCalendar value) {
        this.modifyTime = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerOrgId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerOrgId() {
        return ownerOrgId;
    }

    /**
     * Define el valor de la propiedad ownerOrgId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerOrgId(String value) {
        this.ownerOrgId = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerPartyRoleId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnerPartyRoleId() {
        return ownerPartyRoleId;
    }

    /**
     * Define el valor de la propiedad ownerPartyRoleId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnerPartyRoleId(BigDecimal value) {
        this.ownerPartyRoleId = value;
    }

    /**
     * Obtiene el valor de la propiedad ownerPartyRoleType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerPartyRoleType() {
        return ownerPartyRoleType;
    }

    /**
     * Define el valor de la propiedad ownerPartyRoleType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerPartyRoleType(String value) {
        this.ownerPartyRoleType = value;
    }

    /**
     * Obtiene el valor de la propiedad regionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Define el valor de la propiedad regionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad regionId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegionId() {
        return regionId;
    }

    /**
     * Define el valor de la propiedad regionId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegionId(BigDecimal value) {
        this.regionId = value;
    }

    /**
     * Obtiene el valor de la propiedad salesChannelId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelId() {
        return salesChannelId;
    }

    /**
     * Define el valor de la propiedad salesChannelId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelId(String value) {
        this.salesChannelId = value;
    }

    /**
     * Obtiene el valor de la propiedad salesChannelType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelType() {
        return salesChannelType;
    }

    /**
     * Define el valor de la propiedad salesChannelType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelType(String value) {
        this.salesChannelType = value;
    }

    /**
     * Obtiene el valor de la propiedad salesId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesId() {
        return salesId;
    }

    /**
     * Define el valor de la propiedad salesId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesId(BigDecimal value) {
        this.salesId = value;
    }

    /**
     * Obtiene el valor de la propiedad vpmnCode.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVpmnCode() {
        return vpmnCode;
    }

    /**
     * Define el valor de la propiedad vpmnCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVpmnCode(BigDecimal value) {
        this.vpmnCode = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalInfo.
     * 
     * @return
     *     possible object is
     *     {@link SimplePropertyCRMType }
     *     
     */
    public SimplePropertyCRMType getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Define el valor de la propiedad additionalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePropertyCRMType }
     *     
     */
    public void setAdditionalInfo(SimplePropertyCRMType value) {
        this.additionalInfo = value;
    }

}
