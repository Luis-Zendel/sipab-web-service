package mx.com.telcel.sipab.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.client.ldap.BuscaEmpleadoResponse;
import mx.com.telcel.sipab.constant.ErrorResponse;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.Usuario;
import mx.com.telcel.sipab.repositories.UsuarioRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	@Autowired
	private LdapClientService ldapClientService;
	
	public List<Usuario> findAll() {
		return repository.findAll();
	}
	
	public Response<List<Usuario>> findAllByKeyword(String keyWord) {
		try {
			return new Response<List<Usuario>>(MessageResponse.SUCCESS_RETRIEVE, 
					repository.findAllByKeyword(
							keyWord.split(" ")[0], 
								keyWord.split(" ").length > 1 ? keyWord.split(" ")[1] : keyWord.split(" ")[0],
										keyWord.split(" ").length > 2 ? keyWord.split(" ")[2] : keyWord.split(" ")[0],
												keyWord.split(" ").length > 3 ? keyWord.split(" ")[3] : keyWord.split(" ")[0]
							));
		} catch (Exception e) {
			log.error(e.getMessage());
			return new Response<List<Usuario>>(ErrorResponse.RECORDS_NOT_FOUND, null);
		}
	}
	
	public Response<Usuario> findByNumeroEmpleado(String numeroEmpleado) {
		return new Response<Usuario>(MessageResponse.SUCCESS_RETRIEVE, repository.findByNumeroEmpleado(numeroEmpleado));
	}
	
	public Response<Usuario> consultaLdap(String numeroEmpleado) {
		BuscaEmpleadoResponse buscaEmpleadoResponse = ldapClientService.buscaEmpleado("00410102005", "51PAB315", numeroEmpleado);
		Usuario usuario = new Usuario();
		
		String[] tokens = buscaEmpleadoResponse.getBuscaEmpleadoReturn().split("\\|", -1);
		List <String> sldap = new ArrayList<String>();
		for(String st : tokens){
			sldap.add(st);
		}
		switch(Integer.valueOf(sldap.get(0))){
		case -4:
			log.info("Permiso denegado");
			break;
		case -3:
			log.info("Error al validar permisos de uso");
			break;
		case -2:
			log.info("Error de conexión");
			break;
		case -1:
			log.info("Error de ejecución");
			break;
		case 0:
			for(String s : sldap){
				log.info(s);
			}
			usuario.setNombre(sldap.get(3)+" "+sldap.get(4)+" "+sldap.get(5));
//			usuario.setIdRegion();
			usuario.setCveUsuario(sldap.get(20));
			usuario.setCorreo(sldap.get(19));
			usuario.setNumeroEmpleado(numeroEmpleado);
			break;
		case 1:
			log.info("Usuario no registrado en LDAP");
			break;	
		case 2:
			log.info("No se encontró la información del usuario solicitado");
			break;	
		default:
			log.info("Error, no se obtuvo ningun resultado");
			break;
		}
		return new Response<Usuario>(MessageResponse.SUCCESS_RETRIEVE, usuario);
	}
	
	public Response<Boolean> save(Usuario usuario) {
		try {
			repository.save(usuario);
			return new Response<Boolean>(MessageResponse.SUCCESS_SAVE, true);
		} catch (Exception e) {
			log.error(e.getMessage());
			return new Response<Boolean>(ErrorResponse.RECORD_NOT_SAVE, false);
		}
	}
	
	public Response<Boolean> deleteById(String numeroEmpleado) {
		try{
            repository.deleteById(numeroEmpleado);
            return new Response<Boolean>(MessageResponse.SUCCESS_DELETE, true);
        }catch(Exception err){
        	return new Response<Boolean>(ErrorResponse.RECORD_NOT_DELETE, false);
        }
	}
}
