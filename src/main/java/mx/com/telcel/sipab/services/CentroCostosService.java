package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.CentroCostos;
import mx.com.telcel.sipab.repositories.CentroCostosRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class CentroCostosService {

	@Autowired
	CentroCostosRepository repository;
	
	public Response<List<CentroCostos>> findAllByIdGerencia(Integer idGerencia) {
		return new Response<List<CentroCostos>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByIdGerencia(idGerencia));
	}
	
}
