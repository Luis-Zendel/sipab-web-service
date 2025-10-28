# 📚 Explicación Detallada: Cómo Funciona el Build en OpenShift

## 🎯 El Problema Original

Tu proyecto inicial tenía estos archivos:
- ❌ `Dockerfile` en la raíz
- ❌ `deploy.yaml` con configuración compleja
- ❌ Sin `devfile.yaml`
- ❌ BuildConfig buscaba el Dockerfile en `docker/Dockerfile`

**Resultado**: Error `503 Service Unavailable` porque OpenShift no podía encontrar los archivos correctamente.

---

## 📊 El Proyecto de Ejemplo de Red Hat

El proyecto de ejemplo (https://github.com/devfile-samples/devfile-sample-java-springboot-basic) tiene esta estructura:

```
devfile-sample-java-springboot-basic/
├── docker/
│   └── Dockerfile          ← Dockerfile en carpeta docker/
├── deploy.yaml             ← Deployment simple
├── devfile.yaml            ← Archivo clave
└── pom.xml, src/, etc.
```

**¿Por qué funciona?**
- ✅ Dockerfile en `docker/` (patrón estándar de OpenShift)
- ✅ `devfile.yaml` define TODO el proceso
- ✅ OpenShift detecta y ejecuta automáticamente

---

## 🔗 Cómo Funcionan los Archivos Juntos

### 1️⃣ **devfile.yaml** - El "Orquestador"

Este archivo le dice a OpenShift:

```yaml
components:
  # Componente 1: Construir la imagen Docker
  - name: image-build
    image:
      imageName: sipab-webservice-image:latest
      dockerfile:
        uri: docker/Dockerfile      # ← Dónde está el Dockerfile
        buildContext: .             # ← Contexto para build
  
  # Componente 2: Desplegar en Kubernetes
  - name: kubernetes-deploy
    kubernetes:
      uri: deploy.yaml              # ← Dónde está el deployment

commands:
  # Comando: build-image
  - id: build-image
    apply:
      component: image-build        # ← Usa el componente image-build
  
  # Comando: deployk8s
  - id: deployk8s
    apply:
      component: kubernetes-deploy   # ← Usa el componente kubernetes-deploy
  
  # Comando principal: deploy
  - id: deploy
    composite:
      commands:
        - build-image               # ← Ejecuta primero build-image
        - deployk8s                 # ← Luego deployk8s
```

**Flujo Visual:**

```
Usuario hace click "Create" en OpenShift
        ↓
OpenShift lee devfile.yaml
        ↓
     "Ah, hay un componente image-build"
        ↓
  "Usa docker/Dockerfile"
        ↓
     EJECUTA: docker build -f docker/Dockerfile
        ↓
   Crea imagen: sipab-webservice-image:latest
        ↓
     "Hay un componente kubernetes-deploy"
        ↓
   "Usa deploy.yaml"
        ↓
    REEMPLAZA la imagen en deploy.yaml
        ↓
    APLICA: oc apply -f deploy.yaml
        ↓
   Crea Pods, Services, Routes
        ↓
    ✅ APLICACIÓN CORRIENDO
```

### 2️⃣ **docker/Dockerfile** - Instrucciones de Construcción

Este archivo dice **cómo construir** tu aplicación:

```dockerfile
# Etapa 1: Builder (construir el JAR)
FROM registry.access.redhat.com/ubi8/openjdk-17 AS builder

WORKDIR /home/jboss/project
COPY pom.xml .                    # ← Copia pom.xml
RUN mvn dependency:go-offline      # ← Descarga dependencias Maven
                                   
COPY src src                       # ← Copia código fuente
RUN mvn package                    # ← Compila y crea el JAR
                                   
# Encuentra el JAR generado
RUN mv target/SIPABWebService-1.0.jar target/export-run-artifact.jar

# Etapa 2: Runtime (imagen final más ligera)
FROM registry.access.redhat.com/ubi8/openjdk-17-runtime

# Copia solo el JAR compilado
COPY --from=builder /home/jboss/project/target/export-run-artifact.jar \
     /deployments/app.jar

EXPOSE 8181                         # ← Puerto 8181

ENTRYPOINT ["java", "-jar", "/deployments/app.jar", "--server.port=8181"]
```

**¿Qué hace esto?**
1. **Stage 1 (builder)**: Compila tu aplicación Java
2. **Stage 2 (runtime)**: Copia solo el JAR, sin herramientas de build

**Por qué en `docker/`?**
Porque el `devfile.yaml` especifica:
```yaml
dockerfile:
  uri: docker/Dockerfile
```

### 3️⃣ **deploy.yaml** - Configuración de Despliegue

Este archivo dice **cómo ejecutar** tu aplicación en Kubernetes:

```yaml
kind: Deployment
metadata:
  name: sipab-webservice

spec:
  replicas: 2                       # ← Quieres 2 pods
  
  containers:
    - name: sipab-webservice
      image: sipab-webservice-image:latest  # ← Imagen construida
      ports:
        - containerPort: 8181       # ← Puerto de tu app
      
      env:                          # ← Variables de entorno
        - name: ORACLE_DATASOURCE_URL
          valueFrom:
            secretKeyRef:           # ← Toma del secret
              name: oracle-db-secret
              key: url
      
      resources:                    # ← Límites de CPU/RAM
        requests:
          memory: "512Mi"
          cpu: "500m"
```

**Diferencia con el ejemplo:**

| Aspecto | Ejemplo Red Hat | Tu Proyecto |
|---------|------------------|-------------|
| **Puerto** | 8081 | 8181 |
| **Memory** | 180Mi | 512Mi |
| **CPU** | 10m | 500m |
| **Secret** | No tiene | oracle-db-secret ✅ |
| **Replicas** | 1 | 2 |

---

## 🔄 Proceso Completo del Build

### Paso 1: Importar desde Git

```bash
# Usuario hace esto en OpenShift Console
URL: https://github.com/Luis-Zendel/sipab-web-service.git
Click: "Create"
```

OpenShift clona el repo y lee el `devfile.yaml`.

### Paso 2: Detectar devfile.yaml

OpenShift ve:
```yaml
components:
  - name: image-build
    image:
      dockerfile:
        uri: docker/Dockerfile  # ← Busca este archivo
```

OpenShift busca `docker/Dockerfile` y lo encuentra ✅.

### Paso 3: Construir la Imagen

OpenShift ejecuta:
```bash
docker build -f docker/Dockerfile \
  -t sipab-webservice-image:latest \
  .
```

**Proceso del Dockerfile:**

```
1. Copia pom.xml
   ↓
2. mvn dependency:go-offline (descarga dependencias)
   ↓
3. Copia src/
   ↓
4. mvn package (compila y crea JAR)
   ↓
5. Encuentra: SIPABWebService-1.0.jar
   ↓
6. Renombra a: export-run-artifact.jar
   ↓
7. Imagen final con solo el JAR
```

**Tiempo:** ~5-10 minutos (depende del tamaño del proyecto).

### Paso 4: Crear ImageStream

OpenShift guarda la imagen:
```bash
oc get imagestream sipab-webservice-image
```

### Paso 5: Aplicar deploy.yaml

OpenShift lee `deploy.yaml` y ve:
```yaml
image: sipab-webservice-image:latest
```

Y crea:
- ✅ 2 Pods ejecutando tu aplicación
- ✅ 1 Service para acceso interno
- ⚠️ Route (a crear manualmente o automáticamente)

### Paso 6: Verificar

```bash
# Ver si los pods están corriendo
oc get pods

# Deberías ver:
# NAME                              READY   STATUS
# sipab-webservice-abc123           1/1     Running
# sipab-webservice-xyz789           1/1     Running
```

---

## 🔴 ¿Por Qué Tu Proyecto Original Fallaba?

### Problema 1: Ubicación del Dockerfile

**Antes:**
```
SIPABWebService/
└── Dockerfile       ← En la raíz
```

**El devfile.yaml buscaba:**
```yaml
dockerfile:
  uri: docker/Dockerfile  # ← Buscaba en docker/
```

**Resultado:** ❌ No encuentra el Dockerfile

**Ahora:**
```
SIPABWebService/
└── docker/
    └── Dockerfile   ← En docker/
```

✅ OpenShift encuentra el Dockerfile correctamente.

### Problema 2: Sin devfile.yaml

**Antes:** No había `devfile.yaml`

**Resultado:** OpenShift no sabía qué hacer:
- ¿Qué imagen construir?
- ¿Dónde está el Dockerfile?
- ¿Cómo desplegar?

**Ahora:** Hay `devfile.yaml` ✅

OpenShift sabe exactamente:
- Construir imagen con `docker/Dockerfile`
- Nombre: `sipab-webservice-image:latest`
- Deployment usar `deploy.yaml`

### Problema 3: BuildConfig con Ruta Equivocada

**El error:**
```
error: open /tmp/build/inputs/docker/Dockerfile: no such file or directory
```

**Causa:** El BuildConfig había sido creado por la Web Console y tenía:
```yaml
dockerStrategy:
  dockerfilePath: docker/Dockerfile  # ← Buscaba aquí
```

Pero el Dockerfile estaba en la raíz.

**Solución:** Mover Dockerfile a `docker/` donde OpenShift lo espera.

---

## 📋 Comparación: Antes vs Ahora

### ANTES (No Funcionaba)

```
SIPABWebService/
├── Dockerfile          ← Buscado en raíz por BuildConfig
├── deploy.yaml         ← Complejo, sin devfile
└── (sin devfile.yaml)
```

**Problemas:**
- ❌ BuildConfig usaba ruta Git incorrecta
- ❌ Dockerfile en lugar incorrecto
- ❌ No había orquestación (devfile)
- ❌ Error 503 porque no había pods

### AHORA (Funciona)

```
SIPABWebService/
├── docker/
│   └── Dockerfile      ← Patrón Red Hat
├── deploy.yaml         ← Formato correcto
└── devfile.yaml        ← Orquestador
```

**Ventajas:**
- ✅ Dockerfile en ubicación estándar
- ✅ devfile.yaml orquesta todo
- ✅ OpenShift detecta automáticamente
- ✅ Proceso simplificado

---

## 🎯 Flujo Visual Completo

```
┌────────────────────────────────────────────────────────┐
│  1. USUARIO                                             │
│     Click "Create from Git" en OpenShift Console       │
│     URL: https://github.com/Luis-Zendel/...             │
└───────────────────┬────────────────────────────────────┘
                    ↓
┌────────────────────────────────────────────────────────┐
│  2. OPENSHIFT                                          │
│     Clona el repositorio Git                           │
│     Lee devfile.yaml                                    │
│     Detecta: "Oh, hay un devfile!" ✅                 │
└───────────────────┬────────────────────────────────────┘
                    ↓
┌────────────────────────────────────────────────────────┐
│  3. CONSTRUCCIÓN (docker/Dockerfile)                   │
│     docker build -f docker/Dockerfile                  │
│     ├─ Stage 1: Maven build                            │
│     ├─ Compila Java → JAR                              │
│     └─ Stage 2: Runtime image                          │
│     Resultado: sipab-webservice-image:latest ✅        │
└───────────────────┬────────────────────────────────────┘
                    ↓
┌────────────────────────────────────────────────────────┐
│  4. IMAGEN                                              │
│     oc create imagestream sipab-webservice-image        │
│     Image tag: latest                                   │
│     Estado: Available ✅                               │
└───────────────────┬────────────────────────────────────┘
                    ↓
┌────────────────────────────────────────────────────────┐
│  5. DEPLOYMENT (deploy.yaml)                           │
│     oc apply -f deploy.yaml                            │
│     ├─ Lee env de secrets                             │
│     ├─ Configura variables Oracle DB                   │
│     ├─ Crea 2 Pods (replicas: 2)                       │
│     ├─ Configura resources (CPU/Memory)                │
│     └─ Crea Service                                     │
└───────────────────┬────────────────────────────────────┘
                    ↓
┌────────────────────────────────────────────────────────┐
│  6. PODS                                                │
│     Pod 1: sipab-webservice-abc123                     │
│       Status: Running                                   │
│       Ready: 1/1                                        │
│     Pod 2: sipab-webservice-xyz789                      │
│       Status: Running                                   │
│       Ready: 1/1                                        │
└───────────────────┬────────────────────────────────────┘
                    ↓
┌────────────────────────────────────────────────────────┐
│  7. SERVICIO                                            │
│     Service: sipab-webservice-svc                      │
│       ClusterIP: 172.30.213.22                          │
│       Port: 8181                                        │
└───────────────────┬────────────────────────────────────┘
                    ↓
┌────────────────────────────────────────────────────────┐
│  8. ROUTE (Acceso Público)                             │
│     oc expose service sipab-webservice-svc             │
│     URL: https://sipab-webservice-svc-sipab4.apps...    │
│     ✅ API Disponible                                  │
└────────────────────────────────────────────────────────┘
```

---

## 🎓 Conceptos Clave

### 1. **devfile.yaml**
- **Qué es**: Orquestador que define TODO el proceso
- **Dónde**: En la raíz del proyecto
- **Función**: Le dice a OpenShift qué hacer y en qué orden
- **Comparación**: Es como un "Makefile" o "Script de automatización"

### 2. **docker/Dockerfile**
- **Qué es**: Instrucciones para construir la imagen
- **Dónde**: En carpeta `docker/`
- **Función**: Define cómo compilar y empaquetar tu app
- **Comparación**: Como una "receta de cocina" para construir la app

### 3. **deploy.yaml**
- **Qué es**: Configuración de Kubernetes
- **Dónde**: En la raíz del proyecto
- **Función**: Define recursos (Deployment, Service, etc.)
- **Comparación**: Como la "ficha técnica" de un coche

### 4. **Secrets**
- **Qué es**: Credenciales encriptadas
- **Dónde**: En OpenShift (no en Git)
- **Función**: Guarda passwords, tokens, etc. de forma segura
- **Comparación**: Como una "caja fuerte" para secretos

---

## 🔍 Detalles Técnicos

### ¿Por qué Multi-stage Build?

El Dockerfile usa **2 etapas**:

**Etapa 1: Builder** (imagen grande ~800MB)
```dockerfile
FROM ubi8/openjdk-17  # Tiene Maven, compilador, etc.
```
- Tiene Maven (para compilar)
- Tiene JDK completo
- Tiene herramientas de build

**Etapa 2: Runtime** (imagen ligera ~400MB)
```dockerfile
FROM ubi8/openjdk-17-runtime  # Solo JRE
```
- Solo JRE (ejecutar)
- Sin Maven ni compilador
- Solo el JAR

**Ventaja:** Imagen final 50% más pequeña ✅

### ¿Por qué Usuario 1001?

```dockerfile
RUN chown -R 1001:0 /deployments
USER 1001
```

**Razón:** Seguridad
- OpenShift requiere pods sin privilegios
- Usuario 1001 es no-root (más seguro)
- Previene ataques

### ¿Cómo sabe OpenShift qué recurso usar?

El `devfile.yaml` vincula todo:

```yaml
components:
  - name: image-build        # ← Usa esto para build
  - name: kubernetes-deploy  # ← Usa esto para deploy
```

Cuando ejecutas "deploy", OpenShift:
1. Ejecuta `image-build` (usa `docker/Dockerfile`)
2. Ejecuta `kubernetes-deploy` (usa `deploy.yaml`)
3. Ambos componentes se coordinan automáticamente

---

## ✅ Resumen

**Antes:** Tu proyecto tenía archivos pero no funcionaban juntos.
**Ahora:** Tu proyecto usa el patrón estándar de Red Hat.

**Cambios principales:**
1. ✅ Dockerfile movido a `docker/` (patrón estándar)
2. ✅ devfile.yaml creado (orquestación)
3. ✅ deploy.yaml simplificado (solo configuración)
4. ✅ Estructura idéntica al ejemplo de Red Hat

**Resultado:** OpenShift ahora puede construir y desplegar tu aplicación automáticamente 🚀

