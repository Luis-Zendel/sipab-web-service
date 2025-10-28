# 🔧 Solución: Error "no such file or directory" en Docker Build

## ⚠️ Problema

```
error: open /tmp/build/inputs/docker/Dockerfile: no such file or directory
```

Este error ocurre cuando OpenShift busca el Dockerfile pero no lo encuentra en la ubicación esperada.

## ✅ Soluciones

### Solución 1: Usar BuildConfig Actualizado (RECOMENDADO)

He actualizado el `buildconfig.yaml` para que busque correctamente el Dockerfile en la raíz del repositorio.

```bash
# Eliminar el BuildConfig anterior (si existe)
oc delete buildconfig sipab-webservice

# Aplicar el BuildConfig corregido
oc apply -f buildconfig.yaml

# Iniciar el build
oc start-build sipab-webservice --follow
```

### Solución 2: Construir desde la Raíz del Proyecto

Si estás usando la Web Console, asegúrate de que:

1. **Build Type**: Dockerfile
2. **Dockerfile Path**: Debe estar vacío o poner simplemente `Dockerfile`
3. **Context Directory**: Debe estar vacío o ser `/`

### Solución 3: Build Local y Push

Si continúas con problemas, construye localmente y luego haz push:

```bash
# 1. Construir la imagen localmente
docker build -t sipab-webservice:latest .

# 2. Tag para OpenShift Registry
docker tag sipab-webservice:latest \
  default-route-openshift-image-registry.apps.openshift.com/sipab4/sipab-webservice:latest

# 3. Login al registry
docker login -u $(oc whoami) -p $(oc whoami -t) \
  default-route-openshift-image-registry.apps.openshift.com

# 4. Push
docker push default-route-openshift-image-registry.apps.openshift.com/sipab4/sipab-webservice:latest

# 5. Aplicar deployment (actualiza la imagen)
oc apply -f deploy.yaml
```

### Solución 4: Usar Binary Build (S2I)

Alternativa más simple:

```bash
# Crear BuildConfig con binary build
oc new-build --name=sipab-webservice \
  --strategy=docker \
  --binary \
  --docker-image=maven:3.9-eclipse-temurin-17

# Construir desde directorio local
oc start-build sipab-webservice --from-dir=. --follow
```

## 📋 Verificación de Archivos en GitHub

Asegúrate de que estos archivos están en la **raíz** de tu repositorio en GitHub:

- ✅ `Dockerfile`
- ✅ `pom.xml`
- ✅ `src/` (carpeta completa)
- ✅ `.dockerignore` (opcional)

**NO deben estar en subcarpetas**.

## 🔍 Comandos de Diagnóstico

```bash
# Ver el estado del BuildConfig
oc describe buildconfig sipab-webservice

# Ver los logs del build actual
oc logs build/sipab-webservice-1

# Ver eventos recientes
oc get events --sort-by='.lastTimestamp'

# Verificar estructura del repo
git ls-files | grep -E "Dockerfile|pom.xml"
```

## 🎯 Estructura Correcta del Repositorio

Tu repositorio debe verse así en la **raíz**:

```
sipab-web-service/
├── Dockerfile              ← DEBE estar en la raíz
├── pom.xml                 ← DEBE estar en la raíz
├── src/
│   └── main/
│       └── java/
│           └── ...
├── deploy.yaml
├── buildconfig.yaml
└── .gitignore
```

## 🚀 Deployment Paso a Paso

### Opción A: Usar BuildConfig (Recomendado para CI/CD)

```bash
# 1. Eliminar BuildConfig anterior si existe
oc delete buildconfig sipab-webservice

# 2. Aplicar BuildConfig corregido
oc apply -f buildconfig.yaml

# 3. Iniciar build
oc start-build sipab-webservice --follow

# 4. Verificar que la imagen se creó
oc get imagestream sipab-webservice

# 5. Aplicar deployment
oc apply -f deploy.yaml

# 6. Verificar pods
oc get pods
```

### Opción B: Build Binario Local (Más Rápido)

```bash
# 1. Eliminar BuildConfig anterior
oc delete buildconfig sipab-webservice

# 2. Crear nuevo BuildConfig para binary build
oc new-build --name=sipab-webservice \
  --strategy=docker \
  --binary

# 3. Iniciar build desde directorio actual
oc start-build sipab-webservice --from-dir=. --follow

# 4. Una vez termine, aplicar deployment
oc apply -f deploy.yaml

# 5. Crear secrets
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'

# 6. Ver pods
oc get pods
```

## 📚 Ver Archivos en GitHub

Puedes verificar en el navegador que el Dockerfile esté en la raíz:

```
https://github.com/Luis-Zendel/sipab-web-service/blob/main/Dockerfile
```

Si ves un 404, significa que el Dockerfile NO está en la raíz.

## ✅ Checklist

- [ ] `Dockerfile` está en la raíz del repositorio en GitHub
- [ ] `pom.xml` está en la raíz
- [ ] BuildConfig fue actualizado
- [ ] Build se ejecuta sin errores
- [ ] Imagen se crea correctamente
- [ ] Deployment aplicado
- [ ] Pods corriendo

## 🆘 Si Continúa el Error

Si después de seguir estos pasos sigue fallando:

1. **Verifica que el Dockerfile esté en GitHub**:
   ```bash
   git ls-files | grep Dockerfile
   ```

2. **Haz commit y push si no está**:
   ```bash
   git add Dockerfile
   git commit -m "Agregar Dockerfile a la raíz"
   git push origin main
   ```

3. **Construye manualmente** (solución más confiable):
   ```bash
   # Elimina todo
   oc delete all -l app=sipab-webservice
   oc delete buildconfig sipab-webservice
   
   # Build manual
   oc new-build --name=sipab-webservice --strategy=docker --binary
   oc start-build sipab-webservice --from-dir=. --follow
   ```

---

**La solución más confiable es usar binary build (`--from-dir=.`)** 🚀

