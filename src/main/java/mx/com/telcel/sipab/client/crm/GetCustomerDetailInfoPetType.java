
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetCustomerDetailInfoPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerDetailInfoPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="custId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type"/&gt;
 *           &lt;element name="serviceNumber" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica20Type"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="includeFlag" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}IncludeFlagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerDetailInfoPetType", propOrder = {
    "custId",
    "serviceNumber",
    "includeFlag"
})
public class GetCustomerDetailInfoPetType {

    protected BigDecimal custId;
    protected String serviceNumber;
    protected IncludeFlagType includeFlag;

    /**
     * Obtiene el valor de la propiedad custId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustId() {
        return custId;
    }

    /**
     * Define el valor de la propiedad custId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustId(BigDecimal value) {
        this.custId = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Define el valor de la propiedad serviceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad includeFlag.
     * 
     * @return
     *     possible object is
     *     {@link IncludeFlagType }
     *     
     */
    public IncludeFlagType getIncludeFlag() {
        return includeFlag;
    }

    /**
     * Define el valor de la propiedad includeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeFlagType }
     *     
     */
    public void setIncludeFlag(IncludeFlagType value) {
        this.includeFlag = value;
    }

}
