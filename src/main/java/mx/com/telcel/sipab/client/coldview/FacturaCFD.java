
package mx.com.telcel.sipab.client.coldview;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para facturaCFD complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="facturaCFD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://coldview.org/}ContenedorCV" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}FechaExpedicion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}Folio" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}MontoImpuesto" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}MontoOperacion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}NomReceptor" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}NroCuenta" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}RFC" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}Serie" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}Sustituido" minOccurs="0"/&gt;
 *         &lt;element ref="{http://coldview.org/}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facturaCFD", namespace = "", propOrder = {
    "contenedorCV",
    "fechaExpedicion",
    "folio",
    "montoImpuesto",
    "montoOperacion",
    "nomReceptor",
    "nroCuenta",
    "rfc",
    "serie",
    "sustituido",
    "uuid"
})
public class FacturaCFD {

    @XmlElement(name = "ContenedorCV", namespace = "http://coldview.org/")
    protected String contenedorCV;
    @XmlElement(name = "FechaExpedicion", namespace = "http://coldview.org/")
    protected String fechaExpedicion;
    @XmlElement(name = "Folio", namespace = "http://coldview.org/")
    protected String folio;
    @XmlElement(name = "MontoImpuesto", namespace = "http://coldview.org/")
    protected String montoImpuesto;
    @XmlElement(name = "MontoOperacion", namespace = "http://coldview.org/")
    protected String montoOperacion;
    @XmlElement(name = "NomReceptor", namespace = "http://coldview.org/")
    protected String nomReceptor;
    @XmlElement(name = "NroCuenta", namespace = "http://coldview.org/")
    protected String nroCuenta;
    @XmlElement(name = "RFC", namespace = "http://coldview.org/")
    protected String rfc;
    @XmlElement(name = "Serie", namespace = "http://coldview.org/")
    protected String serie;
    @XmlElement(name = "Sustituido", namespace = "http://coldview.org/")
    protected String sustituido;
    @XmlElement(name = "UUID", namespace = "http://coldview.org/")
    protected String uuid;

    /**
     * Obtiene el valor de la propiedad contenedorCV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenedorCV() {
        return contenedorCV;
    }

    /**
     * Define el valor de la propiedad contenedorCV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenedorCV(String value) {
        this.contenedorCV = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Define el valor de la propiedad fechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad montoImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoImpuesto() {
        return montoImpuesto;
    }

    /**
     * Define el valor de la propiedad montoImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoImpuesto(String value) {
        this.montoImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad montoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoOperacion() {
        return montoOperacion;
    }

    /**
     * Define el valor de la propiedad montoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoOperacion(String value) {
        this.montoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nomReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomReceptor() {
        return nomReceptor;
    }

    /**
     * Define el valor de la propiedad nomReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomReceptor(String value) {
        this.nomReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad nroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroCuenta() {
        return nroCuenta;
    }

    /**
     * Define el valor de la propiedad nroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroCuenta(String value) {
        this.nroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFC() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFC(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad sustituido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSustituido() {
        return sustituido;
    }

    /**
     * Define el valor de la propiedad sustituido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSustituido(String value) {
        this.sustituido = value;
    }

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

}
