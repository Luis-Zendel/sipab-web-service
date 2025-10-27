
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RelaOfferType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RelaOfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relaOfferId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type"/&gt;
 *         &lt;element name="relaOfferInstId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20c0Type" minOccurs="0"/&gt;
 *         &lt;element name="relaOfferPurchaseSeq" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="extProp" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelaOfferType", propOrder = {
    "relaOfferId",
    "relaOfferInstId",
    "relaOfferPurchaseSeq",
    "extProp"
})
public class RelaOfferType {

    @XmlElement(required = true)
    protected BigDecimal relaOfferId;
    protected BigDecimal relaOfferInstId;
    protected String relaOfferPurchaseSeq;
    protected List<BesCrmSimplePropertyType> extProp;

    /**
     * Obtiene el valor de la propiedad relaOfferId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelaOfferId() {
        return relaOfferId;
    }

    /**
     * Define el valor de la propiedad relaOfferId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelaOfferId(BigDecimal value) {
        this.relaOfferId = value;
    }

    /**
     * Obtiene el valor de la propiedad relaOfferInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelaOfferInstId() {
        return relaOfferInstId;
    }

    /**
     * Define el valor de la propiedad relaOfferInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelaOfferInstId(BigDecimal value) {
        this.relaOfferInstId = value;
    }

    /**
     * Obtiene el valor de la propiedad relaOfferPurchaseSeq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaOfferPurchaseSeq() {
        return relaOfferPurchaseSeq;
    }

    /**
     * Define el valor de la propiedad relaOfferPurchaseSeq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaOfferPurchaseSeq(String value) {
        this.relaOfferPurchaseSeq = value;
    }

    /**
     * Gets the value of the extProp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extProp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtProp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BesCrmSimplePropertyType }
     * 
     * 
     */
    public List<BesCrmSimplePropertyType> getExtProp() {
        if (extProp == null) {
            extProp = new ArrayList<BesCrmSimplePropertyType>();
        }
        return this.extProp;
    }

}
