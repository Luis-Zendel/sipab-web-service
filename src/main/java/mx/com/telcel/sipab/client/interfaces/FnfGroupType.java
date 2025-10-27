
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FnfGroupType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FnfGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fnfGroupId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type"/&gt;
 *         &lt;element name="fnfGroupName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="fnfNumbers" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}FnfNumbersType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SimplePropertyCRMType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FnfGroupType", propOrder = {
    "fnfGroupId",
    "fnfGroupName",
    "fnfNumbers",
    "additionalProperty"
})
public class FnfGroupType {

    @XmlElement(required = true)
    protected String fnfGroupId;
    protected String fnfGroupName;
    protected List<FnfNumbersType> fnfNumbers;
    protected List<SimplePropertyCRMType> additionalProperty;

    /**
     * Obtiene el valor de la propiedad fnfGroupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnfGroupId() {
        return fnfGroupId;
    }

    /**
     * Define el valor de la propiedad fnfGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnfGroupId(String value) {
        this.fnfGroupId = value;
    }

    /**
     * Obtiene el valor de la propiedad fnfGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnfGroupName() {
        return fnfGroupName;
    }

    /**
     * Define el valor de la propiedad fnfGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnfGroupName(String value) {
        this.fnfGroupName = value;
    }

    /**
     * Gets the value of the fnfNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fnfNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFnfNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FnfNumbersType }
     * 
     * 
     */
    public List<FnfNumbersType> getFnfNumbers() {
        if (fnfNumbers == null) {
            fnfNumbers = new ArrayList<FnfNumbersType>();
        }
        return this.fnfNumbers;
    }

    /**
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyCRMType }
     * 
     * 
     */
    public List<SimplePropertyCRMType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<SimplePropertyCRMType>();
        }
        return this.additionalProperty;
    }

}
