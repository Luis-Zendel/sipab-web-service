
package mx.com.telcel.sipab.client.interfaces;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AttachmentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attachmentId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}Decimal20Type" minOccurs="0"/&gt;
 *         &lt;element name="attachmentFieldId" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type"/&gt;
 *         &lt;element name="attachmentTypeCode" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica16Type" minOccurs="0"/&gt;
 *         &lt;element name="fileDirectory" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica256Type" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica128Type"/&gt;
 *         &lt;element name="remark" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1024Type" minOccurs="0"/&gt;
 *         &lt;element name="operType" type="{http://www.amx.com.mx/mexico/telcel/di/sds/bes/crm/esb/telcelinterfaceservices}CadenaAlfanumerica1Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", propOrder = {
    "attachmentId",
    "attachmentFieldId",
    "attachmentTypeCode",
    "fileDirectory",
    "fileName",
    "remark",
    "operType"
})
public class AttachmentType {

    protected BigDecimal attachmentId;
    @XmlElement(required = true)
    protected String attachmentFieldId;
    protected String attachmentTypeCode;
    protected String fileDirectory;
    @XmlElement(required = true)
    protected String fileName;
    protected String remark;
    protected String operType;

    /**
     * Obtiene el valor de la propiedad attachmentId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAttachmentId() {
        return attachmentId;
    }

    /**
     * Define el valor de la propiedad attachmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAttachmentId(BigDecimal value) {
        this.attachmentId = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentFieldId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentFieldId() {
        return attachmentFieldId;
    }

    /**
     * Define el valor de la propiedad attachmentFieldId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentFieldId(String value) {
        this.attachmentFieldId = value;
    }

    /**
     * Obtiene el valor de la propiedad attachmentTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentTypeCode() {
        return attachmentTypeCode;
    }

    /**
     * Define el valor de la propiedad attachmentTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentTypeCode(String value) {
        this.attachmentTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad fileDirectory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDirectory() {
        return fileDirectory;
    }

    /**
     * Define el valor de la propiedad fileDirectory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDirectory(String value) {
        this.fileDirectory = value;
    }

    /**
     * Obtiene el valor de la propiedad fileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Define el valor de la propiedad fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Obtiene el valor de la propiedad remark.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Define el valor de la propiedad remark.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

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

}
