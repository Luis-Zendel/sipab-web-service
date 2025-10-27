
package mx.com.telcel.sipab.client.tt;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccessCodeResType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccessCodeResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessCodeType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}CadenaAlfanumerica1Type"/&gt;
 *         &lt;element name="accessOwnerId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice}Decimal20c0Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessCodeResType", propOrder = {
    "accessCodeType",
    "accessOwnerId"
})
public class AccessCodeResType {

    @XmlElement(required = true)
    protected String accessCodeType;
    @XmlElement(required = true)
    protected BigDecimal accessOwnerId;

    /**
     * Obtiene el valor de la propiedad accessCodeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessCodeType() {
        return accessCodeType;
    }

    /**
     * Define el valor de la propiedad accessCodeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessCodeType(String value) {
        this.accessCodeType = value;
    }

    /**
     * Obtiene el valor de la propiedad accessOwnerId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccessOwnerId() {
        return accessOwnerId;
    }

    /**
     * Define el valor de la propiedad accessOwnerId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccessOwnerId(BigDecimal value) {
        this.accessOwnerId = value;
    }

}
