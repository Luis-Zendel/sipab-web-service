
package mx.com.telcel.sipab.client.crm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountBillMediumType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountBillMediumType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mediumName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="mediumType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAlfanumerica5Type"/&gt;
 *         &lt;element name="summaryFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CadenaAbiertaType"/&gt;
 *         &lt;element name="offer" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}MediaOfferType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBillMediumType", propOrder = {
    "mediumName",
    "mediumType",
    "summaryFlag",
    "offer"
})
public class AccountBillMediumType {

    @XmlElement(required = true)
    protected String mediumName;
    @XmlElement(required = true)
    protected String mediumType;
    @XmlElement(required = true)
    protected String summaryFlag;
    @XmlElement(required = true)
    protected MediaOfferType offer;

    /**
     * Obtiene el valor de la propiedad mediumName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumName() {
        return mediumName;
    }

    /**
     * Define el valor de la propiedad mediumName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumName(String value) {
        this.mediumName = value;
    }

    /**
     * Obtiene el valor de la propiedad mediumType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumType() {
        return mediumType;
    }

    /**
     * Define el valor de la propiedad mediumType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumType(String value) {
        this.mediumType = value;
    }

    /**
     * Obtiene el valor de la propiedad summaryFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryFlag() {
        return summaryFlag;
    }

    /**
     * Define el valor de la propiedad summaryFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryFlag(String value) {
        this.summaryFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad offer.
     * 
     * @return
     *     possible object is
     *     {@link MediaOfferType }
     *     
     */
    public MediaOfferType getOffer() {
        return offer;
    }

    /**
     * Define el valor de la propiedad offer.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaOfferType }
     *     
     */
    public void setOffer(MediaOfferType value) {
        this.offer = value;
    }

}
