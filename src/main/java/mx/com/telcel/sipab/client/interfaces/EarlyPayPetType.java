
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EarlyPayPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EarlyPayPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OrderInfoReqType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="custId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type"/&gt;
 *           &lt;element name="customerCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *           &lt;element name="serviceNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="installmentPlanInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaNumerica20Type"/&gt;
 *         &lt;element name="prepayMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="extPropInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EarlyPayPetType", propOrder = {
    "orderInfo",
    "custId",
    "customerCode",
    "serviceNumber",
    "installmentPlanInstId",
    "prepayMode",
    "extPropInfo"
})
public class EarlyPayPetType {

    @XmlElement(required = true)
    protected OrderInfoReqType orderInfo;
    protected BigDecimal custId;
    protected String customerCode;
    protected String serviceNumber;
    @XmlElement(required = true)
    protected String installmentPlanInstId;
    @XmlElement(required = true)
    protected String prepayMode;
    protected List<BesCrmSimplePropertyType> extPropInfo;

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
     * Obtiene el valor de la propiedad custId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustId() {
        return custId;
    }

    /**
     * Define el valor de la propiedad custId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustId(BigDecimal value) {
        this.custId = value;
    }

    /**
     * Obtiene el valor de la propiedad customerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Define el valor de la propiedad customerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
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
     * Obtiene el valor de la propiedad installmentPlanInstId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentPlanInstId() {
        return installmentPlanInstId;
    }

    /**
     * Define el valor de la propiedad installmentPlanInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentPlanInstId(String value) {
        this.installmentPlanInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad prepayMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepayMode() {
        return prepayMode;
    }

    /**
     * Define el valor de la propiedad prepayMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepayMode(String value) {
        this.prepayMode = value;
    }

    /**
     * Gets the value of the extPropInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extPropInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtPropInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BesCrmSimplePropertyType }
     * 
     * 
     */
    public List<BesCrmSimplePropertyType> getExtPropInfo() {
        if (extPropInfo == null) {
            extPropInfo = new ArrayList<BesCrmSimplePropertyType>();
        }
        return this.extPropInfo;
    }

}
