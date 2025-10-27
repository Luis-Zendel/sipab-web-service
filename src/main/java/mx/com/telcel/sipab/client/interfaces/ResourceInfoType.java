
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResourceInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResourceInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resourceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="resourceId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica20Type" minOccurs="0"/&gt;
 *         &lt;element name="skuId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type"/&gt;
 *         &lt;element name="skuCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="operType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="beginIdentityId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="endIdentityId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="goodsInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="lockCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="lockType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type" minOccurs="0"/&gt;
 *         &lt;element name="resourceProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceInfoType", propOrder = {
    "resourceType",
    "resourceId",
    "skuId",
    "skuCode",
    "operType",
    "beginIdentityId",
    "endIdentityId",
    "goodsInstId",
    "lockCode",
    "lockType",
    "resourceProperty"
})
public class ResourceInfoType {

    @XmlElement(required = true)
    protected String resourceType;
    protected String resourceId;
    protected long skuId;
    @XmlElement(required = true)
    protected String skuCode;
    protected String operType;
    protected String beginIdentityId;
    protected String endIdentityId;
    protected Long goodsInstId;
    protected String lockCode;
    protected String lockType;
    protected List<BesCrmSimplePropertyType> resourceProperty;

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
     * Obtiene el valor de la propiedad resourceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Define el valor de la propiedad resourceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceId(String value) {
        this.resourceId = value;
    }

    /**
     * Obtiene el valor de la propiedad skuId.
     * 
     */
    public long getSkuId() {
        return skuId;
    }

    /**
     * Define el valor de la propiedad skuId.
     * 
     */
    public void setSkuId(long value) {
        this.skuId = value;
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
     * Obtiene el valor de la propiedad operType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperType() {
        return operType;
    }

    /**
     * Define el valor de la propiedad operType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperType(String value) {
        this.operType = value;
    }

    /**
     * Obtiene el valor de la propiedad beginIdentityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginIdentityId() {
        return beginIdentityId;
    }

    /**
     * Define el valor de la propiedad beginIdentityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginIdentityId(String value) {
        this.beginIdentityId = value;
    }

    /**
     * Obtiene el valor de la propiedad endIdentityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndIdentityId() {
        return endIdentityId;
    }

    /**
     * Define el valor de la propiedad endIdentityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndIdentityId(String value) {
        this.endIdentityId = value;
    }

    /**
     * Obtiene el valor de la propiedad goodsInstId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGoodsInstId() {
        return goodsInstId;
    }

    /**
     * Define el valor de la propiedad goodsInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGoodsInstId(Long value) {
        this.goodsInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad lockCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockCode() {
        return lockCode;
    }

    /**
     * Define el valor de la propiedad lockCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockCode(String value) {
        this.lockCode = value;
    }

    /**
     * Obtiene el valor de la propiedad lockType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockType() {
        return lockType;
    }

    /**
     * Define el valor de la propiedad lockType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockType(String value) {
        this.lockType = value;
    }

    /**
     * Gets the value of the resourceProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the resourceProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BesCrmSimplePropertyType }
     * 
     * 
     */
    public List<BesCrmSimplePropertyType> getResourceProperty() {
        if (resourceProperty == null) {
            resourceProperty = new ArrayList<BesCrmSimplePropertyType>();
        }
        return this.resourceProperty;
    }

}
