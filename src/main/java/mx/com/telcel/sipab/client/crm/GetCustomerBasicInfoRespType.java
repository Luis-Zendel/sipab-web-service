
package mx.com.telcel.sipab.client.crm;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetCustomerBasicInfoRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerBasicInfoRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="custId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="customerBasicInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}CustomerBasicType" minOccurs="0"/&gt;
 *         &lt;element name="individualInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/customermanagementservice}IndividualBaseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerBasicInfoRespType", propOrder = {
    "custId",
    "customerBasicInfo",
    "individualInfo"
})
public class GetCustomerBasicInfoRespType {

    protected BigDecimal custId;
    protected CustomerBasicType customerBasicInfo;
    protected IndividualBaseType individualInfo;

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
     * Obtiene el valor de la propiedad customerBasicInfo.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBasicType }
     *     
     */
    public CustomerBasicType getCustomerBasicInfo() {
        return customerBasicInfo;
    }

    /**
     * Define el valor de la propiedad customerBasicInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBasicType }
     *     
     */
    public void setCustomerBasicInfo(CustomerBasicType value) {
        this.customerBasicInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad individualInfo.
     * 
     * @return
     *     possible object is
     *     {@link IndividualBaseType }
     *     
     */
    public IndividualBaseType getIndividualInfo() {
        return individualInfo;
    }

    /**
     * Define el valor de la propiedad individualInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualBaseType }
     *     
     */
    public void setIndividualInfo(IndividualBaseType value) {
        this.individualInfo = value;
    }

}
