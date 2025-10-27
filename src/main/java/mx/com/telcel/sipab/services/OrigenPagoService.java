package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.OrigenPago;
import mx.com.telcel.sipab.repositories.OrigenPagoRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class OrigenPagoService {

	@Autowired
	private OrigenPagoRepository repository;
	
	public Response<List<OrigenPago>> findByIdRegionAndOrigen(Integer idRegion, String origen) {
		return new Response<List<OrigenPago>>(MessageResponse.SUCCESS_RETRIEVE, repository.findByIdRegionAndOrigen(idRegion, origen));
	}
	
	public OrigenPago findByIdOrigenPago(Integer idOrigenPago) {
		return repository.findByIdOrigenPago(idOrigenPago);
	}
	
	public OrigenPago findByOrigenCorto(String origenCorto) {
		return repository.findByOrigenCorto(origenCorto);
	}
	
}
