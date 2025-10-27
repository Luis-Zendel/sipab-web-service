
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcctDetailInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcctDetailInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctBasicInfoType"/&gt;
 *         &lt;element name="paymentChannelInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctPaymentChannelType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactPersonInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ContactPersonTypeBusinessType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditLimitInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AccountCreditLimitBusineType" minOccurs="0"/&gt;
 *         &lt;element name="acctLevelOffering" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingRespType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctDetailInfoType", propOrder = {
    "accountBasicInfo",
    "paymentChannelInfo",
    "contactPersonInfo",
    "creditLimitInfo",
    "acctLevelOffering"
})
public class AcctDetailInfoType {

    @XmlElement(required = true)
    protected AcctBasicInfoType accountBasicInfo;
    protected List<AcctPaymentChannelType> paymentChannelInfo;
    protected List<ContactPersonTypeBusinessType> contactPersonInfo;
    protected AccountCreditLimitBusineType creditLimitInfo;
    protected List<OfferingRespType> acctLevelOffering;

    /**
     * Obtiene el valor de la propiedad accountBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link AcctBasicInfoType }
     *     
     */
    public AcctBasicInfoType getAccountBasicInfo() {
        return accountBasicInfo;
    }

    /**
     * Define el valor de la propiedad accountBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBasicInfoType }
     *     
     */
    public void setAccountBasicInfo(AcctBasicInfoType value) {
        this.accountBasicInfo = value;
    }

    /**
     * Gets the value of the paymentChannelInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the paymentChannelInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentChannelInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctPaymentChannelType }
     * 
     * 
     */
    public List<AcctPaymentChannelType> getPaymentChannelInfo() {
        if (paymentChannelInfo == null) {
            paymentChannelInfo = new ArrayList<AcctPaymentChannelType>();
        }
        return this.paymentChannelInfo;
    }

    /**
     * Gets the value of the contactPersonInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contactPersonInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPersonInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonTypeBusinessType }
     * 
     * 
     */
    public List<ContactPersonTypeBusinessType> getContactPersonInfo() {
        if (contactPersonInfo == null) {
            contactPersonInfo = new ArrayList<ContactPersonTypeBusinessType>();
        }
        return this.contactPersonInfo;
    }

    /**
     * Obtiene el valor de la propiedad creditLimitInfo.
     * 
     * @return
     *     possible object is
     *     {@link AccountCreditLimitBusineType }
     *     
     */
    public AccountCreditLimitBusineType getCreditLimitInfo() {
        return creditLimitInfo;
    }

    /**
     * Define el valor de la propiedad creditLimitInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCreditLimitBusineType }
     *     
     */
    public void setCreditLimitInfo(AccountCreditLimitBusineType value) {
        this.creditLimitInfo = value;
    }

    /**
     * Gets the value of the acctLevelOffering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the acctLevelOffering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctLevelOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferingRespType }
     * 
     * 
     */
    public List<OfferingRespType> getAcctLevelOffering() {
        if (acctLevelOffering == null) {
            acctLevelOffering = new ArrayList<OfferingRespType>();
        }
        return this.acctLevelOffering;
    }

}
