package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.Concepto;
import mx.com.telcel.sipab.repositories.ConceptoRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class ConceptoService {

	@Autowired
	private ConceptoRepository repository;
	
	public List<Concepto> findAllByTramiteAndPlataformaAndEstatusAndDescripcionNotLikeOrderByDescripcionAsc(String tramite, String plataforma, String estatus, String descripcion) {
		return repository.findAllByTramiteAndPlataformaAndEstatusAndDescripcionNotLikeOrderByDescripcionAsc(tramite, plataforma, estatus, descripcion);
	}
	
	public Response<List<Concepto>> findAllByTramite(String tramite) {
		return new Response<List<Concepto>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByTramite(tramite));
	}
	
	public Response<List<Concepto>> findAllByTramiteAndRegiones(String tramite, Integer regionCuenta, Integer regionUsuario) {
		return new Response<List<Concepto>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByTramiteAndRegiones(tramite, regionCuenta, regionUsuario));
	}
	
	public Response<List<Concepto>> findAllByFia() {
		return new Response<List<Concepto>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByFia());
	}
	
	public Response<List<Concepto>> findAllByTipoNota() {
		return new Response<List<Concepto>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByTipoNota());
	}
	
}
