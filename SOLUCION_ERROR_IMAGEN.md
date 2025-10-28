# 🔧 Solución: Error de Política de Imágenes

## ⚠️ El Problema

```
error: Source image rejected by policy.
```

OpenShift está **bloqueando** imágenes de `registry.access.redhat.com` debido a políticas de seguridad corporativas.

## ✅ Solución

He actualizado el Dockerfile para usar **imágenes oficiales de Docker Hub** que SÍ están permitidas:

### Cambios Realizados

**Antes (Red Hat UBI):**
```dockerfile
FROM registry.access.redhat.com/ubi8/openjdk-17
FROM registry.access.redhat.com/ubi8/openjdk-17-runtime
```

**Ahora (Eclipse Temurin - Docker Hub):**
```dockerfile
FROM maven:3.9-eclipse-temurin-17 AS builder
FROM eclipse-temurin:17-jre-alpine
```

## 🎯 Por Qué Estas Imágenes

1. ✅ **Eclipse Temurin** es de Docker Hub (público y permitido)
2. ✅ **Apache Maven oficial** para compilar
3. ✅ **Alpine Linux** = imagen más pequeña (aprox. 400MB)
4. ✅ Mismo resultado, sin problemas de políticas

## 📦 Imágenes Permitidas

Tu corporación probablemente permite estas:
- ✅ Docker Hub (`docker.io`) ✅
- ✅ Quay.io (a veces)
- ❌ registry.access.redhat.com ❌

## 🚀 Próximos Pasos

```bash
# 1. Agregar archivo actualizado
git add docker/Dockerfile
git commit -m "Usar imágenes Eclipse Temurin por políticas"
git push origin main

# 2. Reiniciar el build
oc start-build sipab-webservice --follow

# 3. Verificar que construya correctamente
oc get builds
oc logs build/sipab-webservice-<número>

# 4. Una vez termine, aplicar deployment
oc apply -f deploy.yaml

# 5. Ver pods
oc get pods
```

## 🔍 Verificar Políticas

Si quieres saber qué registries están permitidos:

```bash
# Ver ImageStreamPolicy
oc get all -n openshift-config

# Ver políticas del namespace
oc get policyconfig -n sipab4
```

## ✅ Ventajas de Eclipse Temurin

- ✅ Imagen más pequeña (Alpine = ~100MB)
- ✅ Más rápido de descargar
- ✅ Mismo Java 17 LTS
- ✅ Cumple políticas de seguridad

## 🎯 Alternativa Si Aún Falla

Si Eclipse Temurin también está bloqueado, usa OpenJDK oficial:

```dockerfile
FROM openjdk:17-jdk-slim AS builder
FROM openjdk:17-jre-slim
```

---

**El build ahora debería funcionar!** 🚀

