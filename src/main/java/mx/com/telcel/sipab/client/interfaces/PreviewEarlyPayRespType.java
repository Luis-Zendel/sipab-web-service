
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PreviewEarlyPayRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PreviewEarlyPayRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="installmentInstId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="installmentDetailInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}InstallmentDetailInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="residualAmount" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ResidualAmountType" minOccurs="0"/&gt;
 *         &lt;element name="residualAmountWithTax" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}ResidualAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviewEarlyPayRespType", propOrder = {
    "installmentInstId",
    "installmentDetailInfo",
    "residualAmount",
    "residualAmountWithTax"
})
public class PreviewEarlyPayRespType {

    protected BigDecimal installmentInstId;
    protected List<InstallmentDetailInfoType> installmentDetailInfo;
    protected BigDecimal residualAmount;
    protected BigDecimal residualAmountWithTax;

    /**
     * Obtiene el valor de la propiedad installmentInstId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstallmentInstId() {
        return installmentInstId;
    }

    /**
     * Define el valor de la propiedad installmentInstId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstallmentInstId(BigDecimal value) {
        this.installmentInstId = value;
    }

    /**
     * Gets the value of the installmentDetailInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the installmentDetailInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstallmentDetailInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstallmentDetailInfoType }
     * 
     * 
     */
    public List<InstallmentDetailInfoType> getInstallmentDetailInfo() {
        if (installmentDetailInfo == null) {
            installmentDetailInfo = new ArrayList<InstallmentDetailInfoType>();
        }
        return this.installmentDetailInfo;
    }

    /**
     * Obtiene el valor de la propiedad residualAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResidualAmount() {
        return residualAmount;
    }

    /**
     * Define el valor de la propiedad residualAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResidualAmount(BigDecimal value) {
        this.residualAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad residualAmountWithTax.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResidualAmountWithTax() {
        return residualAmountWithTax;
    }

    /**
     * Define el valor de la propiedad residualAmountWithTax.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResidualAmountWithTax(BigDecimal value) {
        this.residualAmountWithTax = value;
    }

}
