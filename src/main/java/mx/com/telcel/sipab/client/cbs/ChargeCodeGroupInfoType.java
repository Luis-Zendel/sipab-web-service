
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChargeCodeGroupInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChargeCodeGroupInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="dueDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaNumerica14Type"/&gt;
 *         &lt;element name="chargeCodeGroup" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="openAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeCodeGroupInfoType", propOrder = {
    "invoiceID",
    "dueDate",
    "chargeCodeGroup",
    "openAmount",
    "currencyID"
})
public class ChargeCodeGroupInfoType {

    protected long invoiceID;
    @XmlElement(required = true)
    protected String dueDate;
    protected String chargeCodeGroup;
    protected Long openAmount;
    @XmlElement(required = true)
    protected BigInteger currencyID;

    /**
     * Obtiene el valor de la propiedad invoiceID.
     * 
     */
    public long getInvoiceID() {
        return invoiceID;
    }

    /**
     * Define el valor de la propiedad invoiceID.
     * 
     */
    public void setInvoiceID(long value) {
        this.invoiceID = value;
    }

    /**
     * Obtiene el valor de la propiedad dueDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Define el valor de la propiedad dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeCodeGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCodeGroup() {
        return chargeCodeGroup;
    }

    /**
     * Define el valor de la propiedad chargeCodeGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCodeGroup(String value) {
        this.chargeCodeGroup = value;
    }

    /**
     * Obtiene el valor de la propiedad openAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOpenAmount() {
        return openAmount;
    }

    /**
     * Define el valor de la propiedad openAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOpenAmount(Long value) {
        this.openAmount = value;
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

}
