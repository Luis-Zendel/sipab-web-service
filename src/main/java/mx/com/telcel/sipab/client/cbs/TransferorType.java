
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransferorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransferorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="balanceChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="handlingChargeAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType" minOccurs="0"/&gt;
 *         &lt;element name="lifeCycleChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LifeCycleChgInfo2Type" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CreditChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferorType", propOrder = {
    "balanceChgInfo",
    "handlingChargeAmt",
    "currencyID",
    "lifeCycleChgInfo",
    "freeUnitChgInfo",
    "creditChgInfo"
})
public class TransferorType {

    protected List<BalanceChgInfoType> balanceChgInfo;
    protected Long handlingChargeAmt;
    protected BigInteger currencyID;
    protected LifeCycleChgInfo2Type lifeCycleChgInfo;
    protected List<FreeUnitChgInfoType> freeUnitChgInfo;
    protected List<CreditChgInfoType> creditChgInfo;

    /**
     * Gets the value of the balanceChgInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the balanceChgInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceChgInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceChgInfoType }
     * 
     * 
     */
    public List<BalanceChgInfoType> getBalanceChgInfo() {
        if (balanceChgInfo == null) {
            balanceChgInfo = new ArrayList<BalanceChgInfoType>();
        }
        return this.balanceChgInfo;
    }

    /**
     * Obtiene el valor de la propiedad handlingChargeAmt.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHandlingChargeAmt() {
        return handlingChargeAmt;
    }

    /**
     * Define el valor de la propiedad handlingChargeAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHandlingChargeAmt(Long value) {
        this.handlingChargeAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyID() {
        return currencyID;
    }

    /**
     * Define el valor de la propiedad currencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyID(BigInteger value) {
        this.currencyID = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeCycleChgInfo.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleChgInfo2Type }
     *     
     */
    public LifeCycleChgInfo2Type getLifeCycleChgInfo() {
        return lifeCycleChgInfo;
    }

    /**
     * Define el valor de la propiedad lifeCycleChgInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleChgInfo2Type }
     *     
     */
    public void setLifeCycleChgInfo(LifeCycleChgInfo2Type value) {
        this.lifeCycleChgInfo = value;
    }

    /**
     * Gets the value of the freeUnitChgInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitChgInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitChgInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitChgInfoType }
     * 
     * 
     */
    public List<FreeUnitChgInfoType> getFreeUnitChgInfo() {
        if (freeUnitChgInfo == null) {
            freeUnitChgInfo = new ArrayList<FreeUnitChgInfoType>();
        }
        return this.freeUnitChgInfo;
    }

    /**
     * Gets the value of the creditChgInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the creditChgInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditChgInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditChgInfoType }
     * 
     * 
     */
    public List<CreditChgInfoType> getCreditChgInfo() {
        if (creditChgInfo == null) {
            creditChgInfo = new ArrayList<CreditChgInfoType>();
        }
        return this.creditChgInfo;
    }

}
