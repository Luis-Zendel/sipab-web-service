package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.TipoBonificacion;

@Repository
public interface TipoBonificacionRepository extends JpaRepository<TipoBonificacion,Integer> {

}
