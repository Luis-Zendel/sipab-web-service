
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountArrearsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountArrearsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountArrearsDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AccountArrearsDetailType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="totalRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="beginRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="fetchRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountArrearsType", propOrder = {
    "accountArrearsDetail",
    "totalRowNum",
    "beginRowNum",
    "fetchRowNum"
})
public class AccountArrearsType {

    @XmlElement(required = true)
    protected List<AccountArrearsDetailType> accountArrearsDetail;
    protected long totalRowNum;
    protected long beginRowNum;
    protected long fetchRowNum;

    /**
     * Gets the value of the accountArrearsDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accountArrearsDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountArrearsDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountArrearsDetailType }
     * 
     * 
     */
    public List<AccountArrearsDetailType> getAccountArrearsDetail() {
        if (accountArrearsDetail == null) {
            accountArrearsDetail = new ArrayList<AccountArrearsDetailType>();
        }
        return this.accountArrearsDetail;
    }

    /**
     * Obtiene el valor de la propiedad totalRowNum.
     * 
     */
    public long getTotalRowNum() {
        return totalRowNum;
    }

    /**
     * Define el valor de la propiedad totalRowNum.
     * 
     */
    public void setTotalRowNum(long value) {
        this.totalRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad beginRowNum.
     * 
     */
    public long getBeginRowNum() {
        return beginRowNum;
    }

    /**
     * Define el valor de la propiedad beginRowNum.
     * 
     */
    public void setBeginRowNum(long value) {
        this.beginRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad fetchRowNum.
     * 
     */
    public long getFetchRowNum() {
        return fetchRowNum;
    }

    /**
     * Define el valor de la propiedad fetchRowNum.
     * 
     */
    public void setFetchRowNum(long value) {
        this.fetchRowNum = value;
    }

}
