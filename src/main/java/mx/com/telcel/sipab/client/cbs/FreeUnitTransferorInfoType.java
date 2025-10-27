
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FreeUnitTransferorInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FreeUnitTransferorInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freeUnitInstanceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="freeUnitType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="transferAmt" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type"/&gt;
 *         &lt;element name="destFreeUnitType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeUnitTransferorInfoType", propOrder = {
    "freeUnitInstanceID",
    "freeUnitType",
    "transferAmt",
    "destFreeUnitType"
})
public class FreeUnitTransferorInfoType {

    protected Long freeUnitInstanceID;
    protected String freeUnitType;
    protected long transferAmt;
    protected String destFreeUnitType;

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
     * Obtiene el valor de la propiedad transferAmt.
     * 
     */
    public long getTransferAmt() {
        return transferAmt;
    }

    /**
     * Define el valor de la propiedad transferAmt.
     * 
     */
    public void setTransferAmt(long value) {
        this.transferAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad destFreeUnitType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestFreeUnitType() {
        return destFreeUnitType;
    }

    /**
     * Define el valor de la propiedad destFreeUnitType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestFreeUnitType(String value) {
        this.destFreeUnitType = value;
    }

}
