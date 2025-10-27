
package mx.com.telcel.sipab.client.crm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IncludeFlagType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IncludeFlagType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="includeDefaultAcctFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="includeContactPersonFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="includeAddrFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="includePartyCertFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="includeAttachmentFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncludeFlagType", propOrder = {
    "includeDefaultAcctFlag",
    "includeContactPersonFlag",
    "includeAddrFlag",
    "includePartyCertFlag",
    "includeAttachmentFlag"
})
public class IncludeFlagType {

    protected String includeDefaultAcctFlag;
    protected String includeContactPersonFlag;
    protected String includeAddrFlag;
    protected String includePartyCertFlag;
    protected String includeAttachmentFlag;

    /**
     * Obtiene el valor de la propiedad includeDefaultAcctFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeDefaultAcctFlag() {
        return includeDefaultAcctFlag;
    }

    /**
     * Define el valor de la propiedad includeDefaultAcctFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeDefaultAcctFlag(String value) {
        this.includeDefaultAcctFlag = value;
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
     * Obtiene el valor de la propiedad includeAddrFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeAddrFlag() {
        return includeAddrFlag;
    }

    /**
     * Define el valor de la propiedad includeAddrFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeAddrFlag(String value) {
        this.includeAddrFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad includePartyCertFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludePartyCertFlag() {
        return includePartyCertFlag;
    }

    /**
     * Define el valor de la propiedad includePartyCertFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludePartyCertFlag(String value) {
        this.includePartyCertFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad includeAttachmentFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeAttachmentFlag() {
        return includeAttachmentFlag;
    }

    /**
     * Define el valor de la propiedad includeAttachmentFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeAttachmentFlag(String value) {
        this.includeAttachmentFlag = value;
    }

}
