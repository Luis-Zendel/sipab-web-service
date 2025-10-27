
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContractRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContractRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *         &lt;element name="contractBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ContractBasicInfoType"/&gt;
 *         &lt;element name="contractExtInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRespType", propOrder = {
    "operType",
    "contractBasicInfo",
    "contractExtInfo"
})
public class ContractRespType {

    protected String operType;
    @XmlElement(required = true)
    protected ContractBasicInfoType contractBasicInfo;
    protected BesCrmSimplePropertyType contractExtInfo;

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
     * Obtiene el valor de la propiedad contractBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link ContractBasicInfoType }
     *     
     */
    public ContractBasicInfoType getContractBasicInfo() {
        return contractBasicInfo;
    }

    /**
     * Define el valor de la propiedad contractBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractBasicInfoType }
     *     
     */
    public void setContractBasicInfo(ContractBasicInfoType value) {
        this.contractBasicInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad contractExtInfo.
     * 
     * @return
     *     possible object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public BesCrmSimplePropertyType getContractExtInfo() {
        return contractExtInfo;
    }

    /**
     * Define el valor de la propiedad contractExtInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCrmSimplePropertyType }
     *     
     */
    public void setContractExtInfo(BesCrmSimplePropertyType value) {
        this.contractExtInfo = value;
    }

}
