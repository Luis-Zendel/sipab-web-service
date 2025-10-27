
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreateCommentsPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateCommentsPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="serviceNumber" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *           &lt;element name="acctCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="commentDetail" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica4000Type"/&gt;
 *         &lt;element name="commentOriginator" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCommentsPetType", propOrder = {
    "serviceNumber",
    "acctCode",
    "commentDetail",
    "commentOriginator"
})
public class CreateCommentsPetType {

    protected String serviceNumber;
    protected String acctCode;
    @XmlElement(required = true)
    protected String commentDetail;
    @XmlElement(required = true)
    protected String commentOriginator;

    /**
     * Obtiene el valor de la propiedad serviceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Define el valor de la propiedad serviceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad acctCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCode() {
        return acctCode;
    }

    /**
     * Define el valor de la propiedad acctCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCode(String value) {
        this.acctCode = value;
    }

    /**
     * Obtiene el valor de la propiedad commentDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentDetail() {
        return commentDetail;
    }

    /**
     * Define el valor de la propiedad commentDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentDetail(String value) {
        this.commentDetail = value;
    }

    /**
     * Obtiene el valor de la propiedad commentOriginator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentOriginator() {
        return commentOriginator;
    }

    /**
     * Define el valor de la propiedad commentOriginator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentOriginator(String value) {
        this.commentOriginator = value;
    }

}
