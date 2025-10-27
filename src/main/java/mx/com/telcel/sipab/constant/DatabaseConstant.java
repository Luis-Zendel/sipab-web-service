package mx.com.telcel.sipab.constant;

public class DatabaseConstant {

	public static final String TB_TRAMITES_TABLE = "SIPAB4_TRAMITES";
    public static final String TB_TRAMITES_FOLIO = "FOLIO";
    public static final String TB_TRAMITES_ANIO = "ANIO";
    public static final String TB_TRAMITES_ESTATUS_ID = "ID_ESTATUS";
    public static final String TB_TRAMITES_REGION_ID = "ID_REGION";
    public static final String TB_TRAMITES_FLUJO_ID = "ID_FLUJO";
    public static final String TB_TRAMITES_CENTRO_ID = "id_centro";
    public static final String TB_TRAMITES_MOTIVO_ID = "id_motivo";
    public static final String TB_TRAMITES_FOLIO_IMPRESION_ID = "id_folio_impresion";
    public static final String TB_TRAMITES_SOPORTE_ID = "id_soporte";
    public static final String TB_TRAMITES_NUMERO_EMPLEADO = "numero_empleado";
    public static final String TB_TRAMITES_FECHA_CREACION = "fecha_creacion";
    public static final String TB_TRAMITES_CORREO = "correo";
    public static final String TB_TRAMITES_MOTIVO = "motivo";
    public static final String TB_TRAMITES_SOPORTE = "soporte";
    public static final String TB_TRAMITES_COMBINADO = "combinado";
    public static final String TB_TRAMITES_USUARIO_BATCH = "usuario_batch";
    public static final String TB_TRAMITES_TRAMITE_MULTIPLE = "tramite_multiple";
    public static final String TB_TRAMITES_OSERVACIONES = "observaciones";
    public static final String TB_TRAMITES_MOTIVO_RECHAZO_CANCELACION = "motivo_rechazo_cancelacion";
    public static final String TB_TRAMITES_FECHA_PAGO = "fecha_pago";
    public static final String TB_TRAMITES_CVE_CAJERO_AU = "cve_cajero_au";
    public static final String TB_TRAMITES_CENTRO_PAGO = "centro_pago";

    public static final String TB_DETALLE_PAGO = "SIPAB4_PAGOS";
    public static final String TB_DETALLE_PAGO_ID_DETALLE_TRAMITE = "id_detalle_tramite";
    public static final String TB_DETALLE_PAGO_FORMA_PAGO = "forma_pago";
    public static final String TB_DETALLE_PAGO_FECHA_PAGO = "fecha_pago";
    public static final String TB_DETALLE_PAGO_ORIGEN_LARGO = "origen_largo";
    public static final String TB_DETALLE_PAGO_ORIGEN_CORTO = "origen_corto";
    public static final String TB_DETALLE_PAGO_ESTATUS_PAGO = "estatus_pago";
    public static final String TB_DETALLE_PAGO_SEC_PAGO = "sec_pago";
    public static final String TB_DETALLE_PAGO_LOTE_PAGO = "lote_pago";
    public static final String TB_DETALLE_PAGO_NUM_REG_BATCH = "num_reg_batch";
    public static final String TB_DETALLE_PAGO_TIPO_PAGO= "tipo_pago";
    public static final String TB_DETALLE_PAGO_EXT_TRANS_ID= "ext_trans_id";

    public static final String TB_APLICACION_PAGOS = "SIPAB4_APLICACION_PAGOS";

