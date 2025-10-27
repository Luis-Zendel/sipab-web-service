# 🚀 Guía Rápida de Deployment en OpenShift

## ⚡ Comandos para Deployment Rápido

### 1. Login y Configuración Inicial

```bash
# Login a OpenShift
oc login https://openshift.tuempresa.com:6443

# Crear/Seleccionar proyecto
oc new-project sipab-webservice || oc project sipab-webservice
```

### 2. Crear Secrets

```bash
# Secret para Oracle Database
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'

# Verificar
oc get secret oracle-db-secret
```

### 3. Build y Push de Imagen

```bash
# Desde la raíz del proyecto SIPABWebService

# Build en OpenShift (Recomendado)
oc new-build --name=sipab-webservice --strategy=docker --binary
oc start-build sipab-webservice --from-dir=. --follow

# O build local y push
docker build -t sipab-webservice:1.0 .
docker tag sipab-webservice:1.0 default-route-openshift-image-registry.apps.openshift.local/sipab-webservice/sipab-webservice:1.0
docker push default-route-openshift-image-registry.apps.openshift.local/sipab-webservice/sipab-webservice:1.0
```

### 4. Deployment

```bash
# Aplicar ConfigMap
oc apply -f openshift/configmap.yaml

# Aplicar Deployment
oc apply -f openshift/deployment.yaml

# Verificar estado
oc rollout status deployment/sipab-webservice
```

### 5. Verificar Aplicación

```bash
# Ver pods
oc get pods

# Ver logs
oc logs -f deployment/sipab-webservice

# Ver todos los recursos
oc get all

# Obtener URL pública
oc get route sipab-webservice

# Probar health check
curl https://sipab-webservice-.../actuator/health
```

## 🎯 Verificación Final

```bash
# ✓ Pods corriendo
oc get pods
# Esperado: 2/2 pods con READY 1/1 y STATUS Running

# ✓ Health check pasando
curl $(oc get route sipab-webservice -o jsonpath='{.spec.host}')/actuator/health

# ✓ Logs sin errores
oc logs -f deployment/sipab-webservice | grep ERROR
```

## 🔄 Comandos de Mantenimiento

### Actualizar la Aplicación

```bash
# 1. Hacer cambios en el código
# 2. Build
oc start-build sipab-webservice --from-dir=. --follow

# 3. Rollout restart
oc rollout restart deployment/sipab-webservice

# 4. Verificar
oc rollout status deployment/sipab-webservice
```

### Escalar Aplicación

```bash
# Escalar a 3 pods
oc scale deployment/sipab-webservice --replicas=3

# Ver pods
oc get pods
```

### Rollback (Revertir)

```bash
# Ver historial
oc rollout history deployment/sipab-webservice

# Revertir
oc rollout undo deployment/sipab-webservice
```

### Eliminar Deployment

```bash
# Eliminar todo
oc delete all -l app=sipab-webservice
oc delete configmap sipab-config
oc delete secret oracle-db-secret
```

## 🐛 Troubleshooting Rápido

### Pod no inicia
```bash
oc logs <nombre-del-pod>
oc describe pod <nombre-del-pod>
```

### No hay conexión a BD
```bash
oc get secret oracle-db-secret
oc describe deployment sipab-webservice
```

### Ver eventos recientes
```bash
oc get events --sort-by='.lastTimestamp'
```

### Shell en el pod
```bash
oc exec -it <nombre-del-pod> -- /bin/sh
```

## 📊 Recursos del Proyecto

- **Dockerfile**: Root del proyecto
- **openshift/deployment.yaml**: Configuración de deployment
- **openshift/configmap.yaml**: Configuración de la app
- **OPENSHIFT_GUIA_COMPLETA.md**: Documentación detallada

---

**¿Necesitas ayuda?** Revisa `OPENSHIFT_GUIA_COMPLETA.md` para más detalles.

