# 🔧 Solución: Error de Resource Quota en OpenShift

## ⚠️ Problema

```
Error creating build pod: pods "sipab-web-service-git-1-build" is forbidden: 
failed quota: sipab4-quota: must specify limits.cpu for: docker-build,git-clone,
manage-dockerfile; limits.memory for: docker-build,git-clone,manage-dockerfile;
requests.cpu for: docker-build,git-clone,manage-dockerfile; 
requests.memory for: docker-build,git-clone,manage-dockerfile
```

## 📊 ¿Qué significa esto?

OpenShift tiene una **ResourceQuota** configurada en tu proyecto que **OBLIGA** a especificar recursos (CPU y memoria) para cada contenedor.

Es como un presupuesto: el administrador dijo "cada proceso debe decir cuánto CPU y memoria va a usar".

## ✅ Soluciones

### Solución 1: Usar el BuildConfig que creé (RECOMENDADO)

He creado `buildconfig.yaml` que especifica los recursos correctamente.

```bash
# Aplicar el BuildConfig
oc apply -f buildconfig.yaml

# Iniciar el build manualmente
oc start-build sipab-webservice
```

### Solución 2: Configurar recursos en la Web Console

1. Ve a tu **Build Config** en la consola web
2. Click en **Actions** → **Edit YAML**
3. Agrega la sección `resources`:

```yaml
spec:
  resources:
    requests:
      cpu: "500m"
      memory: "1Gi"
    limits:
      cpu: "2"
      memory: "3Gi"
```

### Solución 3: Solicitar al Administrador

Si no tienes permisos para crear BuildConfigs, contacta a tu admin:

```bash
# Puedes ver tu quota actual
oc describe quota sipab4-quota -n sipab4

# O ver qué permisos tienes
oc describe clusterrolebinding -n sipab4 | grep tu-usuario
```

## 📋 Comandos Útiles

### Ver el BuildConfig actual

```bash
oc get buildconfig
oc describe buildconfig sipab-webservice
```

### Ver eventos de error

```bash
oc get events --sort-by='.lastTimestamp'
```

### Editar BuildConfig vía CLI

```bash
# Exportar el BuildConfig
oc get buildconfig sipab-webservice -o yaml > buildconfig-edit.yaml

# Editar y agregar recursos
# Luego aplicar
oc apply -f buildconfig-edit.yaml
```

## 🎯 ¿Qué son los recursos?

### CPU
- **request**: Lo que prometes usar
- **limit**: Máximo que puedes usar
- Unidad: "500m" = 0.5 CPUs, "2" = 2 CPUs

### Memoria
- **request**: Memoria mínima garantizada
- **limit**: Máximo que puedes usar
- Unidad: "1Gi" = 1 GB, "512Mi" = 512 MB

### En tu caso:

```yaml
resources:
  requests:  # Lo que reservas
    cpu: "500m"      # 0.5 CPUs reservados
    memory: "1Gi"    # 1 GB reservado
  limits:    # Máximo permitido
    cpu: "2"         # Hasta 2 CPUs
    memory: "3Gi"    # Hasta 3 GB
```

## 🚀 Deployment Completo con BuildConfig

### 1. Aplicar BuildConfig

```bash
oc apply -f buildconfig.yaml
```

### 2. Iniciar Build

```bash
oc start-build sipab-webservice --follow
```

El flag `--follow` muestra los logs en tiempo real.

### 3. Verificar Build

```bash
# Ver builds
oc get builds

# Ver logs del build actual
oc logs build/sipab-webservice-1
```

### 4. Una vez que termine el build

```bash
# Aplicar el deployment
oc apply -f deploy.yaml

# Ver pods
oc get pods

# Ver si necesitas crear los secrets
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'
```

## 🔍 Alternativa: Build Manual

Si tienes problemas con el BuildConfig, puedes construir manualmente:

```bash
# Crear namespace si no existe
oc project sipab4

# Build manual con recursos especificados
oc new-build --name=sipab-webservice \
  --strategy=docker \
  --binary \
  --docker-image=maven:3.9-eclipse-temurin-17

# Construir desde directorio local
oc start-build sipab-webservice \
  --from-dir=. \
  --follow \
  --build-arg=DOCKERFILE_PATH=./Dockerfile \
  --build-arg=RESOURCE_REQUESTS_CPU="500m" \
  --build-arg=RESOURCE_REQUESTS_MEMORY="1Gi" \
  --build-arg=RESOURCE_LIMITS_CPU="2" \
  --build-arg=RESOURCE_LIMITS_MEMORY="3Gi"
```

## ✅ Checklist

- [ ] BuildConfig aplicado con recursos especificados
- [ ] Build iniciado exitosamente
- [ ] Imagen creada correctamente
- [ ] Pods del deployment creados
- [ ] Secrets configurados
- [ ] Aplicación accesible

## 🆘 Si nada funciona

Contacta a tu administrador de OpenShift y solicita:

1. Que te asigne más recursos en el namespace
2. Que ajuste el ResourceQuota
3. Que revise los permisos de tu usuario

---

**Ya tienes el `buildconfig.yaml` listo para usar. Solo ejecuta `oc apply -f buildconfig.yaml`** 🚀

