
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoanLogDetailType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoanLogDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loanID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica90Type"/&gt;
 *         &lt;element name="initLoanAMT" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="initLoanDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *         &lt;element name="initLoanPoundage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="repaymentAMT" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="loanStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="paidAMT" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="remainingAMT" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="graceDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="paidPoundage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="remainingPoundage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="remainingTotal" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="forceGraceDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *         &lt;element name="loanGrade" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType"/&gt;
 *         &lt;element name="sPID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="loanTransID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="operType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitItemList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitItemListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="balanceList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bonusofferlist" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BonusofferlistType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanLogDetailType", propOrder = {
    "loanID",
    "initLoanAMT",
    "initLoanDate",
    "initLoanPoundage",
    "repaymentAMT",
    "loanStatus",
    "paidAMT",
    "remainingAMT",
    "graceDate",
    "paidPoundage",
    "remainingPoundage",
    "remainingTotal",
    "forceGraceDate",
    "loanGrade",
    "spid",
    "loanTransID",
    "operType",
    "additionalProperty",
    "freeUnitItemList",
    "balanceList",
    "bonusofferlist"
})
public class LoanLogDetailType {

    @XmlElement(required = true)
    protected String loanID;
    protected long initLoanAMT;
    @XmlElement(required = true)
    protected String initLoanDate;
    protected Long initLoanPoundage;
    protected long repaymentAMT;
    @XmlElement(required = true)
    protected String loanStatus;
    protected long paidAMT;
    protected long remainingAMT;
    protected String graceDate;
    protected long paidPoundage;
    protected long remainingPoundage;
    protected long remainingTotal;
    @XmlElement(required = true)
    protected String forceGraceDate;
    protected int loanGrade;
    @XmlElement(name = "sPID", required = true)
    protected String spid;
    @XmlElement(required = true)
    protected String loanTransID;
    @XmlElement(required = true)
    protected String operType;
    protected List<SimplePropertyType> additionalProperty;
    protected List<FreeUnitItemListType> freeUnitItemList;
    protected List<BalanceListType> balanceList;
    protected List<BonusofferlistType> bonusofferlist;

    /**
     * Obtiene el valor de la propiedad loanID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanID() {
        return loanID;
    }

    /**
     * Define el valor de la propiedad loanID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanID(String value) {
        this.loanID = value;
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
     * Obtiene el valor de la propiedad initLoanPoundage.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInitLoanPoundage() {
        return initLoanPoundage;
    }

    /**
     * Define el valor de la propiedad initLoanPoundage.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInitLoanPoundage(Long value) {
        this.initLoanPoundage = value;
    }

    /**
     * Obtiene el valor de la propiedad repaymentAMT.
     * 
     */
    public long getRepaymentAMT() {
        return repaymentAMT;
    }

    /**
     * Define el valor de la propiedad repaymentAMT.
     * 
     */
    public void setRepaymentAMT(long value) {
        this.repaymentAMT = value;
    }

    /**
     * Obtiene el valor de la propiedad loanStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatus() {
        return loanStatus;
    }

    /**
     * Define el valor de la propiedad loanStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatus(String value) {
        this.loanStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad paidAMT.
     * 
     */
    public long getPaidAMT() {
        return paidAMT;
    }

    /**
     * Define el valor de la propiedad paidAMT.
     * 
     */
    public void setPaidAMT(long value) {
        this.paidAMT = value;
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
     * Obtiene el valor de la propiedad graceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraceDate() {
        return graceDate;
    }

    /**
     * Define el valor de la propiedad graceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraceDate(String value) {
        this.graceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paidPoundage.
     * 
     */
    public long getPaidPoundage() {
        return paidPoundage;
    }

    /**
     * Define el valor de la propiedad paidPoundage.
     * 
     */
    public void setPaidPoundage(long value) {
        this.paidPoundage = value;
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
     * Obtiene el valor de la propiedad remainingTotal.
     * 
     */
    public long getRemainingTotal() {
        return remainingTotal;
    }

    /**
     * Define el valor de la propiedad remainingTotal.
     * 
     */
    public void setRemainingTotal(long value) {
        this.remainingTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad forceGraceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceGraceDate() {
        return forceGraceDate;
    }

    /**
     * Define el valor de la propiedad forceGraceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceGraceDate(String value) {
        this.forceGraceDate = value;
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
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyType }
     * 
     * 
     */
    public List<SimplePropertyType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<SimplePropertyType>();
        }
        return this.additionalProperty;
    }

    /**
     * Gets the value of the freeUnitItemList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitItemList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitItemList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitItemListType }
     * 
     * 
     */
    public List<FreeUnitItemListType> getFreeUnitItemList() {
        if (freeUnitItemList == null) {
            freeUnitItemList = new ArrayList<FreeUnitItemListType>();
        }
        return this.freeUnitItemList;
    }

    /**
     * Gets the value of the balanceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the balanceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceListType }
     * 
     * 
     */
    public List<BalanceListType> getBalanceList() {
        if (balanceList == null) {
            balanceList = new ArrayList<BalanceListType>();
        }
        return this.balanceList;
    }

    /**
     * Gets the value of the bonusofferlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bonusofferlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBonusofferlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BonusofferlistType }
     * 
     * 
     */
    public List<BonusofferlistType> getBonusofferlist() {
        if (bonusofferlist == null) {
            bonusofferlist = new ArrayList<BonusofferlistType>();
        }
        return this.bonusofferlist;
    }

}
