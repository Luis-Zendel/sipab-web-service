
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DataDictItemType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DataDictItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="beId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal10c0Type" minOccurs="0"/&gt;
 *         &lt;element name="dictCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="itemCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="orderNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataDictItemType", propOrder = {
    "beCode",
    "beId",
    "dictCode",
    "itemCode",
    "orderNo"
})
public class DataDictItemType {

    protected String beCode;
    protected BigDecimal beId;
    @XmlElement(required = true)
    protected String dictCode;
    @XmlElement(required = true)
    protected String itemCode;
    protected String orderNo;

    /**
     * Obtiene el valor de la propiedad beCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeCode() {
        return beCode;
    }

    /**
     * Define el valor de la propiedad beCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeCode(String value) {
        this.beCode = value;
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
     * Obtiene el valor de la propiedad dictCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictCode() {
        return dictCode;
    }

    /**
     * Define el valor de la propiedad dictCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictCode(String value) {
        this.dictCode = value;
    }

    /**
     * Obtiene el valor de la propiedad itemCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Define el valor de la propiedad itemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Obtiene el valor de la propiedad orderNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Define el valor de la propiedad orderNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

}
