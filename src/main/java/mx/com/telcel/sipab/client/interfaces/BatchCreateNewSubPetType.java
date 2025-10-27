
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BatchCreateNewSubPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BatchCreateNewSubPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OrderInfoReqType" minOccurs="0"/&gt;
 *         &lt;element name="selectNumberMode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type"/&gt;
 *         &lt;element name="cityReginId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="offeringInsts" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}OfferingRespType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="smsReceives" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *         &lt;element name="emailReceives" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica128Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchCreateNewSubPetType", propOrder = {
    "orderInfo",
    "selectNumberMode",
    "cityReginId",
    "fileName",
    "offeringInsts",
    "smsReceives",
    "emailReceives"
})
public class BatchCreateNewSubPetType {

    protected OrderInfoReqType orderInfo;
    @XmlElement(required = true)
    protected String selectNumberMode;
    protected String cityReginId;
    @XmlElement(required = true)
    protected String fileName;
    @XmlElement(required = true)
    protected List<OfferingRespType> offeringInsts;
    protected String smsReceives;
    protected String emailReceives;

    /**
     * Obtiene el valor de la propiedad orderInfo.
     * 
     * @return
     *     possible object is
     *     {@link OrderInfoReqType }
     *     
     */
    public OrderInfoReqType getOrderInfo() {
        return orderInfo;
    }

    /**
     * Define el valor de la propiedad orderInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfoReqType }
     *     
     */
    public void setOrderInfo(OrderInfoReqType value) {
        this.orderInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad selectNumberMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectNumberMode() {
        return selectNumberMode;
    }

    /**
     * Define el valor de la propiedad selectNumberMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectNumberMode(String value) {
        this.selectNumberMode = value;
    }

    /**
     * Obtiene el valor de la propiedad cityReginId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityReginId() {
        return cityReginId;
    }

    /**
     * Define el valor de la propiedad cityReginId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityReginId(String value) {
        this.cityReginId = value;
    }

    /**
     * Obtiene el valor de la propiedad fileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Define el valor de la propiedad fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the offeringInsts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the offeringInsts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferingInsts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferingRespType }
     * 
     * 
     */
    public List<OfferingRespType> getOfferingInsts() {
        if (offeringInsts == null) {
            offeringInsts = new ArrayList<OfferingRespType>();
        }
        return this.offeringInsts;
    }

    /**
     * Obtiene el valor de la propiedad smsReceives.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsReceives() {
        return smsReceives;
    }

    /**
     * Define el valor de la propiedad smsReceives.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsReceives(String value) {
        this.smsReceives = value;
    }

    /**
     * Obtiene el valor de la propiedad emailReceives.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailReceives() {
        return emailReceives;
    }

    /**
     * Define el valor de la propiedad emailReceives.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailReceives(String value) {
        this.emailReceives = value;
    }

}
