
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryEntityRelationsPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryEntityRelationsPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="srcEntityType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="srcEntityId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="dstEntityType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="dstEntityId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="relationType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryEntityRelationsPetType", propOrder = {
    "srcEntityType",
    "srcEntityId",
    "dstEntityType",
    "dstEntityId",
    "relationType",
    "status"
})
public class QueryEntityRelationsPetType {

    protected String srcEntityType;
    protected BigDecimal srcEntityId;
    protected String dstEntityType;
    protected BigDecimal dstEntityId;
    @XmlElement(required = true)
    protected String relationType;
    protected String status;

    /**
     * Obtiene el valor de la propiedad srcEntityType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcEntityType() {
        return srcEntityType;
    }

    /**
     * Define el valor de la propiedad srcEntityType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcEntityType(String value) {
        this.srcEntityType = value;
    }

    /**
     * Obtiene el valor de la propiedad srcEntityId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrcEntityId() {
        return srcEntityId;
    }

    /**
     * Define el valor de la propiedad srcEntityId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSrcEntityId(BigDecimal value) {
        this.srcEntityId = value;
    }

    /**
     * Obtiene el valor de la propiedad dstEntityType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstEntityType() {
        return dstEntityType;
    }

    /**
     * Define el valor de la propiedad dstEntityType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstEntityType(String value) {
        this.dstEntityType = value;
    }

    /**
     * Obtiene el valor de la propiedad dstEntityId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDstEntityId() {
        return dstEntityId;
    }

    /**
     * Define el valor de la propiedad dstEntityId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDstEntityId(BigDecimal value) {
        this.dstEntityId = value;
    }

    /**
     * Obtiene el valor de la propiedad relationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationType() {
        return relationType;
    }

    /**
     * Define el valor de la propiedad relationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationType(String value) {
        this.relationType = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