    public static final String TB_APLICACION_PAGOS_ID_APLICACION = "ID_APLICACION_PAGO";
    public static final String TB_APLICACION_PAGOS_ID_TIPO_PAGO = "ID_TIPO_PAGO";
    public static final String TB_APLICACION_PAGOS_ID_FORMA_PAGO = "ID_FORMA_PAGO";
    public static final String TB_APLICACION_PAGOS_ID_ORIGEN_PAGOS = "ID_ORIGEN_PAGOS";
    public static final String TB_APLICACION_PAGOS_FECHA_APLICACION = "FECHA_APLICACION";
    public static final String TB_APLICACION_PAGOS_IMPORTE = "IMPORTE";
    public static final String TB_APLICACION_PAGOS_ID_SOPORTE = "ID_SOPORTE";
    public static final String TB_APLICACION_PAGOS_DOCUMENTO = "DOCUMENTO";
    public static final String TB_APLICACION_PAGOS_ID_MOTIVO = "ID_MOTIVO";
    public static final String TB_APLICACION_PAGOS_OBSERVACIONES = "OBSERVACIONES";
    public static final String TB_APLICACION_PAGOS_CORREO = "CORREO";

    public static final String TB_TIPO_PAGO = "SIPAB4_TIPO_PAGO";
    public static final String TB_TIPO_PAGO_ID_TIPO = "ID_TIPO_PAGO";
    public static final String TB_TIPO_PAGO_CLAVE_PAGO = "CLAVE_PAGO";
    public static final String TB_TIPO_PAGO_DESCRIPCION = "DESCRIPCION_PAGO";

    public static final String TB_FORMA_PAGO = "SIPAB4_FORMAS_PAGO";
    public static final String TB_FORMA_PAGO_ID_FORMA = "ID_FORMA_PAGO";
    public static final String TB_FORMA_PAGO_CVE_FORMA_PAGO = "CVE_FORMA_PAGO";
    public static final String TB_FORMA_PAGO_DESCRIPCION = "DESC_FORMA_PAGO";

    public static final String TB_ORIGENES_PAGO = "SIPAB4_ORIGENES_PAGO";
    public static final String TB_ORIGENES_PAGO_ID_ORIGEN = "ID_ORIGEN_PAGOS";
    public static final String TB_ORIGENES_PAGO_ID_REGION = "ID_REGION";
    public static final String TB_ORIGENES_PAGO_ORIGEN = "ORIGEN";
    public static final String TB_ORIGENES_PAGO_DESCRIPCION = "DESC_ORIGEN";
    public static final String TB_ORIGENES_PAGO_ORIGEN_CORTO = "ORIGEN_CORTO";
    public static final String TB_ORIGENES_PAGO_ORIGEN_LARGO = "ORIGEN_LARGO";
    public static final String TB_ORIGENES_PAGO_NUMERO_EMPLEADO = "NUMERO_EMPLEADO";

    public static final String TB_SOPORTE = "SIPAB4_SOPORTE";
    public static final String TB_SOPORTE_ID = "ID_SOPORTE";
    public static final String TB_SOPORTE_DESCRIPCION = "DESC_SOPORTE";
    
    public static final String TB_REGION = "SIPAB4_REGIONES";
    public static final String TB_REGION_ID = "ID_REGION";
    public static final String TB_REGION_DESCRIPCION = "DESC_REGION";

    public static final String TB_MOTIVOS = "SIPAB4_MOTIVOS";
    public static final String TB_MOTIVOS_ID = "ID_MOTIVO";
    public static final String TB_MOTIVOS_ID_REG = "ID_REG";
    public static final String TB_MOTIVOS_ID_SUMOTIVO = "ID_SUBMOTIVO";
    public static final String TB_MOTIVOS_DESC_MOTIVO = "DESC_MOTIVO";
    public static final String TB_MOTIVOS_DESC_SUBM = "DESC_SUBMOTIVO";
    public static final String TB_MOTIVOS_ESTATUS = "ESTATUS";
    public static final String TB_MOTIVOS_TIPO_TRAMITE = "ID_TIPO_TRAMITE";
    public static final String TB_MOTIVOS_ID_REGION = "ID_REGION";

