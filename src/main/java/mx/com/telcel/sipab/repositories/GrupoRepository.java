package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.telcel.sipab.models.Grupo;

public interface GrupoRepository extends JpaRepository<Grupo, Integer> {

	Grupo findByIdGrupo(Integer idGrupo);
	
}
