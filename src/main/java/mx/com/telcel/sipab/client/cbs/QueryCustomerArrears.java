
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryCustomerArrears complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryCustomerArrears"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/&gt;
 *         &lt;element name="queryCustomerArrears" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QueryCustomerArrearsPetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCustomerArrears", propOrder = {
    "controlData",
    "queryCustomerArrears"
})
public class QueryCustomerArrears {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected QueryCustomerArrearsPetType queryCustomerArrears;

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
     * Obtiene el valor de la propiedad queryCustomerArrears.
     * 
     * @return
     *     possible object is
     *     {@link QueryCustomerArrearsPetType }
     *     
     */
    public QueryCustomerArrearsPetType getQueryCustomerArrears() {
        return queryCustomerArrears;
    }

    /**
     * Define el valor de la propiedad queryCustomerArrears.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCustomerArrearsPetType }
     *     
     */
    public void setQueryCustomerArrears(QueryCustomerArrearsPetType value) {
        this.queryCustomerArrears = value;
    }

}
