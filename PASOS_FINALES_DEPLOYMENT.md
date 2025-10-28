# 🚀 Pasos Finales para Deployment

## ⚠️ Aún NO está deployado

Para que funcione necesitas:

## 📋 Checklist

- [ ] **Subir archivos nuevos a GitHub**
- [ ] **Crear secret para base de datos**
- [ ] **Eliminar deployment anterior (el que da 503)**
- [ ] **Importar desde GitHub en OpenShift**
- [ ] **Verificar pods corriendo**
- [ ] **Crear Route**

## 🎯 Paso 1: Subir Archivos a GitHub

Los archivos nuevos que creamos:

```bash
# Agregar archivos nuevos
git add docker/ deploy.yaml devfile.yaml

# Verificar que estén incluidos
git status

# Commit
git commit -m "Adaptar proyecto al patrón Red Hat con devfile"

# Push a GitHub
git push origin main
```

**Espera** unos minutos a que GitHub se actualice.

## 🎯 Paso 2: Crear Secret en OpenShift

```bash
# Conectarte a OpenShift
oc login https://tu-openshift-cluster:6443
oc project sipab4

# Crear secret
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'
```

## 🎯 Paso 3: Limpiar Deployment Anterior

El deployment actual da error 503. Hay que eliminarlo:

```bash
# Eliminar todo el deployment viejo
oc delete all -l app=sipab-webservice
oc delete deployment sipab-web-service-git1
oc delete service sipab-web-service-git1
oc delete route sipab-web-service-git1

# Opcional: eliminar buildconfig viejo
oc delete buildconfig sipab-webservice
```

## 🎯 Paso 4: Importar Desde GitHub

### Opción A: Web Console (RECOMENDADO)

1. Ve a OpenShift Web Console
2. Click **+Add**
3. Click **From Git**
4. URL: `https://github.com/Luis-Zendel/sipab-web-service.git`
5. Click **"Show advanced Git options"**
6. OpenShift detectará automáticamente el `devfile.yaml` ✅
7. Click **Create**

OpenShift ahora:
- ✅ Construirá la imagen
- ✅ Creará los pods
- ✅ Configurará todo automáticamente

### Opción B: CLI

```bash
# Importar desde GitHub
oc apply -f https://raw.githubusercontent.com/Luis-Zendel/sipab-web-service/main/devfile.yaml

# O manualmente construir
oc new-build --name=sipab-webservice --strategy=docker --binary
cd c:\Users\INETUM\Downloads\SIPABWebService\SIPABWebService
oc start-build sipab-webservice --from-dir=. --follow

# Aplicar deployment
oc apply -f https://raw.githubusercontent.com/Luis-Zendel/sipab-web-service/main/deploy.yaml
```

## 🎯 Paso 5: Verificar Deployment

```bash
# Ver estado de los pods
oc get pods -w

# Deberías ver algo como:
# NAME                              READY   STATUS
# sipab-webservice-abc123            1/1     Running
# sipab-webservice-xyz789            1/1     Running

# Ver logs
oc logs -f deployment/sipab-webservice

# Ver todos los recursos
oc get all -l app=sipab-webservice
```

## 🎯 Paso 6: Crear Route (Acceso Público)

```bash
# Crear route
oc expose service sipab-webservice-svc --port=8181

# Obtener URL pública
oc get route sipab-webservice-svc

# Deberías ver algo como:
# NAME                      HOST/PORT
# sipab-webservice-svc      sipab-webservice-svc-sipab4.apps.openshift.com
```

## 🎯 Paso 7: Acceder a la Aplicación

Una vez tienes la URL, accede a:

```
https://<route-url>/swagger-ui.html
https://<route-url>/actuator/health
```

## 🔍 Verificación Final

```bash
# Ver estado completo
oc get all

# Verificar que NO hay error 503
curl -I https://<route-url>/actuator/health

# Debería retornar:
# HTTP/1.1 200 OK
```

## ⏱️ Tiempo Estimado

- Paso 1 (Push a GitHub): 1 minuto
- Paso 2 (Secret): 30 segundos
- Paso 3 (Limpiar): 1 minuto
- Paso 4 (Importar): 10-15 minutos (construcción de imagen)
- Paso 5 (Verificar): Continuo
- Paso 6 (Route): 30 segundos

**Total:** ~15-20 minutos

## 🚨 Si Sigue Viendo 503

```bash
# Ver por qué está fallando
oc get pods
oc describe pod <nombre-del-pod>
oc logs <nombre-del-pod>

# Ver eventos
oc get events --sort-by='.lastTimestamp'

# Verificar secrets
oc get secret oracle-db-secret
oc describe secret oracle-db-secret
```

## 📊 Estado Actual

Basándome en lo que me dijiste antes:
- ✅ Service existe
- ✅ Route existe  
- ❌ Pero da 503 (no hay pods corriendo)

**Esto confirma que necesitas:**
1. Eliminar el deployment viejo
2. Subir archivos nuevos a GitHub
3. Importar desde GitHub
4. Esperar a que OpenShift construya y despliegue

## ✅ Una Vez Completo

```bash
# Verás estos recursos:
oc get all

# NAME                                  READY   STATUS
# pod/sipab-webservice-abc123           1/1     Running
# pod/sipab-webservice-xyz789           1/1     Running
# 
# NAME                          TYPE      CLUSTER-IP
# service/sipab-webservice-svc ClusterIP  172.30.213.22
# 
# NAME                              HOST/PORT
# route/sipab-webservice-svc        sipab-webservice-svc-sipab4.apps...

# Y podrás acceder a:
# https://sipab-webservice-svc-sipab4.apps.../swagger-ui.html
```

---

**Resumen**: Los archivos nuevos están listos, pero aún NO están en GitHub ni en OpenShift. Sigue los pasos arriba para completar el deployment! 🚀