    public static final String TB_REVERSION_PAGOS = "SIPAB4_REVERSION_PAGOS";
    public static final String TB_REVERSION_PAGOS_ID = "ID_REVERSION_PAGO";
    public static final String TB_REVERSION_PAGOS_ID_SOPORTE = "ID_SOPORTE";
    public static final String TB_REVERSION_PAGOS_DOCUMENTO = "DOCUMENTO";
    public static final String TB_REVERSION_PAGOS_ID_MOTIVO = "ID_MOTIVO";
    public static final String TB_REVERSION_PAGOS_OBSERVACIONES = "OBSERVACIONES";
    public static final String TB_REVERSION_PAGOS_CORREO = "CORREO";
    public static final String TB_REVERSION_PAGOS_ID_PAGOS_REVERSION = "ID_PAGOS_REVERSION";


    public static final String TB_NOTAS_CREDITO = "SIPAB4_NOTAS_CREDITO";
    public static final String TB_NOTAS_CREDITO_ID = "ID_NOTA_CREDITO";
    public static final String TB_NOTAS_CREDITO_CARGO = "CARGO";
    public static final String TB_NOTAS_CREDITO_ID_SOPORTE = "ID_SOPORTE";
    public static final String TB_NOTAS_CREDITO_DOCUMENTO = "DOCUMENTO";
    public static final String TB_NOTAS_CREDITO_ID_MOTIVO = "ID_MOTIVO";
    public static final String TB_NOTAS_CREDITO_ID_SUBMOTIVO = "ID_SUBMOTIVO";
    public static final String TB_NOTAS_CREDITO_OBSERVACIONES = "OBSERVACIONES";


    public static final String TB_NOTAS_PAGO = "SIPAB4_NOTAS_CARGO";
    public static final String TB_NOTAS_PAGO_ID = "ID_NOTA_CARGO";
    public static final String TB_NOTAS_PAGO_CARGO = "CARGO";
    public static final String TB_NOTAS_PAGO_COMPROBANTE = "COMPROBANTE_FISCAL";
    public static final String TB_NOTAS_PAGO_ID_SOPORTE = "ID_SOPORTE";
    public static final String TB_NOTAS_PAGO_DOCUMENTO = "DOCUMENTO";
    public static final String TB_NOTAS_PAGO_ID_MOTIVO = "ID_MOTIVO";
    public static final String TB_NOTAS_PAGO_OBSERVACIONES = "OBSERVACIONES";

    public static final String TB_NOTAS_CREDITO_FIANZA = "SIPAB4_NOTAS_CREDITO_FIANZA";
    public static final String TB_NOTAS_CREDITO_FIANZA_ID = "ID_NOTA_CREDITO_FIAN";
    public static final String TB_NOTAS_CREDITO_FIANZA_TIPO_NOTA = "TIPO_NOTA";
    public static final String TB_NOTAS_CREDITO_FIANZA_ID_CONCEPTO = "ID_CONCEPTO";
    public static final String TB_NOTAS_CREDITO_FIANZA_ID_SOPORTE = "ID_SOPORTE";
    public static final String TB_NOTAS_CREDITO_FIANZA_DOCUMENTO = "DOCUMENTO";
    public static final String TB_NOTAS_CREDITO_FIANZA_ID_MOTIVO = "ID_MOTIVO";
    public static final String TB_NOTAS_CREDITO_FIANZA_OBSERVACIONES = "OBSERVACIONES";

    public static final String TB_CONCEPTOS = "SIPAB4_CONCEPTOS";
    public static final String TB_CONCEPTOS_ID = "ID_CONCEPTO";
    public static final String TB_CONCEPTOS_DESC_CONCEPTO = "DESC_CONCEPTO";
    public static final String TB_CONCEPTOS_TRAMITE = "TRAMITE";
    public static final String TB_CONCEPTOS_ESTATUS = "ESTATUS";
    public static final String TB_CONCEPTOS_PLATAFORMA = "PLATAFORMA";

