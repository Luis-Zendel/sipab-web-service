
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ValidateCardRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ValidateCardRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interredFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="chargeAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="maxAllowCustRFCs" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="cardClass" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="registeredList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RegisteredCustDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bankCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="bankAcctType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCardRespType", propOrder = {
    "interredFlag",
    "chargeAmount",
    "maxAllowCustRFCs",
    "cardClass",
    "registeredList",
    "bankCode",
    "bankAcctType"
})
public class ValidateCardRespType {

    protected String interredFlag;
    protected String chargeAmount;
    protected String maxAllowCustRFCs;
    protected String cardClass;
    protected List<RegisteredCustDetailType> registeredList;
    protected String bankCode;
    protected String bankAcctType;

    /**
     * Obtiene el valor de la propiedad interredFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterredFlag() {
        return interredFlag;
    }

    /**
     * Define el valor de la propiedad interredFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterredFlag(String value) {
        this.interredFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Define el valor de la propiedad chargeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAmount(String value) {
        this.chargeAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad maxAllowCustRFCs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAllowCustRFCs() {
        return maxAllowCustRFCs;
    }

    /**
     * Define el valor de la propiedad maxAllowCustRFCs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAllowCustRFCs(String value) {
        this.maxAllowCustRFCs = value;
    }

    /**
     * Obtiene el valor de la propiedad cardClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardClass() {
        return cardClass;
    }

    /**
     * Define el valor de la propiedad cardClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardClass(String value) {
        this.cardClass = value;
    }

    /**
     * Gets the value of the registeredList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the registeredList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisteredList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredCustDetailType }
     * 
     * 
     */
    public List<RegisteredCustDetailType> getRegisteredList() {
        if (registeredList == null) {
            registeredList = new ArrayList<RegisteredCustDetailType>();
        }
        return this.registeredList;
    }

    /**
     * Obtiene el valor de la propiedad bankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Define el valor de la propiedad bankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bankAcctType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctType() {
        return bankAcctType;
    }

    /**
     * Define el valor de la propiedad bankAcctType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctType(String value) {
        this.bankAcctType = value;
    }

}
