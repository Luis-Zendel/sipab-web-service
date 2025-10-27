
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryAvailableAccountsRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryAvailableAccountsRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctInfosQA" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctInfosQAType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="pageInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAvailableAccountsRespType", propOrder = {
    "acctInfosQA",
    "pageInfo"
})
public class QueryAvailableAccountsRespType {

    @XmlElement(required = true)
    protected List<AcctInfosQAType> acctInfosQA;
    protected PageType pageInfo;

    /**
     * Gets the value of the acctInfosQA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the acctInfosQA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctInfosQA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctInfosQAType }
     * 
     * 
     */
    public List<AcctInfosQAType> getAcctInfosQA() {
        if (acctInfosQA == null) {
            acctInfosQA = new ArrayList<AcctInfosQAType>();
        }
        return this.acctInfosQA;
    }

    /**
     * Obtiene el valor de la propiedad pageInfo.
     * 
     * @return
     *     possible object is
     *     {@link PageType }
     *     
     */
    public PageType getPageInfo() {
        return pageInfo;
    }

    /**
     * Define el valor de la propiedad pageInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PageType }
     *     
     */
    public void setPageInfo(PageType value) {
        this.pageInfo = value;
    }

}
