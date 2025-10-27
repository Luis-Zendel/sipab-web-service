
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RechargeBonus2Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RechargeBonus2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freeUnitItemList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitItemListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="balanceList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bonusofferlist" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BonusofferlistType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargeBonus2Type", propOrder = {
    "freeUnitItemList",
    "balanceList",
    "bonusofferlist"
})
public class RechargeBonus2Type {

    protected List<FreeUnitItemListType> freeUnitItemList;
    protected List<BalanceListType> balanceList;
    protected List<BonusofferlistType> bonusofferlist;

    /**
     * Gets the value of the freeUnitItemList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitItemList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitItemList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitItemListType }
     * 
     * 
     */
    public List<FreeUnitItemListType> getFreeUnitItemList() {
        if (freeUnitItemList == null) {
            freeUnitItemList = new ArrayList<FreeUnitItemListType>();
        }
        return this.freeUnitItemList;
    }

    /**
     * Gets the value of the balanceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the balanceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceListType }
     * 
     * 
     */
    public List<BalanceListType> getBalanceList() {
        if (balanceList == null) {
            balanceList = new ArrayList<BalanceListType>();
        }
        return this.balanceList;
    }

    /**
     * Gets the value of the bonusofferlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bonusofferlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBonusofferlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BonusofferlistType }
     * 
     * 
     */
    public List<BonusofferlistType> getBonusofferlist() {
        if (bonusofferlist == null) {
            bonusofferlist = new ArrayList<BonusofferlistType>();
        }
        return this.bonusofferlist;
    }

}
