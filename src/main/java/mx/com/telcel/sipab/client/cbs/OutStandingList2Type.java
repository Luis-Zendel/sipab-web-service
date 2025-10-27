
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OutStandingList2Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OutStandingList2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billCycleID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica10Type"/&gt;
 *         &lt;element name="billCycleBeginTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *         &lt;element name="billCycleEndTime" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *         &lt;element name="dueDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Datetime14Type"/&gt;
 *         &lt;element name="outStandingDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}OutStandingDetail2Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutStandingList2Type", propOrder = {
    "billCycleID",
    "billCycleBeginTime",
    "billCycleEndTime",
    "dueDate",
    "outStandingDetail"
})
public class OutStandingList2Type {

    @XmlElement(required = true)
    protected String billCycleID;
    @XmlElement(required = true)
    protected String billCycleBeginTime;
    @XmlElement(required = true)
    protected String billCycleEndTime;
    @XmlElement(required = true)
    protected String dueDate;
    @XmlElement(required = true)
    protected List<OutStandingDetail2Type> outStandingDetail;

    /**
     * Obtiene el valor de la propiedad billCycleID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleID() {
        return billCycleID;
    }

    /**
     * Define el valor de la propiedad billCycleID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleID(String value) {
        this.billCycleID = value;
    }

    /**
     * Obtiene el valor de la propiedad billCycleBeginTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleBeginTime() {
        return billCycleBeginTime;
    }

    /**
     * Define el valor de la propiedad billCycleBeginTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleBeginTime(String value) {
        this.billCycleBeginTime = value;
    }

    /**
     * Obtiene el valor de la propiedad billCycleEndTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleEndTime() {
        return billCycleEndTime;
    }

    /**
     * Define el valor de la propiedad billCycleEndTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleEndTime(String value) {
        this.billCycleEndTime = value;
    }

    /**
     * Obtiene el valor de la propiedad dueDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * Define el valor de la propiedad dueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(String value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the outStandingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the outStandingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutStandingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutStandingDetail2Type }
     * 
     * 
     */
    public List<OutStandingDetail2Type> getOutStandingDetail() {
        if (outStandingDetail == null) {
            outStandingDetail = new ArrayList<OutStandingDetail2Type>();
        }
        return this.outStandingDetail;
    }

}
