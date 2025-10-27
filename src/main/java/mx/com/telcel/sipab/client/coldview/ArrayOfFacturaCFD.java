
package mx.com.telcel.sipab.client.coldview;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrayOfFacturaCFD complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrayOfFacturaCFD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://coldview.org/}FacturaCFD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfFacturaCFD", namespace = "", propOrder = {
    "facturaCFD"
})
public class ArrayOfFacturaCFD {

    @XmlElement(name = "FacturaCFD", namespace = "http://coldview.org/")
    protected List<FacturaCFD> facturaCFD;

    /**
     * Gets the value of the facturaCFD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the facturaCFD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturaCFD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturaCFD }
     * 
     * 
     */
    public List<FacturaCFD> getFacturaCFD() {
        if (facturaCFD == null) {
            facturaCFD = new ArrayList<FacturaCFD>();
        }
        return this.facturaCFD;
    }

}
