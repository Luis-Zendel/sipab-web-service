
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LifeCycleChgInfo21Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleChgInfo21Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oldLifeCycleStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OldLifeCycleStatus21Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="newLifeCycleStatus" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}NewLifeCycleStatus21Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="addValidity" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}EnteroType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeCycleChgInfo21Type", propOrder = {
    "oldLifeCycleStatus",
    "newLifeCycleStatus",
    "addValidity"
})
public class LifeCycleChgInfo21Type {

    @XmlElement(required = true)
    protected List<OldLifeCycleStatus21Type> oldLifeCycleStatus;
    @XmlElement(required = true)
    protected List<NewLifeCycleStatus21Type> newLifeCycleStatus;
    protected Integer addValidity;

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
     * {@link OldLifeCycleStatus21Type }
     * 
     * 
     */
    public List<OldLifeCycleStatus21Type> getOldLifeCycleStatus() {
        if (oldLifeCycleStatus == null) {
            oldLifeCycleStatus = new ArrayList<OldLifeCycleStatus21Type>();
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
     * {@link NewLifeCycleStatus21Type }
     * 
     * 
     */
    public List<NewLifeCycleStatus21Type> getNewLifeCycleStatus() {
        if (newLifeCycleStatus == null) {
            newLifeCycleStatus = new ArrayList<NewLifeCycleStatus21Type>();
        }
        return this.newLifeCycleStatus;
    }

    /**
     * Obtiene el valor de la propiedad addValidity.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddValidity() {
        return addValidity;
    }

    /**
     * Define el valor de la propiedad addValidity.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddValidity(Integer value) {
        this.addValidity = value;
    }

}
