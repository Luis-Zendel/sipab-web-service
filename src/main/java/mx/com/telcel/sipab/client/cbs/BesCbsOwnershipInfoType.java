
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BesCbsOwnershipInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BesCbsOwnershipInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BEID" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsBEIDType"/&gt;
 *         &lt;element name="BRID" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCbsBRIDType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BesCbsOwnershipInfoType", namespace = "http://amx.com/mexico/telcel/esb/v1_2", propOrder = {
    "beid",
    "brid"
})
public class BesCbsOwnershipInfoType {

    @XmlElement(name = "BEID", namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected String beid;
    @XmlElement(name = "BRID", namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected String brid;

    /**
     * Obtiene el valor de la propiedad beid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEID() {
        return beid;
    }

    /**
     * Define el valor de la propiedad beid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEID(String value) {
        this.beid = value;
    }

    /**
     * Obtiene el valor de la propiedad brid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRID() {
        return brid;
    }

    /**
     * Define el valor de la propiedad brid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRID(String value) {
        this.brid = value;
    }

}
