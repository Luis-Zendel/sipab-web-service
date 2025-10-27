
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RechargeRollBackRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RechargeRollBackRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rechargeSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="balanceRollBack" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="loanRollBack" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LoanChgInfoType" minOccurs="0"/&gt;
 *         &lt;element name="bonusRollBack" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BonusRollBackType" minOccurs="0"/&gt;
 *         &lt;element name="lifeCycleRollBack" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LifeCycleRollBackType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargeRollBackRespType", propOrder = {
    "rechargeSerialNo",
    "balanceRollBack",
    "loanRollBack",
    "bonusRollBack",
    "lifeCycleRollBack"
})
public class RechargeRollBackRespType {

    @XmlElement(required = true)
    protected String rechargeSerialNo;
    protected List<BalanceChgInfoType> balanceRollBack;
    protected LoanChgInfoType loanRollBack;
    protected BonusRollBackType bonusRollBack;
    protected LifeCycleRollBackType lifeCycleRollBack;

    /**
     * Obtiene el valor de la propiedad rechargeSerialNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeSerialNo() {
        return rechargeSerialNo;
    }

    /**
     * Define el valor de la propiedad rechargeSerialNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeSerialNo(String value) {
        this.rechargeSerialNo = value;
    }

    /**
     * Gets the value of the balanceRollBack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the balanceRollBack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceRollBack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceChgInfoType }
     * 
     * 
     */
    public List<BalanceChgInfoType> getBalanceRollBack() {
        if (balanceRollBack == null) {
            balanceRollBack = new ArrayList<BalanceChgInfoType>();
        }
        return this.balanceRollBack;
    }

    /**
     * Obtiene el valor de la propiedad loanRollBack.
     * 
     * @return
     *     possible object is
     *     {@link LoanChgInfoType }
     *     
     */
    public LoanChgInfoType getLoanRollBack() {
        return loanRollBack;
    }

    /**
     * Define el valor de la propiedad loanRollBack.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanChgInfoType }
     *     
     */
    public void setLoanRollBack(LoanChgInfoType value) {
        this.loanRollBack = value;
    }

    /**
     * Obtiene el valor de la propiedad bonusRollBack.
     * 
     * @return
     *     possible object is
     *     {@link BonusRollBackType }
     *     
     */
    public BonusRollBackType getBonusRollBack() {
        return bonusRollBack;
    }

    /**
     * Define el valor de la propiedad bonusRollBack.
     * 
     * @param value
     *     allowed object is
     *     {@link BonusRollBackType }
     *     
     */
    public void setBonusRollBack(BonusRollBackType value) {
        this.bonusRollBack = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeCycleRollBack.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleRollBackType }
     *     
     */
    public LifeCycleRollBackType getLifeCycleRollBack() {
        return lifeCycleRollBack;
    }

    /**
     * Define el valor de la propiedad lifeCycleRollBack.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleRollBackType }
     *     
     */
    public void setLifeCycleRollBack(LifeCycleRollBackType value) {
        this.lifeCycleRollBack = value;
    }

}
