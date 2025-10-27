
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DepositBalanceListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DepositBalanceListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctKeyType"/&gt;
 *         &lt;element name="creditID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="depositType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="amount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="initialAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/&gt;
 *         &lt;element name="depositOrigin" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DepositOriginType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositBalanceListType", propOrder = {
    "acctKey",
    "creditID",
    "depositType",
    "amount",
    "initialAmount",
    "currencyID",
    "depositOrigin"
})
public class DepositBalanceListType {

    @XmlElement(required = true)
    protected String acctKey;
    @XmlElement(required = true)
    protected String creditID;
    @XmlElement(required = true)
    protected String depositType;
    protected long amount;
    protected long initialAmount;
    @XmlElement(required = true)
    protected BigInteger currencyID;
    protected List<DepositOriginType> depositOrigin;

    /**
     * Obtiene el valor de la propiedad acctKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctKey() {
        return acctKey;
    }

    /**
     * Define el valor de la propiedad acctKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctKey(String value) {
        this.acctKey = value;
    }

    /**
     * Obtiene el valor de la propiedad creditID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditID() {
        return creditID;
    }

    /**
     * Define el valor de la propiedad creditID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditID(String value) {
        this.creditID = value;
    }

    /**
     * Obtiene el valor de la propiedad depositType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositType() {
        return depositType;
    }

    /**
     * Define el valor de la propiedad depositType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositType(String value) {
        this.depositType = value;
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
     * Gets the value of the depositOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the depositOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepositOriginType }
     * 
     * 
     */
    public List<DepositOriginType> getDepositOrigin() {
        if (depositOrigin == null) {
            depositOrigin = new ArrayList<DepositOriginType>();
        }
        return this.depositOrigin;
    }

}
