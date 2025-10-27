package mx.com.telcel.sipab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.dto.request.DetalleFacturaRequest;
import mx.com.telcel.sipab.dto.request.FechasFacturaRequest;
import mx.com.telcel.sipab.dto.response.Factura;
import mx.com.telcel.sipab.response.Response;
import mx.com.telcel.sipab.services.FacturaService;

@Log4j2
@RestController
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	private FacturaService facturaService;
	
	@PostMapping( path = "/consultaFechas")
    public Response<List<Factura>> consultaFechas(@RequestBody FechasFacturaRequest request) {
        log.info("Request Service consultaFechas:{}", request);
        Response<List<Factura>> response = facturaService.consultaFechas(request);
        log.info("Response Service consultaFechas:{}", response);
        return response;
    }
	
	@PostMapping( path = "/detalle")
    public Response<Factura> detalle(@RequestBody DetalleFacturaRequest request) {
        log.info("Request Service detalle:{}", request);
        Response<Factura> response = facturaService.detalle(request);
        log.info("Response Service detalle:{}", response);
        return response;
    }
}
