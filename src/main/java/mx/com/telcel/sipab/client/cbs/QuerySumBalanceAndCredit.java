
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QuerySumBalanceAndCredit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QuerySumBalanceAndCredit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlData" type="{http://amx.com/mexico/telcel/esb/v1_2}ControlDataRequestHeaderType"/&gt;
 *         &lt;element name="querySumBalanceAndCredit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}QuerySumBalanceAndCreditPetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySumBalanceAndCredit", propOrder = {
    "controlData",
    "querySumBalanceAndCredit"
})
public class QuerySumBalanceAndCredit {

    @XmlElement(required = true)
    protected ControlDataRequestHeaderType controlData;
    @XmlElement(required = true)
    protected QuerySumBalanceAndCreditPetType querySumBalanceAndCredit;

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
     * Obtiene el valor de la propiedad querySumBalanceAndCredit.
     * 
     * @return
     *     possible object is
     *     {@link QuerySumBalanceAndCreditPetType }
     *     
     */
    public QuerySumBalanceAndCreditPetType getQuerySumBalanceAndCredit() {
        return querySumBalanceAndCredit;
    }

    /**
     * Define el valor de la propiedad querySumBalanceAndCredit.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySumBalanceAndCreditPetType }
     *     
     */
    public void setQuerySumBalanceAndCredit(QuerySumBalanceAndCreditPetType value) {
        this.querySumBalanceAndCredit = value;
    }

}
