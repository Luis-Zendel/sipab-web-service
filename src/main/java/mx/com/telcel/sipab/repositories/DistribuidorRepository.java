package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.Distribuidor;

@Repository
public interface DistribuidorRepository extends JpaRepository<Distribuidor, Integer> {

	List<Distribuidor> findAllByIdRegionAndEstatus(Integer idRegion, String estatus);
	
}