    public static final String TB_NOTAS_AJUSTES_CREDITO = "SIPAB4_AJUSTES_CREDITO";
    public static final String TB_NOTAS_AJUSTES_CREDITO_ID = "ID_AJUSTE_CREDITO";
    public static final String TB_NOTAS_AJUSTES_CREDITO_TIPO_AJUSTE = "TIPO_AJUSTE";
    public static final String TB_NOTAS_AJUSTES_CREDITO_ID_SOPORTE = "ID_SOPORTE";
    public static final String TB_NOTAS_AJUSTES_CREDITO_DOCUMENTO = "DOCUMENTO";
    public static final String TB_NOTAS_AJUSTES_CREDITO_ID_MOTIVO = "ID_MOTIVO";
    public static final String TB_NOTAS_AJUSTES_CREDITO_OBSERVACIONES = "OBSERVACIONES";
    public static final String TB_NOTAS_AJUSTES_CREDITO_EMAIL = "EMAIL";

    public static final String TB_BANCOS = "SIPAB4_BANCOS";
    public static final String TB_BANCOS_ID = "ID_BANCO";
    public static final String TB_BANCOS_DESC = "DESC_BANCO";
    public static final String TB_BANCOS_CVE = "CVE_BANCO";

    public static final String TB_TIPO_BONIFICACION = "SIPAB4_TIPO_BONIFICACION";
    public static final String TB_TIPO_BONIFICACION_ID = "ID_TIPO_BON";
    public static final String TB_TIPO_BONIFICACION_DESC = "DESC_TIPO_BON";
    public static final String TB_TIPO_BONIFICACION_CVE = "CVE_TIPO_BON";

    public static final String TB_BONIFICACION = "SIPAB4_BONIFICACIONES";
    public static final String TB_BONIFICACION_ID = "ID_BONIFICACION";
    public static final String TB_BONIFICACION_NOTA_CREDITO = "NOTA_CREDITO";
    public static final String TB_BONIFICACION_ID_SOPORTE = "ID_SOPORTE";
    public static final String TB_BONIFICACION_DOCUMENTO = "DOCUMENTO";
    public static final String TB_BONIFICACION_OBSERVACIONES = "OBSERVACIONES";
    public static final String TB_BONIFICACION_EMAIL = "EMAIL";
    public static final String TB_BONIFICACION_IMPORTE = "IMPORTE";
    public static final String TB_BONIFICACION_CESION_DERECHOS = "CESION_DERECHOS";
    public static final String TB_BONIFICACION_NOMBRE = "NOMBRE";
    public static final String TB_BONIFICACION_CONCEPTO = "CONCEPTO";
    public static final String TB_BONIFICACION_ID_MOTIVO = "ID_MOTIVO";
    public static final String TB_BONIFICACION_NUMERO_TARJETA = "NUMERO_TARJETA";
    public static final String TB_BONIFICACION_ID_BANCO = "ID_BANCO";
    public static final String TB_BONIFICACION_CUENTA_BANCARIA = "CUENTA_BANCARIA";

    public static final String TB_TIPO_TRAMITE = "SIPAB4_TIPO_TRAMITE";
    public static final String TB_TIPO_TRAMITE_ID = "ID_TIPO_TRAMITE";
    public static final String TB_TIPO_TRAMITE_PREFIJO = "PREFIJO";
    public static final String TB_TIPO_TRAMITE_TIPO = "TIPO";
    public static final String TB_TIPO_TRAMITE_ESTATUS= "ESTATUS";

