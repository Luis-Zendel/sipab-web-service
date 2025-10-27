
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FeeItemInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FeeItemInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feeItemId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="payMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="feeType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="payDirection" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="chargeCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="chargeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="unitPrice" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type"/&gt;
 *         &lt;element name="includedTax" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="discountAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="itemDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}FeeItemDetailInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica255Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeItemInfoType", propOrder = {
    "feeItemId",
    "payMode",
    "feeType",
    "payDirection",
    "chargeCode",
    "chargeName",
    "unitPrice",
    "quantity",
    "amount",
    "includedTax",
    "taxAmount",
    "discountAmount",
    "itemDetail",
    "remark"
})
public class FeeItemInfoType {

    protected Long feeItemId;
    @XmlElement(required = true)
    protected String payMode;
    @XmlElement(required = true)
    protected String feeType;
    protected String payDirection;
    @XmlElement(required = true)
    protected String chargeCode;
    protected String chargeName;
    protected Long unitPrice;
    protected Long quantity;
    protected long amount;
    @XmlElement(required = true)
    protected String includedTax;
    protected Long taxAmount;
    protected Long discountAmount;
    protected List<FeeItemDetailInfoType> itemDetail;
    protected String remark;

    /**
     * Obtiene el valor de la propiedad feeItemId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeeItemId() {
        return feeItemId;
    }

    /**
     * Define el valor de la propiedad feeItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeeItemId(Long value) {
        this.feeItemId = value;
    }

    /**
     * Obtiene el valor de la propiedad payMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * Define el valor de la propiedad payMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMode(String value) {
        this.payMode = value;
    }

    /**
     * Obtiene el valor de la propiedad feeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Define el valor de la propiedad feeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
    }

    /**
     * Obtiene el valor de la propiedad payDirection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayDirection() {
        return payDirection;
    }

    /**
     * Define el valor de la propiedad payDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayDirection(String value) {
        this.payDirection = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * Define el valor de la propiedad chargeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCode(String value) {
        this.chargeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeName() {
        return chargeName;
    }

    /**
     * Define el valor de la propiedad chargeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeName(String value) {
        this.chargeName = value;
    }

    /**
     * Obtiene el valor de la propiedad unitPrice.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitPrice() {
        return unitPrice;
    }

    /**
     * Define el valor de la propiedad unitPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitPrice(Long value) {
        this.unitPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantity(Long value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad includedTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludedTax() {
        return includedTax;
    }

    /**
     * Define el valor de la propiedad includedTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludedTax(String value) {
        this.includedTax = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxAmount(Long value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad discountAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Define el valor de la propiedad discountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountAmount(Long value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the itemDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itemDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeItemDetailInfoType }
     * 
     * 
     */
    public List<FeeItemDetailInfoType> getItemDetail() {
        if (itemDetail == null) {
            itemDetail = new ArrayList<FeeItemDetailInfoType>();
        }
        return this.itemDetail;
    }

    /**
     * Obtiene el valor de la propiedad remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Define el valor de la propiedad remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
