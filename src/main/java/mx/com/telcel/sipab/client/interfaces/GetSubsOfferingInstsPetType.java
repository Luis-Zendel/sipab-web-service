
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetSubsOfferingInstsPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetSubsOfferingInstsPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="subscriberId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *           &lt;element name="serviceNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="historyFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="historyPeriod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="isIncludePromotion" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubsOfferingInstsPetType", propOrder = {
    "subscriberId",
    "serviceNumber",
    "historyFlag",
    "historyPeriod",
    "isIncludePromotion"
})
public class GetSubsOfferingInstsPetType {

    protected BigDecimal subscriberId;
    protected String serviceNumber;
    protected String historyFlag;
    protected BigDecimal historyPeriod;
    protected String isIncludePromotion;

    /**
     * Obtiene el valor de la propiedad subscriberId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubscriberId() {
        return subscriberId;
    }

    /**
     * Define el valor de la propiedad subscriberId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubscriberId(BigDecimal value) {
        this.subscriberId = value;
    }

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
     * Obtiene el valor de la propiedad historyFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryFlag() {
        return historyFlag;
    }

    /**
     * Define el valor de la propiedad historyFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryFlag(String value) {
        this.historyFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad historyPeriod.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHistoryPeriod() {
        return historyPeriod;
    }

    /**
     * Define el valor de la propiedad historyPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHistoryPeriod(BigDecimal value) {
        this.historyPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad isIncludePromotion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIncludePromotion() {
        return isIncludePromotion;
    }

    /**
     * Define el valor de la propiedad isIncludePromotion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIncludePromotion(String value) {
        this.isIncludePromotion = value;
    }

}
