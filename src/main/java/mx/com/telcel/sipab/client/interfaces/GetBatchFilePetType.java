
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetBatchFilePetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetBatchFilePetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="batchTransactionID" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type"/&gt;
 *         &lt;element name="dirs" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBatchFilePetType", propOrder = {
    "batchTransactionID",
    "dirs",
    "additionalProperty"
})
public class GetBatchFilePetType {

    @XmlElement(required = true)
    protected BigDecimal batchTransactionID;
    protected List<BigDecimal> dirs;
    protected BesCrmSimplePropertyType additionalProperty;

    /**
     * Obtiene el valor de la propiedad batchTransactionID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatchTransactionID() {
        return batchTransactionID;
    }

    /**
     * Define el valor de la propiedad batchTransactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatchTransactionID(BigDecimal value) {
        this.batchTransactionID = value;
    }

    /**
     * Gets the value of the dirs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dirs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getDirs() {
        if (dirs == null) {
            dirs = new ArrayList<BigDecimal>();
        }
        return this.dirs;
    }

    /**
     * Obtiene el valor de la propiedad additionalProperty.
     * 
     * @return
     *     possible object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public BesCrmSimplePropertyType getAdditionalProperty() {
        return additionalProperty;
    }

    /**
     * Define el valor de la propiedad additionalProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public void setAdditionalProperty(BesCrmSimplePropertyType value) {
        this.additionalProperty = value;
    }

}
