
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentChannelID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="opType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="depositType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}PaymentObjType"/&gt;
 *         &lt;element name="paymentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}PaymentInfoType"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType" minOccurs="0"/&gt;
 *         &lt;element name="expectedReleaseDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica14Type" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
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
@XmlType(name = "PaymentPetType", propOrder = {
    "paymentSerialNo",
    "paymentType",
    "paymentChannelID",
    "opType",
    "depositType",
    "paymentObj",
    "paymentInfo",
    "currencyID",
    "expectedReleaseDate",
    "paymentTime",
    "remark",
    "additionalProperty"
})
public class PaymentPetType {

    protected String paymentSerialNo;
    protected String paymentType;
    protected String paymentChannelID;
    protected String opType;
    protected String depositType;
    @XmlElement(required = true)
    protected PaymentObjType paymentObj;
    @XmlElement(required = true)
    protected PaymentInfoType paymentInfo;
    protected BigInteger currencyID;
    protected String expectedReleaseDate;
    protected String paymentTime;
    protected String remark;
    protected List<SimplePropertyType> additionalProperty;

    /**
     * Obtiene el valor de la propiedad paymentSerialNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSerialNo() {
        return paymentSerialNo;
    }

    /**
     * Define el valor de la propiedad paymentSerialNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSerialNo(String value) {
        this.paymentSerialNo = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Define el valor de la propiedad paymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentChannelID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentChannelID() {
        return paymentChannelID;
    }

    /**
     * Define el valor de la propiedad paymentChannelID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentChannelID(String value) {
        this.paymentChannelID = value;
    }

    /**
     * Obtiene el valor de la propiedad opType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpType() {
        return opType;
    }

    /**
     * Define el valor de la propiedad opType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpType(String value) {
        this.opType = value;
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
     * Obtiene el valor de la propiedad paymentObj.
     * 
     * @return
     *     possible object is
     *     {@link PaymentObjType }
     *     
     */
    public PaymentObjType getPaymentObj() {
        return paymentObj;
    }

    /**
     * Define el valor de la propiedad paymentObj.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentObjType }
     *     
     */
    public void setPaymentObj(PaymentObjType value) {
        this.paymentObj = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentInfo.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoType }
     *     
     */
    public PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Define el valor de la propiedad paymentInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoType }
     *     
     */
    public void setPaymentInfo(PaymentInfoType value) {
        this.paymentInfo = value;
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
     * Obtiene el valor de la propiedad paymentTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTime() {
        return paymentTime;
    }

    /**
     * Define el valor de la propiedad paymentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTime(String value) {
        this.paymentTime = value;
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
