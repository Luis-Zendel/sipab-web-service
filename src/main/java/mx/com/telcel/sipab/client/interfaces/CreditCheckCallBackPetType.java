
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreditCheckCallBackPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreditCheckCallBackPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="folioNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="result" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica10Type"/&gt;
 *         &lt;element name="deposit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c6Type"/&gt;
 *         &lt;element name="remark" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="customerCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="accountCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="subscriberId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="advancePayPeriod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="activationType" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="customerSegment" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="creditClass" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="maxPriceAllowed" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="maxPriceAllowedPlan" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="verifyResult" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="totalInstallmentLimit" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="totalAvailableInstallmentLimit" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="useLimit" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="internationalRoaming" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica40Type" minOccurs="0"/&gt;
 *         &lt;element name="rentInAdvancedPaymentFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="trackingUniqueNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica15Type"/&gt;
 *         &lt;element name="outstandingBalance" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c2Type" minOccurs="0"/&gt;
 *         &lt;element name="handsetDeposit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c2Type" minOccurs="0"/&gt;
 *         &lt;element name="invoiceValidation" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="advancedRentals" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCheckCallBackPetType", propOrder = {
    "folioNumber",
    "result",
    "deposit",
    "remark",
    "customerCode",
    "accountCode",
    "subscriberId",
    "advancePayPeriod",
    "activationType",
    "customerSegment",
    "creditClass",
    "maxPriceAllowed",
    "maxPriceAllowedPlan",
    "verifyResult",
    "totalInstallmentLimit",
    "totalAvailableInstallmentLimit",
    "useLimit",
    "internationalRoaming",
    "rentInAdvancedPaymentFlag",
    "trackingUniqueNumber",
    "outstandingBalance",
    "handsetDeposit",
    "invoiceValidation",
    "advancedRentals"
})
public class CreditCheckCallBackPetType {

    @XmlElement(required = true)
    protected String folioNumber;
    @XmlElement(required = true)
    protected String result;
    @XmlElement(required = true)
    protected BigDecimal deposit;
    protected String remark;
    protected String customerCode;
    protected String accountCode;
    protected List<BigDecimal> subscriberId;
    protected String advancePayPeriod;
    protected String activationType;
    protected String customerSegment;
    protected String creditClass;
    protected String maxPriceAllowed;
    protected String maxPriceAllowedPlan;
    protected String verifyResult;
    protected String totalInstallmentLimit;
    protected String totalAvailableInstallmentLimit;
    protected String useLimit;
    protected String internationalRoaming;
    protected String rentInAdvancedPaymentFlag;
    @XmlElement(required = true)
    protected String trackingUniqueNumber;
    protected BigDecimal outstandingBalance;
    protected BigDecimal handsetDeposit;
    protected String invoiceValidation;
    protected String advancedRentals;

    /**
     * Obtiene el valor de la propiedad folioNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioNumber() {
        return folioNumber;
    }

    /**
     * Define el valor de la propiedad folioNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioNumber(String value) {
        this.folioNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad result.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Obtiene el valor de la propiedad deposit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeposit() {
        return deposit;
    }

    /**
     * Define el valor de la propiedad deposit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeposit(BigDecimal value) {
        this.deposit = value;
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

    /**
     * Obtiene el valor de la propiedad customerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Define el valor de la propiedad customerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad accountCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Define el valor de la propiedad accountCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getSubscriberId() {
        if (subscriberId == null) {
            subscriberId = new ArrayList<BigDecimal>();
        }
        return this.subscriberId;
    }

    /**
     * Obtiene el valor de la propiedad advancePayPeriod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvancePayPeriod() {
        return advancePayPeriod;
    }

    /**
     * Define el valor de la propiedad advancePayPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvancePayPeriod(String value) {
        this.advancePayPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad activationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationType() {
        return activationType;
    }

    /**
     * Define el valor de la propiedad activationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationType(String value) {
        this.activationType = value;
    }

    /**
     * Obtiene el valor de la propiedad customerSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSegment() {
        return customerSegment;
    }

    /**
     * Define el valor de la propiedad customerSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSegment(String value) {
        this.customerSegment = value;
    }

    /**
     * Obtiene el valor de la propiedad creditClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditClass() {
        return creditClass;
    }

    /**
     * Define el valor de la propiedad creditClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditClass(String value) {
        this.creditClass = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPriceAllowed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPriceAllowed() {
        return maxPriceAllowed;
    }

    /**
     * Define el valor de la propiedad maxPriceAllowed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPriceAllowed(String value) {
        this.maxPriceAllowed = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPriceAllowedPlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPriceAllowedPlan() {
        return maxPriceAllowedPlan;
    }

    /**
     * Define el valor de la propiedad maxPriceAllowedPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPriceAllowedPlan(String value) {
        this.maxPriceAllowedPlan = value;
    }

    /**
     * Obtiene el valor de la propiedad verifyResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyResult() {
        return verifyResult;
    }

    /**
     * Define el valor de la propiedad verifyResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyResult(String value) {
        this.verifyResult = value;
    }

    /**
     * Obtiene el valor de la propiedad totalInstallmentLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalInstallmentLimit() {
        return totalInstallmentLimit;
    }

    /**
     * Define el valor de la propiedad totalInstallmentLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalInstallmentLimit(String value) {
        this.totalInstallmentLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAvailableInstallmentLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAvailableInstallmentLimit() {
        return totalAvailableInstallmentLimit;
    }

    /**
     * Define el valor de la propiedad totalAvailableInstallmentLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAvailableInstallmentLimit(String value) {
        this.totalAvailableInstallmentLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad useLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseLimit() {
        return useLimit;
    }

    /**
     * Define el valor de la propiedad useLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseLimit(String value) {
        this.useLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad internationalRoaming.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalRoaming() {
        return internationalRoaming;
    }

    /**
     * Define el valor de la propiedad internationalRoaming.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalRoaming(String value) {
        this.internationalRoaming = value;
    }

    /**
     * Obtiene el valor de la propiedad rentInAdvancedPaymentFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentInAdvancedPaymentFlag() {
        return rentInAdvancedPaymentFlag;
    }

    /**
     * Define el valor de la propiedad rentInAdvancedPaymentFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentInAdvancedPaymentFlag(String value) {
        this.rentInAdvancedPaymentFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingUniqueNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUniqueNumber() {
        return trackingUniqueNumber;
    }

    /**
     * Define el valor de la propiedad trackingUniqueNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUniqueNumber(String value) {
        this.trackingUniqueNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad outstandingBalance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingBalance() {
        return outstandingBalance;
    }

    /**
     * Define el valor de la propiedad outstandingBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingBalance(BigDecimal value) {
        this.outstandingBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad handsetDeposit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHandsetDeposit() {
        return handsetDeposit;
    }

    /**
     * Define el valor de la propiedad handsetDeposit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHandsetDeposit(BigDecimal value) {
        this.handsetDeposit = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceValidation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceValidation() {
        return invoiceValidation;
    }

    /**
     * Define el valor de la propiedad invoiceValidation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceValidation(String value) {
        this.invoiceValidation = value;
    }

    /**
     * Obtiene el valor de la propiedad advancedRentals.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvancedRentals() {
        return advancedRentals;
    }

    /**
     * Define el valor de la propiedad advancedRentals.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvancedRentals(String value) {
        this.advancedRentals = value;
    }

}
