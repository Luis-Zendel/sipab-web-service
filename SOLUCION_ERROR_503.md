# 🔧 Solución: Error 503 Service Unavailable

## 📊 ¿Qué Significa el Error 503?

**Status Code: 503 Service Unavailable**

Este error significa:
- ✅ **Route funciona**: La URL pública está activa
- ✅ **Service funciona**: Está recibiendo requests
- ❌ **Pods no disponibles**: Los pods no están corriendo o no están listos

## 🔍 Diagnóstico Rápido

Ejecuta estos comandos para ver qué está pasando:

```bash
# 1. Ver el estado de los Pods
oc get pods -l app=sipab-web-service-git1

# 2. Ver eventos recientes
oc get events --sort-by='.lastTimestamp'

# 3. Ver logs (si hay pods)
oc logs -l app=sipab-web-service-git1

# 4. Ver descripción del Deployment
oc describe deployment sipab-web-service-git1
```

## 🎯 Posibles Causas

### 1. **No hay Pods creados**
El deployment puede haber fallado.

**Solución:**
```bash
# Ver si hay deployment
oc get deployment

# Si no existe, aplicar tu deployment
oc apply -f deploy.yaml
```

### 2. **Pods están en CrashLoopBackOff**
Los pods se crean pero fallan inmediatamente.

**Diagnóstico:**
```bash
oc get pods
# Verás algo como:
# NAME                          STATUS
# sipab-web-service-git1-abc    CrashLoopBackOff
```

**Solución:**
```bash
# Ver logs para entender el error
oc logs pod/sipab-web-service-git1-abc

# Posibles causas:
# - Falta configuración (secrets)
# - Error en la aplicación
# - Problema con la base de datos
```

### 3. **Pods están en Pending**
OpenShift no puede crear los pods (falta de recursos, problemas de red, etc.).

**Diagnóstico:**
```bash
oc get pods
# NAME                          STATUS
# sipab-web-service-git1-abc    Pending
```

**Solución:**
```bash
# Ver por qué está pending
oc describe pod <nombre-del-pod>

# Verificar recursos
oc describe quota sipab4-quota -n sipab4
```

### 4. **Readiness Probe fallando**
Los pods están creados pero no están "listos" para recibir tráfico.

**Diagnóstico:**
```bash
oc get pods
# NAME                          STATUS
# sipab-web-service-git1-abc    Running (pero no Ready)
```

## 🔧 Soluciones por Escenario

### Escenario A: No tienes Deployment

```bash
# Crear el deployment
oc apply -f deploy.yaml

# Ver pods
oc get pods -w
```

### Escenario B: Deployment existe pero sin Pods

```bash
# Ver el deployment
oc get deployment sipab-web-service-git1

# Si no está corriendo, escalar manualmente
oc scale deployment/sipab-web-service-git1 --replicas=1

# Esperar a que se creen los pods
oc get pods -w
```

### Escenario C: Pods en CrashLoopBackOff

```bash
# Ver logs
oc logs -l app=sipab-web-service-git1

# Si ves errores de base de datos, crear el secret:
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'

# Reiniciar pods
oc delete pods -l app=sipab-web-service-git1
```

### Escenario D: Falta Build de la Imagen

```bash
# Ver builds
oc get builds

# Si no hay imagen, construir:
oc new-build --name=sipab-webservice --strategy=docker --binary
cd c:\Users\INETUM\Downloads\SIPABWebService\SIPABWebService
oc start-build sipab-webservice --from-dir=. --follow
```

## ✅ Checklist de Verificación

```bash
# Ejecuta estos comandos en orden:

# 1. ¿Hay pods?
oc get pods

# 2. ¿Qué estado tienen?
# Deberían decir "Running" y "Ready 1/1"

# 3. ¿Hay deployment?
oc get deployment

# 4. ¿Hay secrets?
oc get secret

# 5. ¿Hay build completo?
oc get builds
oc get imagestream

# 6. ¿El route existe?
oc get route
```

## 🎯 Solución Rápida (Empezar de Cero)

Si nada funciona, empezar de cero:

```bash
# 1. Limpiar todo
oc delete all -l app=sipab-webservice
oc delete deployment sipab-web-service-git1
oc delete service sipab-web-service-git1

# 2. Crear secret
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'

# 3. Aplicar deployment
oc apply -f deploy.yaml

# 4. Verificar
oc get pods -w

# 5. Esperar a que cambien a "Running"
# Presionar Ctrl+C cuando veas "Running"

# 6. Probar de nuevo en el navegador
```

## 📊 Entender el Estado de los Pods

```bash
oc get pods
```

**Estados que puedes ver:**
- ✅ **Running** + **Ready 1/1** = Todo bien
- ⚠️ **Running** + **Ready 0/1** = Aún iniciando (esperar)
- 🔴 **CrashLoopBackOff** = Falla constantemente (ver logs)
- 🔴 **Pending** = No puede iniciar (ver eventos)
- 🔴 **ImagePullBackOff** = Problema con la imagen Docker

## 🚀 Una vez que los Pods estén Running

```bash
# Verificar que puedes acceder internamente
oc exec <pod-name> -- wget -O- http://localhost:8181/actuator/health

# Si funciona internamente, el route debería funcionar
# Refresca el navegador
```

## 📝 Lo Más Importante

**Ejecuta esto y compárteme la salida:**

```bash
oc get pods
oc get deployment
oc get events --sort-by='.lastTimestamp' | head -20
```

Con esa información te diré exactamente qué está pasando y cómo solucionarlo.

