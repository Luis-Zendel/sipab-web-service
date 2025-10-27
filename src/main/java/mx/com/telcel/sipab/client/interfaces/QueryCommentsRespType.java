
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryCommentsRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryCommentsRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subsComments" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SubsCommentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="acctComments" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}AcctCommentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCommentsRespType", propOrder = {
    "subsComments",
    "acctComments"
})
public class QueryCommentsRespType {

    protected List<SubsCommentsType> subsComments;
    protected List<AcctCommentsType> acctComments;

    /**
     * Gets the value of the subsComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subsComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubsCommentsType }
     * 
     * 
     */
    public List<SubsCommentsType> getSubsComments() {
        if (subsComments == null) {
            subsComments = new ArrayList<SubsCommentsType>();
        }
        return this.subsComments;
    }

    /**
     * Gets the value of the acctComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the acctComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctCommentsType }
     * 
     * 
     */
    public List<AcctCommentsType> getAcctComments() {
        if (acctComments == null) {
            acctComments = new ArrayList<AcctCommentsType>();
        }
        return this.acctComments;
    }

}
