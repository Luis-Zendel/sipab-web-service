package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.OrigenPago;

@Repository
public interface OrigenPagoRepository extends JpaRepository<OrigenPago, Integer> {

	List<OrigenPago> findByIdRegionAndOrigen(Integer idRegion, String origen);
	
	OrigenPago findByIdOrigenPago(Integer idOrigen);
	
	OrigenPago findByOrigenCorto(String origenCorto);
	
}
