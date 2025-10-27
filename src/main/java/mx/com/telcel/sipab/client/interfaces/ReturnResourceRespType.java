
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReturnResourceRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReturnResourceRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CreateOrderResponseType"/&gt;
 *         &lt;element name="originalOffering" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingSimpleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="returnAmount" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnResourceRespType", propOrder = {
    "response",
    "originalOffering",
    "returnAmount"
})
public class ReturnResourceRespType {

    @XmlElement(required = true)
    protected CreateOrderResponseType response;
    protected List<OfferingSimpleType> originalOffering;
    protected BigDecimal returnAmount;

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link CreateOrderResponseType }
     *     
     */
    public CreateOrderResponseType getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOrderResponseType }
     *     
     */
    public void setResponse(CreateOrderResponseType value) {
        this.response = value;
    }

    /**
     * Gets the value of the originalOffering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the originalOffering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferingSimpleType }
     * 
     * 
     */
    public List<OfferingSimpleType> getOriginalOffering() {
        if (originalOffering == null) {
            originalOffering = new ArrayList<OfferingSimpleType>();
        }
        return this.originalOffering;
    }

    /**
     * Obtiene el valor de la propiedad returnAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    /**
     * Define el valor de la propiedad returnAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnAmount(BigDecimal value) {
        this.returnAmount = value;
    }

}
