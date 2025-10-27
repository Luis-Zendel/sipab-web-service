
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SwapResourcePetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SwapResourcePetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="custId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *           &lt;element name="subscriberId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *           &lt;element name="serviceNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="oldIMEI" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="newIMEI" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="warehouseCode" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="skuCode" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="folio" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica2Type"/&gt;
 *         &lt;element name="oldGoodsReturnMethod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica2Type"/&gt;
 *         &lt;element name="oldGoodsHandlingMethod" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica2Type"/&gt;
 *         &lt;element name="reservationId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="isFakeFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="repairFee" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal10c2Type" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
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
@XmlType(name = "SwapResourcePetType", propOrder = {
    "custId",
    "subscriberId",
    "serviceNumber",
    "oldIMEI",
    "newIMEI",
    "warehouseCode",
    "skuCode",
    "folio",
    "reason",
    "oldGoodsReturnMethod",
    "oldGoodsHandlingMethod",
    "reservationId",
    "isFakeFlag",
    "repairFee",
    "remark",
    "extPropInfo"
})
public class SwapResourcePetType {

    protected BigDecimal custId;
    protected BigDecimal subscriberId;
    protected String serviceNumber;
    @XmlElement(required = true)
    protected String oldIMEI;
    @XmlElement(required = true)
    protected String newIMEI;
    protected String warehouseCode;
    @XmlElement(required = true)
    protected String skuCode;
    protected String folio;
    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    protected String oldGoodsReturnMethod;
    @XmlElement(required = true)
    protected String oldGoodsHandlingMethod;
    protected String reservationId;
    protected String isFakeFlag;
    protected BigDecimal repairFee;
    protected String remark;
    protected List<BesCrmSimplePropertyType> extPropInfo;

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
     * Obtiene el valor de la propiedad oldIMEI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldIMEI() {
        return oldIMEI;
    }

    /**
     * Define el valor de la propiedad oldIMEI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldIMEI(String value) {
        this.oldIMEI = value;
    }

    /**
     * Obtiene el valor de la propiedad newIMEI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIMEI() {
        return newIMEI;
    }

    /**
     * Define el valor de la propiedad newIMEI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIMEI(String value) {
        this.newIMEI = value;
    }

    /**
     * Obtiene el valor de la propiedad warehouseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * Define el valor de la propiedad warehouseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseCode(String value) {
        this.warehouseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad skuCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuCode() {
        return skuCode;
    }

    /**
     * Define el valor de la propiedad skuCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuCode(String value) {
        this.skuCode = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad reason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Define el valor de la propiedad reason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Obtiene el valor de la propiedad oldGoodsReturnMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldGoodsReturnMethod() {
        return oldGoodsReturnMethod;
    }

    /**
     * Define el valor de la propiedad oldGoodsReturnMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldGoodsReturnMethod(String value) {
        this.oldGoodsReturnMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad oldGoodsHandlingMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldGoodsHandlingMethod() {
        return oldGoodsHandlingMethod;
    }

    /**
     * Define el valor de la propiedad oldGoodsHandlingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldGoodsHandlingMethod(String value) {
        this.oldGoodsHandlingMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad reservationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * Define el valor de la propiedad reservationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationId(String value) {
        this.reservationId = value;
    }

    /**
     * Obtiene el valor de la propiedad isFakeFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFakeFlag() {
        return isFakeFlag;
    }

    /**
     * Define el valor de la propiedad isFakeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFakeFlag(String value) {
        this.isFakeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad repairFee.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepairFee() {
        return repairFee;
    }

    /**
     * Define el valor de la propiedad repairFee.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepairFee(BigDecimal value) {
        this.repairFee = value;
    }

    /**
     * Obtiene el valor de la propiedad remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Define el valor de la propiedad remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
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
