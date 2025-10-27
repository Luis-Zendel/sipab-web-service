
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BillCycleTypeWithNameType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BillCycleTypeWithNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billCycleTypeId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="es_MX_Name" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica100Type"/&gt;
 *         &lt;element name="es_US_Name" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica100Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillCycleTypeWithNameType", propOrder = {
    "billCycleTypeId",
    "esMXName",
    "esUSName"
})
public class BillCycleTypeWithNameType {

    @XmlElement(required = true)
    protected BigDecimal billCycleTypeId;
    @XmlElement(name = "es_MX_Name", required = true)
    protected String esMXName;
    @XmlElement(name = "es_US_Name", required = true)
    protected String esUSName;

    /**
     * Obtiene el valor de la propiedad billCycleTypeId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillCycleTypeId() {
        return billCycleTypeId;
    }

    /**
     * Define el valor de la propiedad billCycleTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillCycleTypeId(BigDecimal value) {
        this.billCycleTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad esMXName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsMXName() {
        return esMXName;
    }

    /**
     * Define el valor de la propiedad esMXName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsMXName(String value) {
        this.esMXName = value;
    }

    /**
     * Obtiene el valor de la propiedad esUSName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsUSName() {
        return esUSName;
    }

    /**
     * Define el valor de la propiedad esUSName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsUSName(String value) {
        this.esUSName = value;
    }

}
