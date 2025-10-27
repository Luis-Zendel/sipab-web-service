package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.Secuencia;

@Repository
public interface SecuenciaRepository extends JpaRepository<Secuencia, Integer> {

	Secuencia findByIdCentroAndTramite(Integer idCentro, String tramite);
}
