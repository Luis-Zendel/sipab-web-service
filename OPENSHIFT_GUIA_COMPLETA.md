# 🚀 Guía Completa de Deployment en OpenShift - Para Desarrolladores Junior

## 📖 Tabla de Contenidos
1. [¿Qué es OpenShift?](#qué-es-openshift)
2. [Conceptos Fundamentales](#conceptos-fundamentales)
3. [Arquitectura de OpenShift](#arquitectura-de-openshift)
4. [Tu Proyecto: SIPABWebService](#tu-proyecto-sipabwebservice)
5. [Guía Paso a Paso para Deployment](#guía-paso-a-paso-para-deployment)
6. [Comandos Útiles](#comandos-útiles)
7. [Troubleshooting](#troubleshooting)

---

## 🎯 ¿Qué es OpenShift?

**OpenShift** es una plataforma de contenedores basada en Kubernetes desarrollada por Red Hat. Te permite desplegar, escalar y gestionar aplicaciones en contenedores de manera sencilla y eficiente.

### Analogía Simple:
Imagina que tu aplicación es una pizza 🍕:
- **Tu máquina local** = Tu cocina (funciona, pero solo para ti)
- **OpenShift** = Un restaurante con cocineros profesionales que pueden servir pizza a muchas personas
- **Contenedores (Docker)** = La caja donde empaquetas la pizza para que llegue igual a todas partes

### ¿Por qué usar OpenShift?

✅ **Escalabilidad Automática**: Si necesitas atender más usuarios, OpenShift crea más instancias de tu app automáticamente

✅ **Alta Disponibilidad**: Si una instancia falla, otra toma el control sin que los usuarios lo noten

✅ **Gestión Simplificada**: No necesitas saber de servidores, redes, configuraciones complejas

✅ **Rollback Automático**: Si algo sale mal, vuelves a la versión anterior con un comando

✅ **Monitoreo Integrado**: Ves en tiempo real el estado de tu aplicación

---

## 🧠 Conceptos Fundamentales

### 1. **Pod (Pods)**
**¿Qué es?** La unidad más pequeña en OpenShift. Un Pod ejecuta uno o más contenedores.

**Analogía**: Es como una computadora personal que ejecuta tus programas (contenedores).

```
┌─────────────────┐
│      Pod        │
│  ┌───────────┐  │
│  │ Container │  │  <- Tu aplicación SIPABWebService
│  │   (Java)  │  │
│  └───────────┘  │
└─────────────────┘
```

### 2. **Deployment**
**¿Qué es?** Define cómo quieres que se despliegue tu aplicación (cuántas copias, qué imagen usar, etc.).

**En tu caso**: Define que quieres 2 instancias de tu app Spring Boot.

```yaml
replicas: 2  # Quieres 2 copias de tu app
```

### 3. **Service**
**¿Qué es?** Un punto de entrada estable para acceder a tus Pods.

**Analogía**: Es como el número de teléfono de un servicio. Si cambia la persona (Pod), el número (Service) sigue siendo el mismo.

```
Cliente → Service (IP estable) → Pod 1 o Pod 2
```

### 4. **Route**
**¿Qué es?** Crea una URL pública para acceder a tu aplicación desde Internet.

**En tu caso**: `https://sipab-webservice.tuempresa.com`

### 5. **ConfigMap**
**¿Qué es?** Guarda configuraciones no sensibles.

**Ejemplo**: URLs de servicios externos, nombres de archivos, etc.

### 6. **Secret**
**¿Qué es?** Guarda información sensible (contraseñas, tokens, claves).

**Ejemplo**: Usuario/password de Oracle Database, tokens de APIs.

⚠️ **NUNCA** pongas Secrets en código Git. OpenShift los codifica automáticamente.

### 7. **Image (Imagen Docker)**
**¿Qué es?** Un paquete con tu aplicación y todo lo necesario para ejecutarla.

**En tu caso**: Tu JAR de Spring Boot + Java Runtime + configuración.

---

## 🏗️ Arquitectura de OpenShift

```
┌─────────────────────────────────────────────────────────┐
│                    OpenShift Platform                   │
├─────────────────────────────────────────────────────────┤
│                                                         │
│  ┌──────────────┐      ┌──────────────┐               │
│  │   Route      │ ───→ │   Service     │               │
│  │ (URL pública)│      │ (IP interna)  │               │
│  └──────────────┘      └──────┬────────┘               │
│                               │                         │
│                      ┌────────▼──────────┐            │
│                      │    Deployment     │            │
│                      │  replicas: 2     │            │
│                      └────────┬──────────┘            │
│                               │                        │
│                    ┌──────────┼──────────┐            │
│                    │          │          │            │
│               ┌────▼───┐  ┌──▼────┐                 │
│               │  Pod 1 │  │ Pod 2 │                 │
│               │ (App)  │  │ (App) │                 │
│               └────────┘  └───────┘                  │
│                                                         │
│  ┌────────────────┐    ┌────────────────┐             │
│  │  ConfigMap     │    │   Secret       │             │
│  │ (configuración)│    │ (passwords)    │             │
│  └────────────────┘    └────────────────┘             │
│                                                         │
└─────────────────────────────────────────────────────────┘
```

---

## 🎯 Tu Proyecto: SIPABWebService

### Análisis de tu Aplicación:

**Tipo**: Spring Boot 3.3.0 (Java 17)
**Puerto**: 8181
**Base de Datos**: Oracle
**Características**:
- API REST con Spring Web
- Integración con servicios SOAP (CBS, CRM, LDAP, ColdView)
- Documentación con OpenAPI/Swagger
- Spring Data JPA
- HikariCP para conexión de pools

### Archivos Creados para el Deployment:

1. **`Dockerfile`** → Construye la imagen Docker de tu aplicación
2. **`openshift/deployment.yaml`** → Define el deployment en OpenShift
3. **`openshift/configmap.yaml`** → Configuración de la aplicación
4. **`openshift/secret-template.yaml`** → Template para secrets

---

## 📝 Guía Paso a Paso para Deployment

### Prerrequisitos

Antes de comenzar, necesitas:

1. **Acceso a OpenShift Cluster**
   ```bash
   # Tu administrador te debe proporcionar:
   # - URL del cluster (ej: https://openshift.tuempresa.com)
   # - Tu usuario y contraseña
   # - El proyecto/namespace donde desplegar
   ```

2. **Herramientas Necesarias**:
   - ✅ OC CLI (OpenShift Command Line Interface)
   - ✅ Docker Desktop o Docker Engine
   - ✅ Maven (ya lo tienes en el proyecto)

---

### Paso 1: Instalar OpenShift CLI (OC)

#### Windows:
```powershell
# Descarga el instalador desde:
# https://github.com/openshift/origin/releases

# O usando Chocolatey:
choco install openshift-cli
```

#### Linux/Mac:
```bash
wget https://github.com/openshift/origin/releases/download/v4.12.0/openshift-client-linux.tar.gz
tar -xzf openshift-client-linux.tar.gz
sudo mv oc /usr/local/bin/
```

Verificar instalación:
```bash
oc version
```

---

### Paso 2: Conectarte a OpenShift

```bash
# Login a OpenShift (te pedirá usuario y contraseña)
oc login https://openshift.tuempresa.com:6443

# Ver tus proyectos disponibles
oc projects

# Cambiar al proyecto donde desplegarás
oc project sipab-proyecto
```

---

### Paso 3: Preparar los Secrets

**⚠️ IMPORTANTE**: Nunca subas contraseñas a Git. Los Secrets se crean manualmente.

#### 3.1 Crear Secret para Base de Datos Oracle

```bash
# Crear secret para Oracle DB
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'
```

#### 3.2 Crear Secrets para Servicios Externos

```bash
# Secret para CRM
oc create secret generic sipab-crm-secret \
  --from-literal=client-id='db11e7c865ce40eba6c876fd930457a3' \
  --from-literal=token='Token'

# Secret para ColdView
oc create secret generic sipab-coldview-secret \
  --from-literal=usuario='cvwssipab' \
  --from-literal=contrasenia='cvw2ss1p'
```

---

### Paso 4: Construir la Imagen Docker

#### Opción A: Build en OpenShift (Recomendado)

```bash
# Desde la raíz del proyecto
oc new-build --name=sipab-webservice --strategy=docker --binary

# Crear la imagen
oc start-build sipab-webservice --from-dir=. --follow
```

#### Opción B: Build Local y Push

```bash
# Construir imagen localmente
docker build -t sipab-webservice:1.0 .

# Tag para OpenShift Registry
docker tag sipab-webservice:1.0 registry.openshift.local/sipab-proyecto/sipab-webservice:1.0

# Push a OpenShift
docker push registry.openshift.local/sipab-proyecto/sipab-webservice:1.0
```

---

### Paso 5: Crear ConfigMap

```bash
# Aplicar ConfigMap
oc apply -f openshift/configmap.yaml
```

---

### Paso 6: Deploy la Aplicación

```bash
# Aplicar el deployment
oc apply -f openshift/deployment.yaml

# Ver el estado del deployment
oc rollout status deployment/sipab-webservice

# Ver los pods
oc get pods

# Ver logs
oc logs -f deployment/sipab-webservice
```

---

### Paso 7: Verificar la Aplicación

```bash
# Ver el status
oc status

# Ver todos los recursos
oc get all

# Deberías ver algo como:
# NAME                                    READY   STATUS    RESTARTS
# pod/sipab-webservice-abc123             1/1     Running   0
# pod/sipab-webservice-xyz789             1/1     Running   0

# service/sipab-webservice
# deployment/sipab-webservice
# route/sipab-webservice
```

---

### Paso 8: Acceder a la Aplicación

```bash
# Obtener la URL pública
oc get route sipab-webservice

# Abrir la URL en el navegador
# Ejemplo: https://sipab-webservice-sipab-proyecto.apps.openshift.com

# Probar el health check
curl https://sipab-webservice-.../actuator/health
```

---

## 🔧 Comandos Útiles

### Ver Logs

```bash
# Logs de un pod específico
oc logs sipab-webservice-abc123

# Logs de todos los pods del deployment
oc logs -f deployment/sipab-webservice

# Logs de los últimos 100 lines
oc logs --tail=100 deployment/sipab-webservice
```

### Escalar la Aplicación

```bash
# Escalar a 3 instancias
oc scale deployment/sipab-webservice --replicas=3

# Verificar
oc get pods
```

### Actualizar la Aplicación

```bash
# Método 1: Nuevo build y rollout
oc start-build sipab-webservice --from-dir=. --follow
oc rollout restart deployment/sipab-webservice

# Método 2: Rolling update (sin downtime)
oc set image deployment/sipab-webservice sipab-webservice=imagen:nueva-version
```

### Rollback (Revertir Cambios)

```bash
# Ver historial de deployments
oc rollout history deployment/sipab-webservice

# Revertir al deployment anterior
oc rollout undo deployment/sipab-webservice

# Revertir a una versión específica
oc rollout undo deployment/sipab-webservice --to-revision=2
```

### Shell en un Pod

```bash
# Obtener el nombre del pod
oc get pods

# Ejecutar shell
oc exec -it sipab-webservice-abc123 -- /bin/sh
```

### Eliminar Todo

```bash
# Eliminar deployment, service y route
oc delete all -l app=sipab-webservice

# Eliminar secrets
oc delete secret oracle-db-secret sipab-crm-secret sipab-coldview-secret

# Eliminar configmap
oc delete configmap sipab-config
```

---

## 🔍 Troubleshooting

### Problema: Pod no inicia (CrashLoopBackOff)

**Síntoma**:
```bash
oc get pods
# NAME                      STATUS
# sipab-webservice-abc123   CrashLoopBackOff
```

**Solución**:
```bash
# Ver los logs
oc logs sipab-webservice-abc123

# Ver eventos
oc get events --sort-by='.lastTimestamp'

# Posibles causas:
# - Error en la aplicación (revisa logs)
# - Falta configuración (secrets/configmap)
# - Problema con la base de datos
```

### Problema: No hay conectividad con la Base de Datos

**Síntoma**: Error `ORA-XXXXX` o timeout

**Solución**:
```bash
# Verificar que el secret existe
oc get secret oracle-db-secret

# Ver el contenido del secret (datos codificados)
oc describe secret oracle-db-secret

# Verificar las variables de entorno en el pod
oc exec sipab-webservice-abc123 -- env | grep ORACLE
```

### Problema: Health Check Falla

**Síntoma**: `Readiness probe failed`

**Solución**:
```bash
# Ver logs de la aplicación
oc logs sipab-webservice-abc123

# Verificar que el endpoint existe
oc exec sipab-webservice-abc123 -- wget -O- http://localhost:8181/actuator/health

# Ajustar los tiempos en deployment.yaml si la app tarda mucho en iniciar
```

### Problema: No se puede acceder por la Route

**Síntoma**: `404` o `503` al acceder por la URL

**Solución**:
```bash
# Verificar la route
oc get route sipab-webservice

# Ver la configuración de la route
oc describe route sipab-webservice

# Verificar que el service apunta correctamente
oc get service sipab-webservice
oc describe service sipab-webservice
```

---

## 📊 Monitoreo de la Aplicación

### Dashboard Web de OpenShift

```bash
# Abrir la consola web
oc console

# O desde tu navegador:
# https://console.openshift.com
```

### Métricas

```bash
# Ver uso de CPU y memoria
oc top pod

# Ver recursos del proyecto
oc adm top node
```

---

## 🎓 Conceptos Avanzados (Para el Futuro)

### 1. **Horizontal Pod Autoscaler (HPA)**
Escala automáticamente según uso de CPU/memoria.

### 2. **StatefulSets**
Para aplicaciones con estado (Bases de datos, caches).

### 3. **Service Mesh (Istio)**
Gestiona tráfico complejo entre microservicios.

### 4. **Operators**
Automatiza tareas complejas de gestión.

---

## 📚 Recursos Adicionales

- **Documentación oficial OpenShift**: https://docs.openshift.com
- **Documentación Kubernetes**: https://kubernetes.io/docs
- **Spring Boot en OpenShift**: https://developers.redhat.com/topics/spring-boot
- **Docker Docs**: https://docs.docker.com

---

## ✅ Checklist de Deployment

- [ ] OC CLI instalado y configurado
- [ ] Conectado a OpenShift cluster
- [ ] Secrets creados (oracle-db, crm, coldview)
- [ ] ConfigMap aplicado
- [ ] Imagen Docker construida
- [ ] Deployment aplicado
- [ ] Pods corriendo (READY 1/1)
- [ ] Route creada y accesible
- [ ] Health check funcionando
- [ ] Logs verificados sin errores

---

## 🎉 ¡Felicidades!

Si llegaste hasta aquí, ya sabes cómo deployar una aplicación en OpenShift. 

**Recuerda**:
- 💡 OpenShift es Kubernetes + herramientas adicionales
- 🐳 Docker empaqueta tu aplicación
- 🔒 Los Secrets son para datos sensibles
- 📈 Escalabilidad y alta disponibilidad vienen incluidos
- 🔄 Puedes hacer rollback fácilmente

**Próximos pasos**:
1. Practica con el proyecto actual
2. Experimenta con escalado (oc scale)
3. Aprende sobre monitoreo y logs
4. Investiga CI/CD con OpenShift

¡Éxito con tu deployment! 🚀

