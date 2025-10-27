
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryAvailableBillCyclesPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryAvailableBillCyclesPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessProcesses" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="acctSegment" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="acctMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="regionId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAvailableBillCyclesPetType", propOrder = {
    "businessProcesses",
    "acctSegment",
    "acctMode",
    "regionId"
})
public class QueryAvailableBillCyclesPetType {

    @XmlElement(required = true)
    protected String businessProcesses;
    protected String acctSegment;
    protected String acctMode;
    protected BigDecimal regionId;

    /**
     * Obtiene el valor de la propiedad businessProcesses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessProcesses() {
        return businessProcesses;
    }

    /**
     * Define el valor de la propiedad businessProcesses.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessProcesses(String value) {
        this.businessProcesses = value;
    }

    /**
     * Obtiene el valor de la propiedad acctSegment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSegment() {
        return acctSegment;
    }

    /**
     * Define el valor de la propiedad acctSegment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSegment(String value) {
        this.acctSegment = value;
    }

    /**
     * Obtiene el valor de la propiedad acctMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctMode() {
        return acctMode;
    }

    /**
     * Define el valor de la propiedad acctMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctMode(String value) {
        this.acctMode = value;
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

}
