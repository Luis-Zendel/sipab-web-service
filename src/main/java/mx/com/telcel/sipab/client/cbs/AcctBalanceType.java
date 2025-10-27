
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcctBalanceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcctBalanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="balanceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="balanceTypeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="reservedAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="depositFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="refundFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/&gt;
 *         &lt;element name="balanceDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceDetailType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ARBalance" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctBalanceType", propOrder = {
    "balanceType",
    "balanceTypeName",
    "totalAmount",
    "reservedAmount",
    "depositFlag",
    "refundFlag",
    "currencyID",
    "balanceDetail",
    "arBalance"
})
public class AcctBalanceType {

    @XmlElement(required = true)
    protected String balanceType;
    protected String balanceTypeName;
    protected long totalAmount;
    protected Long reservedAmount;
    @XmlElement(required = true)
    protected String depositFlag;
    @XmlElement(required = true)
    protected String refundFlag;
    @XmlElement(required = true)
    protected BigInteger currencyID;
    @XmlElement(required = true)
    protected List<BalanceDetailType> balanceDetail;
    @XmlElement(name = "ARBalance")
    protected Long arBalance;

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
     * Obtiene el valor de la propiedad totalAmount.
     * 
     */
    public long getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     */
    public void setTotalAmount(long value) {
        this.totalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad reservedAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservedAmount() {
        return reservedAmount;
    }

    /**
     * Define el valor de la propiedad reservedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservedAmount(Long value) {
        this.reservedAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad depositFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositFlag() {
        return depositFlag;
    }

    /**
     * Define el valor de la propiedad depositFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositFlag(String value) {
        this.depositFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad refundFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundFlag() {
        return refundFlag;
    }

    /**
     * Define el valor de la propiedad refundFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundFlag(String value) {
        this.refundFlag = value;
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
     * Gets the value of the balanceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the balanceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceDetailType }
     * 
     * 
     */
    public List<BalanceDetailType> getBalanceDetail() {
        if (balanceDetail == null) {
            balanceDetail = new ArrayList<BalanceDetailType>();
        }
        return this.balanceDetail;
    }

    /**
     * Obtiene el valor de la propiedad arBalance.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getARBalance() {
        return arBalance;
    }

    /**
     * Define el valor de la propiedad arBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setARBalance(Long value) {
        this.arBalance = value;
    }

}
