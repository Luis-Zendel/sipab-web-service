package mx.com.telcel.sipab.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.client.crm.AccountBasicType;
import mx.com.telcel.sipab.client.crm.AccountPaymentChannelType;
import mx.com.telcel.sipab.client.crm.ContactPersonType;
import mx.com.telcel.sipab.client.crm.GetAccountInfoResponse;
import mx.com.telcel.sipab.client.crm.GetCustomerBasicInfoResponse;
import mx.com.telcel.sipab.client.crm.GetCustomerDetailInfoResponse;
import mx.com.telcel.sipab.client.crm.IndividualBaseType;
import mx.com.telcel.sipab.client.crm.SimplePropertyCRMType;
import mx.com.telcel.sipab.client.interfaces.QuerySubscriberByPageResponse;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.dto.response.InformacionCuenta;
import mx.com.telcel.sipab.dto.response.InformacionFiscal;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class CuentaService {
	
	@Autowired
	private CrmClientService crmClientService;
	@Autowired
	private InterfacesClientService interfacesClientService;
	@Autowired
	private RegimenFiscalService regimenFiscalService;
	@Autowired
	private UsoCfdiService usoCfdiService;
	
	public Response<InformacionCuenta> datos(String cuenta) {
		cuenta = String.valueOf(Long.valueOf(cuenta));
		InformacionCuenta informacionCuenta = new InformacionCuenta();
		InformacionFiscal informacionFiscal = new InformacionFiscal();
		GetAccountInfoResponse accountInfoResponse = crmClientService.getAccountInfo(cuenta);
		AccountBasicType accountBasicType = accountInfoResponse.getGetAccountInfoResponse().getAccount().getAccountBasicInfo();
		ContactPersonType contactPersonType = accountInfoResponse.getGetAccountInfoResponse().getAccount().getContactPersonInfo().get(0);
		QuerySubscriberByPageResponse querySubscriberByPageResponse = interfacesClientService.querySubscriberByPageResponse(cuenta);
		String telefono = querySubscriberByPageResponse.getQuerySubscriberByPageResponse().getSubscriberInfo().get(0).getServiceNumber();
		GetCustomerBasicInfoResponse customerBasicInfoResponse = crmClientService.getCustomerBasicInfo(telefono);
		BigDecimal custId = customerBasicInfoResponse.getGetCustomerBasicInfoResponse().getCustId();
		GetCustomerDetailInfoResponse customerDetailInfoResponse = crmClientService.getCustomerDetailInfoResponse(custId);
		IndividualBaseType individualBaseType = customerDetailInfoResponse.getGetCustomerDetailInfoResponse().getCustomer().getIndividualInfo(); 
		String razonSocial = individualBaseType.getFirstName() + " " + individualBaseType.getMiddleName() + " " + individualBaseType.getLastName();
		String regimenFiscal = null;
		String usoCfdi = null;
		String rfc = null;
		for (SimplePropertyCRMType simplePropertyCRMType : individualBaseType.getIndividualProperty()) {
			if (simplePropertyCRMType.getCode().equals("rfc")) {
				rfc = simplePropertyCRMType.getValue();
			}
			if (simplePropertyCRMType.getCode().equals("USO_DE_CFDI_SERVICIO")) {
				usoCfdi = simplePropertyCRMType.getValue();
			}
			if (simplePropertyCRMType.getCode().equals("REGIMEN_FISCAL")) {
				regimenFiscal = simplePropertyCRMType.getValue();
			}
		}
		log.info("Nombre de accountInfo: " + accountBasicType.getAcctName());
		log.info("Nombre de querySubscriberByPageo: " + razonSocial);
		
		informacionCuenta.setRegion("R0" + accountBasicType.getRegionCode().replace("10100", "").substring(0, 1));
		informacionCuenta.setNombre(accountBasicType.getAcctName());
		informacionCuenta.setCuenta(Long.valueOf(accountBasicType.getAcctCode()));
		informacionCuenta.setCiclo(accountBasicType.getBillCycleTypeId().get(0).getBillCycleTypeId().longValue());
		informacionCuenta.setTelefono(telefono);
		informacionCuenta.setEstatus(accountBasicType.getStatus());
//		informacionCuenta.setTipo(accountBasicType.getAcctName());
		List<String> metodosPago = new ArrayList<>();
		for (AccountPaymentChannelType accountPaymentChannelType : accountInfoResponse.getGetAccountInfoResponse().getAccount().getPaymentChannelInfo()) {
			metodosPago.add(accountPaymentChannelType.getPaymentChannelId().toPlainString());
		}
		informacionCuenta.setMetodosPago(metodosPago);
		informacionFiscal.setRazonSocial(razonSocial);
		informacionFiscal.setIdRegimenFiscal(regimenFiscalService.findByRegimenFiscal(regimenFiscal).getIdRegimenFiscal());
		informacionFiscal.setIdUsoCfdi(usoCfdiService.findByUsoCfdi(usoCfdi).getIdUsoCfdi());
		informacionFiscal.setRfc(rfc);
		informacionFiscal.setCodigoPostal(contactPersonType.getAddressInfo().getPostalCode());
		informacionFiscal.setCalle(contactPersonType.getAddressInfo().getAddr1());
		informacionFiscal.setNoExterior(contactPersonType.getAddressInfo().getAddr2());
		informacionFiscal.setNoInterior(contactPersonType.getAddressInfo().getAddr3());
		informacionFiscal.setColonia(contactPersonType.getAddressInfo().getAddr7());
		informacionFiscal.setCiudad(contactPersonType.getAddressInfo().getAddr5());
		informacionFiscal.setEstado(contactPersonType.getAddressInfo().getAddr6());
		informacionFiscal.setDireccion(String.format("%s %s %s, %s %s", informacionFiscal.getCalle(), informacionFiscal.getNoExterior(), informacionFiscal.getNoInterior(), informacionFiscal.getColonia(), informacionFiscal.getCodigoPostal()));
		informacionCuenta.setInformacionFiscal(informacionFiscal);
		
		for (SimplePropertyCRMType simplePropertyCRMType : accountBasicType.getAcctProperty()) {
			if (simplePropertyCRMType.getCode().equals("paymentAccountCode")) {
				log.info("Cuenta no valida: " + cuenta + " /nLa cuenta con responsabilidad de pago es la siguiente: " + simplePropertyCRMType.getValue());
				return new Response<InformacionCuenta>("Cuenta no valida: " + cuenta + " /nLa cuenta con responsabilidad de pago es la siguiente: " + simplePropertyCRMType.getValue(), null);
			}
		}
		return new Response<InformacionCuenta>(MessageResponse.SUCCESS_RETRIEVE, informacionCuenta);
	}

}
