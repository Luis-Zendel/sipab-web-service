
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryBalancePetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryBalancePetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryObjQDLType"/&gt;
 *         &lt;element name="balanceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="balanceBelongSubFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="accurateQuery" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBalancePetType", propOrder = {
    "queryObj",
    "balanceType",
    "balanceBelongSubFlag",
    "accurateQuery"
})
public class QueryBalancePetType {

    @XmlElement(required = true)
    protected QueryObjQDLType queryObj;
    protected String balanceType;
    protected Integer balanceBelongSubFlag;
    protected Integer accurateQuery;

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
     * Obtiene el valor de la propiedad balanceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * Define el valor de la propiedad balanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceBelongSubFlag.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBalanceBelongSubFlag() {
        return balanceBelongSubFlag;
    }

    /**
     * Define el valor de la propiedad balanceBelongSubFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBalanceBelongSubFlag(Integer value) {
        this.balanceBelongSubFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad accurateQuery.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccurateQuery() {
        return accurateQuery;
    }

    /**
     * Define el valor de la propiedad accurateQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccurateQuery(Integer value) {
        this.accurateQuery = value;
    }

}
