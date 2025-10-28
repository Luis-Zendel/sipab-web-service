# 🚀 Solución FINAL: Build Manual en OpenShift

## ⚠️ Problema

El `Dockerfile` no está en la raíz del repositorio de GitHub (o hay un problema con la estructura).

## ✅ Solución: Binary Build (Desde tu Máquina Local)

Esta es la solución **MÁS CONFIALE** porque envía los archivos desde tu PC:

### Paso 1: Conectarse a OpenShift

```powershell
# En PowerShell
oc login https://tu-openshift-cluster:6443
oc project sipab4
```

### Paso 2: Eliminar BuildConfig Anterior

```powershell
oc delete buildconfig sipab-webservice
```

### Paso 3: Crear BuildConfig para Binary Build

```powershell
oc new-build --name=sipab-webservice --strategy=docker --binary
```

### Paso 4: Construir desde tu Máquina Local

```powershell
# Navegar a la raíz del proyecto
cd c:\Users\INETUM\Downloads\SIPABWebService\SIPABWebService

# Iniciar el build desde tu máquina (envía TODOS los archivos)
oc start-build sipab-webservice --from-dir=. --follow
```

Este comando:
- ✅ Envía el Dockerfile desde tu PC
- ✅ Envía todo el proyecto (pom.xml, src, etc.)
- ✅ NO depende de GitHub
- ✅ Es más rápido

### Paso 5: Verificar que Terminó Correctamente

```powershell
# Ver builds
oc get builds

# Ver imagen
oc get imagestream

# Ver logs del último build
oc logs build/sipab-webservice-1
```

Si ves **Complete**, el build fue exitoso! 🎉

---

## 📋 Después del Build Exitoso

### 1. Crear Secrets

```powershell
oc create secret generic oracle-db-secret `
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' `
  --from-literal=username='MBGWOWN' `
  --from-literal=password='september#11'
```

### 2. Aplicar Deployment

```powershell
oc apply -f deploy.yaml
```

### 3. Verificar Aplicación

```powershell
# Ver pods
oc get pods

# Ver logs
oc logs -f deployment/sipab-webservice

# Obtener URL pública
oc get route sipab-webservice
```

---

## 🔄 Si el Deployment Necesita Ajustar la Imagen

Si ves que el deployment usa la imagen incorrecta, edita el `deploy.yaml`:

```yaml
# Cambiar de:
image: image-registry.openshift-image-registry.svc:5000/sipab-proyecto/sipab-webservice:latest

# A:
image: sipab-webservice:latest
```

Y vuelve a aplicar:
```powershell
oc apply -f deploy.yaml
```

---

## 🎯 Alternativa: Subir Dockerfile a GitHub

Si prefieres usar Git build en lugar de binary build:

1. **Verifica que el Dockerfile esté en GitHub**:
   - Ve a: https://github.com/Luis-Zendel/sipab-web-service
   - Debe ver `Dockerfile` en la raíz

2. **Si NO está, súbelo**:
```powershell
git add Dockerfile
git commit -m "Agregar Dockerfile"
git push origin main
```

3. **Luego usa el BuildConfig actualizado**:
```powershell
oc delete buildconfig sipab-webservice
oc apply -f buildconfig.yaml
oc start-build sipab-webservice --follow
```

---

## 🚨 Troubleshooting

### Error: "buildconfig not found"
```powershell
# Crear BuildConfig si no existe
oc new-build --name=sipab-webservice --strategy=docker --binary
```

### Error: "could not find Dockerfile"
```powershell
# Verificar que estás en la raíz del proyecto
ls Dockerfile

# Si no está, verifica que lo agregaste
git status
```

### Error: "connection refused"
```powershell
# Re-conectar a OpenShift
oc logout
oc login https://tu-openshift-cluster:6443
oc project sipab4
```

### Build tarda mucho
```powershell
# Ver progreso en tiempo real
oc logs build/sipab-webservice-1 --follow
```

---

## ✅ Checklist Final

- [ ] Conectado a OpenShift (`oc login`)
- [ ] En el proyecto correcto (`oc project sipab4`)
- [ ] BuildConfig creado con `--binary`
- [ ] Build iniciado con `--from-dir=.`
- [ ] Build completado exitosamente
- [ ] Secret creado
- [ ] Deployment aplicado
- [ ] Pods corriendo
- [ ] Application accesible

---

## 💡 Recomendación Final

**Usa Binary Build** porque:
- ✅ No depende de la estructura de GitHub
- ✅ Es más rápido
- ✅ Puedes construir mientras desarrollas
- ✅ No necesitas push/commit por cada cambio

Solo copia y pega estos comandos:

```powershell
# 1. Login y proyecto
oc login https://tu-cluster:6443
oc project sipab4

# 2. Crear/actualizar BuildConfig
oc delete buildconfig sipab-webservice
oc new-build --name=sipab-webservice --strategy=docker --binary

# 3. Build desde tu PC
cd c:\Users\INETUM\Downloads\SIPABWebService\SIPABWebService
oc start-build sipab-webservice --from-dir=. --follow

# 4. Una vez termine, secret y deploy
oc create secret generic oracle-db-secret --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' --from-literal=username='MBGWOWN' --from-literal=password='september#11'
oc apply -f deploy.yaml

# 5. Ver pods
oc get pods
```

¡Éxito! 🚀

