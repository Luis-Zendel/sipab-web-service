
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para StockInRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StockInRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="successList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InvExecuteResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="failList" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InvExecuteResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockInRespType", propOrder = {
    "successList",
    "failList"
})
public class StockInRespType {

    protected List<InvExecuteResultType> successList;
    protected List<InvExecuteResultType> failList;

    /**
     * Gets the value of the successList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the successList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccessList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvExecuteResultType }
     * 
     * 
     */
    public List<InvExecuteResultType> getSuccessList() {
        if (successList == null) {
            successList = new ArrayList<InvExecuteResultType>();
        }
        return this.successList;
    }

    /**
     * Gets the value of the failList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the failList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvExecuteResultType }
     * 
     * 
     */
    public List<InvExecuteResultType> getFailList() {
        if (failList == null) {
            failList = new ArrayList<InvExecuteResultType>();
        }
        return this.failList;
    }

}
