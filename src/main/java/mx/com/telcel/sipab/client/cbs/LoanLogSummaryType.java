
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoanLogSummaryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoanLogSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalDebtAMT" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="blacklistStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="blacelistDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DateTimeType"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanLogSummaryType", propOrder = {
    "totalDebtAMT",
    "blacklistStatus",
    "blacelistDate",
    "additionalProperty"
})
public class LoanLogSummaryType {

    protected long totalDebtAMT;
    @XmlElement(required = true)
    protected String blacklistStatus;
    @XmlElement(required = true)
    protected String blacelistDate;
    protected List<SimplePropertyType> additionalProperty;

    /**
     * Obtiene el valor de la propiedad totalDebtAMT.
     * 
     */
    public long getTotalDebtAMT() {
        return totalDebtAMT;
    }

    /**
     * Define el valor de la propiedad totalDebtAMT.
     * 
     */
    public void setTotalDebtAMT(long value) {
        this.totalDebtAMT = value;
    }

    /**
     * Obtiene el valor de la propiedad blacklistStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlacklistStatus() {
        return blacklistStatus;
    }

    /**
     * Define el valor de la propiedad blacklistStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlacklistStatus(String value) {
        this.blacklistStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad blacelistDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlacelistDate() {
        return blacelistDate;
    }

    /**
     * Define el valor de la propiedad blacelistDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlacelistDate(String value) {
        this.blacelistDate = value;
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
     * {@link SimplePropertyType }
     * 
     * 
     */
    public List<SimplePropertyType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<SimplePropertyType>();
        }
        return this.additionalProperty;
    }

}
