
package mx.com.telcel.sipab.client.sicatel;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Datos de Sistema externo que invoca la petición de registro de pagos por aplicar y registrar en BD de Sicatel
 * 
 * <p>Clase Java para SistemaExternoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SistemaExternoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSistTerceros" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Entero1a10dType"/&gt;
 *         &lt;element name="region" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Entero1a10dType"/&gt;
 *         &lt;element name="centro" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="fuerzaVtas" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="idProceso" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Entero1a10dType"/&gt;
 *         &lt;element name="idUsuario" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type"/&gt;
 *         &lt;element name="numFolioTerceros" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SistemaExternoType", propOrder = {
    "idSistTerceros",
    "region",
    "centro",
    "fuerzaVtas",
    "idProceso",
    "idUsuario",
    "numFolioTerceros"
})
public class SistemaExternoType {

    @XmlSchemaType(name = "integer")
    protected int idSistTerceros;
    @XmlSchemaType(name = "integer")
    protected int region;
    protected String centro;
    protected String fuerzaVtas;
    @XmlSchemaType(name = "integer")
    protected int idProceso;
    @XmlElement(required = true)
    protected String idUsuario;
    @XmlElement(required = true)
    protected String numFolioTerceros;

    /**
     * Obtiene el valor de la propiedad idSistTerceros.
     * 
     */
    public int getIdSistTerceros() {
        return idSistTerceros;
    }

    /**
     * Define el valor de la propiedad idSistTerceros.
     * 
     */
    public void setIdSistTerceros(int value) {
        this.idSistTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     */
    public int getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     */
    public void setRegion(int value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad centro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentro() {
        return centro;
    }

    /**
     * Define el valor de la propiedad centro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentro(String value) {
        this.centro = value;
    }

    /**
     * Obtiene el valor de la propiedad fuerzaVtas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuerzaVtas() {
        return fuerzaVtas;
    }

    /**
     * Define el valor de la propiedad fuerzaVtas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuerzaVtas(String value) {
        this.fuerzaVtas = value;
    }

    /**
     * Obtiene el valor de la propiedad idProceso.
     * 
     */
    public int getIdProceso() {
        return idProceso;
    }

    /**
     * Define el valor de la propiedad idProceso.
     * 
     */
    public void setIdProceso(int value) {
        this.idProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuario(String value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad numFolioTerceros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFolioTerceros() {
        return numFolioTerceros;
    }

    /**
     * Define el valor de la propiedad numFolioTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFolioTerceros(String value) {
        this.numFolioTerceros = value;
    }

}
