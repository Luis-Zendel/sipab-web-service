package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.TipoBonificacion;
import mx.com.telcel.sipab.repositories.TipoBonificacionRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class TipoBonificacionService {

	@Autowired TipoBonificacionRepository repository;
	
	public Response<List<TipoBonificacion>> findAll() {
		return new Response<List<TipoBonificacion>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAll());
	}
	
}
