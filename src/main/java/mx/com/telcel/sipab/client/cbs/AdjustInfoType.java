
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdjustInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdjustInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctKeyType"/&gt;
 *         &lt;element name="subKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="primaryIdentity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="channelID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica8Type" minOccurs="0"/&gt;
 *         &lt;element name="transID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="extTransID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitAdjustmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitAdjustmentInfo2Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="balanceAdjustmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceAdjustmentInfo2Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="operID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="deptID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica512Type" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
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
@XmlType(name = "AdjustInfoType", propOrder = {
    "tradeTime",
    "acctKey",
    "subKey",
    "primaryIdentity",
    "channelID",
    "transID",
    "extTransID",
    "freeUnitAdjustmentInfo",
    "balanceAdjustmentInfo",
    "operID",
    "deptID",
    "remark",
    "reason",
    "additionalProperty"
})
public class AdjustInfoType {

    @XmlElement(required = true)
    protected String tradeTime;
    @XmlElement(required = true)
    protected String acctKey;
    protected String subKey;
    protected String primaryIdentity;
    protected String channelID;
    protected long transID;
    protected String extTransID;
    protected List<FreeUnitAdjustmentInfo2Type> freeUnitAdjustmentInfo;
    protected List<BalanceAdjustmentInfo2Type> balanceAdjustmentInfo;
    protected Long operID;
    protected Long deptID;
    protected String remark;
    @XmlElement(required = true)
    protected String reason;
    protected List<SimplePropertyType> additionalProperty;

    /**
     * Obtiene el valor de la propiedad tradeTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeTime() {
        return tradeTime;
    }

    /**
     * Define el valor de la propiedad tradeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeTime(String value) {
        this.tradeTime = value;
    }

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
     * Obtiene el valor de la propiedad subKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubKey() {
        return subKey;
    }

    /**
     * Define el valor de la propiedad subKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubKey(String value) {
        this.subKey = value;
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

    /**
     * Obtiene el valor de la propiedad channelID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * Define el valor de la propiedad channelID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelID(String value) {
        this.channelID = value;
    }

    /**
     * Obtiene el valor de la propiedad transID.
     * 
     */
    public long getTransID() {
        return transID;
    }

    /**
     * Define el valor de la propiedad transID.
     * 
     */
    public void setTransID(long value) {
        this.transID = value;
    }

    /**
     * Obtiene el valor de la propiedad extTransID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTransID() {
        return extTransID;
    }

    /**
     * Define el valor de la propiedad extTransID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTransID(String value) {
        this.extTransID = value;
    }

    /**
     * Gets the value of the freeUnitAdjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitAdjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitAdjustmentInfo2Type }
     * 
     * 
     */
    public List<FreeUnitAdjustmentInfo2Type> getFreeUnitAdjustmentInfo() {
        if (freeUnitAdjustmentInfo == null) {
            freeUnitAdjustmentInfo = new ArrayList<FreeUnitAdjustmentInfo2Type>();
        }
        return this.freeUnitAdjustmentInfo;
    }

    /**
     * Gets the value of the balanceAdjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the balanceAdjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceAdjustmentInfo2Type }
     * 
     * 
     */
    public List<BalanceAdjustmentInfo2Type> getBalanceAdjustmentInfo() {
        if (balanceAdjustmentInfo == null) {
            balanceAdjustmentInfo = new ArrayList<BalanceAdjustmentInfo2Type>();
        }
        return this.balanceAdjustmentInfo;
    }

    /**
     * Obtiene el valor de la propiedad operID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperID() {
        return operID;
    }

    /**
     * Define el valor de la propiedad operID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperID(Long value) {
        this.operID = value;
    }

    /**
     * Obtiene el valor de la propiedad deptID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeptID() {
        return deptID;
    }

    /**
     * Define el valor de la propiedad deptID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeptID(Long value) {
        this.deptID = value;
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
     * Obtiene el valor de la propiedad reason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Define el valor de la propiedad reason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
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
