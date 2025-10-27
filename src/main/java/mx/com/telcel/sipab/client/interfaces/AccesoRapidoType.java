
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccesoRapidoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccesoRapidoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idAccesoRapido" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Integer5Type"/&gt;
 *         &lt;element name="nombreAccesoRapido" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica50Type"/&gt;
 *         &lt;element name="ordenAccesoRapido" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Integer5Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccesoRapidoType", propOrder = {
    "idAccesoRapido",
    "nombreAccesoRapido",
    "ordenAccesoRapido"
})
public class AccesoRapidoType {

    @XmlElement(required = true)
    protected BigInteger idAccesoRapido;
    @XmlElement(required = true)
    protected String nombreAccesoRapido;
    @XmlElement(required = true)
    protected BigInteger ordenAccesoRapido;

    /**
     * Obtiene el valor de la propiedad idAccesoRapido.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdAccesoRapido() {
        return idAccesoRapido;
    }

    /**
     * Define el valor de la propiedad idAccesoRapido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdAccesoRapido(BigInteger value) {
        this.idAccesoRapido = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAccesoRapido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAccesoRapido() {
        return nombreAccesoRapido;
    }

    /**
     * Define el valor de la propiedad nombreAccesoRapido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAccesoRapido(String value) {
        this.nombreAccesoRapido = value;
    }

    /**
     * Obtiene el valor de la propiedad ordenAccesoRapido.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrdenAccesoRapido() {
        return ordenAccesoRapido;
    }

    /**
     * Define el valor de la propiedad ordenAccesoRapido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrdenAccesoRapido(BigInteger value) {
        this.ordenAccesoRapido = value;
    }

}
