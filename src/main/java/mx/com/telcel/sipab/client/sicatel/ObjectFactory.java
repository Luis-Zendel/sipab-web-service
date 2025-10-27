
package mx.com.telcel.sipab.client.sicatel;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.telcel.sipab.client.sicatel package. 
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

    private final static QName _RegistrarPagosPorAplicarExt_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", "registrarPagosPorAplicarExt");
    private final static QName _RegistrarPagosPorAplicarExtResponse_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", "registrarPagosPorAplicarExtResponse");
    private final static QName _RegistrarPagosPorAplicarExtException_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", "registrarPagosPorAplicarExtException");
    private final static QName _ConsultarPagosExt_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", "consultarPagosExt");
    private final static QName _ConsultarPagosExtResponse_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", "consultarPagosExtResponse");
    private final static QName _ConsultarPagosExtException_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", "consultarPagosExtException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.telcel.sipab.client.sicatel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarPagosPorAplicarExt }
     * 
     */
    public RegistrarPagosPorAplicarExt createRegistrarPagosPorAplicarExt() {
        return new RegistrarPagosPorAplicarExt();
    }

    /**
     * Create an instance of {@link RegistrarPagosPorAplicarExtResponse }
     * 
     */
    public RegistrarPagosPorAplicarExtResponse createRegistrarPagosPorAplicarExtResponse() {
        return new RegistrarPagosPorAplicarExtResponse();
    }

    /**
     * Create an instance of {@link OperacionesPagosServiceException }
     * 
     */
    public OperacionesPagosServiceException createOperacionesPagosServiceException() {
        return new OperacionesPagosServiceException();
    }

    /**
     * Create an instance of {@link ConsultarPagosExt }
     * 
     */
    public ConsultarPagosExt createConsultarPagosExt() {
        return new ConsultarPagosExt();
    }

    /**
     * Create an instance of {@link ConsultarPagosExtResponse }
     * 
     */
    public ConsultarPagosExtResponse createConsultarPagosExtResponse() {
        return new ConsultarPagosExtResponse();
    }

    /**
     * Create an instance of {@link SistemaExternoType }
     * 
     */
    public SistemaExternoType createSistemaExternoType() {
        return new SistemaExternoType();
    }

    /**
     * Create an instance of {@link ConceptoPagoType }
     * 
     */
    public ConceptoPagoType createConceptoPagoType() {
        return new ConceptoPagoType();
    }

    /**
     * Create an instance of {@link GenericosType }
     * 
     */
    public GenericosType createGenericosType() {
        return new GenericosType();
    }

    /**
     * Create an instance of {@link GenericosBesType }
     * 
     */
    public GenericosBesType createGenericosBesType() {
        return new GenericosBesType();
    }

    /**
     * Create an instance of {@link RegistrarPagosPorAplicarExtPetType }
     * 
     */
    public RegistrarPagosPorAplicarExtPetType createRegistrarPagosPorAplicarExtPetType() {
        return new RegistrarPagosPorAplicarExtPetType();
    }

    /**
     * Create an instance of {@link RegistrarPagosPorAplicarExtRespType }
     * 
     */
    public RegistrarPagosPorAplicarExtRespType createRegistrarPagosPorAplicarExtRespType() {
        return new RegistrarPagosPorAplicarExtRespType();
    }

    /**
     * Create an instance of {@link ConsultarPagosExtPetType }
     * 
     */
    public ConsultarPagosExtPetType createConsultarPagosExtPetType() {
        return new ConsultarPagosExtPetType();
    }

    /**
     * Create an instance of {@link ConsultarPagosExtRespType }
     * 
     */
    public ConsultarPagosExtRespType createConsultarPagosExtRespType() {
        return new ConsultarPagosExtRespType();
    }

    /**
     * Create an instance of {@link ControlDataRequestType }
     * 
     */
    public ControlDataRequestType createControlDataRequestType() {
        return new ControlDataRequestType();
    }

    /**
     * Create an instance of {@link ControlDataResponseType }
     * 
     */
    public ControlDataResponseType createControlDataResponseType() {
        return new ControlDataResponseType();
    }

    /**
     * Create an instance of {@link DetailResponseType }
     * 
     */
    public DetailResponseType createDetailResponseType() {
        return new DetailResponseType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link DetailFailType }
     * 
     */
    public DetailFailType createDetailFailType() {
        return new DetailFailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarPagosPorAplicarExt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarPagosPorAplicarExt }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", name = "registrarPagosPorAplicarExt")
    public JAXBElement<RegistrarPagosPorAplicarExt> createRegistrarPagosPorAplicarExt(RegistrarPagosPorAplicarExt value) {
        return new JAXBElement<RegistrarPagosPorAplicarExt>(_RegistrarPagosPorAplicarExt_QNAME, RegistrarPagosPorAplicarExt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarPagosPorAplicarExtResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrarPagosPorAplicarExtResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", name = "registrarPagosPorAplicarExtResponse")
    public JAXBElement<RegistrarPagosPorAplicarExtResponse> createRegistrarPagosPorAplicarExtResponse(RegistrarPagosPorAplicarExtResponse value) {
        return new JAXBElement<RegistrarPagosPorAplicarExtResponse>(_RegistrarPagosPorAplicarExtResponse_QNAME, RegistrarPagosPorAplicarExtResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionesPagosServiceException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionesPagosServiceException }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", name = "registrarPagosPorAplicarExtException")
    public JAXBElement<OperacionesPagosServiceException> createRegistrarPagosPorAplicarExtException(OperacionesPagosServiceException value) {
        return new JAXBElement<OperacionesPagosServiceException>(_RegistrarPagosPorAplicarExtException_QNAME, OperacionesPagosServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPagosExt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarPagosExt }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", name = "consultarPagosExt")
    public JAXBElement<ConsultarPagosExt> createConsultarPagosExt(ConsultarPagosExt value) {
        return new JAXBElement<ConsultarPagosExt>(_ConsultarPagosExt_QNAME, ConsultarPagosExt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPagosExtResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarPagosExtResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", name = "consultarPagosExtResponse")
    public JAXBElement<ConsultarPagosExtResponse> createConsultarPagosExtResponse(ConsultarPagosExtResponse value) {
        return new JAXBElement<ConsultarPagosExtResponse>(_ConsultarPagosExtResponse_QNAME, ConsultarPagosExtResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionesPagosServiceException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionesPagosServiceException }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/gsce/dsrvcte/operacionespagosservice", name = "consultarPagosExtException")
    public JAXBElement<OperacionesPagosServiceException> createConsultarPagosExtException(OperacionesPagosServiceException value) {
        return new JAXBElement<OperacionesPagosServiceException>(_ConsultarPagosExtException_QNAME, OperacionesPagosServiceException.class, null, value);
    }

}
