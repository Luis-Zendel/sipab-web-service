package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.Distribuidor;
import mx.com.telcel.sipab.repositories.DistribuidorRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class DistribuidorService {
	
	@Autowired
	private DistribuidorRepository repository;
	
	public Response<List<Distribuidor>> findAllByIdRegionAndEstatus(Integer idRegion, String estatus) {
		return new Response<List<Distribuidor>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByIdRegionAndEstatus(idRegion, estatus));
	}

}
