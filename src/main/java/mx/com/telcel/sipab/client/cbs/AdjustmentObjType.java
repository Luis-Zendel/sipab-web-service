
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdjustmentObjType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentObjType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="subAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SubAccessCodeType"/&gt;
 *           &lt;element name="acctAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctAccessCodePayType"/&gt;
 *           &lt;element name="subGroupAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SubGroupAccessCodeType"/&gt;
 *           &lt;element name="custAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CustAccessCodeType"/&gt;
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
@XmlType(name = "AdjustmentObjType", propOrder = {
    "subAccessCode",
    "acctAccessCode",
    "subGroupAccessCode",
    "custAccessCode"
})
public class AdjustmentObjType {

    protected SubAccessCodeType subAccessCode;
    protected AcctAccessCodePayType acctAccessCode;
    protected SubGroupAccessCodeType subGroupAccessCode;
    protected CustAccessCodeType custAccessCode;

    /**
     * Obtiene el valor de la propiedad subAccessCode.
     * 
     * @return
     *     possible object is
     *     {@link SubAccessCodeType }
     *     
     */
    public SubAccessCodeType getSubAccessCode() {
        return subAccessCode;
    }

    /**
     * Define el valor de la propiedad subAccessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccessCodeType }
     *     
     */
    public void setSubAccessCode(SubAccessCodeType value) {
        this.subAccessCode = value;
    }

    /**
     * Obtiene el valor de la propiedad acctAccessCode.
     * 
     * @return
     *     possible object is
     *     {@link AcctAccessCodePayType }
     *     
     */
    public AcctAccessCodePayType getAcctAccessCode() {
        return acctAccessCode;
    }

    /**
     * Define el valor de la propiedad acctAccessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAccessCodePayType }
     *     
     */
    public void setAcctAccessCode(AcctAccessCodePayType value) {
        this.acctAccessCode = value;
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

}
