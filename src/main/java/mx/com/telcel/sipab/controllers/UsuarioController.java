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
import mx.com.telcel.sipab.models.Usuario;
import mx.com.telcel.sipab.response.Response;
import mx.com.telcel.sipab.services.UsuarioService;

@Log4j2
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
    private UsuarioService usuarioService;

//    @GetMapping( path = "/todosLosUsuarios")
//    public List<Usuario> obtenerUsuarios(){
//        return usuarioService.findAll();
//    }
    
    @GetMapping( path = "/buscar")
    public Response<List<Usuario>> buscar(@RequestParam String palabraClave) {
        log.info("Request Service buscar:{}", palabraClave);
        Response<List<Usuario>> response = usuarioService.findAllByKeyword(palabraClave);
        log.info("Response Service buscar:{}", response);
        return response;
    }
    
    @GetMapping( path = "/consulta")
    public Response<Usuario> consulta(@RequestParam String numeroEmpleado) {
    	log.info("Request Service consulta:{}", numeroEmpleado);
    	Response<Usuario> response = usuarioService.findByNumeroEmpleado(numeroEmpleado);
    	log.info("Response Service consulta:{}", response);
    	return response;
    }
    
    @GetMapping( path = "/consultaLdap")
    public Response<Usuario> consultaLdap(@RequestParam String numeroEmpleado) {
    	log.info("Request Service consultaLdap:{}", numeroEmpleado);
    	Response<Usuario> response = usuarioService.consultaLdap(numeroEmpleado);
    	log.info("Response Service consultaLdap:{}", response);
    	return response;
    }

    @PostMapping( path = "/guardar")
    public Response<Boolean> guardar(@RequestBody Usuario usuario) {
    	log.info("Request Service guardar:{}", usuario);
    	Response<Boolean> response = usuarioService.save(usuario);
    	log.info("Response Service guardar:{}", response);
        return response;
    }

//    @DeleteMapping( path = "/eliminar")
//    public Response<Boolean> eliminar(@RequestParam String numeroEmpleado){
//    	log.info("Request Service eliminar:{}", numeroEmpleado);
//    	Response<Boolean> response = usuarioService.deleteById(numeroEmpleado);
//    	log.info("Response Service eliminar:{}", response);
//        return response;
//    }
}
