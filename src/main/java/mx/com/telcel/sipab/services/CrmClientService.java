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
import mx.com.telcel.sipab.client.crm.BesCrmOperatorInfoType;
import mx.com.telcel.sipab.client.crm.BesCrmRequestHeaderType;
import mx.com.telcel.sipab.client.crm.ControlDataRequestHeaderType;
import mx.com.telcel.sipab.client.crm.CustomerManagementService;
import mx.com.telcel.sipab.client.crm.CustomerManagementServiceHttpService;
import mx.com.telcel.sipab.client.crm.GeneralException;
import mx.com.telcel.sipab.client.crm.GetAccountInfo;
import mx.com.telcel.sipab.client.crm.GetAccountInfoPetType;
import mx.com.telcel.sipab.client.crm.GetAccountInfoResponse;
import mx.com.telcel.sipab.client.crm.GetCustomerBasicInfo;
import mx.com.telcel.sipab.client.crm.GetCustomerBasicInfoPetType;
import mx.com.telcel.sipab.client.crm.GetCustomerBasicInfoResponse;
import mx.com.telcel.sipab.client.crm.GetCustomerDetailInfo;
import mx.com.telcel.sipab.client.crm.GetCustomerDetailInfoPetType;
import mx.com.telcel.sipab.client.crm.GetCustomerDetailInfoResponse;
import mx.com.telcel.sipab.client.crm.IncludeFlagType;
import mx.com.telcel.sipab.client.crm.IncludeObjGetAccountType;
import mx.com.telcel.sipab.headers.crm.HeaderHandlerResolver;

@Log4j2
@Service
public class CrmClientService {
	
	@Value("${integration.service.crm.wsdl-location}")
    private String wsdlLocation;
    @Value("${integration.service.crm.send-by}")
    private String sendBy;
    @Value("${integration.service.date-time.format}")
    private String dateTimeFormat;
    
    private DateTimeFormatter formatter;
	
	private CustomerManagementService getCrmClientInstance() {
		CustomerManagementServiceHttpService service = new CustomerManagementServiceHttpService();
		CustomerManagementService port = service.getCustomerManagementServiceHttpPort();
		
		try {
            service = new CustomerManagementServiceHttpService(new URL(wsdlLocation));
            HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
			service.setHandlerResolver(handlerResolver);
            port = service.getCustomerManagementServiceHttpPort();
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
	
	private GetAccountInfoPetType getAccountInfoPetType(String accountCode) {
		GetAccountInfoPetType accountInfoPetType = new GetAccountInfoPetType();
		accountInfoPetType.setAcctCode(String.valueOf(accountCode));

        IncludeObjGetAccountType includeObjGetAccountType = new IncludeObjGetAccountType();
        includeObjGetAccountType.setIncludeContactPersonFlag("Y");
        includeObjGetAccountType.setIncludePaymentChannelFlag("Y");

        accountInfoPetType.setIncludeObj(includeObjGetAccountType);
		
        return accountInfoPetType;
	}
	
	private GetCustomerBasicInfoPetType getCustomerBasicInfoPetType(String serviceNumber) {
		GetCustomerBasicInfoPetType customerBasicInfoPetType = new GetCustomerBasicInfoPetType();
		customerBasicInfoPetType.setServiceNumber(new BigDecimal(serviceNumber));
		return customerBasicInfoPetType;
	}
	
	private GetCustomerDetailInfoPetType getCustomerDetailInfoPetType(BigDecimal custId) {
		GetCustomerDetailInfoPetType customerBasicInfoPetType = new GetCustomerDetailInfoPetType();
		IncludeFlagType includeFlagType = new IncludeFlagType();
		customerBasicInfoPetType.setCustId(custId);
		includeFlagType.setIncludeDefaultAcctFlag("Y");
		includeFlagType.setIncludeAddrFlag("Y");
		includeFlagType.setIncludeContactPersonFlag("Y");
		customerBasicInfoPetType.setIncludeFlag(includeFlagType);
		return customerBasicInfoPetType;
	}
	
	public GetAccountInfoResponse getAccountInfo(String account) {
		GetAccountInfoResponse accountInfoResponse = new GetAccountInfoResponse();
		CustomerManagementService port = getCrmClientInstance();
		GetAccountInfo accountInfo = new GetAccountInfo();
		accountInfo.setControlData(getControlDataRequestHeader());
		accountInfo.setGetAccountInfo(getAccountInfoPetType(account));
		try {
			accountInfoResponse = port.getAccountInfo(accountInfo);
		} catch (GeneralException e) {
			log.error(e.getMessage());
		}
		return accountInfoResponse;
	}
	
	public GetCustomerBasicInfoResponse getCustomerBasicInfo(String serviceNumber) {
		GetCustomerBasicInfoResponse customerBasicInfoResponse = new GetCustomerBasicInfoResponse();
		CustomerManagementService port = getCrmClientInstance();
		GetCustomerBasicInfo customerBasicInfoRequest = new GetCustomerBasicInfo();
		customerBasicInfoRequest.setControlData(getControlDataRequestHeader());
		customerBasicInfoRequest.setGetCustomerBasicInfo(getCustomerBasicInfoPetType(serviceNumber));
		try {
			customerBasicInfoResponse = port.getCustomerBasicInfo(customerBasicInfoRequest);
		} catch (GeneralException e) {
			log.error(e.getMessage());
		}
		return customerBasicInfoResponse;
	}
	
	public GetCustomerDetailInfoResponse getCustomerDetailInfoResponse(BigDecimal custId) {
		GetCustomerDetailInfoResponse customerDetailInfoResponse = new GetCustomerDetailInfoResponse();
		CustomerManagementService port = getCrmClientInstance();
		GetCustomerDetailInfo customerDetailInfo = new GetCustomerDetailInfo();
		customerDetailInfo.setControlData(getControlDataRequestHeader());
		customerDetailInfo.setGetCustomerDetailInfo(getCustomerDetailInfoPetType(custId));
		try {
			customerDetailInfoResponse = port.getCustomerDetailInfo(customerDetailInfo);
		} catch (GeneralException e) {
			log.error(e.getMessage());
		}
		return customerDetailInfoResponse;
	}

}
