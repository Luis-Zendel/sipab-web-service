package mx.com.telcel.sipab.services;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.constant.Constantes;
import mx.com.telcel.sipab.constant.ErrorResponse;
import mx.com.telcel.sipab.constant.MessageResponse;
import mx.com.telcel.sipab.dto.request.CancelacionCfdiRequest;
import mx.com.telcel.sipab.dto.response.DetalleFactura;
import mx.com.telcel.sipab.models.CancelacionCfdi;
import mx.com.telcel.sipab.models.ClaveBatch;
import mx.com.telcel.sipab.models.ClaveSap;
import mx.com.telcel.sipab.models.DetalleSap;
import mx.com.telcel.sipab.models.Rfc;
import mx.com.telcel.sipab.models.TipoTramite;
import mx.com.telcel.sipab.models.Tramite;
import mx.com.telcel.sipab.models.TramiteDetalle;
import mx.com.telcel.sipab.repositories.CancelacionCfdiRepository;
import mx.com.telcel.sipab.response.Response;

@Log4j2
@Service
public class CancelacionCfdiService {
	
	@Autowired
	private CancelacionCfdiRepository repository;
	@Autowired
	private TipoTramiteService tipoTramiteService;
	@Autowired
	private SecuenciaService secuenciaService;
	@Autowired
	private ClaveBatchService claveBatchService;
	@Autowired
	private ClaveSapService claveSapService;
	@Autowired
	private TramiteService tramiteService;
	@Autowired
	private TramiteDetalleService tramiteDetalleService;
	@Autowired
	private DetalleSapService detalleSapService;
	@Autowired
	RfcService rfcService;
	
	public Response<String> cancelacionCfdi(CancelacionCfdiRequest request) {
		try {
			CancelacionCfdi tramiteActivo = repository.findActiveTramiteByUuid(request.getFactura().getUuid());
			if (tramiteActivo == null) {
				return new Response<String>(9002, ErrorResponse.RECORD_NOT_SAVE, "El folio " + tramiteActivo + " esta activo para el uuid: " + request.getFactura().getUuid());
			}
			TipoTramite tipoTramite = tipoTramiteService.findByPrefijo("CCF");
			Long secuencia = secuenciaService.findByIdCentroAndTramite(request.getIdCentro(), tipoTramite.getPrefijo()).getValor();
			String folio = request.getPrefijo() + "-" + tipoTramite.getPrefijo() + "-" + secuencia;
			Integer anio = Calendar.getInstance().get(Calendar.YEAR);
			Integer idEstatus = Constantes.ESTATUS_RV;
			Integer idFlujo = 0;
			if(request.getIdRegionUsuario() == 9){
				idFlujo = Constantes.ID_FLUJO_REFACTURACION_R09;
			}else{
				idFlujo = Constantes.ID_FLUJO_REFACTURACION_REGIONALES;
			}
			if(request.getGrupo().contains("CORPORATIVO") || request.getCentro().contains("CAE ")){
				idFlujo = Constantes.ID_FLUJO_CORPORATVO_R09;
				if(request.getIdRegionUsuario() != 9){
					idFlujo = Constantes.ID_FLUJO_CORPORATIVO_REGIONALES;
				}
			}
			Integer idEstatusComplemento = 28;
			Integer idEstatusCfdi = 28;
			List<Integer> idsTipotramite = Arrays.asList(7,8);
			List<ClaveBatch> clavesBatch = claveBatchService.findAllByIdRegionUsuarioAndIdRegionCuentaAndIdGrupoAndIdtipoTramiteNotInOrderByIdtipoTramiteAsc(request.getIdRegionUsuario(), 
					request.getIdRegionCuenta(), request.getIdGrupo(), idsTipotramite);
			Integer idClaveBatchEgr = clavesBatch.get(0).getIdClaveBatch();
			Integer idClaveBatchIng = clavesBatch.get(1).getIdClaveBatch();
			
			Tramite tramite = new Tramite(folio, anio, idEstatus, request.getNumeroEmpleado(), request.getIdRegionUsuario(), request.getIdCentro(), 
	        		idFlujo, request.getIdSoporte(), request.getSoporte(), request.getIdMotivo(), request.getMotivo(), request.getObservaciones(), new Date());
			tramiteService.save(tramite);
			long idTramiteDetalle = tramiteDetalleService.findMaxIdTramiteDetalle();
	        TramiteDetalle tramiteDetalle = new TramiteDetalle(idTramiteDetalle, folio, anio, tipoTramite.getIdTipoTramite(), request.getIdRegionCuenta(), 
	        		request.getCuenta(), secuencia, request.getTelefono(), request.getCliente(), request.getCiclo(), request.getFactura().getImporte(), 
	        		request.getFactura().getIva(), 
	        		request.getFactura().getTotal()/*request.getImporte()/1.16, request.getImporte()/1.16*0.16,*/);
	        tramiteDetalleService.save(tramiteDetalle);
	        idTramiteDetalle = tramiteDetalleService.findMaxIdTramiteDetalle(folio, anio);
	        CancelacionCfdi cancelacionCfdi = new CancelacionCfdi(folio, anio, idEstatusComplemento, idEstatusCfdi, idClaveBatchEgr, idClaveBatchIng,
	        		request.getFactura().getFechaExpedicion(), request.getFactura().getUuid(), request.getFactura().getEstatus(), request.getTipoCan(), 
	        		request.getImpresoraSap(), request.getFactura().getNumeroFactura());
	        repository.save(cancelacionCfdi);
	        for (DetalleFactura detalleFactura : request.getFactura().getDetallesFactura()) {
	        	for (ClaveSap claveSap : claveSapService.findAllByRegionAndTramite(9, "CFCR")) {
					if (claveSap.getDescripcion().contains(detalleFactura.getClave())) {
						detalleFactura.setClaveSap(claveSap.getClaveSap());
					}
				}
	        	DetalleSap detalleSap = new DetalleSap(idTramiteDetalle, detalleFactura.getClaveSap(), detalleFactura.getImporte(), 
	        			new Date());
	        	detalleSapService.save(detalleSap);
			}
	        String pais = "MX";
	        Rfc rfc = new Rfc(folio, anio, request.getInformacionFiscal().getCalle(), request.getInformacionFiscal().getColonia(), 
	        		request.getInformacionFiscal().getCodigoPostal(), request.getInformacionFiscal().getCiudad(), pais, 
	        		request.getInformacionFiscal().getRfc(), request.getInformacionFiscal().getNoExterior(), 
	        		request.getInformacionFiscal().getNoInterior(), request.getInformacionFiscal().getEstado(),
	        		request.getInformacionFiscal().getIdRegimenFiscal(), request.getInformacionFiscal().getIdUsoCfdi());
	        rfcService.save(rfc);
	        
	        return new Response<String>(MessageResponse.SUCCESS_SAVE, tramite.getFolio());
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			return new Response<String>(ErrorResponse.RECORD_NOT_SAVE, e.getMessage());
		}
    } 

}
