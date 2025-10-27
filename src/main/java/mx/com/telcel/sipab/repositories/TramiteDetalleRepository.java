package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.constant.QueryConstant;
import mx.com.telcel.sipab.models.TramiteDetalle;

@Repository
public interface TramiteDetalleRepository extends JpaRepository<TramiteDetalle, Long> {

	@Query(value = QueryConstant.MAX_ID_DETALLE_TRAMITE, nativeQuery = true)
	long findMaxIdTramiteDetalle();
	
	@Query(value = QueryConstant.MAX_ID_DETALLE_TRAMITE_POR_FOLIO, nativeQuery = true)
	long findMaxIdTramiteDetalle(@Param("folio") String folio, @Param("anio") Integer anio);
	
}
