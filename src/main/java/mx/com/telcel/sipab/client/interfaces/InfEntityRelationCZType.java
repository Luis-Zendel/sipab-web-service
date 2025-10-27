
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InfEntityRelationCZType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfEntityRelationCZType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relationId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="beId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal10c0Type"/&gt;
 *         &lt;element name="srcEntityType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type"/&gt;
 *         &lt;element name="srcEntityId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="dstEntityType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type"/&gt;
 *         &lt;element name="dstEntityId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="relationType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="effDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateType" minOccurs="0"/&gt;
 *         &lt;element name="expDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfEntityRelationCZType", propOrder = {
    "relationId",
    "beId",
    "srcEntityType",
    "srcEntityId",
    "dstEntityType",
    "dstEntityId",
    "relationType",
    "status",
    "effDate",
    "expDate"
})
public class InfEntityRelationCZType {

    @XmlElement(required = true)
    protected BigDecimal relationId;
    @XmlElement(required = true)
    protected BigDecimal beId;
    @XmlElement(required = true)
    protected String srcEntityType;
    @XmlElement(required = true)
    protected BigDecimal srcEntityId;
    @XmlElement(required = true)
    protected String dstEntityType;
    @XmlElement(required = true)
    protected BigDecimal dstEntityId;
    @XmlElement(required = true)
    protected String relationType;
    @XmlElement(required = true)
    protected String status;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expDate;

    /**
     * Obtiene el valor de la propiedad relationId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelationId() {
        return relationId;
    }

    /**
     * Define el valor de la propiedad relationId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelationId(BigDecimal value) {
        this.relationId = value;
    }

    /**
     * Obtiene el valor de la propiedad beId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeId() {
        return beId;
    }

    /**
     * Define el valor de la propiedad beId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeId(BigDecimal value) {
        this.beId = value;
    }

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

    /**
     * Obtiene el valor de la propiedad effDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDate() {
        return effDate;
    }

    /**
     * Define el valor de la propiedad effDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDate(XMLGregorianCalendar value) {
        this.effDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDate() {
        return expDate;
    }

    /**
     * Define el valor de la propiedad expDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDate(XMLGregorianCalendar value) {
        this.expDate = value;
    }

}
