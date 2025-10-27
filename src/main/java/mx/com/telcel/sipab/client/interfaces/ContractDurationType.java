
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContractDurationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContractDurationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="durationType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica2Type"/&gt;
 *         &lt;element name="durationUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="durationValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}NumberLong19Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractDurationType", propOrder = {
    "durationType",
    "durationUnit",
    "durationValue"
})
public class ContractDurationType {

    @XmlElement(required = true)
    protected String durationType;
    protected String durationUnit;
    protected Long durationValue;

    /**
     * Obtiene el valor de la propiedad durationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationType() {
        return durationType;
    }

    /**
     * Define el valor de la propiedad durationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationType(String value) {
        this.durationType = value;
    }

    /**
     * Obtiene el valor de la propiedad durationUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationUnit() {
        return durationUnit;
    }

    /**
     * Define el valor de la propiedad durationUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationUnit(String value) {
        this.durationUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad durationValue.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDurationValue() {
        return durationValue;
    }

    /**
     * Define el valor de la propiedad durationValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDurationValue(Long value) {
        this.durationValue = value;
    }

}
