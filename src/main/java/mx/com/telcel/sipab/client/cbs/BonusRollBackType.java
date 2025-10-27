
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BonusRollBackType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BonusRollBackType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freeUnitItemList2" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitItemList2Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="balanceList2" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceList2Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BonusRollBackType", propOrder = {
    "freeUnitItemList2",
    "balanceList2"
})
public class BonusRollBackType {

    protected List<FreeUnitItemList2Type> freeUnitItemList2;
    protected List<BalanceList2Type> balanceList2;

    /**
     * Gets the value of the freeUnitItemList2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitItemList2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitItemList2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitItemList2Type }
     * 
     * 
     */
    public List<FreeUnitItemList2Type> getFreeUnitItemList2() {
        if (freeUnitItemList2 == null) {
            freeUnitItemList2 = new ArrayList<FreeUnitItemList2Type>();
        }
        return this.freeUnitItemList2;
    }

    /**
     * Gets the value of the balanceList2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the balanceList2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceList2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceList2Type }
     * 
     * 
     */
    public List<BalanceList2Type> getBalanceList2() {
        if (balanceList2 == null) {
            balanceList2 = new ArrayList<BalanceList2Type>();
        }
        return this.balanceList2;
    }

}
