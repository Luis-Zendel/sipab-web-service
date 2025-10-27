
package mx.com.telcel.sipab.client.crm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IncludeObjGetAccountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncludeObjGetAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="includeAcctCreditLimitFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="includePaymentChannelFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="includeContactPersonFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="includeBillMediumFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncludeObjGetAccountType", propOrder = {
    "includeAcctCreditLimitFlag",
    "includePaymentChannelFlag",
    "includeContactPersonFlag",
    "includeBillMediumFlag"
})
public class IncludeObjGetAccountType {

    protected String includeAcctCreditLimitFlag;
    protected String includePaymentChannelFlag;
    protected String includeContactPersonFlag;
    protected String includeBillMediumFlag;

    /**
     * Obtiene el valor de la propiedad includeAcctCreditLimitFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeAcctCreditLimitFlag() {
        return includeAcctCreditLimitFlag;
    }

    /**
     * Define el valor de la propiedad includeAcctCreditLimitFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeAcctCreditLimitFlag(String value) {
        this.includeAcctCreditLimitFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad includePaymentChannelFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludePaymentChannelFlag() {
        return includePaymentChannelFlag;
    }

    /**
     * Define el valor de la propiedad includePaymentChannelFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludePaymentChannelFlag(String value) {
        this.includePaymentChannelFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad includeContactPersonFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeContactPersonFlag() {
        return includeContactPersonFlag;
    }

    /**
     * Define el valor de la propiedad includeContactPersonFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeContactPersonFlag(String value) {
        this.includeContactPersonFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad includeBillMediumFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeBillMediumFlag() {
        return includeBillMediumFlag;
    }

    /**
     * Define el valor de la propiedad includeBillMediumFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeBillMediumFlag(String value) {
        this.includeBillMediumFlag = value;
    }

}
