
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdjustmentRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentSerialNo" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctKeyType"/&gt;
 *         &lt;element name="custKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CustKeyType"/&gt;
 *         &lt;element name="adjustmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitAdjustmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditAdjustmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CreditChgInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lifeCycleChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}LifeCycleChgInfo3Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentRespType", propOrder = {
    "adjustmentSerialNo",
    "acctKey",
    "custKey",
    "adjustmentInfo",
    "freeUnitAdjustmentInfo",
    "creditAdjustmentInfo",
    "lifeCycleChgInfo"
})
public class AdjustmentRespType {

    @XmlElement(required = true)
    protected String adjustmentSerialNo;
    @XmlElement(required = true)
    protected String acctKey;
    @XmlElement(required = true)
    protected String custKey;
    protected List<BalanceChgInfoType> adjustmentInfo;
    protected List<FreeUnitChgInfoType> freeUnitAdjustmentInfo;
    protected List<CreditChgInfoType> creditAdjustmentInfo;
    protected LifeCycleChgInfo3Type lifeCycleChgInfo;

    /**
     * Obtiene el valor de la propiedad adjustmentSerialNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentSerialNo() {
        return adjustmentSerialNo;
    }

    /**
     * Define el valor de la propiedad adjustmentSerialNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentSerialNo(String value) {
        this.adjustmentSerialNo = value;
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
     * Obtiene el valor de la propiedad custKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustKey() {
        return custKey;
    }

    /**
     * Define el valor de la propiedad custKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustKey(String value) {
        this.custKey = value;
    }

    /**
     * Gets the value of the adjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceChgInfoType }
     * 
     * 
     */
    public List<BalanceChgInfoType> getAdjustmentInfo() {
        if (adjustmentInfo == null) {
            adjustmentInfo = new ArrayList<BalanceChgInfoType>();
        }
        return this.adjustmentInfo;
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
     * {@link FreeUnitChgInfoType }
     * 
     * 
     */
    public List<FreeUnitChgInfoType> getFreeUnitAdjustmentInfo() {
        if (freeUnitAdjustmentInfo == null) {
            freeUnitAdjustmentInfo = new ArrayList<FreeUnitChgInfoType>();
        }
        return this.freeUnitAdjustmentInfo;
    }

    /**
     * Gets the value of the creditAdjustmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the creditAdjustmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditAdjustmentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditChgInfoType }
     * 
     * 
     */
    public List<CreditChgInfoType> getCreditAdjustmentInfo() {
        if (creditAdjustmentInfo == null) {
            creditAdjustmentInfo = new ArrayList<CreditChgInfoType>();
        }
        return this.creditAdjustmentInfo;
    }

    /**
     * Obtiene el valor de la propiedad lifeCycleChgInfo.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleChgInfo3Type }
     *     
     */
    public LifeCycleChgInfo3Type getLifeCycleChgInfo() {
        return lifeCycleChgInfo;
    }

    /**
     * Define el valor de la propiedad lifeCycleChgInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleChgInfo3Type }
     *     
     */
    public void setLifeCycleChgInfo(LifeCycleChgInfo3Type value) {
        this.lifeCycleChgInfo = value;
    }

}
