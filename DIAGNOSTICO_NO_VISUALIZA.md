# 🔍 Por Qué No Logras Visualizar la Aplicación

## ❓ Posibles Razones

### 1. **No hay Pods corriendo**
Los pods pueden no existir o estar en estado de error.

**Diagnóstico:**
```bash
oc get pods
```

**Si ves:**
- `No resources found` = No hay pods creados
- `CrashLoopBackOff` = Pods fallando
- `Pending` = Pods esperando recursos

### 2. **No hay Deployment**
El deployment puede no haberse creado.

**Diagnóstico:**
```bash
oc get deployment
```

### 3. **No hay Route (URL pública)**
Puede no haber una URL pública configurada.

**Diagnóstico:**
```bash
oc get route
```

### 4. **Service sin selector correcto**
El Service puede no apuntar a los pods correctos.

**Diagnóstico:**
```bash
oc get service
oc describe service sipab-webservice-svc
```

---

## 🔧 Comandos de Diagnóstico Completo

Ejecuta estos comandos y compárteme la salida:

```bash
# 1. Ver TODO
oc get all

# 2. Ver pods específicamente
oc get pods -o wide

# 3. Ver deployments
oc get deployment

# 4. Ver services
oc get service

# 5. Ver routes
oc get route

# 6. Ver eventos recientes (errores)
oc get events --sort-by='.lastTimestamp' | head -20
```

---

## 🎯 Soluciones Según el Problema

### Problema A: NO hay Pods

```bash
# Verificar que existe el deployment
oc get deployment

# Si NO existe, crearlo
oc apply -f deploy.yaml

# O crear manualmente
oc create deployment sipab-webservice \
  --image=sipab-web-service-git1:latest \
  --replicas=2 \
  --port=8181

# Escalar
oc scale deployment sipab-webservice --replicas=2
```

### Problema B: Pods en CrashLoopBackOff

```bash
# Ver logs del pod
oc logs <pod-name>

# Ver descripción del pod
oc describe pod <pod-name>

# Posibles causas:
# - Falta secret de Oracle DB
# - Error en la aplicación
# - Variables de entorno incorrectas
```

### Problema C: NO hay Route

```bash
# Ver services
oc get service

# Crear route
oc expose service sipab-webservice-svc --port=8181

# O si el service tiene otro nombre
oc get service
oc expose service <nombre-del-service> --port=8181

# Obtener URL
oc get route
```

### Problema D: Route existe pero da 503

```bash
# Ver pods
oc get pods

# Si NO hay pods Running, ese es el problema
# Necesitas crear el deployment primero
```

---

## 📊 Estado Actual Típico

Basándome en tus mensajes anteriores, probablemente tienes:

```bash
✅ Imagen construida (puerto 5000)
❌ NO hay pods (puerto 8181)
❌ NO hay deployment
❌ NO hay route accesible
```

**Por eso no puedes visualizar** → Falta crear el deployment que lance los pods.

---

## 🚀 Solución Paso a Paso

### Paso 1: Verificar Estado

```bash
oc get all
```

**Comparte la salida** para saber exactamente qué tienes.

### Paso 2: Crear Secret (si no existe)

```bash
oc get secret oracle-db-secret

# Si da "NotFound", crear:
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'
```

### Paso 3: Crear Deployment

```bash
# Ver si hay deployment
oc get deployment

# Si NO hay, crear con tu deploy.yaml
oc apply -f deploy.yaml

# O crear manualmente:
oc create deployment sipab-webservice \
  --image=sipab-web-service-git1:latest \
  --replicas=2 \
  --port=8181

# Configurar variables de entorno
oc set env deployment/sipab-webservice \
  SPRING_PROFILES_ACTIVE=openshift \
  ORACLE_DATASOURCE_URL=$(oc get secret oracle-db-secret -o jsonpath='{.data.url}' | base64 -d) \
  ORACLE_DATASOURCE_USERNAME=$(oc get secret oracle-db-secret -o jsonpath='{.data.username}' | base64 -d) \
  ORACLE_DATASOURCE_PASSWORD=$(oc get secret oracle-db-secret -o jsonpath='{.data.password}' | base64 -d)
```

### Paso 4: Crear Service

```bash
# Ver si existe service
oc get service

# Si NO existe, crear:
oc expose deployment sipab-webservice --port=8181
```

### Paso 5: Crear Route

```bash
# Crear route
oc expose service sipab-webservice --port=8181

# Ver URL
oc get route sipab-webservice

# Deberías ver:
# https://sipab-webservice-sipab4.apps.openshift.com
```

### Paso 6: Verificar

```bash
# Ver pods corriendo
oc get pods

# Deberías ver:
# NAME                              READY   STATUS
# sipab-webservice-abc123           1/1     Running
# sipab-webservice-xyz789           1/1     Running

# Probar URL en navegador
# O con curl:
curl https://<route-url>/actuator/health
```

---

## 🎯 Checklist Rápido

Ejecuta esto y dime qué ves:

```bash
# Todo en una vez
echo "=== PODS ==="
oc get pods

echo -e "\n=== DEPLOYMENTS ==="
oc get deployment

echo -e "\n=== SERVICES ==="
oc get service

echo -e "\n=== ROUTES ==="
oc get route

echo -e "\n=== EVENTS ==="
oc get events --sort-by='.lastTimestamp' | tail -10
```

**Con esa salida sabré exactamente qué falta y te diré qué hacer!** 🔍

