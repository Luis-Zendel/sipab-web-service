
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BalanceDetailType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BalanceDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="balanceInstanceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="amount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="initialAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="effectiveTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *         &lt;element name="expireTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *         &lt;element name="acctBalOriginal" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctBalOriginalType" minOccurs="0"/&gt;
 *         &lt;element name="lastUpdateTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="primaryIdentity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceDetailType", propOrder = {
    "balanceInstanceID",
    "amount",
    "initialAmount",
    "effectiveTime",
    "expireTime",
    "acctBalOriginal",
    "lastUpdateTime",
    "primaryIdentity"
})
public class BalanceDetailType {

    protected long balanceInstanceID;
    protected long amount;
    protected long initialAmount;
    @XmlElement(required = true)
    protected String effectiveTime;
    @XmlElement(required = true)
    protected String expireTime;
    protected AcctBalOriginalType acctBalOriginal;
    protected String lastUpdateTime;
    protected String primaryIdentity;

    /**
     * Obtiene el valor de la propiedad balanceInstanceID.
     * 
     */
    public long getBalanceInstanceID() {
        return balanceInstanceID;
    }

    /**
     * Define el valor de la propiedad balanceInstanceID.
     * 
     */
    public void setBalanceInstanceID(long value) {
        this.balanceInstanceID = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad initialAmount.
     * 
     */
    public long getInitialAmount() {
        return initialAmount;
    }

    /**
     * Define el valor de la propiedad initialAmount.
     * 
     */
    public void setInitialAmount(long value) {
        this.initialAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad effectiveTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Define el valor de la propiedad effectiveTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveTime(String value) {
        this.effectiveTime = value;
    }

    /**
     * Obtiene el valor de la propiedad expireTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * Define el valor de la propiedad expireTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireTime(String value) {
        this.expireTime = value;
    }

    /**
     * Obtiene el valor de la propiedad acctBalOriginal.
     * 
     * @return
     *     possible object is
     *     {@link AcctBalOriginalType }
     *     
     */
    public AcctBalOriginalType getAcctBalOriginal() {
        return acctBalOriginal;
    }

    /**
     * Define el valor de la propiedad acctBalOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBalOriginalType }
     *     
     */
    public void setAcctBalOriginal(AcctBalOriginalType value) {
        this.acctBalOriginal = value;
    }

    /**
     * Obtiene el valor de la propiedad lastUpdateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Define el valor de la propiedad lastUpdateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateTime(String value) {
        this.lastUpdateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryIdentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIdentity() {
        return primaryIdentity;
    }

    /**
     * Define el valor de la propiedad primaryIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIdentity(String value) {
        this.primaryIdentity = value;
    }

}
