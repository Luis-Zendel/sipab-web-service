package mx.com.telcel.sipab.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.client.cbs.AcctAccessCodePayType;
import mx.com.telcel.sipab.client.cbs.AcctAccessCodeType;
import mx.com.telcel.sipab.client.cbs.ArServices;
import mx.com.telcel.sipab.client.cbs.ArServicesHttpService;
import mx.com.telcel.sipab.client.cbs.BesAdditionalPropertyType;
import mx.com.telcel.sipab.client.cbs.BesCbsOperatorInfoType;
import mx.com.telcel.sipab.client.cbs.BesCbsOwnershipInfoType;
import mx.com.telcel.sipab.client.cbs.BesCbsRequestHeaderType;
import mx.com.telcel.sipab.client.cbs.BesCbsTimeFormatType;
import mx.com.telcel.sipab.client.cbs.ControlDataRequestHeaderType;
import mx.com.telcel.sipab.client.cbs.GeneralException;
import mx.com.telcel.sipab.client.cbs.QueryInvoice;
import mx.com.telcel.sipab.client.cbs.QueryInvoicePetType;
import mx.com.telcel.sipab.client.cbs.QueryInvoiceResponse;
import mx.com.telcel.sipab.client.cbs.QueryPaymentLog;
import mx.com.telcel.sipab.client.cbs.QueryPaymentLogPetType;
import mx.com.telcel.sipab.client.cbs.QueryPaymentLogResponse;
import mx.com.telcel.sipab.client.cbs.TimePeriodType;
import mx.com.telcel.sipab.headers.cbs.HeaderHandlerResolver;

@Log4j2
@Service
public class CbsClientService {

    @Value("${integration.service.cbs.wsdl-location}")
    private String wsdlLocation;
    @Value("${integration.service.cbs.send-by}")
    private String sendBy;
    @Value("${integration.service.date-time.format}")
    private String dateTimeFormat;
    
    private DateTimeFormatter formatter;
    
    private ArServices getCbsClientInstance() {
    	ArServicesHttpService service = new ArServicesHttpService();
    	ArServices port = service.getArServicesHttpPort();
	    try {
			service = new ArServicesHttpService(new URL(wsdlLocation));
			HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
			service.setHandlerResolver(handlerResolver);
			port = service.getArServicesHttpPort();
		} catch (MalformedURLException e) {
			log.error(e.getMessage());
		}
		return port;
	}
    
    private ControlDataRequestHeaderType getControlDataRequestHeaderType() {
    	ControlDataRequestHeaderType controlDataRequestHeaderType = new ControlDataRequestHeaderType();
        controlDataRequestHeaderType.setVersion("5.5");
        controlDataRequestHeaderType.setBusinessCode("QueryInvoice");

        BesAdditionalPropertyType besAdditionalPropertyType = new BesAdditionalPropertyType();
        besAdditionalPropertyType.setCode("1");
        besAdditionalPropertyType.setValue("1");

        List<BesAdditionalPropertyType> additionalProperty = new ArrayList<>();
        additionalProperty.add(besAdditionalPropertyType);

        controlDataRequestHeaderType.setMessageUUID(UUID.randomUUID().toString());
        formatter = DateTimeFormatter.ofPattern(dateTimeFormat);
        String offsetDateTime = OffsetDateTime.now().format(formatter);

        try {
            controlDataRequestHeaderType.setRequestDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(offsetDateTime));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        controlDataRequestHeaderType.setSendBy(sendBy);
        controlDataRequestHeaderType.setIpClient("192.168.1.64");
        controlDataRequestHeaderType.setIpServer("192.168.1.1");
        controlDataRequestHeaderType.setUser("1003");

        BesCbsOwnershipInfoType ownershipInfo= new BesCbsOwnershipInfoType();
        ownershipInfo.setBEID("101");
        ownershipInfo.setBRID("101");

        BesCbsOperatorInfoType operatorInfo = new BesCbsOperatorInfoType();
        operatorInfo.setOperatorID("6000000649");
        operatorInfo.setChannelID("649");

        BesCbsTimeFormatType timeFormat = new BesCbsTimeFormatType();
        timeFormat.setTimeType("2");
        timeFormat.setTimeZoneID("1083");

        BesCbsRequestHeaderType besCbsRequestHeaderType = new BesCbsRequestHeaderType();
        besCbsRequestHeaderType.setOwnershipInfo(ownershipInfo);
        besCbsRequestHeaderType.setOperatorInfo(operatorInfo);
        besCbsRequestHeaderType.setTimeFormat(timeFormat);
        besCbsRequestHeaderType.setAccessMode("3");
        besCbsRequestHeaderType.setMsgLanguageCode("2049");
        controlDataRequestHeaderType.setBesCbsRequestHeader(besCbsRequestHeaderType);
        
        return controlDataRequestHeaderType;
    }
    
