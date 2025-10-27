package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.constant.QueryConstant;
import mx.com.telcel.sipab.models.ClaveSap;

@Repository
public interface ClaveSapRepository extends JpaRepository<ClaveSap, Integer> {

	@Query(value = QueryConstant.CLAVES_SAP, nativeQuery = true)
	List<ClaveSap> findAllByRegionAndTramite(@Param("idRegion") Integer idRegion, @Param("tramite") String tramite);
	
	@Query(value = QueryConstant.CLAVES_SAP_SINVALIDACION, nativeQuery = true)
	List<ClaveSap> findAllByTramiteAndPlataformaAndSector(@Param("tramite") String tramite, @Param("plataforma") String plataforma, @Param("sector") String sector);
	
	
	@Query(value = QueryConstant.CLAVES_SAP_POR_SECTOR, nativeQuery = true)
	List<ClaveSap> findAllByIdSector(@Param("idSector") Integer idSector);
	
}
