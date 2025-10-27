
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountArrearsDetailType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountArrearsDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type"/&gt;
 *         &lt;element name="arrearsInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}ArrearsInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountArrearsDetailType", propOrder = {
    "acctKey",
    "arrearsInfo"
})
public class AccountArrearsDetailType {

    @XmlElement(required = true)
    protected String acctKey;
    @XmlElement(required = true)
    protected List<ArrearsInfoType> arrearsInfo;

    /**
     * Obtiene el valor de la propiedad acctKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctKey() {
        return acctKey;
    }

    /**
     * Define el valor de la propiedad acctKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctKey(String value) {
        this.acctKey = value;
    }

    /**
     * Gets the value of the arrearsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the arrearsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrearsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrearsInfoType }
     * 
     * 
     */
    public List<ArrearsInfoType> getArrearsInfo() {
        if (arrearsInfo == null) {
            arrearsInfo = new ArrayList<ArrearsInfoType>();
        }
        return this.arrearsInfo;
    }

}
