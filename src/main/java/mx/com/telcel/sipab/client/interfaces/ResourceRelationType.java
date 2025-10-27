
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResourceRelationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResourceRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica2Type"/&gt;
 *         &lt;element name="destSubscriberId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="offeringId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="resourceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="allocatedFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica2Type" minOccurs="0"/&gt;
 *         &lt;element name="rscRelationKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceRelationType", propOrder = {
    "actionType",
    "destSubscriberId",
    "offeringId",
    "resourceType",
    "allocatedFlag",
    "rscRelationKey"
})
public class ResourceRelationType {

    @XmlElement(required = true)
    protected String actionType;
    @XmlElement(required = true)
    protected BigDecimal destSubscriberId;
    @XmlElement(required = true)
    protected BigDecimal offeringId;
    @XmlElement(required = true)
    protected String resourceType;
    protected String allocatedFlag;
    protected String rscRelationKey;

    /**
     * Obtiene el valor de la propiedad actionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Define el valor de la propiedad actionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Obtiene el valor de la propiedad destSubscriberId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDestSubscriberId() {
        return destSubscriberId;
    }

    /**
     * Define el valor de la propiedad destSubscriberId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDestSubscriberId(BigDecimal value) {
        this.destSubscriberId = value;
    }

    /**
     * Obtiene el valor de la propiedad offeringId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferingId() {
        return offeringId;
    }

    /**
     * Define el valor de la propiedad offeringId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferingId(BigDecimal value) {
        this.offeringId = value;
    }

    /**
     * Obtiene el valor de la propiedad resourceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Define el valor de la propiedad resourceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceType(String value) {
        this.resourceType = value;
    }

    /**
     * Obtiene el valor de la propiedad allocatedFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocatedFlag() {
        return allocatedFlag;
    }

    /**
     * Define el valor de la propiedad allocatedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocatedFlag(String value) {
        this.allocatedFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad rscRelationKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRscRelationKey() {
        return rscRelationKey;
    }

    /**
     * Define el valor de la propiedad rscRelationKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRscRelationKey(String value) {
        this.rscRelationKey = value;
    }

}
