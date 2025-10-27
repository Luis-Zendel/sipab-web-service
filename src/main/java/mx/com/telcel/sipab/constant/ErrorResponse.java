package mx.com.telcel.sipab.constant;

public class ErrorResponse {
	
	public static final int BAD_REQUEST_CODE = 9002;

    public static final int ACCESS_DENIED_CODE = 9008;

    public static final String RECORD_NOT_FOUND = "Registro no encontrado";
    
    public static final String RECORDS_NOT_FOUND = "Registros no encontrados";

    public static final String EXCEL_ERROR = "No se pudo generar el reporte ";

    public static final String MISSING_REQUIRED_PARAM = "El parametro requerido '{0}' no esta presente ";

    public static final String RECORD_NOT_SAVE = "El registro no se pudo guardar correctamente";
    
    public static final String RECORD_NOT_DELETE = "El registro no se pudo eliminar correctamente";

    public static final String REMOTE_SESSION_NOT_OPENED_ERROR = "La sesión no se a abierto o hubo un error al iniciarla. Si el manejo es manual asegurese de usar open() y close() para definir la sesión.";
    /** No se pudo crear una ruta de carpetas en el servidor **/
    public static final String COULDNT_CREATE_FOLDER_PATH = "No se pudo crear la ruta {} sobre el servidor {}";
    /** Error al cerrar sesión remota FTP */

    public static final String FTP_LIST_ERROR = "Error al listar ruta {} del servidor FTP {}";

    public static final String FTP_DOWNLOAD_ERROR = "Error al descargar el archivo {} al servidor FTP {}";
    /** Error al descargar desde FTP */
    public static final String FTP_DOWNLOAD_ERROR2 = "Archivo {} no encontrado en el servidor FTP {}";

    public static final String FTP_UPLOAD_ERROR = "Error al subir el archivo {} al servidor FTP {}";

    public static final String CLOSE_FTP_REMOTE_SESSION = "Error al cerrar sesión remota FTP en {}";

    public static final String FTP_ERROR = "Error al conectar con el servidor FTP {}";

}
