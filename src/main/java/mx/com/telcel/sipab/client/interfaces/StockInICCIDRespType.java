
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para StockInICCIDRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StockInICCIDRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stockInICCIDResponse" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}StockInICCIDResponseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockInICCIDRespType", propOrder = {
    "stockInICCIDResponse"
})
public class StockInICCIDRespType {

    protected StockInICCIDResponseType stockInICCIDResponse;

    /**
     * Obtiene el valor de la propiedad stockInICCIDResponse.
     * 
     * @return
     *     possible object is
     *     {@link StockInICCIDResponseType }
     *     
     */
    public StockInICCIDResponseType getStockInICCIDResponse() {
        return stockInICCIDResponse;
    }

    /**
     * Define el valor de la propiedad stockInICCIDResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link StockInICCIDResponseType }
     *     
     */
    public void setStockInICCIDResponse(StockInICCIDResponseType value) {
        this.stockInICCIDResponse = value;
    }

}
