package mx.com.telcel.sipab.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.telcel.sipab.models.ClaveBatch;

@Repository
public interface ClaveBatchRepository extends JpaRepository<ClaveBatch, Integer> {

	List<ClaveBatch> findAllByIdRegionUsuarioAndIdRegionCuentaAndIdGrupoAndIdtipoTramiteNotInOrderByIdtipoTramiteAsc(Integer idRegionUsuario, Integer idRegionCuenta, Integer idGrupo, List<Integer> idstipoTramite);
	
}
