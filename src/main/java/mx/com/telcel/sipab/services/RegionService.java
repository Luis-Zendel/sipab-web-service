package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.Region;
import mx.com.telcel.sipab.repositories.RegionRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class RegionService {
	
	@Autowired
	private RegionRepository repository;

	public Response<List<Region>> findAll() {
		return new Response<List<Region>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAll());
	}
	
}
