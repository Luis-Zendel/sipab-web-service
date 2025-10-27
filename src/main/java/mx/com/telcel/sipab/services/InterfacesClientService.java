package mx.com.telcel.sipab.services;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.client.interfaces.BesCrmOperatorInfoType;
import mx.com.telcel.sipab.client.interfaces.BesCrmRequestHeaderType;
import mx.com.telcel.sipab.client.interfaces.ControlDataRequestHeaderType;
import mx.com.telcel.sipab.client.interfaces.GeneralException;
import mx.com.telcel.sipab.client.interfaces.PageType;
import mx.com.telcel.sipab.client.interfaces.QuerySubscriberByPage;
import mx.com.telcel.sipab.client.interfaces.QuerySubscriberByPagePetType;
import mx.com.telcel.sipab.client.interfaces.QuerySubscriberByPageResponse;
import mx.com.telcel.sipab.client.interfaces.QueryUnpaidInvoiceItem;
import mx.com.telcel.sipab.client.interfaces.QueryUnpaidInvoiceItemPetType;
import mx.com.telcel.sipab.client.interfaces.QueryUnpaidInvoiceItemResponse;
import mx.com.telcel.sipab.client.interfaces.TelcelInterfaceServices;
import mx.com.telcel.sipab.client.interfaces.TelcelInterfaceServicesHttpService;
import mx.com.telcel.sipab.headers.crm.HeaderHandlerResolver;

@Log4j2
@Service
public class InterfacesClientService {

	
	@Value("${integration.service.interfaces.wsdl-location}")
    private String wsdlLocation;
    @Value("${integration.service.interfaces.send-by}")
    private String sendBy;
    @Value("${integration.service.date-time.format}")
    private String dateTimeFormat;
    
    private DateTimeFormatter formatter;
    
    private TelcelInterfaceServices getInterfaceClientInstance() {
    	TelcelInterfaceServicesHttpService service = new TelcelInterfaceServicesHttpService();
    	TelcelInterfaceServices port = service.getTelcelInterfaceServicesHttpPort();
    	
    	try {
            service = new TelcelInterfaceServicesHttpService(new URL(wsdlLocation));
            HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
			service.setHandlerResolver(handlerResolver);
            port = service.getTelcelInterfaceServicesHttpPort();
        } catch (MalformedURLException e) {
            log.error(e.getMessage());
        }
		return port;
    }
    
    private ControlDataRequestHeaderType getControlDataRequestHeader() {
    	ControlDataRequestHeaderType controlDataRequestHeaderType = new ControlDataRequestHeaderType();
		
        controlDataRequestHeaderType.setVersion("101");
        controlDataRequestHeaderType.setMessageUUID(UUID.randomUUID().toString());
        
        formatter = DateTimeFormatter.ofPattern(dateTimeFormat);
        String offsetDateTime = OffsetDateTime.now().format(formatter);

        try {
            controlDataRequestHeaderType.setRequestDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(offsetDateTime));
        } catch (DatatypeConfigurationException e) {
            log.info(e.getMessage());
        }

        controlDataRequestHeaderType.setSendBy(sendBy);

        BesCrmRequestHeaderType besCrmRequestHeaderType = new BesCrmRequestHeaderType();
        besCrmRequestHeaderType.setBeId(BigDecimal.valueOf(101));
        besCrmRequestHeaderType.setRegionId(BigDecimal.valueOf(101));

        BesCrmOperatorInfoType besCrmOperatorInfoType = new BesCrmOperatorInfoType();
        besCrmOperatorInfoType.setOperatorCode("CT649");
        besCrmOperatorInfoType.setOrgId(BigDecimal.valueOf(101));
        besCrmRequestHeaderType.setOperatorInfo(besCrmOperatorInfoType);
        besCrmRequestHeaderType.setChannelType("649");

        controlDataRequestHeaderType.setBesCrmRequestHeader(besCrmRequestHeaderType);
        
        return controlDataRequestHeaderType;
    }
    
    private QuerySubscriberByPagePetType querySubscriberByPagePetType(String account) {
    	QuerySubscriberByPagePetType querySubscriberByPagePetType = new QuerySubscriberByPagePetType();
    	querySubscriberByPagePetType.setAcctCode(String.valueOf(account));
    	querySubscriberByPagePetType.setAcctId(null);
    	querySubscriberByPagePetType.setCustCode(null);
    	querySubscriberByPagePetType.setCustId(null);
    	PageType pageType = new PageType();
    	pageType.setPageSize(10);
    	pageType.setStartNum(0);
    	querySubscriberByPagePetType.setPageInfo(pageType);
    	querySubscriberByPagePetType.setServiceNumber(null);
    	querySubscriberByPagePetType.setSubscriberId(null);
    	
    	return querySubscriberByPagePetType;
    }
    
    private QueryUnpaidInvoiceItemPetType queryUnpaidInvoiceItemPetType(String orderId) {
    	QueryUnpaidInvoiceItemPetType queryUnpaidInvoiceItemPetType = new QueryUnpaidInvoiceItemPetType();
    	queryUnpaidInvoiceItemPetType.setOrderId(new BigDecimal(orderId));
    	return queryUnpaidInvoiceItemPetType;
    }
    
    
    public QuerySubscriberByPageResponse querySubscriberByPageResponse(String account) {
    	QuerySubscriberByPageResponse querySubscriberByPageResponse = new QuerySubscriberByPageResponse();
    	TelcelInterfaceServices port = getInterfaceClientInstance();
    	QuerySubscriberByPage querySubscriberByPage = new QuerySubscriberByPage();
    	querySubscriberByPage.setControlData(getControlDataRequestHeader());
    	querySubscriberByPage.setQuerySubscriberByPage(querySubscriberByPagePetType(account));
    	try {
    		querySubscriberByPageResponse = port.querySubscriberByPage(querySubscriberByPage);
		} catch (GeneralException e) {
			log.error(e.getMessage());
		}
		return querySubscriberByPageResponse;
    }
    
    public QueryUnpaidInvoiceItemResponse queryUnpaidInvoiceItemResponse(String orderId) {
    	QueryUnpaidInvoiceItemResponse queryUnpaidInvoiceItemResponse = new QueryUnpaidInvoiceItemResponse();
    	TelcelInterfaceServices port = getInterfaceClientInstance();
    	QueryUnpaidInvoiceItem queryUnpaidInvoiceItem = new QueryUnpaidInvoiceItem();
    	queryUnpaidInvoiceItem.setControlData(getControlDataRequestHeader());
    	queryUnpaidInvoiceItem.setQueryUnpaidInvoiceItem(queryUnpaidInvoiceItemPetType(orderId));
    	try {
    		queryUnpaidInvoiceItemResponse = port.queryUnpaidInvoiceItem(queryUnpaidInvoiceItem);
		} catch (GeneralException e) {
			log.error(e.getMessage());
		}
		return queryUnpaidInvoiceItemResponse;
    }
}
