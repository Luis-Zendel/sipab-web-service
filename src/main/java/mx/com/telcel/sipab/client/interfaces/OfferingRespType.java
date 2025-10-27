
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OfferingRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OfferingRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="primaryFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal3Type" minOccurs="0"/&gt;
 *         &lt;element name="offeringBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingBasicInfoType"/&gt;
 *         &lt;element name="props" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PropInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contract" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ContractRespType" minOccurs="0"/&gt;
 *         &lt;element name="subOfferings" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingRespType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resourceInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ResourceInfoType" minOccurs="0"/&gt;
 *         &lt;element name="identitys" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IdentityInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="offeringExtInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferingRespType", propOrder = {
    "operType",
    "primaryFlag",
    "quantity",
    "offeringBasicInfo",
    "props",
    "contract",
    "subOfferings",
    "resourceInfo",
    "identitys",
    "offeringExtInfo"
})
public class OfferingRespType {

    @XmlElement(required = true)
    protected String operType;
    protected String primaryFlag;
    protected BigDecimal quantity;
    @XmlElement(required = true)
    protected OfferingBasicInfoType offeringBasicInfo;
    protected List<PropInfoType> props;
    protected ContractRespType contract;
    protected List<OfferingRespType> subOfferings;
    protected ResourceInfoType resourceInfo;
    protected List<IdentityInfoType> identitys;
    protected BesCrmSimplePropertyType offeringExtInfo;

    /**
     * Obtiene el valor de la propiedad operType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperType() {
        return operType;
    }

    /**
     * Define el valor de la propiedad operType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperType(String value) {
        this.operType = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Define el valor de la propiedad primaryFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryFlag(String value) {
        this.primaryFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link OfferingBasicInfoType }
     *     
     */
    public OfferingBasicInfoType getOfferingBasicInfo() {
        return offeringBasicInfo;
    }

    /**
     * Define el valor de la propiedad offeringBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferingBasicInfoType }
     *     
     */
    public void setOfferingBasicInfo(OfferingBasicInfoType value) {
        this.offeringBasicInfo = value;
    }

    /**
     * Gets the value of the props property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the props property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropInfoType }
     * 
     * 
     */
    public List<PropInfoType> getProps() {
        if (props == null) {
            props = new ArrayList<PropInfoType>();
        }
        return this.props;
    }

    /**
     * Obtiene el valor de la propiedad contract.
     * 
     * @return
     *     possible object is
     *     {@link ContractRespType }
     *     
     */
    public ContractRespType getContract() {
        return contract;
    }

    /**
     * Define el valor de la propiedad contract.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRespType }
     *     
     */
    public void setContract(ContractRespType value) {
        this.contract = value;
    }

    /**
     * Gets the value of the subOfferings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subOfferings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubOfferings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferingRespType }
     * 
     * 
     */
    public List<OfferingRespType> getSubOfferings() {
        if (subOfferings == null) {
            subOfferings = new ArrayList<OfferingRespType>();
        }
        return this.subOfferings;
    }

    /**
     * Obtiene el valor de la propiedad resourceInfo.
     * 
     * @return
     *     possible object is
     *     {@link ResourceInfoType }
     *     
     */
    public ResourceInfoType getResourceInfo() {
        return resourceInfo;
    }

    /**
     * Define el valor de la propiedad resourceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceInfoType }
     *     
     */
    public void setResourceInfo(ResourceInfoType value) {
        this.resourceInfo = value;
    }

    /**
     * Gets the value of the identitys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the identitys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentitys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityInfoType }
     * 
     * 
     */
    public List<IdentityInfoType> getIdentitys() {
        if (identitys == null) {
            identitys = new ArrayList<IdentityInfoType>();
        }
        return this.identitys;
    }

    /**
     * Obtiene el valor de la propiedad offeringExtInfo.
     * 
     * @return
     *     possible object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public BesCrmSimplePropertyType getOfferingExtInfo() {
        return offeringExtInfo;
    }

    /**
     * Define el valor de la propiedad offeringExtInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public void setOfferingExtInfo(BesCrmSimplePropertyType value) {
        this.offeringExtInfo = value;
    }

}
