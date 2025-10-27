package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.Motivo;

@Repository
public interface MotivoRepository extends JpaRepository<Motivo, Integer> {
	
	List<Motivo> findAllByTipoTramiteAndEstatusAndDescSubMotivoIsNull(Integer tipoTramite, String estatus);

	List<Motivo> findAllByTipoTramiteAndEstatusAndRegionAndDescSubMotivoIsNull(Integer tipoTramite, String estatus, Integer region);
	
	List<Motivo> findAllByTipoTramiteAndEstatusAndDescSubMotivoIsNotNull(Integer tipoTramite, String estatus);

	List<Motivo> findAllByTipoTramiteAndEstatusAndRegionAndDescSubMotivoIsNotNull(Integer tipoTramite, String estatus, Integer region);
	
}
