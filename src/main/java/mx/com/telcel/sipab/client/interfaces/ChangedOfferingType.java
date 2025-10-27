
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChangedOfferingType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChangedOfferingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priOfferingID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type"/&gt;
 *         &lt;element name="priOfferingInstID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="contractTerm" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica2Type" minOccurs="0"/&gt;
 *         &lt;element name="renewalMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="SupplementOffering" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SupplementOfferingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangedOfferingType", propOrder = {
    "priOfferingID",
    "priOfferingInstID",
    "contractTerm",
    "renewalMode",
    "supplementOffering"
})
public class ChangedOfferingType {

    @XmlElement(required = true)
    protected BigDecimal priOfferingID;
    protected BigDecimal priOfferingInstID;
    protected String contractTerm;
    protected String renewalMode;
    @XmlElement(name = "SupplementOffering")
    protected List<SupplementOfferingType> supplementOffering;

    /**
     * Obtiene el valor de la propiedad priOfferingID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriOfferingID() {
        return priOfferingID;
    }

    /**
     * Define el valor de la propiedad priOfferingID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriOfferingID(BigDecimal value) {
        this.priOfferingID = value;
    }

    /**
     * Obtiene el valor de la propiedad priOfferingInstID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriOfferingInstID() {
        return priOfferingInstID;
    }

    /**
     * Define el valor de la propiedad priOfferingInstID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriOfferingInstID(BigDecimal value) {
        this.priOfferingInstID = value;
    }

    /**
     * Obtiene el valor de la propiedad contractTerm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTerm() {
        return contractTerm;
    }

    /**
     * Define el valor de la propiedad contractTerm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTerm(String value) {
        this.contractTerm = value;
    }

    /**
     * Obtiene el valor de la propiedad renewalMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalMode() {
        return renewalMode;
    }

    /**
     * Define el valor de la propiedad renewalMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalMode(String value) {
        this.renewalMode = value;
    }

    /**
     * Gets the value of the supplementOffering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supplementOffering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplementOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementOfferingType }
     * 
     * 
     */
    public List<SupplementOfferingType> getSupplementOffering() {
        if (supplementOffering == null) {
            supplementOffering = new ArrayList<SupplementOfferingType>();
        }
        return this.supplementOffering;
    }

}
