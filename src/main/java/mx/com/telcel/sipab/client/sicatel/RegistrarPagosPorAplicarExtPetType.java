
package mx.com.telcel.sipab.client.sicatel;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegistrarPagosPorAplicarExtPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistrarPagosPorAplicarExtPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sistemaExterno" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}SistemaExternoType" minOccurs="0"/&gt;
 *         &lt;element name="conceptoPago" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}ConceptoPagoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="genericos" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}GenericosType" minOccurs="0"/&gt;
 *         &lt;element name="genericosBes" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}GenericosBesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrarPagosPorAplicarExtPetType", propOrder = {
    "sistemaExterno",
    "conceptoPago",
    "genericos",
    "genericosBes"
})
public class RegistrarPagosPorAplicarExtPetType {

    protected SistemaExternoType sistemaExterno;
    protected List<ConceptoPagoType> conceptoPago;
    protected GenericosType genericos;
    protected GenericosBesType genericosBes;

    /**
     * Obtiene el valor de la propiedad sistemaExterno.
     * 
     * @return
     *     possible object is
     *     {@link SistemaExternoType }
     *     
     */
    public SistemaExternoType getSistemaExterno() {
        return sistemaExterno;
    }

    /**
     * Define el valor de la propiedad sistemaExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaExternoType }
     *     
     */
    public void setSistemaExterno(SistemaExternoType value) {
        this.sistemaExterno = value;
    }

    /**
     * Gets the value of the conceptoPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the conceptoPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptoPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptoPagoType }
     * 
     * 
     */
    public List<ConceptoPagoType> getConceptoPago() {
        if (conceptoPago == null) {
            conceptoPago = new ArrayList<ConceptoPagoType>();
        }
        return this.conceptoPago;
    }

    /**
     * Obtiene el valor de la propiedad genericos.
     * 
     * @return
     *     possible object is
     *     {@link GenericosType }
     *     
     */
    public GenericosType getGenericos() {
        return genericos;
    }

    /**
     * Define el valor de la propiedad genericos.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericosType }
     *     
     */
    public void setGenericos(GenericosType value) {
        this.genericos = value;
    }

    /**
     * Obtiene el valor de la propiedad genericosBes.
     * 
     * @return
     *     possible object is
     *     {@link GenericosBesType }
     *     
     */
    public GenericosBesType getGenericosBes() {
        return genericosBes;
    }

    /**
     * Define el valor de la propiedad genericosBes.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericosBesType }
     *     
     */
    public void setGenericosBes(GenericosBesType value) {
        this.genericosBes = value;
    }

}
