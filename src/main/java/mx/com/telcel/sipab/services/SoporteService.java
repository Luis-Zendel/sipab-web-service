package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.Soporte;
import mx.com.telcel.sipab.repositories.SoporteRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class SoporteService {
	
	@Autowired
	private SoporteRepository repository;
	
	public Response<List<Soporte>> findAll() {
		return new Response<List<Soporte>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAll());
	}

}
