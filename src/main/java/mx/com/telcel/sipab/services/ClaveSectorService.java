package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.ClaveSector;
import mx.com.telcel.sipab.repositories.ClaveSectorRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class ClaveSectorService {

	@Autowired
	private ClaveSectorRepository repository;
	
	public Response<List<ClaveSector>> clavesSector() {
		return new Response<List<ClaveSector>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAll());
	}
	
}
