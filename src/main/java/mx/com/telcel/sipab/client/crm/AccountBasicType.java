
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountBasicType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountBasicType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="acctId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="acctName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica256Type"/&gt;
 *         &lt;element name="acctClass" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica4Type"/&gt;
 *         &lt;element name="acctSegment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}AcctSegmentV2Type" minOccurs="0"/&gt;
 *         &lt;element name="acctMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}AcctModev2Type" minOccurs="0"/&gt;
 *         &lt;element name="pAcctId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="paymentType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica2Type"/&gt;
 *         &lt;element name="paymentMethod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="currencyId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaNumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="billCycleTypeId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}BillCycleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="dunningFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica8Type" minOccurs="0"/&gt;
 *         &lt;element name="billLang" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaNumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="regionCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="regionId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="collectionProcessFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="regimenFiscal" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}RegimenFiscalType" minOccurs="0"/&gt;
 *         &lt;element name="CFDIServicio" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CFDIServicioType" minOccurs="0"/&gt;
 *         &lt;element name="CFDIEquipo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CFDIEquipoType" minOccurs="0"/&gt;
 *         &lt;element name="acctProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}SimplePropertyCRMType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBasicType", propOrder = {
    "acctCode",
    "acctId",
    "acctName",
    "acctClass",
    "acctSegment",
    "acctMode",
    "pAcctId",
    "paymentType",
    "paymentMethod",
    "currencyId",
    "billCycleTypeId",
    "status",
    "dunningFlag",
    "billLang",
    "regionCode",
    "regionId",
    "collectionProcessFlag",
    "regimenFiscal",
    "cfdiServicio",
    "cfdiEquipo",
    "acctProperty"
})
public class AccountBasicType {

    @XmlElement(required = true)
    protected String acctCode;
    protected BigDecimal acctId;
    @XmlElement(required = true)
    protected String acctName;
    @XmlElement(required = true)
    protected String acctClass;
    protected String acctSegment;
    protected String acctMode;
    protected BigDecimal pAcctId;
    @XmlElement(required = true)
    protected String paymentType;
    protected String paymentMethod;
    protected String currencyId;
    protected List<BillCycleType> billCycleTypeId;
    @XmlElement(required = true)
    protected String status;
    protected String dunningFlag;
    protected String billLang;
    protected String regionCode;
    protected BigDecimal regionId;
    protected String collectionProcessFlag;
    protected String regimenFiscal;
    @XmlElement(name = "CFDIServicio")
    protected String cfdiServicio;
    @XmlElement(name = "CFDIEquipo")
    protected String cfdiEquipo;
    protected List<SimplePropertyCRMType> acctProperty;

    /**
     * Obtiene el valor de la propiedad acctCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Define el valor de la propiedad acctCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCode(String value) {
        this.acctCode = value;
    }

    /**
     * Obtiene el valor de la propiedad acctId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctId() {
        return acctId;
    }

    /**
     * Define el valor de la propiedad acctId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcctId(BigDecimal value) {
        this.acctId = value;
    }

    /**
     * Obtiene el valor de la propiedad acctName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * Define el valor de la propiedad acctName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * Obtiene el valor de la propiedad acctClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctClass() {
        return acctClass;
    }

    /**
     * Define el valor de la propiedad acctClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctClass(String value) {
        this.acctClass = value;
    }

    /**
     * Obtiene el valor de la propiedad acctSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSegment() {
        return acctSegment;
    }

    /**
     * Define el valor de la propiedad acctSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSegment(String value) {
        this.acctSegment = value;
    }

    /**
     * Obtiene el valor de la propiedad acctMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctMode() {
        return acctMode;
    }

    /**
     * Define el valor de la propiedad acctMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctMode(String value) {
        this.acctMode = value;
    }

    /**
     * Obtiene el valor de la propiedad pAcctId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPAcctId() {
        return pAcctId;
    }

    /**
     * Define el valor de la propiedad pAcctId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPAcctId(BigDecimal value) {
        this.pAcctId = value;
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
     * Obtiene el valor de la propiedad paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Define el valor de la propiedad paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * Define el valor de la propiedad currencyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyId(String value) {
        this.currencyId = value;
    }

    /**
     * Gets the value of the billCycleTypeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the billCycleTypeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillCycleTypeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillCycleType }
     * 
     * 
     */
    public List<BillCycleType> getBillCycleTypeId() {
        if (billCycleTypeId == null) {
            billCycleTypeId = new ArrayList<BillCycleType>();
        }
        return this.billCycleTypeId;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad dunningFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunningFlag() {
        return dunningFlag;
    }

    /**
     * Define el valor de la propiedad dunningFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunningFlag(String value) {
        this.dunningFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad billLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillLang() {
        return billLang;
    }

    /**
     * Define el valor de la propiedad billLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillLang(String value) {
        this.billLang = value;
    }

    /**
     * Obtiene el valor de la propiedad regionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Define el valor de la propiedad regionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad regionId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegionId() {
        return regionId;
    }

    /**
     * Define el valor de la propiedad regionId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegionId(BigDecimal value) {
        this.regionId = value;
    }

    /**
     * Obtiene el valor de la propiedad collectionProcessFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionProcessFlag() {
        return collectionProcessFlag;
    }

    /**
     * Define el valor de la propiedad collectionProcessFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionProcessFlag(String value) {
        this.collectionProcessFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    /**
     * Define el valor de la propiedad regimenFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscal(String value) {
        this.regimenFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFDIServicio() {
        return cfdiServicio;
    }

    /**
     * Define el valor de la propiedad cfdiServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFDIServicio(String value) {
        this.cfdiServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad cfdiEquipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFDIEquipo() {
        return cfdiEquipo;
    }

    /**
     * Define el valor de la propiedad cfdiEquipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFDIEquipo(String value) {
        this.cfdiEquipo = value;
    }

    /**
     * Gets the value of the acctProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the acctProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyCRMType }
     * 
     * 
     */
    public List<SimplePropertyCRMType> getAcctProperty() {
        if (acctProperty == null) {
            acctProperty = new ArrayList<SimplePropertyCRMType>();
        }
        return this.acctProperty;
    }

}
