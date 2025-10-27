# 🚀 SIPABWebService - Deployment en OpenShift

## 📋 Resumen del Proyecto

**SIPABWebService** es una aplicación Spring Boot que proporciona servicios REST para SIPAB corporativo, integrando con múltiples sistemas externos mediante servicios SOAP.

### Tecnologías Utilizadas
- **Java 17**
- **Spring Boot 3.3.0**
- **Spring Data JPA**
- **Oracle Database** (ojdbc11)
- **Apache CXF** para servicios SOAP
- **OpenAPI/Swagger** para documentación
- **Spring Actuator** para health checks

### Integraciones Externas
- CBS (ARServices)
- CRM (Customer Management Service)
- LDAP (Authentication)
- ColdView
- Sicatel
- TroubleTicket

---

## 📁 Archivos para Deployment en OpenShift

### Archivos Principales

```
SIPABWebService/
├── Dockerfile                          # Construcción de imagen Docker
├── openshift/
│   ├── deployment.yaml                  # Configuración de deployment OpenShift
│   ├── configmap.yaml                  # Configuraciones de la aplicación
│   ├── secret-template.yaml            # Template para secrets
│   └── application-openshift.properties # Configuración alternativa
├── src/main/resources/
│   ├── application.properties          # Configuración local
│   └── application-openshift.properties # Configuración para OpenShift
├── OPENSHIFT_GUIA_COMPLETA.md          # Documentación detallada
├── OPENSHIFT_DEPLOYMENT_GUIA_RAPIDA.md # Guía rápida de comandos
└── README_OPENSHIFT.md                 # Este archivo
```

---

## 🎯 Análisis y Estrategia de Deployment

### Opciones de Deployment en OpenShift

#### ✅ **Opción Recomendada: Source-to-Image (S2I)**

**Ventajas:**
- ✅ Build automático desde código fuente
- ✅ Integración con Git
- ✅ Re-build automático en cada push
- ✅ Menor complejidad de configuración

**Cuándo usar:** Proyectos con código fuente en repositorio Git

#### ⚙️ **Opción Alternativa: Docker Build**

**Ventajas:**
- ✅ Control total del proceso de build
- ✅ Optimización de la imagen
- ✅ Build local y push manual

**Cuándo usar:** Cuando necesitas un build más controlado

---

### 🏗️ Arquitectura del Deployment

```
┌─────────────────────────────────────────────────────────┐
│                    OpenShift Platform                   │
├─────────────────────────────────────────────────────────┤
│                                                         │
│  ┌────────────────────────────────────┐                │
│  │        Route (URL Pública)         │                │
│  │ https://sipab-webservice...        │                │
│  └────────────┬───────────────────────┘                │
│               │                                          │
│        ┌──────▼───────┐                                │
│        │   Service     │                                │
│        │  ClusterIP    │                                │
│        └──────┬────────┘                                │
│               │                                          │
│       ┌───────▼────────┐                                │
│       │   Deployment   │                                │
│       │  replicas: 2   │                                │
│       └───────┬────────┘                                │
│               │                                          │
│      ┌────────┼────────┐                               │
│      │        │        │                               │
│  ┌───▼───┐ ┌──▼───┐                                  │
│  │ Pod 1 │ │Pod 2 │                                  │
│  │  App  │ │ App  │                                  │
│  └───┬───┘ └──▲───┘                                  │
│      │        │                                        │
│  ┌───▼────────▼───┐                                  │
│  │  ConfigMap &    │                                  │
│  │  Secrets        │                                  │
│  └─────────────────┘                                  │
│                                                         │
└─────────────────────────────────────────────────────────┘
                     │
                     ▼
         Oracle Database
           (10.191.105.18)
```

---

## 🔧 Preparación de la Aplicación

### Cambios Realizados

1. **Agregado Spring Actuator** (`pom.xml`)
   - Health checks para liveness y readiness probes
   - Endpoints de monitoreo

2. **Configuración para OpenShift** (`application-openshift.properties`)
   - Variables de entorno para configuración dinámica
   - Health checks habilitados
   - Pool de conexiones optimizado

3. **Dockerfile Optimizado**
   - Multi-stage build para imagen ligera
   - Usuario no-root para seguridad
   - Health check integrado

4. **Manifiestos de OpenShift**
   - Deployment con 2 réplicas
   - Liveness y readiness probes
   - Resource limits y requests
   - Security context

---

## 📝 Pasos para Deployment

### Prerequisitos

```bash
# 1. Instalar OpenShift CLI
# Descargar desde: https://github.com/openshift/origin/releases

# 2. Verificar instalación
oc version

# 3. Login a OpenShift
oc login https://your-openshift-cluster:6443

# 4. Crear o seleccionar proyecto
oc new-project sipab-webservice
# o
oc project sipab-webservice
```

### Deployment Completo

#### Paso 1: Crear Secrets

```bash
# Secret para Oracle Database
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'
```

