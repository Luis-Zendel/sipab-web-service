package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.models.ClaveBatch;
import mx.com.telcel.sipab.repositories.ClaveBatchRepository;

@Log4j2
@Service
public class ClaveBatchService {

	@Autowired
	private ClaveBatchRepository repository;
	
	public List<ClaveBatch> findAllByIdRegionUsuarioAndIdRegionCuentaAndIdGrupoAndIdtipoTramiteNotInOrderByIdtipoTramiteAsc(Integer idRegionUsuario, Integer idRegionCuenta, Integer idGrupo, List<Integer> idstipoTramite) {
		return repository.findAllByIdRegionUsuarioAndIdRegionCuentaAndIdGrupoAndIdtipoTramiteNotInOrderByIdtipoTramiteAsc(idRegionUsuario, idRegionCuenta, idGrupo, idstipoTramite);
	}
	
}
