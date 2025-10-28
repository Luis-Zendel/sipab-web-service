# 📚 Rutas de Swagger/OpenAPI para SIPABWebService

## 🔍 Información de Swagger/OpenAPI

Tu aplicación usa **SpringDoc OpenAPI 2.5.0** que viene configurado automáticamente.

## 🌐 Rutas de Swagger UI

### Despliegue Local
```
http://localhost:8181/swagger-ui.html
```

### Despliegue en OpenShift
```
https://<route-url>/swagger-ui.html
```
Donde `<route-url>` es la URL que obtienes con:
```bash
oc get route sipab-webservice
```

## 📄 Otras Rutas de OpenAPI

### 1. **Swagger UI** (Interfaz Gráfica) ✨
```
http://localhost:8181/swagger-ui.html
```
O la versión v3:
```
http://localhost:8181/swagger-ui/index.html
```

### 2. **OpenAPI JSON** (Especificación)
```
http://localhost:8181/v3/api-docs
```

### 3. **OpenAPI YAML**
```
http://localhost:8181/v3/api-docs.yaml
```

### 4. **OpenAPI JSON (Grupo por Tags)**
```
http://localhost:8181/v3/api-docs/grouped
```

## 🔗 Ejemplos Completos para OpenShift

Una vez desplegado en OpenShift:

```bash
# 1. Obtener la URL de la route
oc get route sipab-webservice

# Ejemplo de salida:
# NAME               HOST/PORT
# sipab-webservice   sipab-webservice-sipab4.apps.openshift.com
```

Entonces las rutas serían:

```
https://sipab-webservice-sipab4.apps.openshift.com/swagger-ui.html
https://sipab-webservice-sipab4.apps.openshift.com/v3/api-docs
https://sipab-webservice-sipab4.apps.openshift.com/v3/api-docs.yaml
```

## 📋 APIs Disponibles

Según tus controladores, tienes estas APIs documentadas:

### Usuario
- `/usuario/buscar`
- `/usuario/consulta`
- `/usuario/consultaLdap`

### Pagos
- `/pagos/historialPagos`

### Cuenta
- `/cuenta/datos`

### Catálogos (26 endpoints)
- `/catalogos/tiposPago`
- `/catalogos/formasPago`
- `/catalogos/origenesPagoPorRegion`
- `/catalogos/soportes`
- `/catalogos/motivosPorTipoTramite`
- `/catalogos/regiones`
- ... y más

### Otros
- `/bonificacion`
- `/refacturacion`
- `/notas`
- `/factura`
- `/ajustes`

## ⚙️ Configuración Actual

En tu proyecto ya tienes configurado:

**pom.xml**:
```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>
```

## 🎨 Personalizar Swagger (Opcional)

Si quieres personalizar la información de Swagger, crea esta clase:

**`src/main/java/mx/com/telcel/sipab/config/OpenApiConfig.java`**:

```java
package mx.com.telcel.sipab.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI sipabWebServiceOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SIPAB Web Service API")
                        .description("Servicios REST para SIPAB corporativo")
                        .version("1.0")
                        .contact(new Contact()
                                .name("SIPAB Team")
                                .email("sipab@telcel.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")));
    }
}
```

## 🚀 Acceso a Swagger

### Durante Desarrollo

```bash
# Inicia la aplicación
mvn spring-boot:run

# Accede a:
http://localhost:8181/swagger-ui.html
```

### En OpenShift

```bash
# Despliega la aplicación
oc apply -f deploy.yaml

# Obtén la URL
oc get route sipab-webservice

# Accede a Swagger desde tu navegador
```

## 🔐 Seguridad (Futuro)

Actualmente Swagger está abierto. Para producción, considera:

1. Agregar autenticación a Swagger
2. Deshabilitar Swagger en producción
3. Agregar API keys

## ✅ Verificación Rápida

```bash
# Verificar que Swagger esté accesible
curl http://localhost:8181/v3/api-docs

# Debería retornar JSON con la especificación OpenAPI
```

## 🎯 Resumen

**Ruta principal de Swagger UI:**
```
http://localhost:8181/swagger-ui.html
```

**En OpenShift:**
```
https://<tu-route>/swagger-ui.html
```

¡Listo! Ya puedes explorar toda tu API desde la interfaz de Swagger 🎉

