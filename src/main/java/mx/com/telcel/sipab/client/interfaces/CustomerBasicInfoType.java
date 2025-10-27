
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CustomerBasicInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustomerBasicInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personSubType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PersonSubType"/&gt;
 *         &lt;element name="custLevel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CustLevelType"/&gt;
 *         &lt;element name="custClassification" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CustClassificationType"/&gt;
 *         &lt;element name="regionId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RegionIdType"/&gt;
 *         &lt;element name="custCreditLevel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}custCreditLevelType" minOccurs="0"/&gt;
 *         &lt;element name="custProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CustPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBasicInfoType", propOrder = {
    "personSubType",
    "custLevel",
    "custClassification",
    "regionId",
    "custCreditLevel",
    "custProperty"
})
public class CustomerBasicInfoType {

    @XmlElement(required = true)
    protected String personSubType;
    @XmlElement(required = true)
    protected String custLevel;
    @XmlElement(required = true)
    protected String custClassification;
    @XmlElement(required = true)
    protected BigDecimal regionId;
    protected String custCreditLevel;
    protected List<CustPropertyType> custProperty;

    /**
     * Obtiene el valor de la propiedad personSubType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonSubType() {
        return personSubType;
    }

    /**
     * Define el valor de la propiedad personSubType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonSubType(String value) {
        this.personSubType = value;
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
     * Obtiene el valor de la propiedad custCreditLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCreditLevel() {
        return custCreditLevel;
    }

    /**
     * Define el valor de la propiedad custCreditLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCreditLevel(String value) {
        this.custCreditLevel = value;
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
     * {@link CustPropertyType }
     * 
     * 
     */
    public List<CustPropertyType> getCustProperty() {
        if (custProperty == null) {
            custProperty = new ArrayList<CustPropertyType>();
        }
        return this.custProperty;
    }

}
