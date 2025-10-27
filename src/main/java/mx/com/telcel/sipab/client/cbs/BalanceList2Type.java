
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BalanceList2Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BalanceList2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="balanceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="balanceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="balanceTypeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica50Type"/&gt;
 *         &lt;element name="rollBonusAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/&gt;
 *         &lt;element name="effectiveTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *         &lt;element name="expireTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *         &lt;element name="newBalanceAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceList2Type", propOrder = {
    "balanceType",
    "balanceID",
    "balanceTypeName",
    "rollBonusAmt",
    "currencyID",
    "effectiveTime",
    "expireTime",
    "newBalanceAmt"
})
public class BalanceList2Type {

    @XmlElement(required = true)
    protected String balanceType;
    protected String balanceID;
    @XmlElement(required = true)
    protected String balanceTypeName;
    protected long rollBonusAmt;
    @XmlElement(required = true)
    protected BigInteger currencyID;
    @XmlElement(required = true)
    protected String effectiveTime;
    @XmlElement(required = true)
    protected String expireTime;
    protected long newBalanceAmt;

    /**
     * Obtiene el valor de la propiedad balanceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceType() {
        return balanceType;
    }

    /**
     * Define el valor de la propiedad balanceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceType(String value) {
        this.balanceType = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceID() {
        return balanceID;
    }

    /**
     * Define el valor de la propiedad balanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceID(String value) {
        this.balanceID = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceTypeName() {
        return balanceTypeName;
    }

    /**
     * Define el valor de la propiedad balanceTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceTypeName(String value) {
        this.balanceTypeName = value;
    }

    /**
     * Obtiene el valor de la propiedad rollBonusAmt.
     * 
     */
    public long getRollBonusAmt() {
        return rollBonusAmt;
    }

    /**
     * Define el valor de la propiedad rollBonusAmt.
     * 
     */
    public void setRollBonusAmt(long value) {
        this.rollBonusAmt = value;
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
     * Obtiene el valor de la propiedad newBalanceAmt.
     * 
     */
    public long getNewBalanceAmt() {
        return newBalanceAmt;
    }

    /**
     * Define el valor de la propiedad newBalanceAmt.
     * 
     */
    public void setNewBalanceAmt(long value) {
        this.newBalanceAmt = value;
    }

}
