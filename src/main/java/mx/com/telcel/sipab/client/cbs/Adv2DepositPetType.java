
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Adv2DepositPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Adv2DepositPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctAccessCodeType"/&gt;
 *         &lt;element name="depositAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="depositType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="expectedReleaseDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adv2DepositPetType", propOrder = {
    "accountAccessCode",
    "depositAmount",
    "depositType",
    "currencyID",
    "expectedReleaseDate",
    "remark",
    "reasonCode",
    "additionalProperty"
})
public class Adv2DepositPetType {

    @XmlElement(required = true)
    protected AcctAccessCodeType accountAccessCode;
    protected long depositAmount;
    @XmlElement(required = true)
    protected String depositType;
    protected Long currencyID;
    protected String expectedReleaseDate;
    protected String remark;
    protected String reasonCode;
    protected List<SimplePropertyType> additionalProperty;

    /**
     * Obtiene el valor de la propiedad accountAccessCode.
     * 
     * @return
     *     possible object is
     *     {@link AcctAccessCodeType }
     *     
     */
    public AcctAccessCodeType getAccountAccessCode() {
        return accountAccessCode;
    }

    /**
     * Define el valor de la propiedad accountAccessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAccessCodeType }
     *     
     */
    public void setAccountAccessCode(AcctAccessCodeType value) {
        this.accountAccessCode = value;
    }

    /**
     * Obtiene el valor de la propiedad depositAmount.
     * 
     */
    public long getDepositAmount() {
        return depositAmount;
    }

    /**
     * Define el valor de la propiedad depositAmount.
     * 
     */
    public void setDepositAmount(long value) {
        this.depositAmount = value;
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
     * Obtiene el valor de la propiedad currencyID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrencyID() {
        return currencyID;
    }

    /**
     * Define el valor de la propiedad currencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrencyID(Long value) {
        this.currencyID = value;
    }

    /**
     * Obtiene el valor de la propiedad expectedReleaseDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedReleaseDate() {
        return expectedReleaseDate;
    }

    /**
     * Define el valor de la propiedad expectedReleaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedReleaseDate(String value) {
        this.expectedReleaseDate = value;
    }

    /**
     * Obtiene el valor de la propiedad remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Define el valor de la propiedad remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
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

}
