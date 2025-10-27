
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LifeCycleRollBackType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleRollBackType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oldLifeCycleStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OldLifeCycleStatusType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="newLifeCycleStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}NewLifeCycleStatusType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="rollBackValidity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeCycleRollBackType", propOrder = {
    "oldLifeCycleStatus",
    "newLifeCycleStatus",
    "rollBackValidity"
})
public class LifeCycleRollBackType {

    @XmlElement(required = true)
    protected List<OldLifeCycleStatusType> oldLifeCycleStatus;
    @XmlElement(required = true)
    protected List<NewLifeCycleStatusType> newLifeCycleStatus;
    protected int rollBackValidity;

    /**
     * Gets the value of the oldLifeCycleStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the oldLifeCycleStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOldLifeCycleStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OldLifeCycleStatusType }
     * 
     * 
     */
    public List<OldLifeCycleStatusType> getOldLifeCycleStatus() {
        if (oldLifeCycleStatus == null) {
            oldLifeCycleStatus = new ArrayList<OldLifeCycleStatusType>();
        }
        return this.oldLifeCycleStatus;
    }

    /**
     * Gets the value of the newLifeCycleStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the newLifeCycleStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewLifeCycleStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewLifeCycleStatusType }
     * 
     * 
     */
    public List<NewLifeCycleStatusType> getNewLifeCycleStatus() {
        if (newLifeCycleStatus == null) {
            newLifeCycleStatus = new ArrayList<NewLifeCycleStatusType>();
        }
        return this.newLifeCycleStatus;
    }

    /**
     * Obtiene el valor de la propiedad rollBackValidity.
     * 
     */
    public int getRollBackValidity() {
        return rollBackValidity;
    }

    /**
     * Define el valor de la propiedad rollBackValidity.
     * 
     */
    public void setRollBackValidity(int value) {
        this.rollBackValidity = value;
    }

}
