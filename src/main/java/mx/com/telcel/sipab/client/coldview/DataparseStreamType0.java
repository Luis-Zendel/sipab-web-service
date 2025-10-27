
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dataparseStreamType0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dataparseStreamType0"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PG" type="{}stringDataContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataparseStreamType0", namespace = "", propOrder = {
    "pg"
})
public class DataparseStreamType0 {

    @XmlElement(name = "PG")
    protected String pg;

    /**
     * Obtiene el valor de la propiedad pg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPG() {
        return pg;
    }

    /**
     * Define el valor de la propiedad pg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPG(String value) {
        this.pg = value;
    }

}
