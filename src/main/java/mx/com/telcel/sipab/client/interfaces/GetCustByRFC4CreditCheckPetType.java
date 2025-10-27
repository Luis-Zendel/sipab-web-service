
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetCustByRFC4CreditCheckPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetCustByRFC4CreditCheckPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="rfc" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type"/&gt;
 *           &lt;element name="customerId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type"/&gt;
 *           &lt;element name="customerCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *           &lt;element name="serviceNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="queryCBSFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="filterPrepaidInfoFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="pymeFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PymeFlagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustByRFC4CreditCheckPetType", propOrder = {
    "rfc",
    "customerId",
    "customerCode",
    "serviceNumber",
    "queryCBSFlag",
    "filterPrepaidInfoFlag",
    "pymeFlag"
})
public class GetCustByRFC4CreditCheckPetType {

    protected String rfc;
    protected BigDecimal customerId;
    protected String customerCode;
    protected String serviceNumber;
    protected Boolean queryCBSFlag;
    protected Boolean filterPrepaidInfoFlag;
    protected String pymeFlag;

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad customerId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomerId(BigDecimal value) {
        this.customerId = value;
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
     * Obtiene el valor de la propiedad queryCBSFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryCBSFlag() {
        return queryCBSFlag;
    }

    /**
     * Define el valor de la propiedad queryCBSFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryCBSFlag(Boolean value) {
        this.queryCBSFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad filterPrepaidInfoFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterPrepaidInfoFlag() {
        return filterPrepaidInfoFlag;
    }

    /**
     * Define el valor de la propiedad filterPrepaidInfoFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterPrepaidInfoFlag(Boolean value) {
        this.filterPrepaidInfoFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad pymeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymeFlag() {
        return pymeFlag;
    }

    /**
     * Define el valor de la propiedad pymeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymeFlag(String value) {
        this.pymeFlag = value;
    }

}
