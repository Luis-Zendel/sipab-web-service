package mx.com.telcel.sipab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.dto.request.BonificacionRequest;
import mx.com.telcel.sipab.response.Response;
import mx.com.telcel.sipab.services.BonificacionService;

@Log4j2
@RestController
@RequestMapping("/bonificacion")
public class BonificacionesController {
	
	@Autowired
	private BonificacionService bonificacionService;
	
	@PostMapping( path = "/bonificaciones")
    public Response<String> bonificaciones(@RequestBody BonificacionRequest request) {
        log.info("Request Service bonificaciones:{}", request);
        Response<String> response = bonificacionService.bonificaciones(request);
        log.info("Response Service bonificaciones:{}", response);
        return response;
    }
	
}
