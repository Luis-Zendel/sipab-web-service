
package mx.com.telcel.sipab.client.interfaces;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PreferenceFlagType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PreferenceFlagType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="0"/&gt;
 *     &lt;maxLength value="1"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PreferenceFlagType")
@XmlEnum
public enum PreferenceFlagType {

    Y,
    N;

    public String value() {
        return name();
    }

    public static PreferenceFlagType fromValue(String v) {
        return valueOf(v);
    }

}
