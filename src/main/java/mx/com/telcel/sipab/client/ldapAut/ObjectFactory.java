
package mx.com.telcel.sipab.client.ldapAut;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.telcel.sipab.client.ldapAut package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AutenticarUsuarioApp_QNAME = new QName("http://test.dswi.gsa.telcel.com/", "autenticarUsuarioApp");
    private final static QName _AutenticarUsuarioAppAES_QNAME = new QName("http://test.dswi.gsa.telcel.com/", "autenticarUsuarioAppAES");
    private final static QName _AutenticarUsuarioAppAESResponse_QNAME = new QName("http://test.dswi.gsa.telcel.com/", "autenticarUsuarioAppAESResponse");
    private final static QName _AutenticarUsuarioAppResponse_QNAME = new QName("http://test.dswi.gsa.telcel.com/", "autenticarUsuarioAppResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.telcel.sipab.client.ldapAut
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AutenticarUsuarioApp }
     * 
     */
    public AutenticarUsuarioApp createAutenticarUsuarioApp() {
        return new AutenticarUsuarioApp();
    }

    /**
     * Create an instance of {@link AutenticarUsuarioAppAES }
     * 
     */
    public AutenticarUsuarioAppAES createAutenticarUsuarioAppAES() {
        return new AutenticarUsuarioAppAES();
    }

    /**
     * Create an instance of {@link AutenticarUsuarioAppAESResponse }
     * 
     */
    public AutenticarUsuarioAppAESResponse createAutenticarUsuarioAppAESResponse() {
        return new AutenticarUsuarioAppAESResponse();
    }

    /**
     * Create an instance of {@link AutenticarUsuarioAppResponse }
     * 
     */
    public AutenticarUsuarioAppResponse createAutenticarUsuarioAppResponse() {
        return new AutenticarUsuarioAppResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarUsuarioApp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutenticarUsuarioApp }{@code >}
     */
    @XmlElementDecl(namespace = "http://test.dswi.gsa.telcel.com/", name = "autenticarUsuarioApp")
    public JAXBElement<AutenticarUsuarioApp> createAutenticarUsuarioApp(AutenticarUsuarioApp value) {
        return new JAXBElement<AutenticarUsuarioApp>(_AutenticarUsuarioApp_QNAME, AutenticarUsuarioApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarUsuarioAppAES }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutenticarUsuarioAppAES }{@code >}
     */
    @XmlElementDecl(namespace = "http://test.dswi.gsa.telcel.com/", name = "autenticarUsuarioAppAES")
    public JAXBElement<AutenticarUsuarioAppAES> createAutenticarUsuarioAppAES(AutenticarUsuarioAppAES value) {
        return new JAXBElement<AutenticarUsuarioAppAES>(_AutenticarUsuarioAppAES_QNAME, AutenticarUsuarioAppAES.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarUsuarioAppAESResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutenticarUsuarioAppAESResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://test.dswi.gsa.telcel.com/", name = "autenticarUsuarioAppAESResponse")
    public JAXBElement<AutenticarUsuarioAppAESResponse> createAutenticarUsuarioAppAESResponse(AutenticarUsuarioAppAESResponse value) {
        return new JAXBElement<AutenticarUsuarioAppAESResponse>(_AutenticarUsuarioAppAESResponse_QNAME, AutenticarUsuarioAppAESResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarUsuarioAppResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutenticarUsuarioAppResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://test.dswi.gsa.telcel.com/", name = "autenticarUsuarioAppResponse")
    public JAXBElement<AutenticarUsuarioAppResponse> createAutenticarUsuarioAppResponse(AutenticarUsuarioAppResponse value) {
        return new JAXBElement<AutenticarUsuarioAppResponse>(_AutenticarUsuarioAppResponse_QNAME, AutenticarUsuarioAppResponse.class, null, value);
    }

}
