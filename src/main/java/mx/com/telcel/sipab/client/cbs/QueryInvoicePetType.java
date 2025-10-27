
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryInvoicePetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryInvoicePetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctAccessCodePayType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="billCycleID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *           &lt;element name="invoiceNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *           &lt;element name="timePeriod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TimePeriodType"/&gt;
 *           &lt;element name="numberOfBillCycle" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *           &lt;element name="outstandingFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *           &lt;element name="openAmountOfAcctFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *           &lt;element name="queryAnacrFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="serviceTypeFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="totalRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="beginRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="fetchRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInvoicePetType", propOrder = {
    "acctAccessCode",
    "billCycleID",
    "invoiceNo",
    "timePeriod",
    "numberOfBillCycle",
    "outstandingFlag",
    "openAmountOfAcctFlag",
    "queryAnacrFlag",
    "serviceTypeFlag",
    "totalRowNum",
    "beginRowNum",
    "fetchRowNum"
})
public class QueryInvoicePetType {

    @XmlElement(required = true)
    protected AcctAccessCodePayType acctAccessCode;
    protected String billCycleID;
    protected String invoiceNo;
    protected TimePeriodType timePeriod;
    protected Long numberOfBillCycle;
    protected String outstandingFlag;
    protected String openAmountOfAcctFlag;
    protected String queryAnacrFlag;
    protected String serviceTypeFlag;
    protected Long totalRowNum;
    protected Long beginRowNum;
    protected Long fetchRowNum;

    /**
     * Obtiene el valor de la propiedad acctAccessCode.
     * 
     * @return
     *     possible object is
     *     {@link AcctAccessCodePayType }
     *     
     */
    public AcctAccessCodePayType getAcctAccessCode() {
        return acctAccessCode;
    }

    /**
     * Define el valor de la propiedad acctAccessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAccessCodePayType }
     *     
     */
    public void setAcctAccessCode(AcctAccessCodePayType value) {
        this.acctAccessCode = value;
    }

    /**
     * Obtiene el valor de la propiedad billCycleID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleID() {
        return billCycleID;
    }

    /**
     * Define el valor de la propiedad billCycleID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleID(String value) {
        this.billCycleID = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Define el valor de la propiedad invoiceNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    /**
     * Obtiene el valor de la propiedad timePeriod.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Define el valor de la propiedad timePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad numberOfBillCycle.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfBillCycle() {
        return numberOfBillCycle;
    }

    /**
     * Define el valor de la propiedad numberOfBillCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfBillCycle(Long value) {
        this.numberOfBillCycle = value;
    }

    /**
     * Obtiene el valor de la propiedad outstandingFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutstandingFlag() {
        return outstandingFlag;
    }

    /**
     * Define el valor de la propiedad outstandingFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutstandingFlag(String value) {
        this.outstandingFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad openAmountOfAcctFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAmountOfAcctFlag() {
        return openAmountOfAcctFlag;
    }

    /**
     * Define el valor de la propiedad openAmountOfAcctFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAmountOfAcctFlag(String value) {
        this.openAmountOfAcctFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad queryAnacrFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryAnacrFlag() {
        return queryAnacrFlag;
    }

    /**
     * Define el valor de la propiedad queryAnacrFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryAnacrFlag(String value) {
        this.queryAnacrFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceTypeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeFlag() {
        return serviceTypeFlag;
    }

    /**
     * Define el valor de la propiedad serviceTypeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeFlag(String value) {
        this.serviceTypeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRowNum() {
        return totalRowNum;
    }

    /**
     * Define el valor de la propiedad totalRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRowNum(Long value) {
        this.totalRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad beginRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBeginRowNum() {
        return beginRowNum;
    }

    /**
     * Define el valor de la propiedad beginRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBeginRowNum(Long value) {
        this.beginRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad fetchRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFetchRowNum() {
        return fetchRowNum;
    }

    /**
     * Define el valor de la propiedad fetchRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFetchRowNum(Long value) {
        this.fetchRowNum = value;
    }

}
