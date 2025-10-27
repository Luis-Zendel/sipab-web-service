package mx.com.telcel.sipab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.dto.request.AplicacionPagosRequest;
import mx.com.telcel.sipab.dto.request.ReversionPagosRequest;
import mx.com.telcel.sipab.dto.response.HistorialPago;
import mx.com.telcel.sipab.response.Response;
import mx.com.telcel.sipab.services.AplicacionPagoService;
import mx.com.telcel.sipab.services.ReversionPagoService;

@Log4j2
@RestController
@RequestMapping("/pagos")
public class PagosController {
	
	@Autowired
	AplicacionPagoService aplicacionPagoService;
	@Autowired
	ReversionPagoService reversionPagoService;

	@PostMapping( path = "/aplicacionPagos")
    public Response<String> aplicacionPagos(@RequestBody AplicacionPagosRequest request) {
        log.info("Request Service aplicacionPagos:{}", request);
        Response<String> response = aplicacionPagoService.aplicacionPago(request);
        log.info("Response Service aplicacionPagos:{}", response);
        return response;
    }
	
	@GetMapping( path = "/historialPagos")
    public Response<List<HistorialPago>> historialPagos(@RequestParam Long cuenta) {
        log.info("Request Service historialPagos:{}", cuenta);
        Response<List<HistorialPago>> response = reversionPagoService.historialPagos(cuenta);
        log.info("Response Service historialPagos:{}", response);
        return response;
    }
	
	@PostMapping( path = "/reversionPagos")
    public Response<String> reversionPagos(@RequestBody ReversionPagosRequest request) {
        log.info("Request Service reversionPagos:{}", request);
        Response<String> response = reversionPagoService.reversionPago(request);
        log.info("Response Service reversionPagos:{}", response);
        return response;
    }
	
}
