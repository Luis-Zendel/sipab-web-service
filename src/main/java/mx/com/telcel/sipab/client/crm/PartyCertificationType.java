
package mx.com.telcel.sipab.client.crm;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyCertificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyCertificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="idNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="idAddress" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="certEffDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="certExpDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="issueCountry" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica16Type" minOccurs="0"/&gt;
 *         &lt;element name="authority" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="isDefault" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyCertificationType", propOrder = {
    "idType",
    "idNumber",
    "idAddress",
    "certEffDate",
    "certExpDate",
    "issueCountry",
    "authority",
    "isDefault"
})
public class PartyCertificationType {

    @XmlElement(required = true)
    protected String idType;
    @XmlElement(required = true)
    protected String idNumber;
    protected String idAddress;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar certEffDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar certExpDate;
    protected String issueCountry;
    protected String authority;
    protected String isDefault;

    /**
     * Obtiene el valor de la propiedad idType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Define el valor de la propiedad idType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Obtiene el valor de la propiedad idNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Define el valor de la propiedad idNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad idAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAddress() {
        return idAddress;
    }

    /**
     * Define el valor de la propiedad idAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAddress(String value) {
        this.idAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad certEffDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertEffDate() {
        return certEffDate;
    }

    /**
     * Define el valor de la propiedad certEffDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertEffDate(XMLGregorianCalendar value) {
        this.certEffDate = value;
    }

    /**
     * Obtiene el valor de la propiedad certExpDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertExpDate() {
        return certExpDate;
    }

    /**
     * Define el valor de la propiedad certExpDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertExpDate(XMLGregorianCalendar value) {
        this.certExpDate = value;
    }

    /**
     * Obtiene el valor de la propiedad issueCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueCountry() {
        return issueCountry;
    }

    /**
     * Define el valor de la propiedad issueCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueCountry(String value) {
        this.issueCountry = value;
    }

    /**
     * Obtiene el valor de la propiedad authority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Define el valor de la propiedad authority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Obtiene el valor de la propiedad isDefault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * Define el valor de la propiedad isDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDefault(String value) {
        this.isDefault = value;
    }

}
