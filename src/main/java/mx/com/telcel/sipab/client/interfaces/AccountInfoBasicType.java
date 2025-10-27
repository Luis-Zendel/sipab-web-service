
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountInfoBasicType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountInfoBasicType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="acctId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="projectType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="creditClass" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="averageAnacrValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}FloatType" minOccurs="0"/&gt;
 *         &lt;element name="acctSegment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctSegmentType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InvoiceInfoBasicType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInfoBasicType", propOrder = {
    "acctCode",
    "acctId",
    "status",
    "projectType",
    "creditClass",
    "averageAnacrValue",
    "acctSegment",
    "invoiceInfo"
})
public class AccountInfoBasicType {

    @XmlElement(required = true)
    protected String acctCode;
    @XmlElement(required = true)
    protected BigDecimal acctId;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String projectType;
    protected String creditClass;
    protected Float averageAnacrValue;
    protected String acctSegment;
    protected List<InvoiceInfoBasicType> invoiceInfo;

    /**
     * Obtiene el valor de la propiedad acctCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Define el valor de la propiedad acctCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCode(String value) {
        this.acctCode = value;
    }

    /**
     * Obtiene el valor de la propiedad acctId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctId() {
        return acctId;
    }

    /**
     * Define el valor de la propiedad acctId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcctId(BigDecimal value) {
        this.acctId = value;
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
     * Obtiene el valor de la propiedad projectType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectType() {
        return projectType;
    }

    /**
     * Define el valor de la propiedad projectType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectType(String value) {
        this.projectType = value;
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
     * Obtiene el valor de la propiedad averageAnacrValue.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageAnacrValue() {
        return averageAnacrValue;
    }

    /**
     * Define el valor de la propiedad averageAnacrValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageAnacrValue(Float value) {
        this.averageAnacrValue = value;
    }

    /**
     * Obtiene el valor de la propiedad acctSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSegment() {
        return acctSegment;
    }

    /**
     * Define el valor de la propiedad acctSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSegment(String value) {
        this.acctSegment = value;
    }

    /**
     * Gets the value of the invoiceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceInfoBasicType }
     * 
     * 
     */
    public List<InvoiceInfoBasicType> getInvoiceInfo() {
        if (invoiceInfo == null) {
            invoiceInfo = new ArrayList<InvoiceInfoBasicType>();
        }
        return this.invoiceInfo;
    }

}
