
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdjustmentPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentSerialNo" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AdjustmentObjType"/&gt;
 *         &lt;element name="opType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="adjustmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceAdjustmentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitAdjustmentInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitAdjustmentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="invoiceInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}InvoiceInfo2Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentReasonCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentPetType", propOrder = {
    "adjustmentSerialNo",
    "adjustmentObj",
    "opType",
    "adjustmentInfo",
    "freeUnitAdjustmentInfo",
    "invoiceInfo",
    "adjustmentReasonCode",
    "additionalProperty",
    "remark"
})
public class AdjustmentPetType {

    protected String adjustmentSerialNo;
    @XmlElement(required = true)
    protected AdjustmentObjType adjustmentObj;
    @XmlElement(required = true)
    protected String opType;
    protected List<BalanceAdjustmentInfoType> adjustmentInfo;
    protected List<FreeUnitAdjustmentInfoType> freeUnitAdjustmentInfo;
    protected List<InvoiceInfo2Type> invoiceInfo;
    @XmlElement(required = true)
    protected String adjustmentReasonCode;
    protected List<SimplePropertyType> additionalProperty;
    protected String remark;

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
     * Obtiene el valor de la propiedad adjustmentObj.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentObjType }
     *     
     */
    public AdjustmentObjType getAdjustmentObj() {
        return adjustmentObj;
    }

    /**
     * Define el valor de la propiedad adjustmentObj.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentObjType }
     *     
     */
    public void setAdjustmentObj(AdjustmentObjType value) {
        this.adjustmentObj = value;
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
     * {@link BalanceAdjustmentInfoType }
     * 
     * 
     */
    public List<BalanceAdjustmentInfoType> getAdjustmentInfo() {
        if (adjustmentInfo == null) {
            adjustmentInfo = new ArrayList<BalanceAdjustmentInfoType>();
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
     * {@link FreeUnitAdjustmentInfoType }
     * 
     * 
     */
    public List<FreeUnitAdjustmentInfoType> getFreeUnitAdjustmentInfo() {
        if (freeUnitAdjustmentInfo == null) {
            freeUnitAdjustmentInfo = new ArrayList<FreeUnitAdjustmentInfoType>();
        }
        return this.freeUnitAdjustmentInfo;
    }

    /**
     * Gets the value of the invoiceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceInfo2Type }
     * 
     * 
     */
    public List<InvoiceInfo2Type> getInvoiceInfo() {
        if (invoiceInfo == null) {
            invoiceInfo = new ArrayList<InvoiceInfo2Type>();
        }
        return this.invoiceInfo;
    }

    /**
     * Obtiene el valor de la propiedad adjustmentReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }

    /**
     * Define el valor de la propiedad adjustmentReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentReasonCode(String value) {
        this.adjustmentReasonCode = value;
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

}
