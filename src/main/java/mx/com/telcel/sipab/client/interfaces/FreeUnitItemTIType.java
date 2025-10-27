
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FreeUnitItemTIType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FreeUnitItemTIType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freeUnitType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="kbincluidos" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="kbrestantes" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="kusados" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="indicadorKb" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}FreeUnitDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeUnitItemTIType", propOrder = {
    "freeUnitType",
    "kbincluidos",
    "kbrestantes",
    "kusados",
    "indicadorKb",
    "freeUnitDetail"
})
public class FreeUnitItemTIType {

    protected String freeUnitType;
    protected BigDecimal kbincluidos;
    protected BigDecimal kbrestantes;
    protected BigDecimal kusados;
    protected String indicadorKb;
    protected List<FreeUnitDetailType> freeUnitDetail;

    /**
     * Obtiene el valor de la propiedad freeUnitType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeUnitType() {
        return freeUnitType;
    }

    /**
     * Define el valor de la propiedad freeUnitType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeUnitType(String value) {
        this.freeUnitType = value;
    }

    /**
     * Obtiene el valor de la propiedad kbincluidos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKbincluidos() {
        return kbincluidos;
    }

    /**
     * Define el valor de la propiedad kbincluidos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKbincluidos(BigDecimal value) {
        this.kbincluidos = value;
    }

    /**
     * Obtiene el valor de la propiedad kbrestantes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKbrestantes() {
        return kbrestantes;
    }

    /**
     * Define el valor de la propiedad kbrestantes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKbrestantes(BigDecimal value) {
        this.kbrestantes = value;
    }

    /**
     * Obtiene el valor de la propiedad kusados.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKusados() {
        return kusados;
    }

    /**
     * Define el valor de la propiedad kusados.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKusados(BigDecimal value) {
        this.kusados = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorKb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorKb() {
        return indicadorKb;
    }

    /**
     * Define el valor de la propiedad indicadorKb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorKb(String value) {
        this.indicadorKb = value;
    }

    /**
     * Gets the value of the freeUnitDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the freeUnitDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeUnitDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeUnitDetailType }
     * 
     * 
     */
    public List<FreeUnitDetailType> getFreeUnitDetail() {
        if (freeUnitDetail == null) {
            freeUnitDetail = new ArrayList<FreeUnitDetailType>();
        }
        return this.freeUnitDetail;
    }

}
