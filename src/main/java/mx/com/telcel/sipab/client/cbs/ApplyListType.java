
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ApplyListType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ApplyListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invoiceno" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="invoiceID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="invoiceDetailID" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="chargeCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyListType", propOrder = {
    "invoiceno",
    "invoiceID",
    "invoiceDetailID",
    "chargeCode"
})
public class ApplyListType {

    protected String invoiceno;
    protected Long invoiceID;
    protected Long invoiceDetailID;
    protected String chargeCode;

    /**
     * Obtiene el valor de la propiedad invoiceno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceno() {
        return invoiceno;
    }

    /**
     * Define el valor de la propiedad invoiceno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceno(String value) {
        this.invoiceno = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvoiceID() {
        return invoiceID;
    }

    /**
     * Define el valor de la propiedad invoiceID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvoiceID(Long value) {
        this.invoiceID = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceDetailID.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvoiceDetailID() {
        return invoiceDetailID;
    }

    /**
     * Define el valor de la propiedad invoiceDetailID.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvoiceDetailID(Long value) {
        this.invoiceDetailID = value;
    }

    /**
     * Obtiene el valor de la propiedad chargeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeCode() {
        return chargeCode;
    }

    /**
     * Define el valor de la propiedad chargeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeCode(String value) {
        this.chargeCode = value;
    }

}
