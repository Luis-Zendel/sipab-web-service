
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SupplementIndividualCustPetType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SupplementIndividualCustPetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subsAccessCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SubsAccessCodeType"/&gt;
 *         &lt;element name="custId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="individualCustDetailInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}IndividualCustDetailInfoBesType" minOccurs="0"/&gt;
 *         &lt;element name="subsChgInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}SubsChgInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementIndividualCustPetType", propOrder = {
    "subsAccessCode",
    "custId",
    "individualCustDetailInfo",
    "subsChgInfo"
})
public class SupplementIndividualCustPetType {

    @XmlElement(required = true)
    protected SubsAccessCodeType subsAccessCode;
    protected BigDecimal custId;
    protected IndividualCustDetailInfoBesType individualCustDetailInfo;
    protected SubsChgInfoType subsChgInfo;

    /**
     * Obtiene el valor de la propiedad subsAccessCode.
     * 
     * @return
     *     possible object is
     *     {@link SubsAccessCodeType }
     *     
     */
    public SubsAccessCodeType getSubsAccessCode() {
        return subsAccessCode;
    }

    /**
     * Define el valor de la propiedad subsAccessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsAccessCodeType }
     *     
     */
    public void setSubsAccessCode(SubsAccessCodeType value) {
        this.subsAccessCode = value;
    }

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
     * Obtiene el valor de la propiedad individualCustDetailInfo.
     * 
     * @return
     *     possible object is
     *     {@link IndividualCustDetailInfoBesType }
     *     
     */
    public IndividualCustDetailInfoBesType getIndividualCustDetailInfo() {
        return individualCustDetailInfo;
    }

    /**
     * Define el valor de la propiedad individualCustDetailInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualCustDetailInfoBesType }
     *     
     */
    public void setIndividualCustDetailInfo(IndividualCustDetailInfoBesType value) {
        this.individualCustDetailInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad subsChgInfo.
     * 
     * @return
     *     possible object is
     *     {@link SubsChgInfoType }
     *     
     */
    public SubsChgInfoType getSubsChgInfo() {
        return subsChgInfo;
    }

    /**
     * Define el valor de la propiedad subsChgInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsChgInfoType }
     *     
     */
    public void setSubsChgInfo(SubsChgInfoType value) {
        this.subsChgInfo = value;
    }

}
