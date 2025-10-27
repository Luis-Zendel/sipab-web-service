
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryObjARType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryObjARType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="subAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SubAccessCodeType"/&gt;
 *           &lt;element name="acctAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctAccessCodeType"/&gt;
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
@XmlType(name = "QueryObjARType", propOrder = {
    "subAccessCode",
    "acctAccessCode"
})
public class QueryObjARType {

    protected SubAccessCodeType subAccessCode;
    protected AcctAccessCodeType acctAccessCode;

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
     *     {@link AcctAccessCodeType }
     *     
     */
    public AcctAccessCodeType getAcctAccessCode() {
        return acctAccessCode;
    }

    /**
     * Define el valor de la propiedad acctAccessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAccessCodeType }
     *     
     */
    public void setAcctAccessCode(AcctAccessCodeType value) {
        this.acctAccessCode = value;
    }

}
