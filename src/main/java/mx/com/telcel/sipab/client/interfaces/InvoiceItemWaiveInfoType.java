
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceItemWaiveInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceItemWaiveInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reasonCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="authOperId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type"/&gt;
 *         &lt;element name="authDeptId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type"/&gt;
 *         &lt;element name="waiveValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Long20Type" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceItemWaiveInfoType", propOrder = {
    "reasonCode",
    "authOperId",
    "authDeptId",
    "waiveValue",
    "remark"
})
public class InvoiceItemWaiveInfoType {

    @XmlElement(required = true)
    protected String reasonCode;
    protected long authOperId;
    protected long authDeptId;
    protected Long waiveValue;
    protected String remark;

    /**
     * Obtiene el valor de la propiedad reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Define el valor de la propiedad reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad authOperId.
     * 
     */
    public long getAuthOperId() {
        return authOperId;
    }

    /**
     * Define el valor de la propiedad authOperId.
     * 
     */
    public void setAuthOperId(long value) {
        this.authOperId = value;
    }

    /**
     * Obtiene el valor de la propiedad authDeptId.
     * 
     */
    public long getAuthDeptId() {
        return authDeptId;
    }

    /**
     * Define el valor de la propiedad authDeptId.
     * 
     */
    public void setAuthDeptId(long value) {
        this.authDeptId = value;
    }

    /**
     * Obtiene el valor de la propiedad waiveValue.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWaiveValue() {
        return waiveValue;
    }

    /**
     * Define el valor de la propiedad waiveValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWaiveValue(Long value) {
        this.waiveValue = value;
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

}
