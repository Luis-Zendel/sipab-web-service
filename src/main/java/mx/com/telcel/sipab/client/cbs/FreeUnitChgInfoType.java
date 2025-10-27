
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FreeUnitChgInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FreeUnitChgInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freeUnitInstanceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitTypeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="measureUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}IntType" minOccurs="0"/&gt;
 *         &lt;element name="measureUnitName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="oldAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="newAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeUnitChgInfoType", propOrder = {
    "freeUnitInstanceID",
    "freeUnitType",
    "freeUnitTypeName",
    "measureUnit",
    "measureUnitName",
    "oldAmt",
    "newAmt"
})
public class FreeUnitChgInfoType {

    protected Long freeUnitInstanceID;
    protected String freeUnitType;
    protected String freeUnitTypeName;
    protected BigInteger measureUnit;
    protected String measureUnitName;
    protected Long oldAmt;
    protected Long newAmt;

    /**
     * Obtiene el valor de la propiedad freeUnitInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeUnitInstanceID() {
        return freeUnitInstanceID;
    }

    /**
     * Define el valor de la propiedad freeUnitInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeUnitInstanceID(Long value) {
        this.freeUnitInstanceID = value;
    }

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
     * Obtiene el valor de la propiedad freeUnitTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeUnitTypeName() {
        return freeUnitTypeName;
    }

    /**
     * Define el valor de la propiedad freeUnitTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeUnitTypeName(String value) {
        this.freeUnitTypeName = value;
    }

    /**
     * Obtiene el valor de la propiedad measureUnit.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasureUnit() {
        return measureUnit;
    }

    /**
     * Define el valor de la propiedad measureUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasureUnit(BigInteger value) {
        this.measureUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad measureUnitName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureUnitName() {
        return measureUnitName;
    }

    /**
     * Define el valor de la propiedad measureUnitName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureUnitName(String value) {
        this.measureUnitName = value;
    }

    /**
     * Obtiene el valor de la propiedad oldAmt.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOldAmt() {
        return oldAmt;
    }

    /**
     * Define el valor de la propiedad oldAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOldAmt(Long value) {
        this.oldAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad newAmt.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewAmt() {
        return newAmt;
    }

    /**
     * Define el valor de la propiedad newAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewAmt(Long value) {
        this.newAmt = value;
    }

}