    public static final String TB_TRAMITE_DETALLE = "SIPAB4_TRAMITES_DETALLE";
    public static final String TB_TRAMITE_DETALLE_ID = "ID_DETALLE_TRAMITE";
    public static final String TB_TRAMITE_DETALLE_FOLIO = "FOLIO";
    public static final String TB_TRAMITE_DETALLE_ANIO = "ANIO";
    public static final String TB_TRAMITE_DETALLE_ID_ESTATUS = "ID_ESTATUS";
    public static final String TB_TRAMITE_DETALLE_ID_ESTATUS_BATCH = "ID_ESTATUS_BATCH";
    public static final String TB_TRAMITE_DETALLE_ID_TIPO_TRAMITE = "ID_TIPO_TRAMITE";
    public static final String TB_TRAMITE_DETALLE_ID_FORMA_PAGO = "ID_FORMA_PAGO";
    public static final String TB_TRAMITE_DETALLE_ID_CLAVE_BATCH = "ID_CLAVE_BATCH";
    public static final String TB_TRAMITE_DETALLE_ID_CONCEPTO = "ID_CONCEPTO";
    public static final String TB_TRAMITE_DETALLE_ID_CLAVE_SAP = "ID_CLAVE_SAP";
    public static final String TB_TRAMITE_DETALLE_ID_BANCO = "ID_BANCO";
    public static final String TB_TRAMITE_DETALLE_ID_MARCA = "ID_MARCA";
    public static final String TB_TRAMITE_DETALLE_ID_NOTA_SIDES = "ID_NOTA_SIDES";
    public static final String TB_TRAMITE_DETALLE_PROCESO = "PROCESO";
    public static final String TB_TRAMITE_DETALLE_ID_REGION = "ID_REGION";
    public static final String TB_TRAMITE_DETALLE_CUENTA = "CUENTA";
    public static final String TB_TRAMITE_DETALLE_NUMERO_FOLIO = "NUMERO_FOLIO";
    public static final String TB_TRAMITE_DETALLE_TELEFONO = "TELEFONO";
    public static final String TB_TRAMITE_DETALLE_CICLO = "CICLO";
    public static final String TB_TRAMITE_DETALLE_PROCESO_REPORTE = "PROCESO_REPORTE";
    public static final String TB_TRAMITE_DETALLE_FECHA_APLICACION = "FECHA_APLICACION";
    public static final String TB_TRAMITE_DETALLE_USUARIO_BATCH = "USUARIO_BATCH";
    public static final String TB_TRAMITE_DETALLE_LOTE_BATCH = "LOTE_BATCH";
    public static final String TB_TRAMITE_DETALLE_CONCEPTO = "CONCEPTO";
    public static final String TB_TRAMITE_DETALLE_CANTIDAD = "CANTIDAD";
    public static final String TB_TRAMITE_DETALLE_IMPORTE = "IMPORTE";
    public static final String TB_TRAMITE_DETALLE_IVA = "IVA";
    public static final String TB_TRAMITE_DETALLE_TOTAL = "TOTAL";
    public static final String TB_TRAMITE_DETALLE_PLATAFORMA = "PLATAFORMA";
    public static final String TB_TRAMITE_DETALLE_TIPO_CAPTURA = "TIPO_CAPTURA";
    public static final String TB_TRAMITE_DETALLE_INDICADOR_FISCAL = "INDICADOR_FISCAL";
    public static final String TB_TRAMITE_DETALLE_ARCHIVO_SAP = "ARCHIVO_SAP";
    public static final String TB_TRAMITE_DETALLE_ID_SIDES = "ID_SIDES";
    public static final String TB_TRAMITE_DETALLE_FOLIO_SERTEC = "FOLIO_SERTEC";
    public static final String TB_TRAMITE_DETALLE_IMEI = "IMEI";
    public static final String TB_TRAMITE_DETALLE_CLIENTE = "CLIENTE";
    public static final String TB_TRAMITE_DETALLE_TC = "TC";
    public static final String TB_TRAMITE_DETALLE_A_FAVOR = "A_FAVOR";
    public static final String TB_TRAMITE_DETALLE_CODIGO_ERROR = "CODIGO_ERROR";
    public static final String TB_TRAMITE_DETALLE_DESCRIPCION_ERROR = "DESCRIPCION_ERROR";
    public static final String TB_TRAMITE_DETALLE_IMPORTE_TA = "IMPORTE_TA";
    public static final String TB_TRAMITE_DETALLE_TELEFONO2 = "TELEFONO2";
    public static final String TB_TRAMITE_DETALLE_CLABE = "CLABE";
    public static final String TB_TRAMITE_DETALLE_FECHA_INICIAL = "FECHA_INICIAL";
    public static final String TB_TRAMITE_DETALLE_FECHA_FINAL = "FECHA_FINAL";
    public static final String TB_TRAMITE_DETALLE_ID_TIPO_BON = "ID_TIPO_BON";
    public static final String TB_TRAMITE_DETALLE_ID_IDENTIFICACION = "ID_IDENTIFICACION";
    public static final String TB_TRAMITE_DETALLE_NUMERO_IDENTIFICACION = "NUMERO_IDENTIFICACION";
    public static final String TB_TRAMITE_DETALLE_OTRO_IDENTIFICACION = "OTRO_IDENTIFICACION";
    public static final String TB_TRAMITE_DETALLE_CORREO_CLIENTE = "CORREO_CLIENTE";
    public static final String TB_TRAMITE_DETALLE_CONCEPTO_NOTA = "CONCEPTO_NOTA";
    public static final String TB_TRAMITE_DETALLE_DESC_SAP = "DESC_SAP";
    public static final String TB_TRAMITE_DETALLE_CLAVE_BATCH_NOTA = "CLAVE_BATCH_NOTA";
    public static final String TB_TRAMITE_DETALLE_TIPO_BATCH_NOTA = "TIPO_BATCH_NOTA";
    public static final String TB_TRAMITE_DETALLE_CVE_TIPO_BON = "CVE_TIPO_BON";
    public static final String TB_TRAMITE_DETALLE_DESC_IDENTIFICACION = "DESC_IDENTIFICACION";
    public static final String TB_TRAMITE_DETALLE_FACTURA_SAP = "FACTURA_SAP";
    public static final String TB_TRAMITE_DETALLE_FACTURA_MANUAL = "FACTURA_MANUAL";
    public static final String TB_TRAMITE_DETALLE_NUMERO_FACTURA = "NUMERO_FACTURA";
    public static final String TB_TRAMITE_DETALLE_UUID = "UUID";
    public static final String TB_TRAMITE_DETALLE_MONTO_FACTURA = "MONTO_FACTURA";
    public static final String TB_TRAMITE_DETALLE_FECHA_FACTURA = "FECHA_FACTURA";
    public static final String TB_TRAMITE_DETALLE_ESTATUS_FACTURA = "ESTATUS_FACTURA";
    public static final String TB_TRAMITE_DETALLE_NUMERO_PEDIDO_ECOMMERCE = "NUMERO_PEDIDO_ECOMMERCE";
    public static final String TB_TRAMITE_DETALLE_ID_ITEM = "ID_ITEM";
    public static final String TB_TRAMITE_DETALLE_ENVIO_TIENDA = "ENVIO_TIENDA";
    public static final String TB_TRAMITE_DETALLE_NUMERO_ORDEN = "NUMERO_ORDEN";
    public static final String TB_TRAMITE_DETALLE_ID_DETALLE_FACTURA = "ID_DETALLE_FACTURA";
    public static final String TB_TRAMITE_DETALLE_IMPORTE_RETENCION = "IMPORTE_RETENCION";
    public static final String TB_TRAMITE_DETALLE_RETENCION = "RETENCION";
    public static final String TB_TRAMITE_DETALLE_MESES_APLICACION = "MESES_APLICACION";
    public static final String TB_TRAMITE_DETALLE_DIA_APLICACION = "DIA_APLICACION";
    public static final String TB_TRAMITE_DETALLE_CONTADOR = "CONTADOR";
    public static final String TB_TRAMITE_DETALLE_AJUSTES_APLICADOS = "AJUSTES_APLICADOS";
    public static final String TB_TRAMITE_DETALLE_REGIMEN_FISCAL = "REGIMEN_FISCAL";
    public static final String TB_TRAMITE_DETALLE_ID_MOTIVO_CANCELACION = "ID_MOTIVO_CANCELACION";
    public static final String TB_TRAMITE_DETALLE_UUID_NUEVA_FACTURA = "UUID_NUEVA_FACTURA";
    public static final String TB_TRAMITE_DETALLE_USO_CFDI = "USO_CFDI";
    public static final String TB_TRAMITE_DETALLE_FACTURA_SAP_NUEVA = "FACTURA_SAP_NUEVA";
    public static final String TB_TRAMITE_DETALLE_SERIE_NUM = "SERIE_NUM";
    public static final String TB_TRAMITE_DETALLE_UUID_COMPAGO_SUSTITUIR = "UUID_COMPAGO_SUSTITUIR";


