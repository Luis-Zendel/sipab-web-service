package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.FormaPago;

@Repository
public interface FormaPagoRepository extends JpaRepository<FormaPago, Integer> {
	
	List<FormaPago> findAllByClaveNotIn(List<String> claves);
	
	FormaPago findByIdFormaPago(Integer idFormaPago);

}
