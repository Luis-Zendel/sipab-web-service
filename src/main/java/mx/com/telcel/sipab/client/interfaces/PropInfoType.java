
package mx.com.telcel.sipab.client.interfaces;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PropInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PropInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="propBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PropBasicInfoType"/&gt;
 *         &lt;element name="subProps" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}PropInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropInfoType", propOrder = {
    "operType",
    "propBasicInfo",
    "subProps"
})
public class PropInfoType {

    protected String operType;
    @XmlElement(required = true)
    protected PropBasicInfoType propBasicInfo;
    protected List<PropInfoType> subProps;

    /**
     * Obtiene el valor de la propiedad operType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperType() {
        return operType;
    }

    /**
     * Define el valor de la propiedad operType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperType(String value) {
        this.operType = value;
    }

    /**
     * Obtiene el valor de la propiedad propBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link PropBasicInfoType }
     *     
     */
    public PropBasicInfoType getPropBasicInfo() {
        return propBasicInfo;
    }

    /**
     * Define el valor de la propiedad propBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link PropBasicInfoType }
     *     
     */
    public void setPropBasicInfo(PropBasicInfoType value) {
        this.propBasicInfo = value;
    }

    /**
     * Gets the value of the subProps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subProps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubProps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropInfoType }
     * 
     * 
     */
    public List<PropInfoType> getSubProps() {
        if (subProps == null) {
            subProps = new ArrayList<PropInfoType>();
        }
        return this.subProps;
    }

}
