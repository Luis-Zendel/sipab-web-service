
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RechargePetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RechargePetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rechargeSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="rechargeType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="rechargeChannelID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="rechargeObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RechargeObjType"/&gt;
 *         &lt;element name="rechargeInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RechargeInfoType"/&gt;
 *         &lt;element name="currencyID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CurrencyIDType" minOccurs="0"/&gt;
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
@XmlType(name = "RechargePetType", propOrder = {
    "rechargeSerialNo",
    "rechargeType",
    "rechargeChannelID",
    "rechargeObj",
    "rechargeInfo",
    "currencyID",
    "additionalProperty"
})
public class RechargePetType {

    protected String rechargeSerialNo;
    protected String rechargeType;
    protected String rechargeChannelID;
    @XmlElement(required = true)
    protected RechargeObjType rechargeObj;
    @XmlElement(required = true)
    protected RechargeInfoType rechargeInfo;
    protected BigInteger currencyID;
    protected List<SimplePropertyType> additionalProperty;

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
     * Obtiene el valor de la propiedad rechargeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeType() {
        return rechargeType;
    }

    /**
     * Define el valor de la propiedad rechargeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeType(String value) {
        this.rechargeType = value;
    }

    /**
     * Obtiene el valor de la propiedad rechargeChannelID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeChannelID() {
        return rechargeChannelID;
    }

    /**
     * Define el valor de la propiedad rechargeChannelID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeChannelID(String value) {
        this.rechargeChannelID = value;
    }

    /**
     * Obtiene el valor de la propiedad rechargeObj.
     * 
     * @return
     *     possible object is
     *     {@link RechargeObjType }
     *     
     */
    public RechargeObjType getRechargeObj() {
        return rechargeObj;
    }

    /**
     * Define el valor de la propiedad rechargeObj.
     * 
     * @param value
     *     allowed object is
     *     {@link RechargeObjType }
     *     
     */
    public void setRechargeObj(RechargeObjType value) {
        this.rechargeObj = value;
    }

    /**
     * Obtiene el valor de la propiedad rechargeInfo.
     * 
     * @return
     *     possible object is
     *     {@link RechargeInfoType }
     *     
     */
    public RechargeInfoType getRechargeInfo() {
        return rechargeInfo;
    }

    /**
     * Define el valor de la propiedad rechargeInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link RechargeInfoType }
     *     
     */
    public void setRechargeInfo(RechargeInfoType value) {
        this.rechargeInfo = value;
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
