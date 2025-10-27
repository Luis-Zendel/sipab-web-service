
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubGroupAccessCodeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubGroupAccessCodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="subGroupKey" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SubGroupKeyType"/&gt;
 *           &lt;element name="subGroupCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type"/&gt;
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
@XmlType(name = "SubGroupAccessCodeType", propOrder = {
    "subGroupKey",
    "subGroupCode"
})
public class SubGroupAccessCodeType {

    protected String subGroupKey;
    protected String subGroupCode;

    /**
     * Obtiene el valor de la propiedad subGroupKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupKey() {
        return subGroupKey;
    }

    /**
     * Define el valor de la propiedad subGroupKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupKey(String value) {
        this.subGroupKey = value;
    }

    /**
     * Obtiene el valor de la propiedad subGroupCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubGroupCode() {
        return subGroupCode;
    }

    /**
     * Define el valor de la propiedad subGroupCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubGroupCode(String value) {
        this.subGroupCode = value;
    }

}
