
package mx.com.telcel.sipab.client.sicatel;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Tipos de datos genéricos para el servicio SicatelWSPagosSistExt u otro servicio que le sea funcional.
 * 
 * <p>Clase Java para GenericosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GenericosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generico1" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="generico2" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="generico3" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}String32Type" minOccurs="0"/&gt;
 *         &lt;element name="generico4" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Decimal10c2Type" minOccurs="0"/&gt;
 *         &lt;element name="generico5" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Decimal10c2Type" minOccurs="0"/&gt;
 *         &lt;element name="generico6" type="{http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice}Decimal10c2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericosType", propOrder = {
    "generico1",
    "generico2",
    "generico3",
    "generico4",
    "generico5",
    "generico6"
})
public class GenericosType {

    protected String generico1;
    protected String generico2;
    protected String generico3;
    protected BigDecimal generico4;
    protected BigDecimal generico5;
    protected BigDecimal generico6;

    /**
     * Obtiene el valor de la propiedad generico1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerico1() {
        return generico1;
    }

    /**
     * Define el valor de la propiedad generico1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerico1(String value) {
        this.generico1 = value;
    }

    /**
     * Obtiene el valor de la propiedad generico2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerico2() {
        return generico2;
    }

    /**
     * Define el valor de la propiedad generico2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerico2(String value) {
        this.generico2 = value;
    }

    /**
     * Obtiene el valor de la propiedad generico3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerico3() {
        return generico3;
    }

    /**
     * Define el valor de la propiedad generico3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerico3(String value) {
        this.generico3 = value;
    }

    /**
     * Obtiene el valor de la propiedad generico4.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGenerico4() {
        return generico4;
    }

    /**
     * Define el valor de la propiedad generico4.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGenerico4(BigDecimal value) {
        this.generico4 = value;
    }

    /**
     * Obtiene el valor de la propiedad generico5.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGenerico5() {
        return generico5;
    }

    /**
     * Define el valor de la propiedad generico5.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGenerico5(BigDecimal value) {
        this.generico5 = value;
    }

    /**
     * Obtiene el valor de la propiedad generico6.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGenerico6() {
        return generico6;
    }

    /**
     * Define el valor de la propiedad generico6.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGenerico6(BigDecimal value) {
        this.generico6 = value;
    }

}
