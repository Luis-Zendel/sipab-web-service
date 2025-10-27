
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IndividualPropertyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IndividualPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="besCrmSimpleProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPropertyType", propOrder = {
    "besCrmSimpleProperty"
})
public class IndividualPropertyType {

    protected BesCrmSimplePropertyType besCrmSimpleProperty;

    /**
     * Obtiene el valor de la propiedad besCrmSimpleProperty.
     * 
     * @return
     *     possible object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public BesCrmSimplePropertyType getBesCrmSimpleProperty() {
        return besCrmSimpleProperty;
    }

    /**
     * Define el valor de la propiedad besCrmSimpleProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public void setBesCrmSimpleProperty(BesCrmSimplePropertyType value) {
        this.besCrmSimpleProperty = value;
    }

}
