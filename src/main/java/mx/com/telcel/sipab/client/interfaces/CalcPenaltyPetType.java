
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CalcPenaltyPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CalcPenaltyPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="serviceNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *           &lt;element name="subsId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="changedOffering" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ChangedOfferingType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalcPenaltyPetType", propOrder = {
    "serviceNumber",
    "subsId",
    "changedOffering"
})
public class CalcPenaltyPetType {

    protected String serviceNumber;
    protected BigDecimal subsId;
    protected ChangedOfferingType changedOffering;

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
     * Obtiene el valor de la propiedad subsId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsId() {
        return subsId;
    }

    /**
     * Define el valor de la propiedad subsId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsId(BigDecimal value) {
        this.subsId = value;
    }

    /**
     * Obtiene el valor de la propiedad changedOffering.
     * 
     * @return
     *     possible object is
     *     {@link ChangedOfferingType }
     *     
     */
    public ChangedOfferingType getChangedOffering() {
        return changedOffering;
    }

    /**
     * Define el valor de la propiedad changedOffering.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedOfferingType }
     *     
     */
    public void setChangedOffering(ChangedOfferingType value) {
        this.changedOffering = value;
    }

}
