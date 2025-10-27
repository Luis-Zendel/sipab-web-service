package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.TipoTramite;

@Repository
public interface TipoTramiteRepository extends JpaRepository<TipoTramite, Integer> {

	List<TipoTramite> findAllByEstatus(String estatus);
	
	TipoTramite findByPrefijo(String prefijo);
	
}