    public static final String TB_DISTRIBUIDORES = "SIPAB4_DISTRIBUIDORES";
    public static final String TB_DISTRIBUIDORES_ID = "ID_DISTRIBUIDOR";
    public static final String TB_DISTRIBUIDORES_DESC = "DESC_DISTRIBUIDOR";
    public static final String TB_DISTRIBUIDORES_ESTATUS = "ESTATUS";
    public static final String TB_DISTRIBUIDORES_CVE_USUARIO = "CVE_USUARIO";
    public static final String TB_DISTRIBUIDORES_FECHA_ALTA = "FECHA_ALTA";
    public static final String TB_DISTRIBUIDORES_ID_REGION = "ID_REGION";

    public static final String TB_ESTATUS = "SIPAB4_ESTATUS";
    public static final String TB_ESTATUS_ID = "ID_ESTATUS";
    public static final String TB_ESTATUS_DESC = "DESC_ESTATUS";
    public static final String TB_ESTATUS_ORIGEN = "ORIGEN";
    public static final String TB_ESTATUS_COD = "COD_ESTATUS";

    public static final String TB_CENTRO_COSTOS = "SIPAB4_CENTRO_COSTOS";
    public static final String TB_CENTRO_COSTOS_ID = "ID_CENTRO";
    public static final String TB_CENTRO_COSTOS_ID_GRUPO = "ID_GRUPO";
    public static final String TB_CENTRO_COSTOS_ID_REGION = "ID_REGION";
    public static final String TB_CENTRO_COSTOS_DESC = "DESC_CENTRO";
    public static final String TB_CENTRO_COSTOS_PREFIJO = "PREFIJO";
    public static final String TB_CENTRO_COSTOS_ESTATUS = "ESTATUS";
    public static final String TB_CENTRO_COSTOS_ID_GERENCIA = "ID_GERENCIA";
    public static final String TB_CENTRO_COSTOS_ID_SUBDIRECCION = "ID_SUBDIRECCION";
    public static final String TB_CENTRO_COSTOS_ID_DIRECCION = "ID_DIRECCION";

