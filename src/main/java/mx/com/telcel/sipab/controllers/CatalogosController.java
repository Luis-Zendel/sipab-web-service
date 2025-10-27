package mx.com.telcel.sipab.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import mx.com.telcel.sipab.dto.response.DetalleOrden;
import mx.com.telcel.sipab.models.CentroCostos;
import mx.com.telcel.sipab.models.ClaveSap;
import mx.com.telcel.sipab.models.ClaveSector;
import mx.com.telcel.sipab.models.Concepto;
import mx.com.telcel.sipab.models.Distribuidor;
import mx.com.telcel.sipab.models.Estatus;
import mx.com.telcel.sipab.models.FormaPago;
import mx.com.telcel.sipab.models.Motivo;
import mx.com.telcel.sipab.models.OrigenPago;
import mx.com.telcel.sipab.models.RegimenFiscal;
import mx.com.telcel.sipab.models.Region;
import mx.com.telcel.sipab.models.Soporte;
import mx.com.telcel.sipab.models.TipoBonificacion;
import mx.com.telcel.sipab.models.TipoPago;
import mx.com.telcel.sipab.models.TipoTramite;
import mx.com.telcel.sipab.models.UsoCfdi;
import mx.com.telcel.sipab.response.Response;
import mx.com.telcel.sipab.services.BonificacionService;
import mx.com.telcel.sipab.services.CentroCostosService;
import mx.com.telcel.sipab.services.ClaveSapService;
import mx.com.telcel.sipab.services.ClaveSectorService;
import mx.com.telcel.sipab.services.ConceptoService;
import mx.com.telcel.sipab.services.DistribuidorService;
import mx.com.telcel.sipab.services.EstatusService;
import mx.com.telcel.sipab.services.FormaPagoService;
import mx.com.telcel.sipab.services.MotivoService;
import mx.com.telcel.sipab.services.OrigenPagoService;
import mx.com.telcel.sipab.services.RegimenFiscalService;
import mx.com.telcel.sipab.services.RegionService;
import mx.com.telcel.sipab.services.SoporteService;
import mx.com.telcel.sipab.services.TipoBonificacionService;
import mx.com.telcel.sipab.services.TipoPagoService;
import mx.com.telcel.sipab.services.TipoTramiteService;
import mx.com.telcel.sipab.services.UsoCfdiService;

@Log4j2
@RestController
@RequestMapping("/catalogos")
public class CatalogosController {
	
	@Autowired
	private TipoPagoService tipoPagoService;
	@Autowired
	private FormaPagoService formaPagoService;
	@Autowired
	private OrigenPagoService origenPagoService;
	@Autowired
	private SoporteService soporteService;
	@Autowired
	private MotivoService motivoService;
	@Autowired
	private DistribuidorService distribuidorService;
	@Autowired
	private RegimenFiscalService regimenFiscalService;
	@Autowired
	private UsoCfdiService usoCfdiService;
	@Autowired
	private TipoTramiteService tipoTramiteService;
	@Autowired
	private CentroCostosService centroCostosService;
	@Autowired
	private EstatusService estatusService;
	@Autowired
	private RegionService regionService;
	@Autowired
	private ConceptoService conceptoService;
	@Autowired
	private ClaveSapService claveSapService;
	@Autowired
	private ClaveSectorService claveSectorService;
	@Autowired
	private TipoBonificacionService tipoBonificacionService;
	@Autowired
	private BonificacionService bonificacionService;
	
	
	@GetMapping( path = "/tiposPago")
    public Response<List<TipoPago>> tipoPago() {
        log.info("Request Service tiposPago:{}");
        Response<List<TipoPago>> response = tipoPagoService.findAll();
        log.info("Response Service tiposPago:{}", response);
        return response;
    }
	
	@GetMapping( path = "/formasPago")
    public Response<List<FormaPago>> formaPago() {
        log.info("Request Service formasPago:{}");
		List<String> claves = Arrays.asList("VE","BA");
        Response<List<FormaPago>> response = formaPagoService.findAllByClaveNotIn(claves);
        log.info("Response Service formasPago:{}", response);
        return response;
    }
	
	@GetMapping( path = "/origenesPagoPorRegion")
    public Response<List<OrigenPago>> origenesPagoPorRegion(@RequestParam Integer idRegion) {
        log.info("Request Service origenesPagoPorRegion:{}", idRegion);
        Response<List<OrigenPago>> response = origenPagoService.findByIdRegionAndOrigen(idRegion, "SIPAB");
        log.info("Response Service origenesPagoPorRegion:{}", response);
        return response;
    }
	
