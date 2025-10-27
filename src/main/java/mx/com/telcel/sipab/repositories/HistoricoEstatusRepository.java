package mx.com.telcel.sipab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.telcel.sipab.models.HistoricoEstatus;

public interface HistoricoEstatusRepository extends JpaRepository<HistoricoEstatus, Integer> {
	
	Object findByFolioAndAnio(String folio, Integer anio);

}
