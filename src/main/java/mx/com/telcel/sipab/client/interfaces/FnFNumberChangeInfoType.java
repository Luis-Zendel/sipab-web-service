
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FnFNumberChangeInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FnFNumberChangeInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fnfGroupId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4Type"/&gt;
 *         &lt;element name="fnFNumbers" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}FnFNumberType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FnFNumberChangeInfoType", propOrder = {
    "fnfGroupId",
    "fnFNumbers"
})
public class FnFNumberChangeInfoType {

    @XmlElement(required = true)
    protected String fnfGroupId;
    @XmlElement(required = true)
    protected List<FnFNumberType> fnFNumbers;

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
     * Gets the value of the fnFNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fnFNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFnFNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FnFNumberType }
     * 
     * 
     */
    public List<FnFNumberType> getFnFNumbers() {
        if (fnFNumbers == null) {
            fnFNumbers = new ArrayList<FnFNumberType>();
        }
        return this.fnFNumbers;
    }

}
