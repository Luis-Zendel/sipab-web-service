
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChildAttrListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChildAttrListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attrId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="attributeCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="attrType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="isComplex" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="isNullable" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="isReassignable" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="isInstantiable" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="attrValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="attributeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="defaultValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="backgroundValidator" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="isInherited" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="valueScope" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4000Type" minOccurs="0"/&gt;
 *         &lt;element name="newValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="oldValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="allowChanage" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="attributeInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="inputType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="dataType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="firstassignEffectMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="changeEffectMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="delEffectMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="childAttrList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica100Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildAttrListType", propOrder = {
    "attrId",
    "attributeCode",
    "attrType",
    "isComplex",
    "isNullable",
    "isReassignable",
    "isInstantiable",
    "attrValue",
    "attributeName",
    "defaultValue",
    "backgroundValidator",
    "isInherited",
    "valueScope",
    "newValue",
    "oldValue",
    "allowChanage",
    "attributeInstId",
    "inputType",
    "dataType",
    "firstassignEffectMode",
    "changeEffectMode",
    "delEffectMode",
    "childAttrList"
})
public class ChildAttrListType {

    @XmlElement(required = true)
    protected BigDecimal attrId;
    @XmlElement(required = true)
    protected String attributeCode;
    protected String attrType;
    protected String isComplex;
    protected String isNullable;
    protected String isReassignable;
    protected String isInstantiable;
    protected String attrValue;
    protected String attributeName;
    protected String defaultValue;
    protected String backgroundValidator;
    protected String isInherited;
    protected String valueScope;
    protected String newValue;
    protected String oldValue;
    protected String allowChanage;
    protected BigDecimal attributeInstId;
    protected String inputType;
    protected String dataType;
    protected String firstassignEffectMode;
    protected String changeEffectMode;
    protected String delEffectMode;
    protected List<String> childAttrList;

    /**
     * Obtiene el valor de la propiedad attrId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAttrId() {
        return attrId;
    }

    /**
     * Define el valor de la propiedad attrId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAttrId(BigDecimal value) {
        this.attrId = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeCode() {
        return attributeCode;
    }

    /**
     * Define el valor de la propiedad attributeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeCode(String value) {
        this.attributeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad attrType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrType() {
        return attrType;
    }

    /**
     * Define el valor de la propiedad attrType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrType(String value) {
        this.attrType = value;
    }

    /**
     * Obtiene el valor de la propiedad isComplex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsComplex() {
        return isComplex;
    }

    /**
     * Define el valor de la propiedad isComplex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsComplex(String value) {
        this.isComplex = value;
    }

    /**
     * Obtiene el valor de la propiedad isNullable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNullable() {
        return isNullable;
    }

    /**
     * Define el valor de la propiedad isNullable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNullable(String value) {
        this.isNullable = value;
    }

    /**
     * Obtiene el valor de la propiedad isReassignable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReassignable() {
        return isReassignable;
    }

    /**
     * Define el valor de la propiedad isReassignable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReassignable(String value) {
        this.isReassignable = value;
    }

    /**
     * Obtiene el valor de la propiedad isInstantiable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsInstantiable() {
        return isInstantiable;
    }

    /**
     * Define el valor de la propiedad isInstantiable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsInstantiable(String value) {
        this.isInstantiable = value;
    }

    /**
     * Obtiene el valor de la propiedad attrValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * Define el valor de la propiedad attrValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrValue(String value) {
        this.attrValue = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Define el valor de la propiedad attributeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Define el valor de la propiedad defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Obtiene el valor de la propiedad backgroundValidator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundValidator() {
        return backgroundValidator;
    }

    /**
     * Define el valor de la propiedad backgroundValidator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundValidator(String value) {
        this.backgroundValidator = value;
    }

    /**
     * Obtiene el valor de la propiedad isInherited.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsInherited() {
        return isInherited;
    }

    /**
     * Define el valor de la propiedad isInherited.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsInherited(String value) {
        this.isInherited = value;
    }

    /**
     * Obtiene el valor de la propiedad valueScope.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueScope() {
        return valueScope;
    }

    /**
     * Define el valor de la propiedad valueScope.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueScope(String value) {
        this.valueScope = value;
    }

    /**
     * Obtiene el valor de la propiedad newValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Define el valor de la propiedad newValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

    /**
     * Obtiene el valor de la propiedad oldValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * Define el valor de la propiedad oldValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldValue(String value) {
        this.oldValue = value;
    }

    /**
     * Obtiene el valor de la propiedad allowChanage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowChanage() {
        return allowChanage;
    }

    /**
     * Define el valor de la propiedad allowChanage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowChanage(String value) {
        this.allowChanage = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAttributeInstId() {
        return attributeInstId;
    }

    /**
     * Define el valor de la propiedad attributeInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAttributeInstId(BigDecimal value) {
        this.attributeInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad inputType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputType() {
        return inputType;
    }

    /**
     * Define el valor de la propiedad inputType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputType(String value) {
        this.inputType = value;
    }

    /**
     * Obtiene el valor de la propiedad dataType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Define el valor de la propiedad dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Obtiene el valor de la propiedad firstassignEffectMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstassignEffectMode() {
        return firstassignEffectMode;
    }

    /**
     * Define el valor de la propiedad firstassignEffectMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstassignEffectMode(String value) {
        this.firstassignEffectMode = value;
    }

    /**
     * Obtiene el valor de la propiedad changeEffectMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeEffectMode() {
        return changeEffectMode;
    }

    /**
     * Define el valor de la propiedad changeEffectMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeEffectMode(String value) {
        this.changeEffectMode = value;
    }

    /**
     * Obtiene el valor de la propiedad delEffectMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelEffectMode() {
        return delEffectMode;
    }

    /**
     * Define el valor de la propiedad delEffectMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelEffectMode(String value) {
        this.delEffectMode = value;
    }

    /**
     * Gets the value of the childAttrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the childAttrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildAttrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChildAttrList() {
        if (childAttrList == null) {
            childAttrList = new ArrayList<String>();
        }
        return this.childAttrList;
    }

}
