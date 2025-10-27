
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OfferingResourceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OfferingResourceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="instId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Long20Type"/&gt;
 *         &lt;element name="offeringId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Long20Type"/&gt;
 *         &lt;element name="offeringInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="beginIdentityId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="endIdentityId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="exchangeInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="orderId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Long20Type"/&gt;
 *         &lt;element name="resourceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="skuId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Long20Type"/&gt;
 *         &lt;element name="skuCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="quantity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="discountAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="tax" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="includeTax" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="waiveAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="unitPrice" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="salesOrgId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferingResourceType", propOrder = {
    "instId",
    "offeringId",
    "offeringInstId",
    "beginIdentityId",
    "endIdentityId",
    "effDate",
    "expDate",
    "status",
    "exchangeInstId",
    "orderId",
    "resourceType",
    "skuId",
    "skuCode",
    "quantity",
    "amount",
    "discountAmount",
    "tax",
    "includeTax",
    "waiveAmount",
    "unitPrice",
    "salesOrgId"
})
public class OfferingResourceType {

    protected long instId;
    protected long offeringId;
    @XmlElement(required = true)
    protected String offeringInstId;
    protected String beginIdentityId;
    protected String endIdentityId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    @XmlElement(required = true)
    protected String status;
    protected Long exchangeInstId;
    protected long orderId;
    @XmlElement(required = true)
    protected String resourceType;
    protected long skuId;
    @XmlElement(required = true)
    protected String skuCode;
    protected Long quantity;
    protected Long amount;
    protected Long discountAmount;
    protected Long tax;
    protected String includeTax;
    protected Long waiveAmount;
    protected Long unitPrice;
    protected BigDecimal salesOrgId;

    /**
     * Obtiene el valor de la propiedad instId.
     * 
     */
    public long getInstId() {
        return instId;
    }

    /**
     * Define el valor de la propiedad instId.
     * 
     */
    public void setInstId(long value) {
        this.instId = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringId.
     * 
     */
    public long getOfferingId() {
        return offeringId;
    }

    /**
     * Define el valor de la propiedad offeringId.
     * 
     */
    public void setOfferingId(long value) {
        this.offeringId = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringInstId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferingInstId() {
        return offeringInstId;
    }

    /**
     * Define el valor de la propiedad offeringInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferingInstId(String value) {
        this.offeringInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad beginIdentityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginIdentityId() {
        return beginIdentityId;
    }

    /**
     * Define el valor de la propiedad beginIdentityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginIdentityId(String value) {
        this.beginIdentityId = value;
    }

    /**
     * Obtiene el valor de la propiedad endIdentityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndIdentityId() {
        return endIdentityId;
    }

    /**
     * Define el valor de la propiedad endIdentityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndIdentityId(String value) {
        this.endIdentityId = value;
    }

    /**
     * Obtiene el valor de la propiedad effDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDate() {
        return effDate;
    }

    /**
     * Define el valor de la propiedad effDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDate(XMLGregorianCalendar value) {
        this.effDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Define el valor de la propiedad expDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeInstId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchangeInstId() {
        return exchangeInstId;
    }

    /**
     * Define el valor de la propiedad exchangeInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchangeInstId(Long value) {
        this.exchangeInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad orderId.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Define el valor de la propiedad orderId.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Obtiene el valor de la propiedad resourceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Define el valor de la propiedad resourceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceType(String value) {
        this.resourceType = value;
    }

    /**
     * Obtiene el valor de la propiedad skuId.
     * 
     */
    public long getSkuId() {
        return skuId;
    }

    /**
     * Define el valor de la propiedad skuId.
     * 
     */
    public void setSkuId(long value) {
        this.skuId = value;
    }

    /**
     * Obtiene el valor de la propiedad skuCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * Define el valor de la propiedad skuCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuCode(String value) {
        this.skuCode = value;
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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmount(Long value) {
        this.amount = value;
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
     * Obtiene el valor de la propiedad tax.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTax() {
        return tax;
    }

    /**
     * Define el valor de la propiedad tax.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTax(Long value) {
        this.tax = value;
    }

    /**
     * Obtiene el valor de la propiedad includeTax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeTax() {
        return includeTax;
    }

    /**
     * Define el valor de la propiedad includeTax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeTax(String value) {
        this.includeTax = value;
    }

    /**
     * Obtiene el valor de la propiedad waiveAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWaiveAmount() {
        return waiveAmount;
    }

    /**
     * Define el valor de la propiedad waiveAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWaiveAmount(Long value) {
        this.waiveAmount = value;
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
     * Obtiene el valor de la propiedad salesOrgId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesOrgId() {
        return salesOrgId;
    }

    /**
     * Define el valor de la propiedad salesOrgId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesOrgId(BigDecimal value) {
        this.salesOrgId = value;
    }

}