    public static final String TB_PAGOS = "SIPAB4_PAGOS";
    public static final String TB_PAGOS_ID = "ID_DETALLE_TRAMITE";
    public static final String TB_PAGOS_FORMA_PAGO = "FORMA_PAGO";
    public static final String TB_PAGOS_FECHA_PAGO = "FECHA_PAGO";
    public static final String TB_PAGOS_ORIGEN_LARGO = "ORIGEN_LARGO";
    public static final String TB_PAGOS_ORIGEN_CORTO = "ORIGEN_CORTO";
    public static final String TB_PAGOS_ESTATUS = "ESTATUS_PAGO";
    public static final String TB_PAGOS_SEC_PAGO = "SEC_PAGO";
    public static final String TB_PAGOS_LOTE_PAGO = "LOTE_PAGO";
    public static final String TB_PAGOS_NUM_REG_BATCH = "NUM_REG_BATCH";
    public static final String TB_PAGOS_TIPO_PAGO = "TIPO_PAGO";
    public static final String TB_PAGOS_EXT_TRANS_ID = "EXT_TRANS_ID";

    public static final String TB_PBATCH = "SIPAB4_PROCESO_BATCH";
    public static final String TB_PBATCH_PROCESO = "PROCESO";
    public static final String TB_PBATCH_ID_ESTATUS = "ID_ESTATUS";
    public static final String TB_PBATCH_ID_REGION = "ID_REGION";
    public static final String TB_PBATCH_ID_GRUPO = "ID_GRUPO";
    public static final String TB_PBATCH_TIPO = "TIPO";
    public static final String TB_PBATCH_FECHA_CREACION = "FECHA_CREACION";
    public static final String TB_PBATCH_FECHA_PROCESO = "FECHA_PROCESO";
    public static final String TB_PBATCH_USUARIO = "USUARIO";
    public static final String TB_PBATCH_FECHA_INI = "FECHA_INI";
    public static final String TB_PBATCH_FECHA_FIN = "FECHA_FIN";
    public static final String TB_PBATCH_EMAIL = "EMAIL";
    public static final String TB_PBATCH_ANIO = "ANIO";
    public static final String TB_PBATCH_PARAMETROS = "PARAMETROS";

