
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QuerySubsServiceContractRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QuerySubsServiceContractRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceContractInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ServiceContractInfoType" minOccurs="0"/&gt;
 *         &lt;element name="termType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica32Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySubsServiceContractRespType", propOrder = {
    "serviceContractInfo",
    "termType"
})
public class QuerySubsServiceContractRespType {

    protected ServiceContractInfoType serviceContractInfo;
    protected String termType;

    /**
     * Obtiene el valor de la propiedad serviceContractInfo.
     * 
     * @return
     *     possible object is
     *     {@link ServiceContractInfoType }
     *     
     */
    public ServiceContractInfoType getServiceContractInfo() {
        return serviceContractInfo;
    }

    /**
     * Define el valor de la propiedad serviceContractInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceContractInfoType }
     *     
     */
    public void setServiceContractInfo(ServiceContractInfoType value) {
        this.serviceContractInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad termType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermType() {
        return termType;
    }

    /**
     * Define el valor de la propiedad termType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermType(String value) {
        this.termType = value;
    }

}
