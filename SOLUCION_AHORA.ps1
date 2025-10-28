# ============================================
# SOLUCIÓN DIRECTA PARA OPENSHIFT
# ============================================

Write-Host "🔧 Eliminando BuildConfig anterior..." -ForegroundColor Yellow
oc delete buildconfig sipab-webservice

Write-Host "✅ Creando BuildConfig para binary build..." -ForegroundColor Green
oc new-build --name=sipab-webservice --strategy=docker --binary

Write-Host "📦 Iniciando build desde tu máquina local..." -ForegroundColor Cyan
Write-Host "   Esto envía TODO (Dockerfile, pom.xml, src/) desde tu PC" -ForegroundColor Cyan
Write-Host ""

# Navegar a la raíz del proyecto
Set-Location c:\Users\INETUM\Downloads\SIPABWebService\SIPABWebService

# Iniciar el build
oc start-build sipab-webservice --from-dir=. --follow

Write-Host ""
Write-Host "✅ Build completado! Verificando..." -ForegroundColor Green
oc get builds
oc get imagestream

Write-Host ""
Write-Host "📋 Próximos pasos:" -ForegroundColor Yellow
Write-Host "   1. Crear secret: oc create secret generic oracle-db-secret --from-literal=url='jdbc:oracle:thin:@10.191.105.18:1550/mbgwdes' --from-literal=username='MBGWOWN' --from-literal=password='september#11'" -ForegroundColor Cyan
Write-Host "   2. Aplicar deployment: oc apply -f deploy.yaml" -ForegroundColor Cyan
Write-Host "   3. Ver pods: oc get pods" -ForegroundColor Cyan

