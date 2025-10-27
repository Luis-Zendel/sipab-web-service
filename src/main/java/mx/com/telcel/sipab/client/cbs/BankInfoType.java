
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BankInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BankInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bankCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="bankBranchCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="acctType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="acctNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}String320Type" minOccurs="0"/&gt;
 *         &lt;element name="creditCardType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica8Type" minOccurs="0"/&gt;
 *         &lt;element name="acctName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}String120Type" minOccurs="0"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica80Type" minOccurs="0"/&gt;
 *         &lt;element name="cVVNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica80Type" minOccurs="0"/&gt;
 *         &lt;element name="checkNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="checkDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankInfoType", propOrder = {
    "bankCode",
    "bankBranchCode",
    "acctType",
    "acctNo",
    "creditCardType",
    "acctName",
    "expDate",
    "cvvNumber",
    "checkNo",
    "checkDate"
})
public class BankInfoType {

    protected String bankCode;
    protected String bankBranchCode;
    protected String acctType;
    protected String acctNo;
    protected String creditCardType;
    protected String acctName;
    protected String expDate;
    @XmlElement(name = "cVVNumber")
    protected String cvvNumber;
    protected String checkNo;
    protected String checkDate;

    /**
     * Obtiene el valor de la propiedad bankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Define el valor de la propiedad bankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bankBranchCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranchCode() {
        return bankBranchCode;
    }

    /**
     * Define el valor de la propiedad bankBranchCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranchCode(String value) {
        this.bankBranchCode = value;
    }

    /**
     * Obtiene el valor de la propiedad acctType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Define el valor de la propiedad acctType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Obtiene el valor de la propiedad acctNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * Define el valor de la propiedad acctNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNo(String value) {
        this.acctNo = value;
    }

    /**
     * Obtiene el valor de la propiedad creditCardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardType() {
        return creditCardType;
    }

    /**
     * Define el valor de la propiedad creditCardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardType(String value) {
        this.creditCardType = value;
    }

    /**
     * Obtiene el valor de la propiedad acctName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Define el valor de la propiedad acctName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * Obtiene el valor de la propiedad expDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * Define el valor de la propiedad expDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDate(String value) {
        this.expDate = value;
    }

    /**
     * Obtiene el valor de la propiedad cvvNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVVNumber() {
        return cvvNumber;
    }

    /**
     * Define el valor de la propiedad cvvNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVVNumber(String value) {
        this.cvvNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad checkNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNo() {
        return checkNo;
    }

    /**
     * Define el valor de la propiedad checkNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNo(String value) {
        this.checkNo = value;
    }

    /**
     * Obtiene el valor de la propiedad checkDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckDate() {
        return checkDate;
    }

    /**
     * Define el valor de la propiedad checkDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckDate(String value) {
        this.checkDate = value;
    }

}
