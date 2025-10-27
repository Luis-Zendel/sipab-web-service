
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GenerateDepositPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GenerateDepositPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderInfoReq" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OrderInfoReqType"/&gt;
 *         &lt;element name="serviceNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="refOrderId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateDepositPetType", propOrder = {
    "orderInfoReq",
    "serviceNumber",
    "refOrderId"
})
public class GenerateDepositPetType {

    @XmlElement(required = true)
    protected OrderInfoReqType orderInfoReq;
    @XmlElement(required = true)
    protected String serviceNumber;
    @XmlElement(required = true)
    protected BigDecimal refOrderId;

    /**
     * Obtiene el valor de la propiedad orderInfoReq.
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoReqType }
     *     
     */
    public OrderInfoReqType getOrderInfoReq() {
        return orderInfoReq;
    }

    /**
     * Define el valor de la propiedad orderInfoReq.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoReqType }
     *     
     */
    public void setOrderInfoReq(OrderInfoReqType value) {
        this.orderInfoReq = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Define el valor de la propiedad serviceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad refOrderId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefOrderId() {
        return refOrderId;
    }

    /**
     * Define el valor de la propiedad refOrderId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefOrderId(BigDecimal value) {
        this.refOrderId = value;
    }

}
