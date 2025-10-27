package mx.com.telcel.sipab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.models.Sides;
import mx.com.telcel.sipab.repositories.SidesRepository;

@Log4j2
@Service
public class SidesService {

	@Autowired
	private SidesRepository repository;
	
	public Sides save(Sides sides) {
		return repository.save(sides);
	}
	
	public Integer findMaxIdSides() {
		return repository.findMaxIdSides();
	}
	
}
