
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcctAccessCodePayType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcctAccessCodePayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}AcctAccessCodeType"/&gt;
 *         &lt;element name="payType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctAccessCodePayType", propOrder = {
    "acctAccessCode",
    "payType"
})
public class AcctAccessCodePayType {

    @XmlElement(required = true)
    protected AcctAccessCodeType acctAccessCode;
    protected String payType;

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

    /**
     * Obtiene el valor de la propiedad payType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayType() {
        return payType;
    }

    /**
     * Define el valor de la propiedad payType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayType(String value) {
        this.payType = value;
    }

}
