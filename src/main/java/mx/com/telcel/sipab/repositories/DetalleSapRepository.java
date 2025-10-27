package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.DetalleSap;
import mx.com.telcel.sipab.models.LlaveDetalleSap;

@Repository
public interface DetalleSapRepository extends JpaRepository<DetalleSap, LlaveDetalleSap> {

}
