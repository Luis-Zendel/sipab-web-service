package mx.com.telcel.sipab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.models.TramiteDetalle;
import mx.com.telcel.sipab.repositories.TramiteDetalleRepository;

@Log4j2
@Service
public class TramiteDetalleService {

	@Autowired
	private TramiteDetalleRepository repository;
	
	public long findMaxIdTramiteDetalle() {
		return repository.findMaxIdTramiteDetalle();
	}
	
	public long findMaxIdTramiteDetalle(String folio, Integer anio) {
		return repository.findMaxIdTramiteDetalle(folio, anio);
	}
	
	public TramiteDetalle save(TramiteDetalle tramiteDetalle) {
		return repository.save(tramiteDetalle);
	}
	
}
