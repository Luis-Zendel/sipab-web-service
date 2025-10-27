
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServiceChannelType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ServiceChannelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="256"/&gt;
 *     &lt;enumeration value="ExpandChaType1"/&gt;
 *     &lt;enumeration value="ExpandChaType2"/&gt;
 *     &lt;enumeration value="ExpandChaType3"/&gt;
 *     &lt;enumeration value="ExpandChaType4"/&gt;
 *     &lt;enumeration value="ExpandChaType5"/&gt;
 *     &lt;enumeration value="ExpandChaType6"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceChannelType")
@XmlEnum
public enum ServiceChannelType {

    @XmlEnumValue("ExpandChaType1")
    EXPAND_CHA_TYPE_1("ExpandChaType1"),
    @XmlEnumValue("ExpandChaType2")
    EXPAND_CHA_TYPE_2("ExpandChaType2"),
    @XmlEnumValue("ExpandChaType3")
    EXPAND_CHA_TYPE_3("ExpandChaType3"),
    @XmlEnumValue("ExpandChaType4")
    EXPAND_CHA_TYPE_4("ExpandChaType4"),
    @XmlEnumValue("ExpandChaType5")
    EXPAND_CHA_TYPE_5("ExpandChaType5"),
    @XmlEnumValue("ExpandChaType6")
    EXPAND_CHA_TYPE_6("ExpandChaType6");
    private final String value;

    ServiceChannelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceChannelType fromValue(String v) {
        for (ServiceChannelType c: ServiceChannelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
