
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubAccountLoanPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubAccountLoanPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SubAccessCodeType"/&gt;
 *         &lt;element name="objectType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="subAccountTypeCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="subAccountAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="subAccountValDays" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="subAccountMesureID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="repayLoanAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="repayLoanPoundage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="loanPenalty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="graceDays" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="forceGraceDays" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="loanGrade" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="subAccountExpDate" type="{http://amx.com/mexico/telcel/esb/v1_2}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="loanTransID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SimplePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="repayMesureID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *         &lt;element name="loanOffering" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LoanOfferingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccountLoanPetType", propOrder = {
    "subAccessCode",
    "objectType",
    "subAccountTypeCode",
    "subAccountAmount",
    "subAccountValDays",
    "subAccountMesureID",
    "repayLoanAmt",
    "repayLoanPoundage",
    "loanPenalty",
    "graceDays",
    "forceGraceDays",
    "loanGrade",
    "subAccountExpDate",
    "loanTransID",
    "additionalProperty",
    "repayMesureID",
    "loanOffering",
    "remark"
})
public class SubAccountLoanPetType {

    @XmlElement(required = true)
    protected SubAccessCodeType subAccessCode;
    @XmlElement(required = true)
    protected String objectType;
    protected String subAccountTypeCode;
    protected Long subAccountAmount;
    protected Integer subAccountValDays;
    protected Integer subAccountMesureID;
    protected Long repayLoanAmt;
    protected Long repayLoanPoundage;
    protected Long loanPenalty;
    protected Integer graceDays;
    protected Integer forceGraceDays;
    protected Integer loanGrade;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subAccountExpDate;
    protected String loanTransID;
    protected SimplePropertyType additionalProperty;
    protected Integer repayMesureID;
    protected List<LoanOfferingType> loanOffering;
    protected String remark;

    /**
     * Obtiene el valor de la propiedad subAccessCode.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCodeType }
     *     
     */
    public SubAccessCodeType getSubAccessCode() {
        return subAccessCode;
    }

    /**
     * Define el valor de la propiedad subAccessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCodeType }
     *     
     */
    public void setSubAccessCode(SubAccessCodeType value) {
        this.subAccessCode = value;
    }

    /**
     * Obtiene el valor de la propiedad objectType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Define el valor de la propiedad objectType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Obtiene el valor de la propiedad subAccountTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAccountTypeCode() {
        return subAccountTypeCode;
    }

    /**
     * Define el valor de la propiedad subAccountTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAccountTypeCode(String value) {
        this.subAccountTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad subAccountAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubAccountAmount() {
        return subAccountAmount;
    }

    /**
     * Define el valor de la propiedad subAccountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubAccountAmount(Long value) {
        this.subAccountAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad subAccountValDays.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubAccountValDays() {
        return subAccountValDays;
    }

    /**
     * Define el valor de la propiedad subAccountValDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubAccountValDays(Integer value) {
        this.subAccountValDays = value;
    }

    /**
     * Obtiene el valor de la propiedad subAccountMesureID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubAccountMesureID() {
        return subAccountMesureID;
    }

    /**
     * Define el valor de la propiedad subAccountMesureID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubAccountMesureID(Integer value) {
        this.subAccountMesureID = value;
    }

    /**
     * Obtiene el valor de la propiedad repayLoanAmt.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepayLoanAmt() {
        return repayLoanAmt;
    }

    /**
     * Define el valor de la propiedad repayLoanAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepayLoanAmt(Long value) {
        this.repayLoanAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad repayLoanPoundage.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepayLoanPoundage() {
        return repayLoanPoundage;
    }

    /**
     * Define el valor de la propiedad repayLoanPoundage.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepayLoanPoundage(Long value) {
        this.repayLoanPoundage = value;
    }

    /**
     * Obtiene el valor de la propiedad loanPenalty.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoanPenalty() {
        return loanPenalty;
    }

    /**
     * Define el valor de la propiedad loanPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoanPenalty(Long value) {
        this.loanPenalty = value;
    }

    /**
     * Obtiene el valor de la propiedad graceDays.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGraceDays() {
        return graceDays;
    }

    /**
     * Define el valor de la propiedad graceDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGraceDays(Integer value) {
        this.graceDays = value;
    }

    /**
     * Obtiene el valor de la propiedad forceGraceDays.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getForceGraceDays() {
        return forceGraceDays;
    }

    /**
     * Define el valor de la propiedad forceGraceDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setForceGraceDays(Integer value) {
        this.forceGraceDays = value;
    }

    /**
     * Obtiene el valor de la propiedad loanGrade.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanGrade() {
        return loanGrade;
    }

    /**
     * Define el valor de la propiedad loanGrade.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanGrade(Integer value) {
        this.loanGrade = value;
    }

    /**
     * Obtiene el valor de la propiedad subAccountExpDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubAccountExpDate() {
        return subAccountExpDate;
    }

    /**
     * Define el valor de la propiedad subAccountExpDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubAccountExpDate(XMLGregorianCalendar value) {
        this.subAccountExpDate = value;
    }

    /**
     * Obtiene el valor de la propiedad loanTransID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanTransID() {
        return loanTransID;
    }

    /**
     * Define el valor de la propiedad loanTransID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanTransID(String value) {
        this.loanTransID = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalProperty.
     * 
     * @return
     *     possible object is
     *     {@link SimplePropertyType }
     *     
     */
    public SimplePropertyType getAdditionalProperty() {
        return additionalProperty;
    }

    /**
     * Define el valor de la propiedad additionalProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePropertyType }
     *     
     */
    public void setAdditionalProperty(SimplePropertyType value) {
        this.additionalProperty = value;
    }

    /**
     * Obtiene el valor de la propiedad repayMesureID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepayMesureID() {
        return repayMesureID;
    }

    /**
     * Define el valor de la propiedad repayMesureID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepayMesureID(Integer value) {
        this.repayMesureID = value;
    }

    /**
     * Gets the value of the loanOffering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the loanOffering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanOfferingType }
     * 
     * 
     */
    public List<LoanOfferingType> getLoanOffering() {
        if (loanOffering == null) {
            loanOffering = new ArrayList<LoanOfferingType>();
        }
        return this.loanOffering;
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
