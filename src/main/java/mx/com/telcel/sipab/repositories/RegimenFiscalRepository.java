package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.RegimenFiscal;

@Repository
public interface RegimenFiscalRepository extends JpaRepository<RegimenFiscal, Integer> {
	
	List<RegimenFiscal> findAllByFisicaAndMoral(String fisica, String moral);
	
	RegimenFiscal findByRegimenFiscal(String regimenFiscal);
	
}
