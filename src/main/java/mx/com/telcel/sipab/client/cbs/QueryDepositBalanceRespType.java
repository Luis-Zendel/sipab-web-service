
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryDepositBalanceRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryDepositBalanceRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depositBalanceList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}DepositBalanceListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDepositBalanceRespType", propOrder = {
    "depositBalanceList"
})
public class QueryDepositBalanceRespType {

    protected List<DepositBalanceListType> depositBalanceList;

    /**
     * Gets the value of the depositBalanceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the depositBalanceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositBalanceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepositBalanceListType }
     * 
     * 
     */
    public List<DepositBalanceListType> getDepositBalanceList() {
        if (depositBalanceList == null) {
            depositBalanceList = new ArrayList<DepositBalanceListType>();
        }
        return this.depositBalanceList;
    }

}
