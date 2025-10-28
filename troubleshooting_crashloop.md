# Troubleshooting CrashLoopBackOff

## Posibles Causas

### 1. Secret no configurado correctamente
- La aplicación no puede leer las variables de entorno
- Verificar que el secret tiene las keys: url, username, password

### 2. Imagen incorrecta
- El deployment apunta a una imagen que no existe
- Verificar en "Containers" → "Image"

### 3. Configuración de application.properties
- La app busca configuración en /deployments/conf pero no existe
- El Dockerfile copia conf/ pero puede que no esté en GitHub

### 4. Memoria insuficiente
- Java necesita más memoria de la asignada

## Solución Rápida

### Paso 1: Ver logs del pod
```
Workloads → Pods → webservicetest-xxx → Logs
```

### Paso 2: Si el error es "File not found" o "conf/"
Simplificar: Eliminar la referencia a conf del Dockerfile

### Paso 3: Crear nuevo deployment sin conf
Usar deploy_nuevo.yaml que ya está corregido

