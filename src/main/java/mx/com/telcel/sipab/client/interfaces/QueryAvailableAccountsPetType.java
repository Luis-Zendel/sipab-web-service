
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryAvailableAccountsPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryAvailableAccountsPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="custId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CustIdType"/&gt;
 *         &lt;element name="acctCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctCodeType" minOccurs="0"/&gt;
 *         &lt;element name="acctName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctNameType" minOccurs="0"/&gt;
 *         &lt;element name="project" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ProjectType" minOccurs="0"/&gt;
 *         &lt;element name="acctSegment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctSegmentType" minOccurs="0"/&gt;
 *         &lt;element name="acctMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctModeType" minOccurs="0"/&gt;
 *         &lt;element name="regionId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RegionIdType" minOccurs="0"/&gt;
 *         &lt;element name="billCycleTypeIdList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BillCycleTypeIdListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="collectionProcessFlagList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CollectionProcessFlagListType" minOccurs="0"/&gt;
 *         &lt;element name="pageInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAvailableAccountsPetType", propOrder = {
    "custId",
    "acctCode",
    "acctName",
    "project",
    "acctSegment",
    "acctMode",
    "regionId",
    "billCycleTypeIdList",
    "collectionProcessFlagList",
    "pageInfo"
})
public class QueryAvailableAccountsPetType {

    @XmlElement(required = true)
    protected BigDecimal custId;
    protected String acctCode;
    protected String acctName;
    protected String project;
    protected String acctSegment;
    protected String acctMode;
    protected BigDecimal regionId;
    protected List<BigDecimal> billCycleTypeIdList;
    protected String collectionProcessFlagList;
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
     * Obtiene el valor de la propiedad acctCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Define el valor de la propiedad acctCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCode(String value) {
        this.acctCode = value;
    }

    /**
     * Obtiene el valor de la propiedad acctName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Define el valor de la propiedad acctName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * Obtiene el valor de la propiedad project.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject() {
        return project;
    }

    /**
     * Define el valor de la propiedad project.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject(String value) {
        this.project = value;
    }

    /**
     * Obtiene el valor de la propiedad acctSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSegment() {
        return acctSegment;
    }

    /**
     * Define el valor de la propiedad acctSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSegment(String value) {
        this.acctSegment = value;
    }

    /**
     * Obtiene el valor de la propiedad acctMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctMode() {
        return acctMode;
    }

    /**
     * Define el valor de la propiedad acctMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctMode(String value) {
        this.acctMode = value;
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
     * Gets the value of the billCycleTypeIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the billCycleTypeIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillCycleTypeIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getBillCycleTypeIdList() {
        if (billCycleTypeIdList == null) {
            billCycleTypeIdList = new ArrayList<BigDecimal>();
        }
        return this.billCycleTypeIdList;
    }

    /**
     * Obtiene el valor de la propiedad collectionProcessFlagList.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionProcessFlagList() {
        return collectionProcessFlagList;
    }

    /**
     * Define el valor de la propiedad collectionProcessFlagList.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionProcessFlagList(String value) {
        this.collectionProcessFlagList = value;
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