    private QueryInvoicePetType invoicePetType(String account, String startTime, String endTime, String invoiceNo) {
        QueryInvoicePetType queryInvoicePetType = new QueryInvoicePetType();

        TimePeriodType timePeriodType = new TimePeriodType();
        timePeriodType.setStartTime(startTime);
        timePeriodType.setEndTime(endTime);
        if (startTime != null && !startTime.equals("") && endTime != null && !endTime.equals("")) {
        	queryInvoicePetType.setTimePeriod(timePeriodType);
        }

        AcctAccessCodeType acctAccessCodeType= new AcctAccessCodeType();
        acctAccessCodeType.setAccountCode(account);
        AcctAccessCodePayType acctAccessCodeT = new AcctAccessCodePayType();
        acctAccessCodeT.setAcctAccessCode(acctAccessCodeType);
        if (invoiceNo != null && !invoiceNo.equals("")) {
        	queryInvoicePetType.setInvoiceNo(invoiceNo);
		}
        queryInvoicePetType.setAcctAccessCode(acctAccessCodeT);
        
        return queryInvoicePetType;
    }
    
    private QueryPaymentLogPetType queryPaymentLogPetType(String account, Boolean deposit) {
    	QueryPaymentLogPetType queryPaymentLogPetType = new QueryPaymentLogPetType();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    	AcctAccessCodePayType accessCodePayType = new AcctAccessCodePayType();
		AcctAccessCodeType accessCodeType = new AcctAccessCodeType();
		accessCodeType.setAccountCode(account);	
		accessCodePayType.setAcctAccessCode(accessCodeType);
		if(deposit) {
			accessCodePayType.setPayType("2");
		}
		queryPaymentLogPetType.setAcctAccessCode(accessCodePayType);
		queryPaymentLogPetType.setStartTime("20000814200938");//checar fecha inicio
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 1);
		queryPaymentLogPetType.setEndTime(sdf.format(new Date(calendar.getTimeInMillis())));
		queryPaymentLogPetType.setTotalRowNum(100L);
		queryPaymentLogPetType.setBeginRowNum(0L);
		queryPaymentLogPetType.setFetchRowNum(100L);
		return queryPaymentLogPetType;
    }
    
    public QueryInvoiceResponse queryInvoice(String account, String startTime, String endTime, String invoiceNo)  {
    	QueryInvoiceResponse queryInvoiceResponse = new QueryInvoiceResponse();
    	ArServices port = getCbsClientInstance();
    	QueryInvoice queryInvoice = new QueryInvoice();
    	queryInvoice.setControlData(getControlDataRequestHeaderType());
    	queryInvoice.setQueryInvoice(invoicePetType(account, startTime, endTime, invoiceNo));
    	try {
    		queryInvoiceResponse = port.queryInvoice(queryInvoice);
		} catch (GeneralException e) {
			log.error(e.getMessage());
		}
    	return queryInvoiceResponse;
    }
    
    public QueryPaymentLogResponse queryPaymentLog(String account) {
    	QueryPaymentLogResponse queryPaymentLogResponse = new QueryPaymentLogResponse();
    	ArServices port = getCbsClientInstance();
    	QueryPaymentLog queryPaymentLog = new QueryPaymentLog();
    	queryPaymentLog.setControlData(getControlDataRequestHeaderType());
    	queryPaymentLog.setQueryPaymentLog(queryPaymentLogPetType(account, false));
    	try {
    		queryPaymentLogResponse = port.queryPaymentLog(queryPaymentLog);
		} catch (GeneralException e) {
			log.error(e.getMessage());
		}
    	return queryPaymentLogResponse;
    }
}
