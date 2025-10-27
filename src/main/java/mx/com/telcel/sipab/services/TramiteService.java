package mx.com.telcel.sipab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.models.Tramite;
import mx.com.telcel.sipab.repositories.TramiteRepository;

@Log4j2
@Service
public class TramiteService {
	
	@Autowired
	private TramiteRepository repository;

	public Tramite save(Tramite tramite) {
		return repository.save(tramite);
	}
}
