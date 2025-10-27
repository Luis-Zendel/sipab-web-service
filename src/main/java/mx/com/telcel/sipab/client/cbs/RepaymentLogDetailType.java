
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RepaymentLogDetailType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RepaymentLogDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *         &lt;element name="operType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="initLoanDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *         &lt;element name="initLoanAMT" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="initLoanPoundage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="repayAMT" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="repayPoundage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="remainingAMT" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="remainingPoundage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="loanGrade" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType"/&gt;
 *         &lt;element name="sPID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="loanTransID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="transID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepaymentLogDetailType", propOrder = {
    "operDate",
    "operType",
    "initLoanDate",
    "initLoanAMT",
    "initLoanPoundage",
    "repayAMT",
    "repayPoundage",
    "remainingAMT",
    "remainingPoundage",
    "loanGrade",
    "spid",
    "loanTransID",
    "transID"
})
public class RepaymentLogDetailType {

    @XmlElement(required = true)
    protected String operDate;
    @XmlElement(required = true)
    protected String operType;
    @XmlElement(required = true)
    protected String initLoanDate;
    protected long initLoanAMT;
    protected long initLoanPoundage;
    protected long repayAMT;
    protected long repayPoundage;
    protected long remainingAMT;
    protected long remainingPoundage;
    protected int loanGrade;
    @XmlElement(name = "sPID", required = true)
    protected String spid;
    @XmlElement(required = true)
    protected String loanTransID;
    @XmlElement(required = true)
    protected String transID;

    /**
     * Obtiene el valor de la propiedad operDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperDate() {
        return operDate;
    }

    /**
     * Define el valor de la propiedad operDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperDate(String value) {
        this.operDate = value;
    }

    /**
     * Obtiene el valor de la propiedad operType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperType() {
        return operType;
    }

    /**
     * Define el valor de la propiedad operType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperType(String value) {
        this.operType = value;
    }

    /**
     * Obtiene el valor de la propiedad initLoanDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitLoanDate() {
        return initLoanDate;
    }

    /**
     * Define el valor de la propiedad initLoanDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitLoanDate(String value) {
        this.initLoanDate = value;
    }

    /**
     * Obtiene el valor de la propiedad initLoanAMT.
     * 
     */
    public long getInitLoanAMT() {
        return initLoanAMT;
    }

    /**
     * Define el valor de la propiedad initLoanAMT.
     * 
     */
    public void setInitLoanAMT(long value) {
        this.initLoanAMT = value;
    }

    /**
     * Obtiene el valor de la propiedad initLoanPoundage.
     * 
     */
    public long getInitLoanPoundage() {
        return initLoanPoundage;
    }

    /**
     * Define el valor de la propiedad initLoanPoundage.
     * 
     */
    public void setInitLoanPoundage(long value) {
        this.initLoanPoundage = value;
    }

    /**
     * Obtiene el valor de la propiedad repayAMT.
     * 
     */
    public long getRepayAMT() {
        return repayAMT;
    }

    /**
     * Define el valor de la propiedad repayAMT.
     * 
     */
    public void setRepayAMT(long value) {
        this.repayAMT = value;
    }

    /**
     * Obtiene el valor de la propiedad repayPoundage.
     * 
     */
    public long getRepayPoundage() {
        return repayPoundage;
    }

    /**
     * Define el valor de la propiedad repayPoundage.
     * 
     */
    public void setRepayPoundage(long value) {
        this.repayPoundage = value;
    }

    /**
     * Obtiene el valor de la propiedad remainingAMT.
     * 
     */
    public long getRemainingAMT() {
        return remainingAMT;
    }

    /**
     * Define el valor de la propiedad remainingAMT.
     * 
     */
    public void setRemainingAMT(long value) {
        this.remainingAMT = value;
    }

    /**
     * Obtiene el valor de la propiedad remainingPoundage.
     * 
     */
    public long getRemainingPoundage() {
        return remainingPoundage;
    }

    /**
     * Define el valor de la propiedad remainingPoundage.
     * 
     */
    public void setRemainingPoundage(long value) {
        this.remainingPoundage = value;
    }

    /**
     * Obtiene el valor de la propiedad loanGrade.
     * 
     */
    public int getLoanGrade() {
        return loanGrade;
    }

    /**
     * Define el valor de la propiedad loanGrade.
     * 
     */
    public void setLoanGrade(int value) {
        this.loanGrade = value;
    }

    /**
     * Obtiene el valor de la propiedad spid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPID() {
        return spid;
    }

    /**
     * Define el valor de la propiedad spid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPID(String value) {
        this.spid = value;
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
     * Obtiene el valor de la propiedad transID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransID() {
        return transID;
    }

    /**
     * Define el valor de la propiedad transID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransID(String value) {
        this.transID = value;
    }

}
