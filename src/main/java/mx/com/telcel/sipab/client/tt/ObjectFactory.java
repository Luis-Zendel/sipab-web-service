
package mx.com.telcel.sipab.client.tt;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.telcel.sipab.client.tt package. 
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

    private final static QName _CreateTT_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "createTT");
    private final static QName _CreateTTResponse_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "createTTResponse");
    private final static QName _QueryTTList_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryTTList");
    private final static QName _QueryTTListResponse_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryTTListResponse");
    private final static QName _QueryTTDetail_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryTTDetail");
    private final static QName _QueryTTDetailResponse_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryTTDetailResponse");
    private final static QName _UpdateTT_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "updateTT");
    private final static QName _UpdateTTResponse_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "updateTTResponse");
    private final static QName _QueryMonitoringTT_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryMonitoringTT");
    private final static QName _QueryMonitoringTTResponse_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryMonitoringTTResponse");
    private final static QName _QueryTTOperations_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryTTOperations");
    private final static QName _QueryTTOperationsResponse_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryTTOperationsResponse");
    private final static QName _GeneralException_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "generalException");
    private final static QName _CreateTTPeticion_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "createTTPeticion");
    private final static QName _QueryTTListPeticion_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryTTListPeticion");
    private final static QName _QueryTTDetailPeticion_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryTTDetailPeticion");
    private final static QName _UpdateTTPeticion_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "updateTTPeticion");
    private final static QName _QueryMonitoringTTPeticion_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryMonitoringTTPeticion");
    private final static QName _QueryTTOperationsPeticion_QNAME = new QName("http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", "queryTTOperationsPeticion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.telcel.sipab.client.tt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateTT }
     * 
     */
    public CreateTT createCreateTT() {
        return new CreateTT();
    }

    /**
     * Create an instance of {@link CreateTTResponse }
     * 
     */
    public CreateTTResponse createCreateTTResponse() {
        return new CreateTTResponse();
    }

    /**
     * Create an instance of {@link QueryTTList }
     * 
     */
    public QueryTTList createQueryTTList() {
        return new QueryTTList();
    }

    /**
     * Create an instance of {@link QueryTTListResponse }
     * 
     */
    public QueryTTListResponse createQueryTTListResponse() {
        return new QueryTTListResponse();
    }

    /**
     * Create an instance of {@link QueryTTDetail }
     * 
     */
    public QueryTTDetail createQueryTTDetail() {
        return new QueryTTDetail();
    }

    /**
     * Create an instance of {@link QueryTTDetailResponse }
     * 
     */
    public QueryTTDetailResponse createQueryTTDetailResponse() {
        return new QueryTTDetailResponse();
    }

    /**
     * Create an instance of {@link UpdateTT }
     * 
     */
    public UpdateTT createUpdateTT() {
        return new UpdateTT();
    }

    /**
     * Create an instance of {@link UpdateTTResponse }
     * 
     */
    public UpdateTTResponse createUpdateTTResponse() {
        return new UpdateTTResponse();
    }

    /**
     * Create an instance of {@link QueryMonitoringTT }
     * 
     */
    public QueryMonitoringTT createQueryMonitoringTT() {
        return new QueryMonitoringTT();
    }

    /**
     * Create an instance of {@link QueryMonitoringTTResponse }
     * 
     */
    public QueryMonitoringTTResponse createQueryMonitoringTTResponse() {
        return new QueryMonitoringTTResponse();
    }

    /**
     * Create an instance of {@link QueryTTOperations }
     * 
     */
    public QueryTTOperations createQueryTTOperations() {
        return new QueryTTOperations();
    }

    /**
     * Create an instance of {@link QueryTTOperationsResponse }
     * 
     */
    public QueryTTOperationsResponse createQueryTTOperationsResponse() {
        return new QueryTTOperationsResponse();
    }

    /**
     * Create an instance of {@link TroubleTicketServiceException }
     * 
     */
    public TroubleTicketServiceException createTroubleTicketServiceException() {
        return new TroubleTicketServiceException();
    }

    /**
     * Create an instance of {@link CreateTTPetType }
     * 
     */
    public CreateTTPetType createCreateTTPetType() {
        return new CreateTTPetType();
    }

    /**
     * Create an instance of {@link QueryTTListPetType }
     * 
     */
    public QueryTTListPetType createQueryTTListPetType() {
        return new QueryTTListPetType();
    }

    /**
     * Create an instance of {@link QueryTTDetailPetType }
     * 
     */
    public QueryTTDetailPetType createQueryTTDetailPetType() {
        return new QueryTTDetailPetType();
    }

    /**
     * Create an instance of {@link UpdateTTPetType }
     * 
     */
    public UpdateTTPetType createUpdateTTPetType() {
        return new UpdateTTPetType();
    }

    /**
     * Create an instance of {@link QueryMonitoringTTPetType }
     * 
     */
    public QueryMonitoringTTPetType createQueryMonitoringTTPetType() {
        return new QueryMonitoringTTPetType();
    }

    /**
     * Create an instance of {@link QueryTTOperationsPetType }
     * 
     */
    public QueryTTOperationsPetType createQueryTTOperationsPetType() {
        return new QueryTTOperationsPetType();
    }

    /**
     * Create an instance of {@link TTlistType }
     * 
     */
    public TTlistType createTTlistType() {
        return new TTlistType();
    }

    /**
     * Create an instance of {@link AccessCodeResType }
     * 
     */
    public AccessCodeResType createAccessCodeResType() {
        return new AccessCodeResType();
    }

    /**
     * Create an instance of {@link MonitoringTTListType }
     * 
     */
    public MonitoringTTListType createMonitoringTTListType() {
        return new MonitoringTTListType();
    }

    /**
     * Create an instance of {@link TTOperationsListType }
     * 
     */
    public TTOperationsListType createTTOperationsListType() {
        return new TTOperationsListType();
    }

    /**
     * Create an instance of {@link CreateTTRespType }
     * 
     */
    public CreateTTRespType createCreateTTRespType() {
        return new CreateTTRespType();
    }

    /**
     * Create an instance of {@link QueryTTListRespType }
     * 
     */
    public QueryTTListRespType createQueryTTListRespType() {
        return new QueryTTListRespType();
    }

    /**
     * Create an instance of {@link QueryTTDetailRespType }
     * 
     */
    public QueryTTDetailRespType createQueryTTDetailRespType() {
        return new QueryTTDetailRespType();
    }

    /**
     * Create an instance of {@link UpdateTTRespType }
     * 
     */
    public UpdateTTRespType createUpdateTTRespType() {
        return new UpdateTTRespType();
    }

    /**
     * Create an instance of {@link QueryMonitoringTTRespType }
     * 
     */
    public QueryMonitoringTTRespType createQueryMonitoringTTRespType() {
        return new QueryMonitoringTTRespType();
    }

    /**
     * Create an instance of {@link QueryTTOperationsRespType }
     * 
     */
    public QueryTTOperationsRespType createQueryTTOperationsRespType() {
        return new QueryTTOperationsRespType();
    }

    /**
     * Create an instance of {@link ControlDataRequestHeaderType }
     * 
     */
    public ControlDataRequestHeaderType createControlDataRequestHeaderType() {
        return new ControlDataRequestHeaderType();
    }

    /**
     * Create an instance of {@link ControlDataResponseHeaderType }
     * 
     */
    public ControlDataResponseHeaderType createControlDataResponseHeaderType() {
        return new ControlDataResponseHeaderType();
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
     * Create an instance of {@link BesAdditionalPropertyType }
     * 
     */
    public BesAdditionalPropertyType createBesAdditionalPropertyType() {
        return new BesAdditionalPropertyType();
    }

    /**
     * Create an instance of {@link BesCbsRequestHeaderType }
     * 
     */
    public BesCbsRequestHeaderType createBesCbsRequestHeaderType() {
        return new BesCbsRequestHeaderType();
    }

    /**
     * Create an instance of {@link BesCrmRequestHeaderType }
     * 
     */
    public BesCrmRequestHeaderType createBesCrmRequestHeaderType() {
        return new BesCrmRequestHeaderType();
    }

    /**
     * Create an instance of {@link BesCbsOperatorInfoType }
     * 
     */
    public BesCbsOperatorInfoType createBesCbsOperatorInfoType() {
        return new BesCbsOperatorInfoType();
    }

    /**
     * Create an instance of {@link BesCbsOwnershipInfoType }
     * 
     */
    public BesCbsOwnershipInfoType createBesCbsOwnershipInfoType() {
        return new BesCbsOwnershipInfoType();
    }

    /**
     * Create an instance of {@link BesCrmOperatorInfoType }
     * 
     */
    public BesCrmOperatorInfoType createBesCrmOperatorInfoType() {
        return new BesCrmOperatorInfoType();
    }

    /**
     * Create an instance of {@link PropertyErrorType }
     * 
     */
    public PropertyErrorType createPropertyErrorType() {
        return new PropertyErrorType();
    }

    /**
     * Create an instance of {@link BesCbsTimeFormatType }
     * 
     */
    public BesCbsTimeFormatType createBesCbsTimeFormatType() {
        return new BesCbsTimeFormatType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTT }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateTT }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "createTT")
    public JAXBElement<CreateTT> createCreateTT(CreateTT value) {
        return new JAXBElement<CreateTT>(_CreateTT_QNAME, CreateTT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTTResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateTTResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "createTTResponse")
    public JAXBElement<CreateTTResponse> createCreateTTResponse(CreateTTResponse value) {
        return new JAXBElement<CreateTTResponse>(_CreateTTResponse_QNAME, CreateTTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTTList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTTList }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryTTList")
    public JAXBElement<QueryTTList> createQueryTTList(QueryTTList value) {
        return new JAXBElement<QueryTTList>(_QueryTTList_QNAME, QueryTTList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTTListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTTListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryTTListResponse")
    public JAXBElement<QueryTTListResponse> createQueryTTListResponse(QueryTTListResponse value) {
        return new JAXBElement<QueryTTListResponse>(_QueryTTListResponse_QNAME, QueryTTListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTTDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTTDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryTTDetail")
    public JAXBElement<QueryTTDetail> createQueryTTDetail(QueryTTDetail value) {
        return new JAXBElement<QueryTTDetail>(_QueryTTDetail_QNAME, QueryTTDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTTDetailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTTDetailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryTTDetailResponse")
    public JAXBElement<QueryTTDetailResponse> createQueryTTDetailResponse(QueryTTDetailResponse value) {
        return new JAXBElement<QueryTTDetailResponse>(_QueryTTDetailResponse_QNAME, QueryTTDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTT }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateTT }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "updateTT")
    public JAXBElement<UpdateTT> createUpdateTT(UpdateTT value) {
        return new JAXBElement<UpdateTT>(_UpdateTT_QNAME, UpdateTT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTTResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateTTResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "updateTTResponse")
    public JAXBElement<UpdateTTResponse> createUpdateTTResponse(UpdateTTResponse value) {
        return new JAXBElement<UpdateTTResponse>(_UpdateTTResponse_QNAME, UpdateTTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMonitoringTT }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryMonitoringTT }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryMonitoringTT")
    public JAXBElement<QueryMonitoringTT> createQueryMonitoringTT(QueryMonitoringTT value) {
        return new JAXBElement<QueryMonitoringTT>(_QueryMonitoringTT_QNAME, QueryMonitoringTT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMonitoringTTResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryMonitoringTTResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryMonitoringTTResponse")
    public JAXBElement<QueryMonitoringTTResponse> createQueryMonitoringTTResponse(QueryMonitoringTTResponse value) {
        return new JAXBElement<QueryMonitoringTTResponse>(_QueryMonitoringTTResponse_QNAME, QueryMonitoringTTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTTOperations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTTOperations }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryTTOperations")
    public JAXBElement<QueryTTOperations> createQueryTTOperations(QueryTTOperations value) {
        return new JAXBElement<QueryTTOperations>(_QueryTTOperations_QNAME, QueryTTOperations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTTOperationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTTOperationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryTTOperationsResponse")
    public JAXBElement<QueryTTOperationsResponse> createQueryTTOperationsResponse(QueryTTOperationsResponse value) {
        return new JAXBElement<QueryTTOperationsResponse>(_QueryTTOperationsResponse_QNAME, QueryTTOperationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TroubleTicketServiceException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TroubleTicketServiceException }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "generalException")
    public JAXBElement<TroubleTicketServiceException> createGeneralException(TroubleTicketServiceException value) {
        return new JAXBElement<TroubleTicketServiceException>(_GeneralException_QNAME, TroubleTicketServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTTPetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateTTPetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "createTTPeticion")
    public JAXBElement<CreateTTPetType> createCreateTTPeticion(CreateTTPetType value) {
        return new JAXBElement<CreateTTPetType>(_CreateTTPeticion_QNAME, CreateTTPetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTTListPetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTTListPetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryTTListPeticion")
    public JAXBElement<QueryTTListPetType> createQueryTTListPeticion(QueryTTListPetType value) {
        return new JAXBElement<QueryTTListPetType>(_QueryTTListPeticion_QNAME, QueryTTListPetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTTDetailPetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTTDetailPetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryTTDetailPeticion")
    public JAXBElement<QueryTTDetailPetType> createQueryTTDetailPeticion(QueryTTDetailPetType value) {
        return new JAXBElement<QueryTTDetailPetType>(_QueryTTDetailPeticion_QNAME, QueryTTDetailPetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTTPetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateTTPetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "updateTTPeticion")
    public JAXBElement<UpdateTTPetType> createUpdateTTPeticion(UpdateTTPetType value) {
        return new JAXBElement<UpdateTTPetType>(_UpdateTTPeticion_QNAME, UpdateTTPetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMonitoringTTPetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryMonitoringTTPetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryMonitoringTTPeticion")
    public JAXBElement<QueryMonitoringTTPetType> createQueryMonitoringTTPeticion(QueryMonitoringTTPetType value) {
        return new JAXBElement<QueryMonitoringTTPetType>(_QueryMonitoringTTPeticion_QNAME, QueryMonitoringTTPetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryTTOperationsPetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryTTOperationsPetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.amx.com.mx/mexico/telcel/di/sds/bes/tt/esb/troubleticketservice", name = "queryTTOperationsPeticion")
    public JAXBElement<QueryTTOperationsPetType> createQueryTTOperationsPeticion(QueryTTOperationsPetType value) {
        return new JAXBElement<QueryTTOperationsPetType>(_QueryTTOperationsPeticion_QNAME, QueryTTOperationsPetType.class, null, value);
    }

}
