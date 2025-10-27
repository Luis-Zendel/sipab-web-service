
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RecibirResultadoPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RecibirResultadoPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="telefonoCodi" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica10Type"/&gt;
 *         &lt;element name="referenciaNumerica" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Entero7dType"/&gt;
 *         &lt;element name="idConcepto" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="tipoServicio" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica10Type"/&gt;
 *         &lt;element name="idMsjCobro" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;element name="fechaSolicitud" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica19Type"/&gt;
 *         &lt;element name="monto" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal10c2Type"/&gt;
 *         &lt;element name="claveRastreo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica40Type"/&gt;
 *         &lt;element name="resMsjCobro" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica3Type"/&gt;
 *         &lt;element name="fechaProcMsjCobro" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica19Type"/&gt;
 *         &lt;element name="telefonoServicio" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica10Type" minOccurs="0"/&gt;
 *         &lt;element name="idAplicacion" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica3Type"/&gt;
 *         &lt;element name="folioAutorizador" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica6Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecibirResultadoPetType", propOrder = {
    "telefonoCodi",
    "referenciaNumerica",
    "idConcepto",
    "tipoServicio",
    "idMsjCobro",
    "fechaSolicitud",
    "monto",
    "claveRastreo",
    "resMsjCobro",
    "fechaProcMsjCobro",
    "telefonoServicio",
    "idAplicacion",
    "folioAutorizador"
})
public class RecibirResultadoPetType {

    @XmlElement(required = true)
    protected String telefonoCodi;
    protected int referenciaNumerica;
    @XmlElement(required = true)
    protected String idConcepto;
    @XmlElement(required = true)
    protected String tipoServicio;
    @XmlElement(required = true)
    protected String idMsjCobro;
    @XmlElement(required = true)
    protected String fechaSolicitud;
    @XmlElement(required = true)
    protected BigDecimal monto;
    @XmlElement(required = true)
    protected String claveRastreo;
    @XmlElement(required = true)
    protected String resMsjCobro;
    @XmlElement(required = true)
    protected String fechaProcMsjCobro;
    protected String telefonoServicio;
    @XmlElement(required = true)
    protected String idAplicacion;
    @XmlElement(required = true)
    protected String folioAutorizador;

    /**
     * Obtiene el valor de la propiedad telefonoCodi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoCodi() {
        return telefonoCodi;
    }

    /**
     * Define el valor de la propiedad telefonoCodi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoCodi(String value) {
        this.telefonoCodi = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaNumerica.
     * 
     */
    public int getReferenciaNumerica() {
        return referenciaNumerica;
    }

    /**
     * Define el valor de la propiedad referenciaNumerica.
     * 
     */
    public void setReferenciaNumerica(int value) {
        this.referenciaNumerica = value;
    }

    /**
     * Obtiene el valor de la propiedad idConcepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdConcepto() {
        return idConcepto;
    }

    /**
     * Define el valor de la propiedad idConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdConcepto(String value) {
        this.idConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoServicio() {
        return tipoServicio;
    }

    /**
     * Define el valor de la propiedad tipoServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoServicio(String value) {
        this.tipoServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad idMsjCobro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMsjCobro() {
        return idMsjCobro;
    }

    /**
     * Define el valor de la propiedad idMsjCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMsjCobro(String value) {
        this.idMsjCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Define el valor de la propiedad fechaSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSolicitud(String value) {
        this.fechaSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad claveRastreo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveRastreo() {
        return claveRastreo;
    }

    /**
     * Define el valor de la propiedad claveRastreo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveRastreo(String value) {
        this.claveRastreo = value;
    }

    /**
     * Obtiene el valor de la propiedad resMsjCobro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResMsjCobro() {
        return resMsjCobro;
    }

    /**
     * Define el valor de la propiedad resMsjCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResMsjCobro(String value) {
        this.resMsjCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaProcMsjCobro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaProcMsjCobro() {
        return fechaProcMsjCobro;
    }

    /**
     * Define el valor de la propiedad fechaProcMsjCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaProcMsjCobro(String value) {
        this.fechaProcMsjCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoServicio() {
        return telefonoServicio;
    }

    /**
     * Define el valor de la propiedad telefonoServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoServicio(String value) {
        this.telefonoServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad idAplicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAplicacion() {
        return idAplicacion;
    }

    /**
     * Define el valor de la propiedad idAplicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAplicacion(String value) {
        this.idAplicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad folioAutorizador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioAutorizador() {
        return folioAutorizador;
    }

    /**
     * Define el valor de la propiedad folioAutorizador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioAutorizador(String value) {
        this.folioAutorizador = value;
    }

}
