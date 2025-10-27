
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ValidateCPO2PlatinoPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ValidateCPO2PlatinoPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="serviceNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *           &lt;element name="subscriberId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="primaryOfferingId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type"/&gt;
 *         &lt;element name="isSpecialPermission" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="extPropInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SimplePropertyCRMType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateCPO2PlatinoPetType", propOrder = {
    "serviceNumber",
    "subscriberId",
    "primaryOfferingId",
    "isSpecialPermission",
    "extPropInfo"
})
public class ValidateCPO2PlatinoPetType {

    protected String serviceNumber;
    protected BigDecimal subscriberId;
    @XmlElement(required = true)
    protected BigDecimal primaryOfferingId;
    protected Boolean isSpecialPermission;
    protected List<SimplePropertyCRMType> extPropInfo;

    /**
     * Obtiene el valor de la propiedad serviceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Define el valor de la propiedad serviceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad subscriberId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubscriberId() {
        return subscriberId;
    }

    /**
     * Define el valor de la propiedad subscriberId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubscriberId(BigDecimal value) {
        this.subscriberId = value;
    }

    /**
     * Obtiene el valor de la propiedad primaryOfferingId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimaryOfferingId() {
        return primaryOfferingId;
    }

    /**
     * Define el valor de la propiedad primaryOfferingId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimaryOfferingId(BigDecimal value) {
        this.primaryOfferingId = value;
    }

    /**
     * Obtiene el valor de la propiedad isSpecialPermission.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpecialPermission() {
        return isSpecialPermission;
    }

    /**
     * Define el valor de la propiedad isSpecialPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpecialPermission(Boolean value) {
        this.isSpecialPermission = value;
    }

    /**
     * Gets the value of the extPropInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extPropInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtPropInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyCRMType }
     * 
     * 
     */
    public List<SimplePropertyCRMType> getExtPropInfo() {
        if (extPropInfo == null) {
            extPropInfo = new ArrayList<SimplePropertyCRMType>();
        }
        return this.extPropInfo;
    }

}
