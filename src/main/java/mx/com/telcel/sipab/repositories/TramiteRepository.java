package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.LlaveTramite;
import mx.com.telcel.sipab.models.Tramite;

@Repository
public interface TramiteRepository extends JpaRepository<Tramite, LlaveTramite> {

}
