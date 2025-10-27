
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QuerySumBalanceAndCreditPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QuerySumBalanceAndCreditPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryObj2Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySumBalanceAndCreditPetType", propOrder = {
    "queryObj"
})
public class QuerySumBalanceAndCreditPetType {

    @XmlElement(required = true)
    protected QueryObj2Type queryObj;

    /**
     * Obtiene el valor de la propiedad queryObj.
     * 
     * @return
     *     possible object is
     *     {@link QueryObj2Type }
     *     
     */
    public QueryObj2Type getQueryObj() {
        return queryObj;
    }

    /**
     * Define el valor de la propiedad queryObj.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryObj2Type }
     *     
     */
    public void setQueryObj(QueryObj2Type value) {
        this.queryObj = value;
    }

}
