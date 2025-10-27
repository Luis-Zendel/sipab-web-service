
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SupplementOfferingType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SupplementOfferingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="offeringID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type"/&gt;
 *         &lt;element name="offeringInstID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="SubsidyInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SubsidyInfoCalcType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementOfferingType", propOrder = {
    "operType",
    "offeringID",
    "offeringInstID",
    "subsidyInfo"
})
public class SupplementOfferingType {

    @XmlElement(required = true)
    protected String operType;
    @XmlElement(required = true)
    protected BigDecimal offeringID;
    protected BigDecimal offeringInstID;
    @XmlElement(name = "SubsidyInfo")
    protected SubsidyInfoCalcType subsidyInfo;

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
     * Obtiene el valor de la propiedad offeringID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferingID() {
        return offeringID;
    }

    /**
     * Define el valor de la propiedad offeringID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferingID(BigDecimal value) {
        this.offeringID = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringInstID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferingInstID() {
        return offeringInstID;
    }

    /**
     * Define el valor de la propiedad offeringInstID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferingInstID(BigDecimal value) {
        this.offeringInstID = value;
    }

    /**
     * Obtiene el valor de la propiedad subsidyInfo.
     * 
     * @return
     *     possible object is
     *     {@link SubsidyInfoCalcType }
     *     
     */
    public SubsidyInfoCalcType getSubsidyInfo() {
        return subsidyInfo;
    }

    /**
     * Define el valor de la propiedad subsidyInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidyInfoCalcType }
     *     
     */
    public void setSubsidyInfo(SubsidyInfoCalcType value) {
        this.subsidyInfo = value;
    }

}
