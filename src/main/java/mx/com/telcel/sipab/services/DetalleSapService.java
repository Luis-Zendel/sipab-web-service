package mx.com.telcel.sipab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.models.DetalleSap;
import mx.com.telcel.sipab.repositories.DetalleSapRepository;

@Log4j2
@Service
public class DetalleSapService {

	@Autowired
	private DetalleSapRepository repository;
	
	public DetalleSap save(DetalleSap detalleSap) {
		return repository.save(detalleSap);
	}
	
}
