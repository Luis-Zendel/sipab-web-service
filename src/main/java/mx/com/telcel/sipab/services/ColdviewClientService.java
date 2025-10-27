package mx.com.telcel.sipab.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.client.coldview.COLDviewWS_Service;
import mx.com.telcel.sipab.client.coldview.ColdviewWS;
import mx.com.telcel.sipab.client.coldview.RetrieveDocumentListByIndexCFDI;
import mx.com.telcel.sipab.client.coldview.RetrieveDocumentListByIndexCFDIResponse;
import mx.com.telcel.sipab.headers.coldview.HeaderHandlerResolver;

@Log4j2
@Service
public class ColdviewClientService {

	@Value("${integration.service.coldView.usuario}")
    private String usuario;
    @Value("${integration.service.coldView.contrasenia}")
    private String contraenia;
    @Value("${integration.service.coldView.sistema}")
    private String sitemaCv;
    @Value("${integration.service.coldView.resourceConfig}")
    private String resourceConfig;
    @Value("${integration.service.coldView.wsdl-location}")
    private String wsdlLocation;
    
    private ColdviewWS getColdviewClientInstance() {
    	COLDviewWS_Service service = new COLDviewWS_Service();
    	ColdviewWS port = service.getCOLDviewWSSoap();
    	try {
			service = new COLDviewWS_Service(new URL(wsdlLocation));
			HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
			service.setHandlerResolver(handlerResolver);
			port = service.getCOLDviewWSSoap();
		} catch (MalformedURLException e) {
			log.error(e.getMessage());
		}
		return port;
    }
    
    public RetrieveDocumentListByIndexCFDIResponse retrieveDocumentListByIndexCFDI (Long cuenta, String noFactura, Date fechaInicial, Date fechaFinal) {
    	RetrieveDocumentListByIndexCFDIResponse retrieveDocumentListByIndexCFDIResponse = new RetrieveDocumentListByIndexCFDIResponse();
    	ColdviewWS port = getColdviewClientInstance();
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	String dateFrom = null;
        String dateTo = null;
        dateFrom = simpleDateFormat.format(fechaInicial);
        dateTo= simpleDateFormat.format(fechaFinal);
    	RetrieveDocumentListByIndexCFDI retrieveDocumentListByIndexCFDI = new RetrieveDocumentListByIndexCFDI();
    	retrieveDocumentListByIndexCFDI.setCVResourceConfig(resourceConfig);
        retrieveDocumentListByIndexCFDI.setUser(usuario);
        retrieveDocumentListByIndexCFDI.setPWD(contraenia);
        retrieveDocumentListByIndexCFDI.setSistema(sitemaCv);
        retrieveDocumentListByIndexCFDI.setNroCuenta(String.valueOf(cuenta));
        retrieveDocumentListByIndexCFDI.setNroFolio(noFactura);
        retrieveDocumentListByIndexCFDI.setDateFrom(dateFrom);
        retrieveDocumentListByIndexCFDI.setDateTo(dateTo);
        
    	retrieveDocumentListByIndexCFDIResponse = port.retrieveDocumentListByIndexCFDI(retrieveDocumentListByIndexCFDI);
    	
    	return retrieveDocumentListByIndexCFDIResponse;
    }
    
}
