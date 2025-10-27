package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.LlaveTramite;
import mx.com.telcel.sipab.models.Rfc;

@Repository
public interface RfcRepository extends JpaRepository<Rfc, LlaveTramite> {

}
