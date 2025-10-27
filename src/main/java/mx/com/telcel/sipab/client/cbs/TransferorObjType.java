
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransferorObjType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransferorObjType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="custAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CustAccessCodeType"/&gt;
 *           &lt;element name="subGroupAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SubGroupAccessCodeType"/&gt;
 *           &lt;element name="subAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SubAccessCodeWithAuthType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferorObjType", propOrder = {
    "custAccessCode",
    "subGroupAccessCode",
    "subAccessCode"
})
public class TransferorObjType {

    protected CustAccessCodeType custAccessCode;
    protected SubGroupAccessCodeType subGroupAccessCode;
    protected SubAccessCodeWithAuthType subAccessCode;

    /**
     * Obtiene el valor de la propiedad custAccessCode.
     * 
     * @return
     *     possible object is
     *     {@link CustAccessCodeType }
     *     
     */
    public CustAccessCodeType getCustAccessCode() {
        return custAccessCode;
    }

    /**
     * Define el valor de la propiedad custAccessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CustAccessCodeType }
     *     
     */
    public void setCustAccessCode(CustAccessCodeType value) {
        this.custAccessCode = value;
    }

    /**
     * Obtiene el valor de la propiedad subGroupAccessCode.
     * 
     * @return
     *     possible object is
     *     {@link SubGroupAccessCodeType }
     *     
     */
    public SubGroupAccessCodeType getSubGroupAccessCode() {
        return subGroupAccessCode;
    }

    /**
     * Define el valor de la propiedad subGroupAccessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubGroupAccessCodeType }
     *     
     */
    public void setSubGroupAccessCode(SubGroupAccessCodeType value) {
        this.subGroupAccessCode = value;
    }

    /**
     * Obtiene el valor de la propiedad subAccessCode.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCodeWithAuthType }
     *     
     */
    public SubAccessCodeWithAuthType getSubAccessCode() {
        return subAccessCode;
    }

    /**
     * Define el valor de la propiedad subAccessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCodeWithAuthType }
     *     
     */
    public void setSubAccessCode(SubAccessCodeWithAuthType value) {
        this.subAccessCode = value;
    }

}
