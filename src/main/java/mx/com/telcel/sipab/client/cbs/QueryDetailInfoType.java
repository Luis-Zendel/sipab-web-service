
package mx.com.telcel.sipab.client.cbs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryDetailInfoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryDetailInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="freeUnitInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FreeUnitInfoType"/&gt;
 *           &lt;element name="balanceInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}BalanceInfoType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDetailInfoType", propOrder = {
    "freeUnitInfo",
    "balanceInfo"
})
public class QueryDetailInfoType {

    protected FreeUnitInfoType freeUnitInfo;
    protected BalanceInfoType balanceInfo;

    /**
     * Obtiene el valor de la propiedad freeUnitInfo.
     * 
     * @return
     *     possible object is
     *     {@link FreeUnitInfoType }
     *     
     */
    public FreeUnitInfoType getFreeUnitInfo() {
        return freeUnitInfo;
    }

    /**
     * Define el valor de la propiedad freeUnitInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeUnitInfoType }
     *     
     */
    public void setFreeUnitInfo(FreeUnitInfoType value) {
        this.freeUnitInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceInfo.
     * 
     * @return
     *     possible object is
     *     {@link BalanceInfoType }
     *     
     */
    public BalanceInfoType getBalanceInfo() {
        return balanceInfo;
    }

    /**
     * Define el valor de la propiedad balanceInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceInfoType }
     *     
     */
    public void setBalanceInfo(BalanceInfoType value) {
        this.balanceInfo = value;
    }

}
