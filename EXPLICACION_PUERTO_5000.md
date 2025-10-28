# 🔍 Explicación: Puerto 5000 vs Puerto 8181

## ❌ NO, NO se desplegó en puerto 5000

El puerto 5000 es del **registry interno de OpenShift**, no de tu aplicación.

## 📊 Dos Cosas Diferentes

### 1️⃣ Registry de OpenShift (Puerto 5000) - ALMACENAMIENTO

```
image-registry.openshift-image-registry.svc:5000
         ↓
   Es como un "almacén" de imágenes Docker
         ↓
   Donde OpenShift GUARDA las imágenes construidas
```

**Analogía:** Es como un "garage" donde guardas tu coche 🚗
- **Puerto 5000** = El garage (registry)
- **Imagen** = El coche
- **Tu app** = Tú conduciendo el coche

**¿Para qué sirve?**
- Guardar la imagen Docker construida
- No es donde tu app corre
- Es interno de OpenShift

### 2️⃣ Tu Aplicación (Puerto 8181) - EJECUCIÓN

```
Tu aplicación Spring Boot corre en puerto 8181
```

**Analogía:** Es como tu casa (donde VIVES) 🏠
- **Puerto 8181** = Tu casa (donde tu app corre)
- **Runtime** = Donde trabajas y recibes visitas

## 🔄 Flujo Completo

```
┌────────────────────────────────────────────┐
│ 1. BUILD (Construir la imagen)            │
│    docker build -f docker/Dockerfile      │
│    ✅ Crea la imagen                       │
└─────────────────┬──────────────────────────┘
                  ↓
┌────────────────────────────────────────────┐
│ 2. PUSH al Registry (Puerto 5000)          │
│    pushed image-registry:5000/sipab4/...   │
│    ✅ GUARDA en el "garage"                │
│    (NO es donde corre tu app)               │
└─────────────────┬──────────────────────────┘
                  ↓
┌────────────────────────────────────────────┐
│ 3. PULL del Registry                      │
│    OpenShift "saca" la imagen del garage   │
│    Para usarla en los pods                │
└─────────────────┬──────────────────────────┘
                  ↓
┌────────────────────────────────────────────┐
│ 4. DEPLOYMENT (Crear pods)                 │
│    Crea pods que EJECUTAN la imagen        │
│    Tu app CORRE en puerto 8181             │
└─────────────────┬──────────────────────────┘
                  ↓
┌────────────────────────────────────────────┐
│ 5. SERVICE (Puerto 8181)                   │
│    Exponer tu app al mundo                 │
│    http://tu-app.com:8181                  │
└────────────────────────────────────────────┘
```

## 🎯 Puerto 5000 = GUARDAR
## 🎯 Puerto 8181 = EJECUTAR

## 📋 Verificación Actual

```bash
# 1. Ver qué tienes actualmente
oc get all

# Si NO ves deployment ni pods, significa:
# ✅ Imagen construida (puerto 5000)
# ❌ App NO desplegada todavía (necesitas puerto 8181)
```

## 🚀 Para Desplegar Tu App en Puerto 8181

```bash
# 1. Aplicar deployment
oc apply -f deploy.yaml

# 2. Ver pods (ahora sí correrán en 8181)
oc get pods

# 3. Crear service para exponer puerto 8181
oc expose service sipab-webservice-svc --port=8181

# 4. Obtener URL pública
oc get route

# Verás algo como:
# https://sipab-webservice-svc-sipab4.apps...  ← Tu URL pública
```

## 🔍 Diferencia Visual

```
┌─────────────────────────────────────────────┐
│ PUERTO 5000 (Registry - Store)           │
│ ────────────────────────────────────────── │
│ Registry OpenShift                        │
│ ├─ Imagen: sipab-web-service-git1        │
│ ├─ Sha256: 206ca5...                       │
│ └─ Estado: GUARDADA ✅                     │
│                                            │
│ 🏪 Es como un WAREHOUSE (almacén)          │
│ Solo guarda, NO ejecuta                   │
└─────────────────────────────────────────────┘

                 ↓ (saca la imagen)
                 
┌─────────────────────────────────────────────┐
│ PUERTO 8181 (Your App - Runtime)          │
│ ────────────────────────────────────────── │
│ Pod: sipab-webservice-abc123              │
│ ├─ Imagen: sipab-web-service-git1        │
│ ├─ Puerto: 8181                           │
│ ├─ Estado: Running ✅                      │
│ └─ URL: https://tu-app.apps...            │
│                                            │
│ 🏠 Es tu CASA (donde vive tu app)         │
│ Aquí es donde CORRE tu aplicación         │
└─────────────────────────────────────────────┘
```

## ✅ Resumen

| Componente | Puerto | Función |
|------------|--------|---------|
| **Registry** | 5000 | Guardar imágenes Docker |
| **Tu App** | 8181 | Ejecutar tu aplicación Spring Boot |
| **Route (URL pública)** | 443/80 | Acceso desde Internet |

**Entonces:**
- ✅ Puerto 5000 = Imagen guardada
- ⏳ Puerto 8181 = App corriendo (aún falta desplegar)
- ⏳ URL pública = Acceso web (aún falta crear)

## 🎯 Estado Actual de Tu Deployment

```
✅ BUILD completado
✅ Imagen en registry (puerto 5000)
⏳ Deployment pendiente (necesita puerto 8181)
⏳ Service pendiente
⏳ Route pendiente
```

## 🚀 Siguientes Pasos

```bash
# 1. Crear secret (si no lo hiciste)
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'

# 2. Aplicar deployment
oc apply -f deploy.yaml

# 3. Verificar pods (ahora sí en puerto 8181)
oc get pods

# 4. Exponer servicio
oc expose service sipab-webservice-svc --port=8181

# 5. Ver URL
oc get route

# 6. Probar
curl https://<route-url>/actuator/health
# O en navegador:
# https://<route-url>/swagger-ui.html
```

---

**En resumen:** Puerto 5000 es el "garage", puerto 8181 es tu "casa". La imagen está en el garage, pero aún necesitas que OpenShift la saque y la ponga en una casa (pod) para que tu app corra! 🏠🚀

