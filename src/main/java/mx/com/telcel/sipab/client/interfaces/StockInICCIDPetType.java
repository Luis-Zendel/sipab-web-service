
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para StockInICCIDPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StockInICCIDPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stockInICCIDRequest" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}StockInICCIDRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockInICCIDPetType", propOrder = {
    "stockInICCIDRequest"
})
public class StockInICCIDPetType {

    @XmlElement(required = true)
    protected StockInICCIDRequestType stockInICCIDRequest;

    /**
     * Obtiene el valor de la propiedad stockInICCIDRequest.
     * 
     * @return
     *     possible object is
     *     {@link StockInICCIDRequestType }
     *     
     */
    public StockInICCIDRequestType getStockInICCIDRequest() {
        return stockInICCIDRequest;
    }

    /**
     * Define el valor de la propiedad stockInICCIDRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link StockInICCIDRequestType }
     *     
     */
    public void setStockInICCIDRequest(StockInICCIDRequestType value) {
        this.stockInICCIDRequest = value;
    }

}
