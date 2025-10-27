
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServiceManagerType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ServiceManagerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ServiceTypeITType"/&gt;
 *         &lt;element name="serviceChannelType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ServiceChannelType"/&gt;
 *         &lt;element name="employeeCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}EmployeeCodeType"/&gt;
 *         &lt;element name="remarks" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}RemarksType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceManagerType", propOrder = {
    "serviceType",
    "serviceChannelType",
    "employeeCode",
    "remarks"
})
public class ServiceManagerType {

    @XmlElement(required = true)
    protected String serviceType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceChannelType serviceChannelType;
    @XmlElement(required = true)
    protected String employeeCode;
    protected String remarks;

    /**
     * Obtiene el valor de la propiedad serviceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Define el valor de la propiedad serviceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceChannelType.
     * 
     * @return
     *     possible object is
     *     {@link ServiceChannelType }
     *     
     */
    public ServiceChannelType getServiceChannelType() {
        return serviceChannelType;
    }

    /**
     * Define el valor de la propiedad serviceChannelType.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceChannelType }
     *     
     */
    public void setServiceChannelType(ServiceChannelType value) {
        this.serviceChannelType = value;
    }

    /**
     * Obtiene el valor de la propiedad employeeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeCode() {
        return employeeCode;
    }

    /**
     * Define el valor de la propiedad employeeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeCode(String value) {
        this.employeeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad remarks.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Define el valor de la propiedad remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
