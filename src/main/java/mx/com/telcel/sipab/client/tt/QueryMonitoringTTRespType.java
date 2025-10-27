
package mx.com.telcel.sipab.client.tt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryMonitoringTTRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryMonitoringTTRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monitoringTTlist" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}MonitoringTTListType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMonitoringTTRespType", propOrder = {
    "monitoringTTlist"
})
public class QueryMonitoringTTRespType {

    protected List<MonitoringTTListType> monitoringTTlist;

    /**
     * Gets the value of the monitoringTTlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the monitoringTTlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoringTTlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoringTTListType }
     * 
     * 
     */
    public List<MonitoringTTListType> getMonitoringTTlist() {
        if (monitoringTTlist == null) {
            monitoringTTlist = new ArrayList<MonitoringTTListType>();
        }
        return this.monitoringTTlist;
    }

}
