package mx.com.telcel.sipab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.models.Motivo;
import mx.com.telcel.sipab.repositories.MotivoRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class MotivoService {

	@Autowired
	private MotivoRepository repository;
	
	public Response<List<Motivo>> findAllByTipoTramiteAndEstatusAndDescSubMotivoIsNull(Integer tipoTramite, String estatus) {
		return new Response<List<Motivo>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByTipoTramiteAndEstatusAndDescSubMotivoIsNull(tipoTramite, estatus));
	}
	
	public Response<List<Motivo>> findAllByTipoTramiteAndEstatusAndRegionAndDescSubMotivoIsNull(Integer tipoTramite, String estatus, Integer region) {
		return new Response<List<Motivo>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByTipoTramiteAndEstatusAndRegionAndDescSubMotivoIsNull(tipoTramite, estatus, region));
	}
	
	public Response<List<Motivo>> findAllByTipoTramiteAndEstatusAndDescSubMotivoIsNotNull(Integer tipoTramite, String estatus) {
		return new Response<List<Motivo>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByTipoTramiteAndEstatusAndDescSubMotivoIsNotNull(tipoTramite, estatus));
	}
	
	public Response<List<Motivo>> findAllByTipoTramiteAndEstatusAndRegionAndDescSubMotivoIsNotNull(Integer tipoTramite, String estatus, Integer region) {
		return new Response<List<Motivo>>(MessageResponse.SUCCESS_RETRIEVE, repository.findAllByTipoTramiteAndEstatusAndRegionAndDescSubMotivoIsNotNull(tipoTramite, estatus, region));
	}
}