#### Paso 2: Build de la Imagen

**Opción A: S2I Build (Recomendado)**

```bash
oc new-build --name=sipab-webservice --strategy=docker --binary
oc start-build sipab-webservice --from-dir=. --follow
```

**Opción B: Build Local**

```bash
# Construir imagen
docker build -t sipab-webservice:1.0 .

# Push a registry de OpenShift
docker tag sipab-webservice:1.0 default-route-openshift-image-registry.apps.openshift.local/sipab-webservice/sipab-webservice:1.0
docker push default-route-openshift-image-registry.apps.openshift.local/sipab-webservice/sipab-webservice:1.0
```

#### Paso 3: Deploy de la Aplicación

```bash
# Aplicar configuración
oc apply -f openshift/configmap.yaml

# Aplicar deployment
oc apply -f openshift/deployment.yaml

# Verificar estado
oc rollout status deployment/sipab-webservice

# Ver pods
oc get pods
```

#### Paso 4: Verificar Deployment

```bash
# Ver todos los recursos
oc get all

# Ver logs
oc logs -f deployment/sipab-webservice

# Obtener URL pública
oc get route sipab-webservice
```

---

## 🔍 Monitoreo y Troubleshooting

### Comandos Útiles

```bash
# Ver estado de los pods
oc get pods

# Ver logs en tiempo real
oc logs -f deployment/sipab-webservice

# Ver descripción del pod
oc describe pod <pod-name>

# Ver eventos
oc get events --sort-by='.lastTimestamp'

# Shell en el pod
oc exec -it <pod-name> -- /bin/sh

# Escalar aplicación
oc scale deployment/sipab-webservice --replicas=3

# Verificar health check
curl https://<route-url>/actuator/health
```

### Troubleshooting Común

**Problema**: Pod en CrashLoopBackOff
```bash
oc logs <pod-name>
oc describe pod <pod-name>
```

**Problema**: Health check falla
```bash
# Verificar variables de entorno
oc exec <pod-name> -- env

# Verificar conectividad
oc exec <pod-name> -- wget -O- http://localhost:8181/actuator/health
```

**Problema**: No hay conexión a BD
```bash
# Verificar secret
oc get secret oracle-db-secret
oc describe secret oracle-db-secret
```

---

## 📊 Estrategias de Deployment

### Rolling Update (Default)

```bash
# Actualizar a nueva versión
oc set image deployment/sipab-webservice sipab-webservice=imagen:nueva-version

# Ver progreso
oc rollout status deployment/sipab-webservice
```

### Rollback

```bash
# Ver historial
oc rollout history deployment/sipab-webservice

# Revertir
oc rollout undo deployment/sipab-webservice
```

---

## 🔒 Seguridad

### Implementado

- ✅ Usuario no-root en contenedor
- ✅ Security context configurado
- ✅ Secrets para datos sensibles
- ✅ Resource limits configurados
- ✅ Health checks habilitados

### Recomendaciones Adicionales

- Usar certificados TLS para route
- Implementar Network Policies
- Configurar Pod Security Standards
- Usar Vault para secrets

---

## 📚 Documentación Adicional

- **Guía Completa**: [`OPENSHIFT_GUIA_COMPLETA.md`](OPENSHIFT_GUIA_COMPLETA.md)
- **Guía Rápida**: [`OPENSHIFT_DEPLOYMENT_GUIA_RAPIDA.md`](OPENSHIFT_DEPLOYMENT_GUIA_RAPIDA.md)

---

## 🎓 Para Desarrolladores Junior

### Conceptos Clave

1. **Pod**: Contenedor en ejecución
2. **Deployment**: Define cómo ejecutar tu app
3. **Service**: Punto de acceso estable
4. **Route**: URL pública
5. **Secret**: Información sensible
6. **ConfigMap**: Configuración

### Flujo de Trabajo

```
1. Desarrollo → 2. Commit → 3. Push → 4. Build → 5. Deploy → 6. Monitoreo
```

### Comandos Más Usados

```bash
# Ver estado
oc get pods

# Ver logs
oc logs -f deployment/sipab-webservice

# Aplicar cambios
oc apply -f openshift/deployment.yaml

# Acceder a la app
oc get route
```

---

## ✅ Checklist de Deployment

- [ ] OC CLI instalado
- [ ] Conectado a OpenShift
- [ ] Secrets creados
- [ ] Build de imagen completado
- [ ] Deployment aplicado
- [ ] Pods corriendo (READY 1/1)
- [ ] Route accesible
- [ ] Health check pasando
- [ ] Logs sin errores

---

## 🆘 Soporte

Si encuentras problemas:

1. Revisa los logs: `oc logs -f deployment/sipab-webservice`
2. Verifica eventos: `oc get events`
3. Consulta la documentación completa en [`OPENSHIFT_GUIA_COMPLETA.md`](OPENSHIFT_GUIA_COMPLETA.md)

---

**¡Listo para deployar! 🚀**

