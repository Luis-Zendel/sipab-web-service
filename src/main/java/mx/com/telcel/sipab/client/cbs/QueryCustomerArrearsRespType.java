
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryCustomerArrearsRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryCustomerArrearsRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="customerName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="totalArrears" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}TotalArrearsType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="accountArrears" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AccountArrearsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCustomerArrearsRespType", propOrder = {
    "customerKey",
    "customerName",
    "totalArrears",
    "accountArrears"
})
public class QueryCustomerArrearsRespType {

    @XmlElement(required = true)
    protected String customerKey;
    @XmlElement(required = true)
    protected String customerName;
    @XmlElement(required = true)
    protected List<TotalArrearsType> totalArrears;
    protected AccountArrearsType accountArrears;

    /**
     * Obtiene el valor de la propiedad customerKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Define el valor de la propiedad customerKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Obtiene el valor de la propiedad customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define el valor de la propiedad customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the totalArrears property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the totalArrears property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalArrears().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalArrearsType }
     * 
     * 
     */
    public List<TotalArrearsType> getTotalArrears() {
        if (totalArrears == null) {
            totalArrears = new ArrayList<TotalArrearsType>();
        }
        return this.totalArrears;
    }

    /**
     * Obtiene el valor de la propiedad accountArrears.
     * 
     * @return
     *     possible object is
     *     {@link AccountArrearsType }
     *     
     */
    public AccountArrearsType getAccountArrears() {
        return accountArrears;
    }

    /**
     * Define el valor de la propiedad accountArrears.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountArrearsType }
     *     
     */
    public void setAccountArrears(AccountArrearsType value) {
        this.accountArrears = value;
    }

}