	@GetMapping( path = "/soportes")
    public Response<List<Soporte>> soportes() {
        log.info("Request Service soportes:{}");
        Response<List<Soporte>> response = soporteService.findAll();
        log.info("Response Service soportes:{}", response);
        return response;
    }
	
	@GetMapping( path = "/motivosPorTipoTramite")
    public Response<List<Motivo>> motivosPorTipoTramite(@RequestParam Integer idTipotramite) {
        log.info("Request Service motivosPorTipoTramite:{}", idTipotramite);
        Response<List<Motivo>> response = motivoService.findAllByTipoTramiteAndEstatusAndDescSubMotivoIsNull(idTipotramite, "A");
        log.info("Response Service motivosPorTipoTramite:{}", response);
        return response;
    }
	
	@GetMapping( path = "/motivosPorTipoTramiteYRegion")
    public Response<List<Motivo>> motivosPorTipoTramiteYRegion(@RequestParam Integer idTipotramite, @RequestParam Integer idRegion){
        log.info("Request Service motivosPorTipoTramiteYRegion:{}", idRegion);
        Response<List<Motivo>> response = motivoService.findAllByTipoTramiteAndEstatusAndRegionAndDescSubMotivoIsNull(idTipotramite, "A", idRegion);
        log.info("Response Service motivosPorTipoTramiteYRegion:{}", response);
        return response;
    }
	
	@GetMapping( path = "/submotivosPorTipoTramite")
    public Response<List<Motivo>> submotivosPorTipoTramite(@RequestParam Integer idTipotramite) {
        log.info("Request Service submotivosPorTipoTramite:{}", idTipotramite);
        Response<List<Motivo>> response = motivoService.findAllByTipoTramiteAndEstatusAndDescSubMotivoIsNotNull(idTipotramite, "A");
        log.info("Response Service submotivosPorTipoTramite:{}", response);
        return response;
    }
	
	@GetMapping( path = "/submotivosPorTipoTramiteYRegion")
    public Response<List<Motivo>> submotivosPorTipoTramiteYRegion(@RequestParam Integer idTipotramite, @RequestParam Integer idRegion){
        log.info("Request Service submotivosPorTipoTramiteYRegion:{}", idRegion);
        Response<List<Motivo>> response = motivoService.findAllByTipoTramiteAndEstatusAndRegionAndDescSubMotivoIsNotNull(idTipotramite, "A", idRegion);
        log.info("Response Service submotivosPorTipoTramiteYRegion:{}", response);
        return response;
    }
	
	@GetMapping( path = "/distribuidoresPorRegion")
    public Response<List<Distribuidor>> distribuidoresPorRegion(@RequestParam Integer idRegion) {
        log.info("Request Service distribuidoresPorRegion:{}", idRegion);
        Response<List<Distribuidor>> response = distribuidorService.findAllByIdRegionAndEstatus(idRegion, "A");
        log.info("Response Service distribuidoresPorRegion:{}", response);
        return response;
    }
	
	@GetMapping( path = "/regimenesFiscales")
    public Response<List<RegimenFiscal>> regimenesFiscales(@RequestParam String rfc) {
        log.info("Request Service regimenesFiscales:{}", rfc);
        Response<List<RegimenFiscal>> response = regimenFiscalService.findAllByRfc(rfc);
        log.info("Response Service regimenesFiscales:{}", response);
        return response;
    }
	
	@GetMapping( path = "/usosCfdiPorRegimenFiscal")
    public Response<List<UsoCfdi>> usosCfdiPorRegimenFiscal(@RequestParam Integer idRegimenFiscal, @RequestParam String rfc) {
        log.info("Request Service usosCfdiPorRegimenFiscal:{}", idRegimenFiscal, rfc);
        Response<List<UsoCfdi>> response = usoCfdiService.findAllByRfcAndRegimenFiscal(rfc, idRegimenFiscal);
        log.info("Response Service usosCfdiPorRegimenFiscal:{}", response);
        return response;
    }
	
	@GetMapping( path = "/tiposTramite")
    public Response<List<TipoTramite>> tiposTramite() {
        log.info("Request Service tiposTramite:{}");
        Response<List<TipoTramite>> response = tipoTramiteService.findAllByEstatus("A");
        log.info("Response Service tiposTramite:{}", response);
        return response;
    }
	
	@GetMapping( path = "/centroCostosPorGerencia")
    public Response<List<CentroCostos>> centroCostosPorGerencia(@RequestParam Integer idGerencia) {
        log.info("Request Service centroCostosPorGerencia:{}", idGerencia);
        Response<List<CentroCostos>> response = centroCostosService.findAllByIdGerencia(idGerencia);
        log.info("Response Service centroCostosPorGerencia:{}", response);
        return response;
    }
	
