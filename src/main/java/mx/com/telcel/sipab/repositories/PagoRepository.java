package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {

}
