
package mx.com.telcel.sipab.client.crm;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}AccountBasicType"/&gt;
 *         &lt;element name="paymentChannelInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}AccountPaymentChannelType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creditLimitInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}AccountCreditLimitType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contactPersonInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}ContactPersonType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="billMediums" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}AccountBillMediumType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountType", propOrder = {
    "accountBasicInfo",
    "paymentChannelInfo",
    "creditLimitInfo",
    "contactPersonInfo",
    "billMediums"
})
public class AccountType {

    @XmlElement(required = true)
    protected AccountBasicType accountBasicInfo;
    protected List<AccountPaymentChannelType> paymentChannelInfo;
    protected List<AccountCreditLimitType> creditLimitInfo;
    protected List<ContactPersonType> contactPersonInfo;
    protected List<AccountBillMediumType> billMediums;

    /**
     * Obtiene el valor de la propiedad accountBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link AccountBasicType }
     *     
     */
    public AccountBasicType getAccountBasicInfo() {
        return accountBasicInfo;
    }

    /**
     * Define el valor de la propiedad accountBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountBasicType }
     *     
     */
    public void setAccountBasicInfo(AccountBasicType value) {
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
     * {@link AccountPaymentChannelType }
     * 
     * 
     */
    public List<AccountPaymentChannelType> getPaymentChannelInfo() {
        if (paymentChannelInfo == null) {
            paymentChannelInfo = new ArrayList<AccountPaymentChannelType>();
        }
        return this.paymentChannelInfo;
    }

    /**
     * Gets the value of the creditLimitInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the creditLimitInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditLimitInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCreditLimitType }
     * 
     * 
     */
    public List<AccountCreditLimitType> getCreditLimitInfo() {
        if (creditLimitInfo == null) {
            creditLimitInfo = new ArrayList<AccountCreditLimitType>();
        }
        return this.creditLimitInfo;
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
     * {@link ContactPersonType }
     * 
     * 
     */
    public List<ContactPersonType> getContactPersonInfo() {
        if (contactPersonInfo == null) {
            contactPersonInfo = new ArrayList<ContactPersonType>();
        }
        return this.contactPersonInfo;
    }

    /**
     * Gets the value of the billMediums property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the billMediums property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillMediums().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBillMediumType }
     * 
     * 
     */
    public List<AccountBillMediumType> getBillMediums() {
        if (billMediums == null) {
            billMediums = new ArrayList<AccountBillMediumType>();
        }
        return this.billMediums;
    }

}
