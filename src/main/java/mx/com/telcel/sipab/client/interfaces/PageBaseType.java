
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PageBaseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PageBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pageSize" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Integer100Type"/&gt;
 *         &lt;element name="startNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Integer10Type"/&gt;
 *         &lt;element name="totalNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Entero10dType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageBaseType", propOrder = {
    "pageSize",
    "startNum",
    "totalNum"
})
public class PageBaseType {

    @XmlSchemaType(name = "integer")
    protected int pageSize;
    @XmlElement(required = true)
    protected BigInteger startNum;
    protected Integer totalNum;

    /**
     * Obtiene el valor de la propiedad pageSize.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Define el valor de la propiedad pageSize.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Obtiene el valor de la propiedad startNum.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartNum() {
        return startNum;
    }

    /**
     * Define el valor de la propiedad startNum.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartNum(BigInteger value) {
        this.startNum = value;
    }

    /**
     * Obtiene el valor de la propiedad totalNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    /**
     * Define el valor de la propiedad totalNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNum(Integer value) {
        this.totalNum = value;
    }

}
