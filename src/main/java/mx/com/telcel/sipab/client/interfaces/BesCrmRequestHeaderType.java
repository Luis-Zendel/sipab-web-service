
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BesCrmRequestHeaderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BesCrmRequestHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type"/&gt;
 *         &lt;element name="regionId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type"/&gt;
 *         &lt;element name="operatorInfo" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCrmOperatorInfoType" minOccurs="0"/&gt;
 *         &lt;element name="channelType" type="{http://amx.com/mexico/telcel/esb/v1_2}BesCrmChannelType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BesCrmRequestHeaderType", namespace = "http://amx.com/mexico/telcel/esb/v1_2", propOrder = {
    "beId",
    "regionId",
    "operatorInfo",
    "channelType"
})
public class BesCrmRequestHeaderType {

    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected BigDecimal beId;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected BigDecimal regionId;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2")
    protected BesCrmOperatorInfoType operatorInfo;
    @XmlElement(namespace = "http://amx.com/mexico/telcel/esb/v1_2", required = true)
    protected String channelType;

    /**
     * Obtiene el valor de la propiedad beId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeId() {
        return beId;
    }

    /**
     * Define el valor de la propiedad beId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeId(BigDecimal value) {
        this.beId = value;
    }

    /**
     * Obtiene el valor de la propiedad regionId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegionId() {
        return regionId;
    }

    /**
     * Define el valor de la propiedad regionId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegionId(BigDecimal value) {
        this.regionId = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorInfo.
     * 
     * @return
     *     possible object is
     *     {@link BesCrmOperatorInfoType }
     *     
     */
    public BesCrmOperatorInfoType getOperatorInfo() {
        return operatorInfo;
    }

    /**
     * Define el valor de la propiedad operatorInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link BesCrmOperatorInfoType }
     *     
     */
    public void setOperatorInfo(BesCrmOperatorInfoType value) {
        this.operatorInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad channelType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Define el valor de la propiedad channelType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
    }

}
