
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryCustomerArrearsPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryCustomerArrearsPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryObjArrType"/&gt;
 *         &lt;element name="queryResultMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="totalRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="beginRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="fetchRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCustomerArrearsPetType", propOrder = {
    "queryObj",
    "queryResultMode",
    "totalRowNum",
    "beginRowNum",
    "fetchRowNum"
})
public class QueryCustomerArrearsPetType {

    @XmlElement(required = true)
    protected QueryObjArrType queryObj;
    @XmlElement(required = true)
    protected String queryResultMode;
    protected Long totalRowNum;
    protected Long beginRowNum;
    protected Long fetchRowNum;

    /**
     * Obtiene el valor de la propiedad queryObj.
     * 
     * @return
     *     possible object is
     *     {@link QueryObjArrType }
     *     
     */
    public QueryObjArrType getQueryObj() {
        return queryObj;
    }

    /**
     * Define el valor de la propiedad queryObj.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObjArrType }
     *     
     */
    public void setQueryObj(QueryObjArrType value) {
        this.queryObj = value;
    }

    /**
     * Obtiene el valor de la propiedad queryResultMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryResultMode() {
        return queryResultMode;
    }

    /**
     * Define el valor de la propiedad queryResultMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryResultMode(String value) {
        this.queryResultMode = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRowNum() {
        return totalRowNum;
    }

    /**
     * Define el valor de la propiedad totalRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRowNum(Long value) {
        this.totalRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad beginRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBeginRowNum() {
        return beginRowNum;
    }

    /**
     * Define el valor de la propiedad beginRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBeginRowNum(Long value) {
        this.beginRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad fetchRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFetchRowNum() {
        return fetchRowNum;
    }

    /**
     * Define el valor de la propiedad fetchRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFetchRowNum(Long value) {
        this.fetchRowNum = value;
    }

}
