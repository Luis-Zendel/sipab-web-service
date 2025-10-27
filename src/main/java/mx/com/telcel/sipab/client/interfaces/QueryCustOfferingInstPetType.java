
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryCustOfferingInstPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryCustOfferingInstPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="offeringInstIds" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="historyFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="offeringPropFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BooleanType" minOccurs="0"/&gt;
 *         &lt;element name="filterFactorInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}FilterFactorInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCustOfferingInstPetType", propOrder = {
    "customerId",
    "offeringInstIds",
    "historyFlag",
    "offeringPropFlag",
    "filterFactorInfo"
})
public class QueryCustOfferingInstPetType {

    @XmlElement(required = true)
    protected String customerId;
    protected List<BigDecimal> offeringInstIds;
    protected Boolean historyFlag;
    protected Boolean offeringPropFlag;
    protected FilterFactorInfoType filterFactorInfo;

    /**
     * Obtiene el valor de la propiedad customerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the offeringInstIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the offeringInstIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferingInstIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getOfferingInstIds() {
        if (offeringInstIds == null) {
            offeringInstIds = new ArrayList<BigDecimal>();
        }
        return this.offeringInstIds;
    }

    /**
     * Obtiene el valor de la propiedad historyFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistoryFlag() {
        return historyFlag;
    }

    /**
     * Define el valor de la propiedad historyFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistoryFlag(Boolean value) {
        this.historyFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringPropFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferingPropFlag() {
        return offeringPropFlag;
    }

    /**
     * Define el valor de la propiedad offeringPropFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferingPropFlag(Boolean value) {
        this.offeringPropFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad filterFactorInfo.
     * 
     * @return
     *     possible object is
     *     {@link FilterFactorInfoType }
     *     
     */
    public FilterFactorInfoType getFilterFactorInfo() {
        return filterFactorInfo;
    }

    /**
     * Define el valor de la propiedad filterFactorInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterFactorInfoType }
     *     
     */
    public void setFilterFactorInfo(FilterFactorInfoType value) {
        this.filterFactorInfo = value;
    }

}
