package mx.com.telcel.sipab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.models.Rfc;
import mx.com.telcel.sipab.repositories.RfcRepository;

@Log4j2
@Service
public class RfcService {

	@Autowired
	private RfcRepository repository;
	
	public Rfc save(Rfc rfc) {
		return repository.save(rfc);
	}
	
}
