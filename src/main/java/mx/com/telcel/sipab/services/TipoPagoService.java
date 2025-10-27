package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.TipoPago;
import mx.com.telcel.sipab.repositories.TipoPagoRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class TipoPagoService {
	
	@Autowired
	private TipoPagoRepository repository;
	
	public Response<List<TipoPago>> findAll() {
		return new Response<List<TipoPago>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAll());
	}
	
	public TipoPago findByIdTipoPago(Integer idTipoPago) {
		return repository.findByIdTipoPago(idTipoPago);
	}
	
}
