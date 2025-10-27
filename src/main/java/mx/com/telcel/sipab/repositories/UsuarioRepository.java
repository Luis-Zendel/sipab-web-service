package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.constant.QueryConstant;
import mx.com.telcel.sipab.models.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,String> {
	
	List<Usuario> findAll();

	Usuario findByNumeroEmpleado(String numeroEmpleado);
	
	@Query(value = QueryConstant.BUSCA_USUARIO,	nativeQuery = true)
	List<Usuario> findAllByKeyword(@Param("clave1") String clave1, @Param("clave2") String clave2, @Param("clave3") String clave3, @Param("clave4") String clave4);
}
