
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryFnFPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryFnFPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriberId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="serviceNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="isIncludeHistory" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="timeCondition" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}TimeConditionType" minOccurs="0"/&gt;
 *         &lt;element name="fnServiceNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryFnFPetType", propOrder = {
    "subscriberId",
    "serviceNumber",
    "isIncludeHistory",
    "timeCondition",
    "fnServiceNumber",
    "additionalProperty"
})
public class QueryFnFPetType {

    protected BigDecimal subscriberId;
    protected String serviceNumber;
    protected String isIncludeHistory;
    protected TimeConditionType timeCondition;
    protected String fnServiceNumber;
    protected List<BesCrmSimplePropertyType> additionalProperty;

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
     * Obtiene el valor de la propiedad isIncludeHistory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIncludeHistory() {
        return isIncludeHistory;
    }

    /**
     * Define el valor de la propiedad isIncludeHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIncludeHistory(String value) {
        this.isIncludeHistory = value;
    }

    /**
     * Obtiene el valor de la propiedad timeCondition.
     * 
     * @return
     *     possible object is
     *     {@link TimeConditionType }
     *     
     */
    public TimeConditionType getTimeCondition() {
        return timeCondition;
    }

    /**
     * Define el valor de la propiedad timeCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeConditionType }
     *     
     */
    public void setTimeCondition(TimeConditionType value) {
        this.timeCondition = value;
    }

    /**
     * Obtiene el valor de la propiedad fnServiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnServiceNumber() {
        return fnServiceNumber;
    }

    /**
     * Define el valor de la propiedad fnServiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnServiceNumber(String value) {
        this.fnServiceNumber = value;
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
     * {@link BesCrmSimplePropertyType }
     * 
     * 
     */
    public List<BesCrmSimplePropertyType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<BesCrmSimplePropertyType>();
        }
        return this.additionalProperty;
    }

}
