package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.constant.QueryConstant;
import mx.com.telcel.sipab.models.UsoCfdi;

@Repository
public interface UsoCfdiRepository extends JpaRepository<UsoCfdi, Integer> {

	@Query(value = QueryConstant.USO_CFDI_POR_REGIMEN, nativeQuery = true)
	List<UsoCfdi> findAllByRegimenFiscalAndFisicaAndMoral(@Param("idRegimen") Integer idRegimen, @Param("fisica") String fisica, @Param("moral") String moral);
	
	UsoCfdi findByUsoCfdi(String usoCfdi);
	
}
