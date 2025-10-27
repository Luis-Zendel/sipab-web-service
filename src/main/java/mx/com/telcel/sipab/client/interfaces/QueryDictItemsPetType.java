
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryDictItemsPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryDictItemsPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataDictCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica100Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDictItemsPetType", propOrder = {
    "dataDictCode"
})
public class QueryDictItemsPetType {

    @XmlElement(required = true)
    protected String dataDictCode;

    /**
     * Obtiene el valor de la propiedad dataDictCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDictCode() {
        return dataDictCode;
    }

    /**
     * Define el valor de la propiedad dataDictCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDictCode(String value) {
        this.dataDictCode = value;
    }

}
