
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContractType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContractType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type"/&gt;
 *         &lt;element name="offeringInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type"/&gt;
 *         &lt;element name="contractId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="contractCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="contractType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="periodUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica10Type"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="statusTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType"/&gt;
 *         &lt;element name="maxEndDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="windowDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="notifyDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="prolongPeriodUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="prolongPeriod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="prolongType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="autoProlongFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="reserveDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="reserveAction" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="prolongNewContract" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="prolongOldContract" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractType", propOrder = {
    "contractInstId",
    "offeringInstId",
    "contractId",
    "contractCode",
    "contractType",
    "periodUnit",
    "period",
    "status",
    "statusTime",
    "effDate",
    "expDate",
    "maxEndDate",
    "windowDate",
    "notifyDate",
    "prolongPeriodUnit",
    "prolongPeriod",
    "prolongType",
    "autoProlongFlag",
    "reserveDate",
    "reserveAction",
    "prolongNewContract",
    "prolongOldContract"
})
public class ContractType {

    @XmlElement(required = true)
    protected BigDecimal contractInstId;
    @XmlElement(required = true)
    protected BigDecimal offeringInstId;
    @XmlElement(required = true)
    protected String contractId;
    protected String contractCode;
    protected String contractType;
    protected String periodUnit;
    @XmlElement(required = true)
    protected String period;
    @XmlElement(required = true)
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar windowDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notifyDate;
    protected String prolongPeriodUnit;
    protected String prolongPeriod;
    protected String prolongType;
    protected String autoProlongFlag;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reserveDate;
    protected String reserveAction;
    protected BigDecimal prolongNewContract;
    protected BigDecimal prolongOldContract;

    /**
     * Obtiene el valor de la propiedad contractInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContractInstId() {
        return contractInstId;
    }

    /**
     * Define el valor de la propiedad contractInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContractInstId(BigDecimal value) {
        this.contractInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferingInstId() {
        return offeringInstId;
    }

    /**
     * Define el valor de la propiedad offeringInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferingInstId(BigDecimal value) {
        this.offeringInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad contractId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Define el valor de la propiedad contractId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Obtiene el valor de la propiedad contractCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * Define el valor de la propiedad contractCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCode(String value) {
        this.contractCode = value;
    }

    /**
     * Obtiene el valor de la propiedad contractType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Define el valor de la propiedad contractType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractType(String value) {
        this.contractType = value;
    }

    /**
     * Obtiene el valor de la propiedad periodUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodUnit() {
        return periodUnit;
    }

    /**
     * Define el valor de la propiedad periodUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodUnit(String value) {
        this.periodUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad period.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Define el valor de la propiedad period.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
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
     * Obtiene el valor de la propiedad statusTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusTime() {
        return statusTime;
    }

    /**
     * Define el valor de la propiedad statusTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusTime(XMLGregorianCalendar value) {
        this.statusTime = value;
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
     * Obtiene el valor de la propiedad maxEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxEndDate() {
        return maxEndDate;
    }

    /**
     * Define el valor de la propiedad maxEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxEndDate(XMLGregorianCalendar value) {
        this.maxEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad windowDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWindowDate() {
        return windowDate;
    }

    /**
     * Define el valor de la propiedad windowDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWindowDate(XMLGregorianCalendar value) {
        this.windowDate = value;
    }

    /**
     * Obtiene el valor de la propiedad notifyDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotifyDate() {
        return notifyDate;
    }

    /**
     * Define el valor de la propiedad notifyDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotifyDate(XMLGregorianCalendar value) {
        this.notifyDate = value;
    }

    /**
     * Obtiene el valor de la propiedad prolongPeriodUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProlongPeriodUnit() {
        return prolongPeriodUnit;
    }

    /**
     * Define el valor de la propiedad prolongPeriodUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProlongPeriodUnit(String value) {
        this.prolongPeriodUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad prolongPeriod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProlongPeriod() {
        return prolongPeriod;
    }

    /**
     * Define el valor de la propiedad prolongPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProlongPeriod(String value) {
        this.prolongPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad prolongType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProlongType() {
        return prolongType;
    }

    /**
     * Define el valor de la propiedad prolongType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProlongType(String value) {
        this.prolongType = value;
    }

    /**
     * Obtiene el valor de la propiedad autoProlongFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoProlongFlag() {
        return autoProlongFlag;
    }

    /**
     * Define el valor de la propiedad autoProlongFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoProlongFlag(String value) {
        this.autoProlongFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad reserveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReserveDate() {
        return reserveDate;
    }

    /**
     * Define el valor de la propiedad reserveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReserveDate(XMLGregorianCalendar value) {
        this.reserveDate = value;
    }

    /**
     * Obtiene el valor de la propiedad reserveAction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveAction() {
        return reserveAction;
    }

    /**
     * Define el valor de la propiedad reserveAction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveAction(String value) {
        this.reserveAction = value;
    }

    /**
     * Obtiene el valor de la propiedad prolongNewContract.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProlongNewContract() {
        return prolongNewContract;
    }

    /**
     * Define el valor de la propiedad prolongNewContract.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProlongNewContract(BigDecimal value) {
        this.prolongNewContract = value;
    }

    /**
     * Obtiene el valor de la propiedad prolongOldContract.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProlongOldContract() {
        return prolongOldContract;
    }

    /**
     * Define el valor de la propiedad prolongOldContract.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProlongOldContract(BigDecimal value) {
        this.prolongOldContract = value;
    }

}
