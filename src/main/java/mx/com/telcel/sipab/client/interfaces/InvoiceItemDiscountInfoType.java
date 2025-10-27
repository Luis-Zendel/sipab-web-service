
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceItemDiscountInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceItemDiscountInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="promotionId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="discountMethod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="discountValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type"/&gt;
 *         &lt;element name="redeemCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceItemDiscountInfoType", propOrder = {
    "promotionId",
    "discountMethod",
    "discountValue",
    "redeemCode"
})
public class InvoiceItemDiscountInfoType {

    protected Long promotionId;
    protected String discountMethod;
    protected long discountValue;
    protected String redeemCode;

    /**
     * Obtiene el valor de la propiedad promotionId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotionId() {
        return promotionId;
    }

    /**
     * Define el valor de la propiedad promotionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotionId(Long value) {
        this.promotionId = value;
    }

    /**
     * Obtiene el valor de la propiedad discountMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountMethod() {
        return discountMethod;
    }

    /**
     * Define el valor de la propiedad discountMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountMethod(String value) {
        this.discountMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad discountValue.
     * 
     */
    public long getDiscountValue() {
        return discountValue;
    }

    /**
     * Define el valor de la propiedad discountValue.
     * 
     */
    public void setDiscountValue(long value) {
        this.discountValue = value;
    }

    /**
     * Obtiene el valor de la propiedad redeemCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeemCode() {
        return redeemCode;
    }

    /**
     * Define el valor de la propiedad redeemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeemCode(String value) {
        this.redeemCode = value;
    }

}
