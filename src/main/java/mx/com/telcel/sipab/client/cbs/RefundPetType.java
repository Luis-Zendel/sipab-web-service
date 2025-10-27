
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RefundPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RefundPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refundSerialNo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}CadenaAlfanumerica64Type" minOccurs="0"/&gt;
 *         &lt;element name="refundObj" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RefundObjType"/&gt;
 *         &lt;element name="refundInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RefundInfoType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="refundChannel" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}RefundChannelType" minOccurs="0"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}SimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundPetType", propOrder = {
    "refundSerialNo",
    "refundObj",
    "refundInfo",
    "refundChannel",
    "additionalProperty"
})
public class RefundPetType {

    protected String refundSerialNo;
    @XmlElement(required = true)
    protected RefundObjType refundObj;
    @XmlElement(required = true)
    protected List<RefundInfoType> refundInfo;
    protected RefundChannelType refundChannel;
    protected List<SimplePropertyType> additionalProperty;

    /**
     * Obtiene el valor de la propiedad refundSerialNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundSerialNo() {
        return refundSerialNo;
    }

    /**
     * Define el valor de la propiedad refundSerialNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundSerialNo(String value) {
        this.refundSerialNo = value;
    }

    /**
     * Obtiene el valor de la propiedad refundObj.
     * 
     * @return
     *     possible object is
     *     {@link RefundObjType }
     *     
     */
    public RefundObjType getRefundObj() {
        return refundObj;
    }

    /**
     * Define el valor de la propiedad refundObj.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundObjType }
     *     
     */
    public void setRefundObj(RefundObjType value) {
        this.refundObj = value;
    }

    /**
     * Gets the value of the refundInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the refundInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefundInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefundInfoType }
     * 
     * 
     */
    public List<RefundInfoType> getRefundInfo() {
        if (refundInfo == null) {
            refundInfo = new ArrayList<RefundInfoType>();
        }
        return this.refundInfo;
    }

    /**
     * Obtiene el valor de la propiedad refundChannel.
     * 
     * @return
     *     possible object is
     *     {@link RefundChannelType }
     *     
     */
    public RefundChannelType getRefundChannel() {
        return refundChannel;
    }

    /**
     * Define el valor de la propiedad refundChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundChannelType }
     *     
     */
    public void setRefundChannel(RefundChannelType value) {
        this.refundChannel = value;
    }

    /**
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePropertyType }
     * 
     * 
     */
    public List<SimplePropertyType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<SimplePropertyType>();
        }
        return this.additionalProperty;
    }

}
