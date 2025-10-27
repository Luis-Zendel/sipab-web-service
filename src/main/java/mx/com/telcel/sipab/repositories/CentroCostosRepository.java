package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.constant.QueryConstant;
import mx.com.telcel.sipab.models.CentroCostos;

@Repository
public interface CentroCostosRepository extends JpaRepository<CentroCostos, Integer> {

	@Query(value = QueryConstant.CENTRO_COSTOS_POR_GERENCIA, nativeQuery = true)
	List<CentroCostos> findAllByIdGerencia(@Param("idGerencia") Integer idGerencia);
	
}