    public static final String TB_USUARIOS = "SIPAB4_USUARIOS";
    public static final String TB_USUARIOS_NUM_EMP = "NUMERO_EMPLEADO";
    public static final String TB_USUARIOS_ID_CENTRO = "ID_CENTRO";
    public static final String TB_USUARIOS_ID_ROL = "ID_ROL";
    public static final String TB_USUARIOS_ID_REGION = "ID_REGION";
    public static final String TB_USUARIOS_ID_PUESTO = "ID_PUESTO";
    public static final String TB_USUARIOS_CVE_USUARIO = "CVE_USUARIO";
    public static final String TB_USUARIOS_NOMBRE = "NOMBRE";
    public static final String TB_USUARIOS_ESTATUS = "ESTATUS";
    public static final String TB_USUARIOS_CORREO = "CORREO";
    public static final String TB_USUARIOS_ULTIMO_ACCESO = "ULTIMO_ACCESO";
    public static final String TB_USUARIOS_EMPLEADO_MODIFICA = "EMPLEADO_MODIFICA";
    public static final String TB_USUARIOS_FECHA_MODIFICA = "FECHA_MODIFICA";
    
    public static final String TB_REGIMEN_FISCAL = "SIPAB_C_REGIMEN_FISCAL";
    public static final String TB_REGIMEN_FISCAL_ID = "ID_REGIMEN_FISCAL";
    public static final String TB_REGIMEN_FISCAL_REGIMEN_FISCAL = "REGIMEN_FISCAL";
    public static final String TB_REGIMEN_FISCAL_DESCRIPCION = "DESCRIPCION";
    public static final String TB_REGIMEN_FISCAL_FISICA = "FISICA";
    public static final String TB_REGIMEN_FISCAL_MORAL = "MORAL";
    
    public static final String TB_USO_CFDI = "SIPAB_C_USO_CFDI";
    public static final String TB_USO_CFDI_ID = "ID_USO_CFDI";
    public static final String TB_USO_CFDI_REGIMEN_FISCAL = "USO_CFDI";
    public static final String TB_USO_CFDI_DESCRIPCION = "DESCRIPCION";
    public static final String TB_USO_CFDI_FISICA = "FISICA";
    public static final String TB_USO_CFDI_MORAL = "MORAL";
    
    public static final String TB_PUESTO = "SIPAB4_PUESTOS";
    public static final String TB_PUESTO_ID_PUESTO = "ID_PUESTO";
    public static final String TB_PUESTO_ID_ROL = "ID_ROL";
    public static final String TB_PUESTO_ID_REGION = "ID_REGION";
    public static final String TB_PUESTO_ID_GRUPO = "ID_GRUPO";
    public static final String TB_PUESTO_DESC_PUESTO = "DESC_PUESTO";

    public static final String TB_ROLES = "SIPAB4_ROLES";
    public static final String TB_ROLES_ID_ROL = "ID_ROL";
    public static final String TB_ROLES_DESC_ROL = "DESC_ROL";
    
    public static final String TB_GRUPOS = "SIPAB4_GRUPOS";
    public static final String TB_GRUPOS_ID_GRUPO = "ID_GRUPO";
    public static final String TB_GRUPOS_DESC_GRUPO = "DESC_GRUPO";
}
