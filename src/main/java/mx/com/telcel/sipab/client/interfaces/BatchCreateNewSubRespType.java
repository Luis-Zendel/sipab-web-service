
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BatchCreateNewSubRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BatchCreateNewSubRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="batchTransactionID" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="orderId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchCreateNewSubRespType", propOrder = {
    "batchTransactionID",
    "orderId"
})
public class BatchCreateNewSubRespType {

    protected BigDecimal batchTransactionID;
    protected BigDecimal orderId;

    /**
     * Obtiene el valor de la propiedad batchTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatchTransactionID() {
        return batchTransactionID;
    }

    /**
     * Define el valor de la propiedad batchTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatchTransactionID(BigDecimal value) {
        this.batchTransactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad orderId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderId() {
        return orderId;
    }

    /**
     * Define el valor de la propiedad orderId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderId(BigDecimal value) {
        this.orderId = value;
    }

}
