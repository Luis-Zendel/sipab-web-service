package mx.com.telcel.sipab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.models.Grupo;
import mx.com.telcel.sipab.repositories.GrupoRepository;

@Log4j2
@Service
public class GrupoService {

	@Autowired
	private GrupoRepository repository;
	
	public Grupo findByIdGrupo(Integer idGrupo) {
		return repository.findByIdGrupo(idGrupo);
	}
	
}
