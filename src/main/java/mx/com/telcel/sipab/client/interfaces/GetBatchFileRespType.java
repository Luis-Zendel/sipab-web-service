
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetBatchFileRespType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetBatchFileRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="batchFileInfo" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BatchFileInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="srcFileName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal1Type" minOccurs="0"/&gt;
 *         &lt;element name="taskId" type="{http://amx.com/mexico/telcel/esb/v1_2}CadenaAlfanumerica24Type" minOccurs="0"/&gt;
 *         &lt;element name="token" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="cookie" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="beId" type="{http://amx.com/mexico/telcel/esb/v1_2}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="additionalProperty" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}BesCrmSimplePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBatchFileRespType", propOrder = {
    "batchFileInfo",
    "srcFileName",
    "status",
    "taskId",
    "token",
    "cookie",
    "beId",
    "additionalProperty"
})
public class GetBatchFileRespType {

    protected List<BatchFileInfoType> batchFileInfo;
    protected String srcFileName;
    protected BigDecimal status;
    protected String taskId;
    protected String token;
    protected String cookie;
    protected BigDecimal beId;
    protected List<BesCrmSimplePropertyType> additionalProperty;

    /**
     * Gets the value of the batchFileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the batchFileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchFileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchFileInfoType }
     * 
     * 
     */
    public List<BatchFileInfoType> getBatchFileInfo() {
        if (batchFileInfo == null) {
            batchFileInfo = new ArrayList<BatchFileInfoType>();
        }
        return this.batchFileInfo;
    }

    /**
     * Obtiene el valor de la propiedad srcFileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcFileName() {
        return srcFileName;
    }

    /**
     * Define el valor de la propiedad srcFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcFileName(String value) {
        this.srcFileName = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStatus(BigDecimal value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad taskId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Define el valor de la propiedad taskId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad cookie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * Define el valor de la propiedad cookie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCookie(String value) {
        this.cookie = value;
    }

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
     * Gets the value of the additionalProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BesCrmSimplePropertyType }
     * 
     * 
     */
    public List<BesCrmSimplePropertyType> getAdditionalProperty() {
        if (additionalProperty == null) {
            additionalProperty = new ArrayList<BesCrmSimplePropertyType>();
        }
        return this.additionalProperty;
    }

}
