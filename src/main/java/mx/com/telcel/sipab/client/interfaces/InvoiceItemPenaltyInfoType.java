
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceItemPenaltyInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceItemPenaltyInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="penaltyType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="penaltyItemId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type"/&gt;
 *         &lt;element name="fixedAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="variableAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="cycleNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="cycleUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="annexCycleNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="annexCycleUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="contractId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceItemPenaltyInfoType", propOrder = {
    "penaltyType",
    "penaltyItemId",
    "fixedAmount",
    "variableAmount",
    "cycleNum",
    "cycleUnit",
    "annexCycleNum",
    "annexCycleUnit",
    "contractId"
})
public class InvoiceItemPenaltyInfoType {

    @XmlElement(required = true)
    protected String penaltyType;
    protected long penaltyItemId;
    protected Long fixedAmount;
    protected Long variableAmount;
    protected Long cycleNum;
    protected String cycleUnit;
    protected Long annexCycleNum;
    protected String annexCycleUnit;
    protected long contractId;

    /**
     * Obtiene el valor de la propiedad penaltyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyType() {
        return penaltyType;
    }

    /**
     * Define el valor de la propiedad penaltyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyType(String value) {
        this.penaltyType = value;
    }

    /**
     * Obtiene el valor de la propiedad penaltyItemId.
     * 
     */
    public long getPenaltyItemId() {
        return penaltyItemId;
    }

    /**
     * Define el valor de la propiedad penaltyItemId.
     * 
     */
    public void setPenaltyItemId(long value) {
        this.penaltyItemId = value;
    }

    /**
     * Obtiene el valor de la propiedad fixedAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFixedAmount() {
        return fixedAmount;
    }

    /**
     * Define el valor de la propiedad fixedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFixedAmount(Long value) {
        this.fixedAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad variableAmount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVariableAmount() {
        return variableAmount;
    }

    /**
     * Define el valor de la propiedad variableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVariableAmount(Long value) {
        this.variableAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad cycleNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCycleNum() {
        return cycleNum;
    }

    /**
     * Define el valor de la propiedad cycleNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCycleNum(Long value) {
        this.cycleNum = value;
    }

    /**
     * Obtiene el valor de la propiedad cycleUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleUnit() {
        return cycleUnit;
    }

    /**
     * Define el valor de la propiedad cycleUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleUnit(String value) {
        this.cycleUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad annexCycleNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnnexCycleNum() {
        return annexCycleNum;
    }

    /**
     * Define el valor de la propiedad annexCycleNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnnexCycleNum(Long value) {
        this.annexCycleNum = value;
    }

    /**
     * Obtiene el valor de la propiedad annexCycleUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnexCycleUnit() {
        return annexCycleUnit;
    }

    /**
     * Define el valor de la propiedad annexCycleUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnexCycleUnit(String value) {
        this.annexCycleUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad contractId.
     * 
     */
    public long getContractId() {
        return contractId;
    }

    /**
     * Define el valor de la propiedad contractId.
     * 
     */
    public void setContractId(long value) {
        this.contractId = value;
    }

}
