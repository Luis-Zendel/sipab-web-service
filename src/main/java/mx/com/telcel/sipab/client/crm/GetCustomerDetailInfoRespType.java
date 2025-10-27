
package mx.com.telcel.sipab.client.crm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetCustomerDetailInfoRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerDetailInfoRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CustomerType" minOccurs="0"/&gt;
 *         &lt;element name="defaultAccount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}AccountBasicType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerDetailInfoRespType", propOrder = {
    "customer",
    "defaultAccount"
})
public class GetCustomerDetailInfoRespType {

    protected CustomerType customer;
    protected AccountBasicType defaultAccount;

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultAccount.
     * 
     * @return
     *     possible object is
     *     {@link AccountBasicType }
     *     
     */
    public AccountBasicType getDefaultAccount() {
        return defaultAccount;
    }

    /**
     * Define el valor de la propiedad defaultAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountBasicType }
     *     
     */
    public void setDefaultAccount(AccountBasicType value) {
        this.defaultAccount = value;
    }

}
