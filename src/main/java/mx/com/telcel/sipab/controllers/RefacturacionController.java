package mx.com.telcel.sipab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.dto.request.CancelacionCfdiRequest;
import mx.com.telcel.sipab.response.Response;
import mx.com.telcel.sipab.services.CancelacionCfdiService;

@Log4j2
@RestController
@RequestMapping("/refacturacion")
public class RefacturacionController {
	
	@Autowired
	private CancelacionCfdiService cancelacionCfdiService;
	
	@PostMapping( path = "/cancelacionCfdi")
    public Response<String> cancelacionCfdi(@RequestBody CancelacionCfdiRequest request) {
        log.info("Request Service cancelacionCfdi:{}", request);
        Response<String> response = cancelacionCfdiService.cancelacionCfdi(request);
        log.info("Response Service cancelacionCfdi:{}", response);
        return response;
    }
	
}
