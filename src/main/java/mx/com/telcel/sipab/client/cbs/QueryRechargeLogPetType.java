
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryRechargeLogPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryRechargeLogPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="custAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CustAccessCodeType" minOccurs="0"/&gt;
 *         &lt;element name="queryObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryObjQDLType"/&gt;
 *         &lt;element name="rechargeChannelIDs" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RechargeChannelIDsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="beginRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="fetchRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="startTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *         &lt;element name="endTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *         &lt;element name="extTransID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRechargeLogPetType", propOrder = {
    "custAccessCode",
    "queryObj",
    "rechargeChannelIDs",
    "totalRowNum",
    "beginRowNum",
    "fetchRowNum",
    "startTime",
    "endTime",
    "extTransID"
})
public class QueryRechargeLogPetType {

    protected CustAccessCodeType custAccessCode;
    @XmlElement(required = true)
    protected QueryObjQDLType queryObj;
    protected List<RechargeChannelIDsType> rechargeChannelIDs;
    protected long totalRowNum;
    protected long beginRowNum;
    protected long fetchRowNum;
    @XmlElement(required = true)
    protected String startTime;
    @XmlElement(required = true)
    protected String endTime;
    protected String extTransID;

    /**
     * Obtiene el valor de la propiedad custAccessCode.
     * 
     * @return
     *     possible object is
     *     {@link CustAccessCodeType }
     *     
     */
    public CustAccessCodeType getCustAccessCode() {
        return custAccessCode;
    }

    /**
     * Define el valor de la propiedad custAccessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccessCodeType }
     *     
     */
    public void setCustAccessCode(CustAccessCodeType value) {
        this.custAccessCode = value;
    }

    /**
     * Obtiene el valor de la propiedad queryObj.
     * 
     * @return
     *     possible object is
     *     {@link QueryObjQDLType }
     *     
     */
    public QueryObjQDLType getQueryObj() {
        return queryObj;
    }

    /**
     * Define el valor de la propiedad queryObj.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjQDLType }
     *     
     */
    public void setQueryObj(QueryObjQDLType value) {
        this.queryObj = value;
    }

    /**
     * Gets the value of the rechargeChannelIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rechargeChannelIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRechargeChannelIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RechargeChannelIDsType }
     * 
     * 
     */
    public List<RechargeChannelIDsType> getRechargeChannelIDs() {
        if (rechargeChannelIDs == null) {
            rechargeChannelIDs = new ArrayList<RechargeChannelIDsType>();
        }
        return this.rechargeChannelIDs;
    }

    /**
     * Obtiene el valor de la propiedad totalRowNum.
     * 
     */
    public long getTotalRowNum() {
        return totalRowNum;
    }

    /**
     * Define el valor de la propiedad totalRowNum.
     * 
     */
    public void setTotalRowNum(long value) {
        this.totalRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad beginRowNum.
     * 
     */
    public long getBeginRowNum() {
        return beginRowNum;
    }

    /**
     * Define el valor de la propiedad beginRowNum.
     * 
     */
    public void setBeginRowNum(long value) {
        this.beginRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad fetchRowNum.
     * 
     */
    public long getFetchRowNum() {
        return fetchRowNum;
    }

    /**
     * Define el valor de la propiedad fetchRowNum.
     * 
     */
    public void setFetchRowNum(long value) {
        this.fetchRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad startTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Define el valor de la propiedad startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Obtiene el valor de la propiedad endTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Define el valor de la propiedad endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Obtiene el valor de la propiedad extTransID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTransID() {
        return extTransID;
    }

    /**
     * Define el valor de la propiedad extTransID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTransID(String value) {
        this.extTransID = value;
    }

}
