
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryFnFRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryFnFRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fnfOfferingInstId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="fnfGroups" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}FnfGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryFnFRespType", propOrder = {
    "fnfOfferingInstId",
    "fnfGroups"
})
public class QueryFnFRespType {

    protected BigDecimal fnfOfferingInstId;
    protected List<FnfGroupType> fnfGroups;

    /**
     * Obtiene el valor de la propiedad fnfOfferingInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFnfOfferingInstId() {
        return fnfOfferingInstId;
    }

    /**
     * Define el valor de la propiedad fnfOfferingInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFnfOfferingInstId(BigDecimal value) {
        this.fnfOfferingInstId = value;
    }

    /**
     * Gets the value of the fnfGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fnfGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFnfGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FnfGroupType }
     * 
     * 
     */
    public List<FnfGroupType> getFnfGroups() {
        if (fnfGroups == null) {
            fnfGroups = new ArrayList<FnfGroupType>();
        }
        return this.fnfGroups;
    }

}
