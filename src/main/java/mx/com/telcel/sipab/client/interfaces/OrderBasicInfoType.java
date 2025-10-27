
package mx.com.telcel.sipab.client.interfaces;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderBasicInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderBasicInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wishExecDate" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="salesCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="remark" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="reqApplyType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBasicInfoType", propOrder = {
    "wishExecDate",
    "salesCode",
    "remark",
    "reqApplyType"
})
public class OrderBasicInfoType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar wishExecDate;
    protected String salesCode;
    protected String remark;
    protected String reqApplyType;

    /**
     * Obtiene el valor de la propiedad wishExecDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWishExecDate() {
        return wishExecDate;
    }

    /**
     * Define el valor de la propiedad wishExecDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWishExecDate(XMLGregorianCalendar value) {
        this.wishExecDate = value;
    }

    /**
     * Obtiene el valor de la propiedad salesCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesCode() {
        return salesCode;
    }

    /**
     * Define el valor de la propiedad salesCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesCode(String value) {
        this.salesCode = value;
    }

    /**
     * Obtiene el valor de la propiedad remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Define el valor de la propiedad remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Obtiene el valor de la propiedad reqApplyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqApplyType() {
        return reqApplyType;
    }

    /**
     * Define el valor de la propiedad reqApplyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqApplyType(String value) {
        this.reqApplyType = value;
    }

}
