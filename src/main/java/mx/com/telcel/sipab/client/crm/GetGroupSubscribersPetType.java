
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetGroupSubscribersPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetGroupSubscribersPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="custId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="memberSubsId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="historyFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="groupId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="pivotServiceNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="groupCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="groupName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="groupType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="pageInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}PageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetGroupSubscribersPetType", propOrder = {
    "custId",
    "memberSubsId",
    "historyFlag",
    "groupId",
    "pivotServiceNumber",
    "groupCode",
    "groupName",
    "groupType",
    "pageInfo"
})
public class GetGroupSubscribersPetType {

    protected BigDecimal custId;
    protected BigDecimal memberSubsId;
    protected String historyFlag;
    protected BigDecimal groupId;
    protected BigDecimal pivotServiceNumber;
    protected BigDecimal groupCode;
    protected String groupName;
    protected String groupType;
    @XmlElement(required = true)
    protected PageType pageInfo;

    /**
     * Obtiene el valor de la propiedad custId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustId() {
        return custId;
    }

    /**
     * Define el valor de la propiedad custId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustId(BigDecimal value) {
        this.custId = value;
    }

    /**
     * Obtiene el valor de la propiedad memberSubsId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMemberSubsId() {
        return memberSubsId;
    }

    /**
     * Define el valor de la propiedad memberSubsId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMemberSubsId(BigDecimal value) {
        this.memberSubsId = value;
    }

    /**
     * Obtiene el valor de la propiedad historyFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryFlag() {
        return historyFlag;
    }

    /**
     * Define el valor de la propiedad historyFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryFlag(String value) {
        this.historyFlag = value;
    }

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
     * Obtiene el valor de la propiedad pivotServiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPivotServiceNumber() {
        return pivotServiceNumber;
    }

    /**
     * Define el valor de la propiedad pivotServiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPivotServiceNumber(BigDecimal value) {
        this.pivotServiceNumber = value;
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
     * Obtiene el valor de la propiedad pageInfo.
     * 
     * @return
     *     possible object is
     *     {@link PageType }
     *     
     */
    public PageType getPageInfo() {
        return pageInfo;
    }

    /**
     * Define el valor de la propiedad pageInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PageType }
     *     
     */
    public void setPageInfo(PageType value) {
        this.pageInfo = value;
    }

}
