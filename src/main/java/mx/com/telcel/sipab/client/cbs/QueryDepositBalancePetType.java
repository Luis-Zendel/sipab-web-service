
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryDepositBalancePetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryDepositBalancePetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryObjQDLType"/&gt;
 *         &lt;element name="depositType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDepositBalancePetType", propOrder = {
    "queryObj",
    "depositType"
})
public class QueryDepositBalancePetType {

    @XmlElement(required = true)
    protected QueryObjQDLType queryObj;
    protected String depositType;

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
     * Obtiene el valor de la propiedad depositType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositType() {
        return depositType;
    }

    /**
     * Define el valor de la propiedad depositType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositType(String value) {
        this.depositType = value;
    }

}
