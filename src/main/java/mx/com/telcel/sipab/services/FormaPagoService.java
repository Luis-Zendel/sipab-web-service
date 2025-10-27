package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.FormaPago;
import mx.com.telcel.sipab.repositories.FormaPagoRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class FormaPagoService {

	@Autowired
	private FormaPagoRepository repository;
	
	public Response<List<FormaPago>> findAllByClaveNotIn(List<String> claves) {
		return new Response<List<FormaPago>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByClaveNotIn(claves));
	}
	
	
	public FormaPago findByIdFormaPago(Integer idFormaPago) {
		return repository.findByIdFormaPago(idFormaPago);
	}
	
}
