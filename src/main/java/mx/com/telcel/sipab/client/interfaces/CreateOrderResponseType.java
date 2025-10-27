
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreateOrderResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreateOrderResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseHeader" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ResponseHeaderType"/&gt;
 *         &lt;element name="responseOrder" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ResponseOrderresType" minOccurs="0"/&gt;
 *         &lt;element name="validateResults" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ValidateResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderResponseType", propOrder = {
    "responseHeader",
    "responseOrder",
    "validateResults"
})
public class CreateOrderResponseType {

    @XmlElement(required = true)
    protected ResponseHeaderType responseHeader;
    protected ResponseOrderresType responseOrder;
    protected List<ValidateResultType> validateResults;

    /**
     * Obtiene el valor de la propiedad responseHeader.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeaderType }
     *     
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Define el valor de la propiedad responseHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeaderType }
     *     
     */
    public void setResponseHeader(ResponseHeaderType value) {
        this.responseHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad responseOrder.
     * 
     * @return
     *     possible object is
     *     {@link ResponseOrderresType }
     *     
     */
    public ResponseOrderresType getResponseOrder() {
        return responseOrder;
    }

    /**
     * Define el valor de la propiedad responseOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseOrderresType }
     *     
     */
    public void setResponseOrder(ResponseOrderresType value) {
        this.responseOrder = value;
    }

    /**
     * Gets the value of the validateResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the validateResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidateResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidateResultType }
     * 
     * 
     */
    public List<ValidateResultType> getValidateResults() {
        if (validateResults == null) {
            validateResults = new ArrayList<ValidateResultType>();
        }
        return this.validateResults;
    }

}
