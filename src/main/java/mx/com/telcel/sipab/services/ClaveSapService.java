package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.ClaveSap;
import mx.com.telcel.sipab.repositories.ClaveSapRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class ClaveSapService {

	@Autowired
	private ClaveSapRepository repository;
	
	public List<ClaveSap> findAllByRegionAndTramite(Integer idRegion, String tramite) {
		return repository.findAllByRegionAndTramite(idRegion, tramite);
	}
	
	public Response<List<ClaveSap>> findAllByTramiteAndPlataformaAndSector(String tramite, String plataforma, String sector) {
		return new Response<List<ClaveSap>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByTramiteAndPlataformaAndSector(tramite, plataforma, sector));
	}
	
	public Response<List<ClaveSap>> findAllByIdSector(Integer idSector) {
		return new Response<List<ClaveSap>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByIdSector(idSector));
	}
	
}
