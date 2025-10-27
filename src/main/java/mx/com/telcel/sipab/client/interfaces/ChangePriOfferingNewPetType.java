
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChangePriOfferingNewPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChangePriOfferingNewPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OrderInfoReqType"/&gt;
 *         &lt;element name="subscriberId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type"/&gt;
 *         &lt;element name="changedOfferings" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ChangedOfferingsType"/&gt;
 *         &lt;element name="existAccountID" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="acctDetailInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctDetailInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePriOfferingNewPetType", propOrder = {
    "orderInfo",
    "subscriberId",
    "changedOfferings",
    "existAccountID",
    "acctDetailInfo"
})
public class ChangePriOfferingNewPetType {

    @XmlElement(required = true)
    protected OrderInfoReqType orderInfo;
    @XmlElement(required = true)
    protected BigDecimal subscriberId;
    @XmlElement(required = true)
    protected ChangedOfferingsType changedOfferings;
    protected BigDecimal existAccountID;
    protected AcctDetailInfoType acctDetailInfo;

    /**
     * Obtiene el valor de la propiedad orderInfo.
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoReqType }
     *     
     */
    public OrderInfoReqType getOrderInfo() {
        return orderInfo;
    }

    /**
     * Define el valor de la propiedad orderInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoReqType }
     *     
     */
    public void setOrderInfo(OrderInfoReqType value) {
        this.orderInfo = value;
    }

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
     * Obtiene el valor de la propiedad changedOfferings.
     * 
     * @return
     *     possible object is
     *     {@link ChangedOfferingsType }
     *     
     */
    public ChangedOfferingsType getChangedOfferings() {
        return changedOfferings;
    }

    /**
     * Define el valor de la propiedad changedOfferings.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedOfferingsType }
     *     
     */
    public void setChangedOfferings(ChangedOfferingsType value) {
        this.changedOfferings = value;
    }

    /**
     * Obtiene el valor de la propiedad existAccountID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExistAccountID() {
        return existAccountID;
    }

    /**
     * Define el valor de la propiedad existAccountID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExistAccountID(BigDecimal value) {
        this.existAccountID = value;
    }

    /**
     * Obtiene el valor de la propiedad acctDetailInfo.
     * 
     * @return
     *     possible object is
     *     {@link AcctDetailInfoType }
     *     
     */
    public AcctDetailInfoType getAcctDetailInfo() {
        return acctDetailInfo;
    }

    /**
     * Define el valor de la propiedad acctDetailInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctDetailInfoType }
     *     
     */
    public void setAcctDetailInfo(AcctDetailInfoType value) {
        this.acctDetailInfo = value;
    }

}
