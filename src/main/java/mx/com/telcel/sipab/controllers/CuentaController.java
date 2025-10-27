package mx.com.telcel.sipab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.dto.response.InformacionCuenta;
import mx.com.telcel.sipab.response.Response;
import mx.com.telcel.sipab.services.CuentaService;

@Log4j2
@RestController
@RequestMapping("/cuenta")
public class CuentaController {
	
	@Autowired
	private CuentaService cuentaService;
	
	@GetMapping( path = "/datos")
    public Response<InformacionCuenta> datos(@RequestParam String cuenta) {
        log.info("Request Service datos:{}", cuenta);
        Response<InformacionCuenta> response = cuentaService.datos(cuenta);
        log.info("Response Service datos:{}", response);
        return response;
    }

}
