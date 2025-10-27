
package mx.com.telcel.sipab.client.cbs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreditChgInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreditChgInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditLimitID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="creditLimitType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="creditLimitTypeName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica50Type" minOccurs="0"/&gt;
 *         &lt;element name="oldLeftCreditAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="newLeftCreditAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="measureUnit" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}IntType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditChgInfoType", propOrder = {
    "creditLimitID",
    "creditLimitType",
    "creditLimitTypeName",
    "oldLeftCreditAmt",
    "newLeftCreditAmt",
    "measureUnit"
})
public class CreditChgInfoType {

    protected Long creditLimitID;
    @XmlElement(required = true)
    protected String creditLimitType;
    protected String creditLimitTypeName;
    protected long oldLeftCreditAmt;
    protected long newLeftCreditAmt;
    @XmlElement(required = true)
    protected BigInteger measureUnit;

    /**
     * Obtiene el valor de la propiedad creditLimitID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditLimitID() {
        return creditLimitID;
    }

    /**
     * Define el valor de la propiedad creditLimitID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditLimitID(Long value) {
        this.creditLimitID = value;
    }

    /**
     * Obtiene el valor de la propiedad creditLimitType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitType() {
        return creditLimitType;
    }

    /**
     * Define el valor de la propiedad creditLimitType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitType(String value) {
        this.creditLimitType = value;
    }

    /**
     * Obtiene el valor de la propiedad creditLimitTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitTypeName() {
        return creditLimitTypeName;
    }

    /**
     * Define el valor de la propiedad creditLimitTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitTypeName(String value) {
        this.creditLimitTypeName = value;
    }

    /**
     * Obtiene el valor de la propiedad oldLeftCreditAmt.
     * 
     */
    public long getOldLeftCreditAmt() {
        return oldLeftCreditAmt;
    }

    /**
     * Define el valor de la propiedad oldLeftCreditAmt.
     * 
     */
    public void setOldLeftCreditAmt(long value) {
        this.oldLeftCreditAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad newLeftCreditAmt.
     * 
     */
    public long getNewLeftCreditAmt() {
        return newLeftCreditAmt;
    }

    /**
     * Define el valor de la propiedad newLeftCreditAmt.
     * 
     */
    public void setNewLeftCreditAmt(long value) {
        this.newLeftCreditAmt = value;
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

}
