
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubsidyInfonType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubsidyInfonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subsidyId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="subsidyPlanInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}Decimal20c0Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidyInfonType", propOrder = {
    "subsidyId",
    "subsidyPlanInstId"
})
public class SubsidyInfonType {

    protected BigDecimal subsidyId;
    @XmlElement(required = true)
    protected BigDecimal subsidyPlanInstId;

    /**
     * Obtiene el valor de la propiedad subsidyId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsidyId() {
        return subsidyId;
    }

    /**
     * Define el valor de la propiedad subsidyId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsidyId(BigDecimal value) {
        this.subsidyId = value;
    }

    /**
     * Obtiene el valor de la propiedad subsidyPlanInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsidyPlanInstId() {
        return subsidyPlanInstId;
    }

    /**
     * Define el valor de la propiedad subsidyPlanInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsidyPlanInstId(BigDecimal value) {
        this.subsidyPlanInstId = value;
    }

}
