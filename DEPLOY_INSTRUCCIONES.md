# 🔧 Instrucciones de Deployment en OpenShift

## ⚠️ Problema Detectado

OpenShift no puede encontrar el archivo `deploy.yaml` porque estaba buscando en una ruta incorrecta.

## ✅ Solución Implementada

He creado el archivo `deploy.yaml` en la raíz del proyecto con todos los recursos necesarios para el deployment.

## 📋 Pasos para Deployment

### 1. Commit y Push del archivo deploy.yaml

```bash
git add deploy.yaml
git commit -m "Agregar deploy.yaml para OpenShift"
git push origin main
```

### 2. En OpenShift Web Console

1. Ve a **Developer Perspective**
2. Selecciona **+Add** en el menú izquierdo
3. Click en **From Git** o **Import from Git**
4. Pega la URL de tu repo: `https://github.com/Luis-Zendel/sipab-web-service.git`
5. Click en **Show advanced Git options**
6. En la sección de recursos, busca:
   - **Build Config**: Selecciona **Docker** como estrategia
   - **Deployment**: Debería detectar automáticamente `deploy.yaml`

### 3. Configurar Secrets Manualmente

**IMPORTANTE**: Los secrets NO deben estar en el código. Créalos manualmente en OpenShift:

```bash
# Conectarte a OpenShift
oc login https://your-openshift-cluster:6443

# Crear el secret para Oracle DB
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'
```

### 4. Verificar el Deployment

```bash
# Ver los pods
oc get pods

# Ver logs
oc logs -f deployment/sipab-webservice

# Ver la URL pública
oc get route sipab-webservice
```

## 🎯 Estructura del deploy.yaml

El archivo `deploy.yaml` incluye:

1. **Deployment**: Configuración de la aplicación con 2 réplicas
2. **Service**: Punto de acceso interno
3. **Route**: URL pública para acceder
4. **ConfigMap**: Configuraciones de la aplicación

## ⚠️ Nota Importante sobre la Imagen

El `deploy.yaml` hace referencia a la imagen:
```yaml
image: image-registry.openshift-image-registry.svc:5000/sipab-proyecto/sipab-webservice:latest
```

**Necesitas construir la imagen primero**. Opciones:

### Opción A: Build automático en OpenShift
```bash
# Desde la raíz del proyecto
oc new-build --name=sipab-webservice --strategy=docker --binary
oc start-build sipab-webservice --from-dir=. --follow
```

### Opción B: Ajustar la imagen en el deploy.yaml
Si vas a construir la imagen en otro lugar, edita el `deploy.yaml` y cambia:
```yaml
image: tu-registry/tu-imagen:version
```

## 🔍 Troubleshooting

### Error: "Could not fetch kubernetes resource"
✅ **Solucionado**: El archivo `deploy.yaml` ahora está en la raíz.

### Error: "ImagePullBackOff"
Causa: La imagen no existe o no es accesible.
Solución: Construye la imagen con `oc new-build` o ajusta la ruta de la imagen.

### Error: "Secret not found"
Causa: No has creado los secrets manualmente.
Solución: Usa el comando `oc create secret` mostrado arriba.

### Error: Health check fails
Causa: La aplicación tarda mucho en iniciar.
Solución: Ajusta `initialDelaySeconds` en el `deploy.yaml`:
```yaml
readinessProbe:
  initialDelaySeconds: 120  # Aumenta este valor
```

## 📚 Documentación Completa

Para más detalles, consulta:
- `OPENSHIFT_GUIA_COMPLETA.md` - Guía detallada para desarrolladores junior
- `OPENSHIFT_DEPLOYMENT_GUIA_RAPIDA.md` - Comandos rápidos
- `README_OPENSHIFT.md` - Resumen del proyecto

## ✅ Checklist Final

- [ ] `deploy.yaml` subido a GitHub
- [ ] OpenShift puede detectar el archivo
- [ ] Secrets creados manualmente
- [ ] Imagen Docker construida
- [ ] Pods corriendo correctamente
- [ ] Health checks pasando
- [ ] Route accesible

¡Listo para deployar! 🚀

