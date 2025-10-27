package mx.com.telcel.sipab.services;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.client.ldap.BuscaEmpleado;
import mx.com.telcel.sipab.client.ldap.BuscaEmpleadoResponse;
import mx.com.telcel.sipab.client.ldap.SearchLdap;
import mx.com.telcel.sipab.client.ldap.SearchLdapService;

@Log4j2
@Service
public class LdapClientService {

	@Value("${integration.service.ldap.wsdl-location}")
    private String wsdlLocation;
 
    private SearchLdap getLdapClientInstance() {
    	SearchLdapService service = new SearchLdapService();
    	SearchLdap port = service.getSearchLdap();
    	try {
			service = new SearchLdapService(new URL(wsdlLocation));
//			HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
//			service.setHandlerResolver(handlerResolver);
			port = service.getSearchLdap();
		} catch (MalformedURLException e) {
			log.error(e.getMessage());
		}
		return port;
    }
    
    public BuscaEmpleadoResponse buscaEmpleado(String idapp, String passwordApp, String numeroEmpleado) {
    	BuscaEmpleadoResponse buscaEmpleadoResponse = new BuscaEmpleadoResponse();
    	SearchLdap port = getLdapClientInstance();
    	BuscaEmpleado buscaEmpleado = new BuscaEmpleado();
    	buscaEmpleado.setIdApp(idapp);
    	buscaEmpleado.setPasswordApp(passwordApp);
    	buscaEmpleado.setNumeroDeEmpleado(numeroEmpleado);
    	buscaEmpleadoResponse = port.buscaEmpleado(buscaEmpleado);
    	return buscaEmpleadoResponse;
    }
}
