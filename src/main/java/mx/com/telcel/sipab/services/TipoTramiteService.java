package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.TipoTramite;
import mx.com.telcel.sipab.repositories.TipoTramiteRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class TipoTramiteService {

	@Autowired
	private TipoTramiteRepository repository;
	
	public Response<List<TipoTramite>> findAllByEstatus(String estatus) {
		return new Response<List<TipoTramite>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByEstatus(estatus));
	}
	
	public TipoTramite findByPrefijo(String prefijo) {
		return repository.findByPrefijo(prefijo);
	}
	
}
