
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CorporateCustBasicInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CorporateCustBasicInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="custCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CustCodeType"/&gt;
 *         &lt;element name="person" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PersonType"/&gt;
 *         &lt;element name="personSub" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PersonSubType"/&gt;
 *         &lt;element name="cust" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CustType" minOccurs="0"/&gt;
 *         &lt;element name="parentCustId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ParentCustIdType" minOccurs="0"/&gt;
 *         &lt;element name="custLevel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CustLevelType"/&gt;
 *         &lt;element name="custClassification" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CustClassificationType"/&gt;
 *         &lt;element name="regionId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RegionIdType"/&gt;
 *         &lt;element name="custProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateCustBasicInfoType", propOrder = {
    "custCode",
    "person",
    "personSub",
    "cust",
    "parentCustId",
    "custLevel",
    "custClassification",
    "regionId",
    "custProperty"
})
public class CorporateCustBasicInfoType {

    @XmlElement(required = true)
    protected String custCode;
    @XmlElement(required = true)
    protected String person;
    @XmlElement(required = true)
    protected String personSub;
    protected String cust;
    protected BigDecimal parentCustId;
    @XmlElement(required = true)
    protected String custLevel;
    @XmlElement(required = true)
    protected String custClassification;
    @XmlElement(required = true)
    protected BigDecimal regionId;
    protected List<BesCrmSimplePropertyType> custProperty;

    /**
     * Obtiene el valor de la propiedad custCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCode() {
        return custCode;
    }

    /**
     * Define el valor de la propiedad custCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCode(String value) {
        this.custCode = value;
    }

    /**
     * Obtiene el valor de la propiedad person.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerson() {
        return person;
    }

    /**
     * Define el valor de la propiedad person.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerson(String value) {
        this.person = value;
    }

    /**
     * Obtiene el valor de la propiedad personSub.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonSub() {
        return personSub;
    }

    /**
     * Define el valor de la propiedad personSub.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonSub(String value) {
        this.personSub = value;
    }

    /**
     * Obtiene el valor de la propiedad cust.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCust() {
        return cust;
    }

    /**
     * Define el valor de la propiedad cust.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCust(String value) {
        this.cust = value;
    }

    /**
     * Obtiene el valor de la propiedad parentCustId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParentCustId() {
        return parentCustId;
    }

    /**
     * Define el valor de la propiedad parentCustId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParentCustId(BigDecimal value) {
        this.parentCustId = value;
    }

    /**
     * Obtiene el valor de la propiedad custLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustLevel() {
        return custLevel;
    }

    /**
     * Define el valor de la propiedad custLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustLevel(String value) {
        this.custLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad custClassification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustClassification() {
        return custClassification;
    }

    /**
     * Define el valor de la propiedad custClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustClassification(String value) {
        this.custClassification = value;
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
     * Gets the value of the custProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the custProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BesCrmSimplePropertyType }
     * 
     * 
     */
    public List<BesCrmSimplePropertyType> getCustProperty() {
        if (custProperty == null) {
            custProperty = new ArrayList<BesCrmSimplePropertyType>();
        }
        return this.custProperty;
    }

}
