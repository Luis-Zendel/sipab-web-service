package mx.com.telcel.sipab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.models.Nota;
import mx.com.telcel.sipab.repositories.NotaRepository;

@Log4j2
@Service
public class NotaService {

	@Autowired
	private NotaRepository repository;
	
	public Nota save(Nota nota) {
		return repository.save(nota);
	}
	
}
