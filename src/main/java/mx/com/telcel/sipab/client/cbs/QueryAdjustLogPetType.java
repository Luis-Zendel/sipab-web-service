
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryAdjustLogPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryAdjustLogPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryObj3AccType"/&gt;
 *         &lt;element name="queryDetailInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryDetailInfoType" minOccurs="0"/&gt;
 *         &lt;element name="pendingPenaltyFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="extTransID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="totalRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="beginRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="fetchRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type" minOccurs="0"/&gt;
 *         &lt;element name="endTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAdjustLogPetType", propOrder = {
    "queryObj",
    "queryDetailInfo",
    "pendingPenaltyFlag",
    "extTransID",
    "totalRowNum",
    "beginRowNum",
    "fetchRowNum",
    "startTime",
    "endTime"
})
public class QueryAdjustLogPetType {

    @XmlElement(required = true)
    protected QueryObj3AccType queryObj;
    protected QueryDetailInfoType queryDetailInfo;
    protected String pendingPenaltyFlag;
    protected String extTransID;
    protected Integer totalRowNum;
    protected Integer beginRowNum;
    protected Integer fetchRowNum;
    protected String startTime;
    protected String endTime;

    /**
     * Obtiene el valor de la propiedad queryObj.
     * 
     * @return
     *     possible object is
     *     {@link QueryObj3AccType }
     *     
     */
    public QueryObj3AccType getQueryObj() {
        return queryObj;
    }

    /**
     * Define el valor de la propiedad queryObj.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObj3AccType }
     *     
     */
    public void setQueryObj(QueryObj3AccType value) {
        this.queryObj = value;
    }

    /**
     * Obtiene el valor de la propiedad queryDetailInfo.
     * 
     * @return
     *     possible object is
     *     {@link QueryDetailInfoType }
     *     
     */
    public QueryDetailInfoType getQueryDetailInfo() {
        return queryDetailInfo;
    }

    /**
     * Define el valor de la propiedad queryDetailInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryDetailInfoType }
     *     
     */
    public void setQueryDetailInfo(QueryDetailInfoType value) {
        this.queryDetailInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad pendingPenaltyFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingPenaltyFlag() {
        return pendingPenaltyFlag;
    }

    /**
     * Define el valor de la propiedad pendingPenaltyFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingPenaltyFlag(String value) {
        this.pendingPenaltyFlag = value;
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

    /**
     * Obtiene el valor de la propiedad totalRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRowNum() {
        return totalRowNum;
    }

    /**
     * Define el valor de la propiedad totalRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRowNum(Integer value) {
        this.totalRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad beginRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBeginRowNum() {
        return beginRowNum;
    }

    /**
     * Define el valor de la propiedad beginRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBeginRowNum(Integer value) {
        this.beginRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad fetchRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFetchRowNum() {
        return fetchRowNum;
    }

    /**
     * Define el valor de la propiedad fetchRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFetchRowNum(Integer value) {
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

}