	@GetMapping( path = "/estatusPorOrigen")
    public Response<List<Estatus>> estatusPorOrigen(@RequestParam String origen) {
        log.info("Request Service estatusPorOrigen:{}", origen);
        Response<List<Estatus>> response = estatusService.findAllByOrigen(origen);
        log.info("Response Service estatusPorOrigen:{}", response);
        return response;
    }
	
	@GetMapping( path = "/regiones")
    public Response<List<Region>> regiones() {
        log.info("Request Service regiones:{}");
        Response<List<Region>> response = regionService.findAll();
        log.info("Response Service regiones:{}", response);
        return response;
    }
	
	//Nota credito
	@GetMapping( path = "/conceptosPorTramite")
    public Response<List<Concepto>> conceptosPorTramite(@RequestParam String tramite) {
        log.info("Request Service conceptosPorTramite:{}", tramite);
        Response<List<Concepto>> response = conceptoService.findAllByTramite(tramite);
        log.info("Response Service conceptosPorTramite:{}", response);
        return response;
    }
	
	//Nota credito
	@GetMapping( path = "/conceptosPorTramiteYRegiones")
    public Response<List<Concepto>> conceptosPorTramiteYRegiones(@RequestParam String tramite, @RequestParam Integer regionCuenta, @RequestParam Integer regionUsuario) {
        log.info("Request Service conceptosPorTramiteYRegiones:{}", tramite, regionCuenta, regionUsuario);
        Response<List<Concepto>> response = conceptoService.findAllByTramiteAndRegiones(tramite, regionCuenta, regionUsuario);
        log.info("Response Service conceptosPorTramiteYRegiones:{}", response);
        return response;
    }
	
	//Nota fianza
	@GetMapping( path = "/conceptosTipoNota")
    public Response<List<Concepto>> conceptosTipoNota() {
        log.info("Request Service conceptosTipoNota:{}");
        Response<List<Concepto>> response = conceptoService.findAllByTipoNota();
        log.info("Response Service conceptosTipoNota:{}", response);
        return response;
    }
	
	//Nota fianza
	@GetMapping( path = "/conceptosFia")
    public Response<List<Concepto>> conceptosFia() {
        log.info("Request Service conceptosFia:{}");
        Response<List<Concepto>> response = conceptoService.findAllByFia();
        log.info("Response Service conceptosFia:{}", response);
        return response;
    }
	
	//Nota credito
	@GetMapping( path = "/clavesPorTramitePlataformaYSector")
    public Response<List<ClaveSap>> clavesPorTramitePlataformaYSector(@RequestParam String tramite, @RequestParam String plataforma, @RequestParam String cveSector) {
        log.info("Request Service clavesPorTramitePlataformaYSector:{}", tramite, plataforma, cveSector);
        Response<List<ClaveSap>> response = claveSapService.findAllByTramiteAndPlataformaAndSector(tramite, plataforma, cveSector + " -%");
        log.info("Response Service clavesPorTramitePlataformaYSector:{}", response);
        return response;
    }
	
	//Nota Cargo
	@GetMapping( path = "/clavesSector")
    public Response<List<ClaveSector>> clavesSector() {
        log.info("Request Service clavesSector:{}");
        Response<List<ClaveSector>> response = claveSectorService.clavesSector();
        log.info("Response Service clavesSector:{}", response);
        return response;
    }
	
	//Nota Cargo
	@GetMapping( path = "/clavesPorIdSector")
    public Response<List<ClaveSap>> clavesPorIdSector(@RequestParam Integer idSector) {
        log.info("Request Service clavesPorIdSector:{}", idSector);
        Response<List<ClaveSap>> response = claveSapService.findAllByIdSector(idSector);
        log.info("Response Service clavesPorIdSector:{}", response);
        return response;
    }
	
	//Bonificacion
	@GetMapping( path = "/tiposBonificacion")
    public Response<List<TipoBonificacion>> tiposBonificacion() {
        log.info("Request Service tiposBonificacion:{}");
        Response<List<TipoBonificacion>> response = tipoBonificacionService.findAll();
        log.info("Response Service tiposBonificacion:{}", response);
        return response;
    }
	
	//Bonificacion
	@GetMapping( path = "/conceptosPorOrden")
    public Response<List<DetalleOrden>> conceptosPorOrden(@RequestParam String orden) {
        log.info("Request Service conceptosPorOrden:{}");
        Response<List<DetalleOrden>> response = bonificacionService.conceptosPorOrden(orden);
        log.info("Response Service conceptosPorOrden:{}", response);
        return response;
    }
	
	
	/*
	 * Ajustes 
	 * Tipos ajuste credito
	 * Tipos debito
	 * Ajuste credito automatico numero de meses y dias de aplicacion
	 * Centro costos por region, corporativos y empresariales
	 */
}
