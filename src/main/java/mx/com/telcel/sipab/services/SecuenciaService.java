package mx.com.telcel.sipab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.models.Secuencia;
import mx.com.telcel.sipab.repositories.SecuenciaRepository;

@Log4j2
@Service
public class SecuenciaService {

	@Autowired
	private SecuenciaRepository repository;
	
	public Secuencia findByIdCentroAndTramite(Integer idCentro, String tramite) {
		Secuencia secuencia = repository.findByIdCentroAndTramite(idCentro, tramite);
		repository.save(new Secuencia(secuencia.getIdSecuencia(), secuencia.getIdCentro(), secuencia.getTramite(), secuencia.getValor() + 1));
		return secuencia;
	}
	
}
