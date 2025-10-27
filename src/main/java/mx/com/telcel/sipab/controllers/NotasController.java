package mx.com.telcel.sipab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.dto.request.NotasRequest;
import mx.com.telcel.sipab.response.Response;
import mx.com.telcel.sipab.services.NotaCargoService;
import mx.com.telcel.sipab.services.NotaCreditoFianzaService;
import mx.com.telcel.sipab.services.NotaCreditoService;

@Log4j2
@RestController
@RequestMapping("/notas")
public class NotasController {

	@Autowired
	private NotaCreditoService notaCreditoService;
	@Autowired
	private NotaCargoService notaCargoService;
	@Autowired
	private NotaCreditoFianzaService notaCreditoFianzaService;;
	
	@PostMapping( path = "/notaCredito")
    public Response<String> notaCredito(@RequestBody NotasRequest request) {
        log.info("Request Service notaCredito:{}", request);
        Response<String> response = notaCreditoService.notaCredito(request);
        log.info("Response Service notaCredito:{}", response);
        return response;
    }
	
	@PostMapping( path = "/notaCargo")
    public Response<String> notaCargo(@RequestBody NotasRequest request) {
        log.info("Request Service notaCargo:{}", request);
        Response<String> response = notaCargoService.notaCargo(request);
        log.info("Response Service notaCargo:{}", response);
        return response;
    }
	
	@PostMapping( path = "/notaCreditoFianza")
    public Response<String> notaCreditoFianza(@RequestBody NotasRequest request) {
        log.info("Request Service notaCreditoFianza:{}", request);
        Response<String> response = notaCreditoFianzaService.notaCreditoFianza(request);
        log.info("Response Service notaCreditoFianza:{}", response);
        return response;
    }
	
}
