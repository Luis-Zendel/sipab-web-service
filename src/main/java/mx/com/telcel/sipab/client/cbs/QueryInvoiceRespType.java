
package mx.com.telcel.sipab.client.cbs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para QueryInvoiceRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QueryInvoiceRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageAnacrValue" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}FloatType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}InvoiceInfoQueryInvoiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="beginRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *         &lt;element name="fetchRowNum" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/esb/arservices}Long19Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInvoiceRespType", propOrder = {
    "averageAnacrValue",
    "invoiceInfo",
    "totalRowNum",
    "beginRowNum",
    "fetchRowNum"
})
public class QueryInvoiceRespType {

    protected Float averageAnacrValue;
    protected List<InvoiceInfoQueryInvoiceType> invoiceInfo;
    protected Long totalRowNum;
    protected Long beginRowNum;
    protected Long fetchRowNum;

    /**
     * Obtiene el valor de la propiedad averageAnacrValue.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageAnacrValue() {
        return averageAnacrValue;
    }

    /**
     * Define el valor de la propiedad averageAnacrValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageAnacrValue(Float value) {
        this.averageAnacrValue = value;
    }

    /**
     * Gets the value of the invoiceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceInfoQueryInvoiceType }
     * 
     * 
     */
    public List<InvoiceInfoQueryInvoiceType> getInvoiceInfo() {
        if (invoiceInfo == null) {
            invoiceInfo = new ArrayList<InvoiceInfoQueryInvoiceType>();
        }
        return this.invoiceInfo;
    }

    /**
     * Obtiene el valor de la propiedad totalRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRowNum() {
        return totalRowNum;
    }

    /**
     * Define el valor de la propiedad totalRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRowNum(Long value) {
        this.totalRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad beginRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBeginRowNum() {
        return beginRowNum;
    }

    /**
     * Define el valor de la propiedad beginRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBeginRowNum(Long value) {
        this.beginRowNum = value;
    }

    /**
     * Obtiene el valor de la propiedad fetchRowNum.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFetchRowNum() {
        return fetchRowNum;
    }

    /**
     * Define el valor de la propiedad fetchRowNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFetchRowNum(Long value) {
        this.fetchRowNum = value;
    }

}
