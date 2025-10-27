
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SpecialChangeOfferingPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SpecialChangeOfferingPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="changedOfferings" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingRecType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="rechargeSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="whetherResubsribe" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialChangeOfferingPetType", propOrder = {
    "serviceNumber",
    "changedOfferings",
    "rechargeSerialNo",
    "whetherResubsribe"
})
public class SpecialChangeOfferingPetType {

    @XmlElement(required = true)
    protected String serviceNumber;
    @XmlElement(required = true)
    protected List<OfferingRecType> changedOfferings;
    protected String rechargeSerialNo;
    protected String whetherResubsribe;

    /**
     * Obtiene el valor de la propiedad serviceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Define el valor de la propiedad serviceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Gets the value of the changedOfferings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the changedOfferings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedOfferings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferingRecType }
     * 
     * 
     */
    public List<OfferingRecType> getChangedOfferings() {
        if (changedOfferings == null) {
            changedOfferings = new ArrayList<OfferingRecType>();
        }
        return this.changedOfferings;
    }

    /**
     * Obtiene el valor de la propiedad rechargeSerialNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeSerialNo() {
        return rechargeSerialNo;
    }

    /**
     * Define el valor de la propiedad rechargeSerialNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeSerialNo(String value) {
        this.rechargeSerialNo = value;
    }

    /**
     * Obtiene el valor de la propiedad whetherResubsribe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhetherResubsribe() {
        return whetherResubsribe;
    }

    /**
     * Define el valor de la propiedad whetherResubsribe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhetherResubsribe(String value) {
        this.whetherResubsribe = value;
    }

}
