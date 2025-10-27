package mx.com.telcel.sipab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.models.Pago;
import mx.com.telcel.sipab.repositories.PagoRepository;

@Log4j2
@Service
public class PagoService {
	
	@Autowired
	private PagoRepository repository;
	
	public Pago save(Pago pago) {
		return repository.save(pago);
	}
	
}
