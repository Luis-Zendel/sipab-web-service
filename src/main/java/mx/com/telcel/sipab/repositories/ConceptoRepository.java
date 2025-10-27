package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.constant.QueryConstant;
import mx.com.telcel.sipab.models.Concepto;

@Repository
public interface ConceptoRepository extends JpaRepository<Concepto, Integer> {

	List<Concepto> findAllByTramiteAndPlataformaAndEstatusAndDescripcionNotLikeOrderByDescripcionAsc(String tramite, String plataforma, String estatus, String descripcion);
	
	@Query(value = QueryConstant.CONCEPTOS_POR_TRAMITE, nativeQuery = true)
	List<Concepto> findAllByTramite(@Param("tramite") String tramite);
	
	@Query(value = QueryConstant.CONCEPTOS_POR_TRAMITE_Y_REGIONES, nativeQuery = true)
	List<Concepto> findAllByTramiteAndRegiones(@Param("tramite") String tramite, @Param("regionCuenta") Integer regionCuenta, @Param("regionUsuario") Integer regionUsuario);
	
	@Query(value = QueryConstant.CONCEPTOS_TIPO_NOTA, nativeQuery = true)
	List<Concepto> findAllByTipoNota();
	
	@Query(value = QueryConstant.CONCEPTOS_FIA, nativeQuery = true)
	List<Concepto> findAllByFia();
	
}
