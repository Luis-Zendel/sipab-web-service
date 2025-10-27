package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.LlaveNotas;
import mx.com.telcel.sipab.models.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, LlaveNotas> {

}
