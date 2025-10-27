package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.ErrorResponse;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.UsoCfdi;
import mx.com.telcel.sipab.repositories.UsoCfdiRepository;
import mx.com.telcel.sipab.response.Response;
import mx.com.telcel.sipab.utility.Utilities;

@Log4j2
@Service
public class UsoCfdiService {

	@Autowired
	private UsoCfdiRepository repository;
	
	public Response<List<UsoCfdi>> findAllByRfcAndRegimenFiscal(String rfc, Integer idRegimen) {
		String tipoRfc = Utilities.RFCValidator(rfc);
		if (tipoRfc != null) {
			return new Response<List<UsoCfdi>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByRegimenFiscalAndFisicaAndMoral(idRegimen, tipoRfc.equals("F") ? "S" : "N", tipoRfc.equals("M") ? "S" : "N"));
		}
		return new Response<List<UsoCfdi>>(ErrorResponse.RECORDS_NOT_FOUND, null);
	}
	
	public UsoCfdi findByUsoCfdi(String usoCfdi) {
		return repository.findByUsoCfdi(usoCfdi);
	}
	
}
