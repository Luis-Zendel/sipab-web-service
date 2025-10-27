
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryDepositBalance complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryDepositBalance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/&gt;
 *         &lt;element name="queryDepositBalance" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryDepositBalancePetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDepositBalance", propOrder = {
    "controlData",
    "queryDepositBalance"
})
public class QueryDepositBalance {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected QueryDepositBalancePetType queryDepositBalance;

    /**
     * Obtiene el valor de la propiedad controlData.
     * 
     * @return
     *     possible object is
     *     {@link ControlDataRequestHeaderType }
     *     
     */
    public ControlDataRequestHeaderType getControlData() {
        return controlData;
    }

    /**
     * Define el valor de la propiedad controlData.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlDataRequestHeaderType }
     *     
     */
    public void setControlData(ControlDataRequestHeaderType value) {
        this.controlData = value;
    }

    /**
     * Obtiene el valor de la propiedad queryDepositBalance.
     * 
     * @return
     *     possible object is
     *     {@link QueryDepositBalancePetType }
     *     
     */
    public QueryDepositBalancePetType getQueryDepositBalance() {
        return queryDepositBalance;
    }

    /**
     * Define el valor de la propiedad queryDepositBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryDepositBalancePetType }
     *     
     */
    public void setQueryDepositBalance(QueryDepositBalancePetType value) {
        this.queryDepositBalance = value;
    }

}
