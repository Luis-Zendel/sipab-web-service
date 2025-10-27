package mx.com.telcel.sipab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.dto.request.AjusteRequest;
import mx.com.telcel.sipab.dto.request.BonificacionRequest;
import mx.com.telcel.sipab.response.Response;
import mx.com.telcel.sipab.services.BonificacionService;

@Log4j2
@RestController
@RequestMapping("/ajustes")
public class AjustesController {
	
	@Autowired
	private BonificacionService bonificacionService;
	
//	@PostMapping( path = "/ajusteCredito")
//    public Response<String> ajusteCredito(@RequestBody AjusteRequest request) {
//        log.info("Request Service ajusteCredito:{}", request);
//        Response<String> response = bonificacionService.bonificaciones(request);
//        log.info("Response Service ajusteCredito:{}", response);
//        return response;
//	}

}
