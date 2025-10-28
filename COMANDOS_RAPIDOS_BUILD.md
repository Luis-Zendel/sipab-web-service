# ⚡ Comandos Rápidos para Build en OpenShift

## 🚀 Solución Más Rápida: Binary Build

**Esta es la opción más confiable y rápida:**

```bash
# 1. Conectarte a OpenShift
oc login https://tu-openshift-cluster:6443
oc project sipab4

# 2. Eliminar build anterior si existe
oc delete buildconfig sipab-webservice

# 3. Crear BuildConfig para binary build
oc new-build --name=sipab-webservice \
  --strategy=docker \
  --binary

# 4. Desde la RAÍZ del proyecto, iniciar build
cd c:\Users\INETUM\Downloads\SIPABWebService\SIPABWebService
oc start-build sipab-webservice --from-dir=. --follow

# 5. Verificar que la imagen se creó
oc get imagestream

# 6. Crear secret para base de datos
oc create secret generic oracle-db-secret \
  --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' \
  --from-literal=username='MBGWOWN' \
  --from-literal=password='september#11'

# 7. Aplicar deployment
oc apply -f deploy.yaml

# 8. Ver pods
oc get pods

# 9. Ver logs
oc logs -f deployment/sipab-webservice
```

## ✅ Done! Tu aplicación está corriendo 🎉

---

## 📋 Si Prefieres Usar Git Build (más lento)

```bash
# 1. Eliminar build anterior
oc delete buildconfig sipab-webservice

# 2. Aplicar el BuildConfig actualizado
oc apply -f buildconfig.yaml

# 3. Iniciar build
oc start-build sipab-webservice --follow

# 4. Resto igual que arriba
```

---

## 🔍 Troubleshooting

### Ver estado del build
```bash
oc get builds
oc describe build sipab-webservice-1
oc logs build/sipab-webservice-1
```

### Si el build falla
```bash
# Ver eventos
oc get events --sort-by='.lastTimestamp'

# Ver pods del build
oc get pods | grep build

# Ver logs detallados
oc logs build/sipab-webservice-1 --previous
```

### Reiniciar desde cero
```bash
# Limpiar todo
oc delete buildconfig sipab-webservice
oc delete imagestream sipab-webservice

# Volver a crear
oc new-build --name=sipab-webservice --strategy=docker --binary
oc start-build sipab-webservice --from-dir=. --follow
```

---

**💡 Tip: Usa binary build (`--from-dir=.`) es más rápido y confiable** 🚀

