package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.Bonificacion;

@Repository
public interface BonificacionRepository extends JpaRepository<Bonificacion, Long> {

}
