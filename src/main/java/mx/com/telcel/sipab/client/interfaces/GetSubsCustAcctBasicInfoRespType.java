
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetSubsCustAcctBasicInfoRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetSubsCustAcctBasicInfoRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriberInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SubscriberBasicType" minOccurs="0"/&gt;
 *         &lt;element name="customerBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CustomerBasicType" minOccurs="0"/&gt;
 *         &lt;element name="individualInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IndividualBaseType" minOccurs="0"/&gt;
 *         &lt;element name="accountInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AccountBasicType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSubsCustAcctBasicInfoRespType", propOrder = {
    "subscriberInfo",
    "customerBasicInfo",
    "individualInfo",
    "accountInfo"
})
public class GetSubsCustAcctBasicInfoRespType {

    protected SubscriberBasicType subscriberInfo;
    protected CustomerBasicType customerBasicInfo;
    protected IndividualBaseType individualInfo;
    protected AccountBasicType accountInfo;

    /**
     * Obtiene el valor de la propiedad subscriberInfo.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberBasicType }
     *     
     */
    public SubscriberBasicType getSubscriberInfo() {
        return subscriberInfo;
    }

    /**
     * Define el valor de la propiedad subscriberInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberBasicType }
     *     
     */
    public void setSubscriberInfo(SubscriberBasicType value) {
        this.subscriberInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad customerBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBasicType }
     *     
     */
    public CustomerBasicType getCustomerBasicInfo() {
        return customerBasicInfo;
    }

    /**
     * Define el valor de la propiedad customerBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBasicType }
     *     
     */
    public void setCustomerBasicInfo(CustomerBasicType value) {
        this.customerBasicInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad individualInfo.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBaseType }
     *     
     */
    public IndividualBaseType getIndividualInfo() {
        return individualInfo;
    }

    /**
     * Define el valor de la propiedad individualInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBaseType }
     *     
     */
    public void setIndividualInfo(IndividualBaseType value) {
        this.individualInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad accountInfo.
     * 
     * @return
     *     possible object is
     *     {@link AccountBasicType }
     *     
     */
    public AccountBasicType getAccountInfo() {
        return accountInfo;
    }

    /**
     * Define el valor de la propiedad accountInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountBasicType }
     *     
     */
    public void setAccountInfo(AccountBasicType value) {
        this.accountInfo = value;
    }

}
