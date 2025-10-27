
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChangedAccountType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChangedAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="existAccount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctAccessCodeResType" minOccurs="0"/&gt;
 *         &lt;element name="newAccount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctDetailInfoType" minOccurs="0"/&gt;
 *         &lt;element name="acctLevelOffering" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingRespType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extOfferInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SimplePropertyCRMType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangedAccountType", propOrder = {
    "existAccount",
    "newAccount",
    "acctLevelOffering",
    "extOfferInfo"
})
public class ChangedAccountType {

    protected AcctAccessCodeResType existAccount;
    protected AcctDetailInfoType newAccount;
    protected List<OfferingRespType> acctLevelOffering;
    protected SimplePropertyCRMType extOfferInfo;

    /**
     * Obtiene el valor de la propiedad existAccount.
     * 
     * @return
     *     possible object is
     *     {@link AcctAccessCodeResType }
     *     
     */
    public AcctAccessCodeResType getExistAccount() {
        return existAccount;
    }

    /**
     * Define el valor de la propiedad existAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAccessCodeResType }
     *     
     */
    public void setExistAccount(AcctAccessCodeResType value) {
        this.existAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad newAccount.
     * 
     * @return
     *     possible object is
     *     {@link AcctDetailInfoType }
     *     
     */
    public AcctDetailInfoType getNewAccount() {
        return newAccount;
    }

    /**
     * Define el valor de la propiedad newAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctDetailInfoType }
     *     
     */
    public void setNewAccount(AcctDetailInfoType value) {
        this.newAccount = value;
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

    /**
     * Obtiene el valor de la propiedad extOfferInfo.
     * 
     * @return
     *     possible object is
     *     {@link SimplePropertyCRMType }
     *     
     */
    public SimplePropertyCRMType getExtOfferInfo() {
        return extOfferInfo;
    }

    /**
     * Define el valor de la propiedad extOfferInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePropertyCRMType }
     *     
     */
    public void setExtOfferInfo(SimplePropertyCRMType value) {
        this.extOfferInfo = value;
    }

}
