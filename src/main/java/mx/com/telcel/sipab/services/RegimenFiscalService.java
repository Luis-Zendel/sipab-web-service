package mx.com.telcel.sipab.services;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.ErrorResponse;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.RegimenFiscal;
import mx.com.telcel.sipab.repositories.RegimenFiscalRepository;
import mx.com.telcel.sipab.response.Response;
import mx.com.telcel.sipab.utility.Utilities;

@Log4j2
@Service
public class RegimenFiscalService {

	@Autowired
	private RegimenFiscalRepository repository;
	
	public Response<List<RegimenFiscal>> findAllByRfc(String rfc) {
		String tipoRfc = Utilities.RFCValidator(rfc);
		if (tipoRfc != null) {
			return new Response<List<RegimenFiscal>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByFisicaAndMoral(tipoRfc.equals("F") ? "S" : "N", tipoRfc.equals("M") ? "S" : "N"));
		}
		return new Response<List<RegimenFiscal>>(ErrorResponse.RECORDS_NOT_FOUND, null);
	}
	
	public RegimenFiscal findByRegimenFiscal(String regimenFiscal) {
		return repository.findByRegimenFiscal(regimenFiscal);
	}
	
}
