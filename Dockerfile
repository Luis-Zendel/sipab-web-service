####
# Dockerfile para SIPABWebService
# Usa imágenes oficiales de Eclipse Temurin (permitidas por políticas)
#
# Build the image with:
# docker build -f docker/Dockerfile -t sipab-webservice .
####
FROM maven:3.9-eclipse-temurin-17 AS builder

# Build dependency offline to streamline build
WORKDIR /app

# Copiar pom.xml y descargar dependencias (cached layer)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiar código fuente
COPY src src
RUN mvn package -Dmaven.test.skip=true -B

# Copiar configuración
RUN mkdir -p /app/conf
COPY conf /app/conf

# Encontrar el nombre del JAR generado
RUN grep version target/maven-archiver/pom.properties | cut -d '=' -f2 >.env-version
RUN grep artifactId target/maven-archiver/pom.properties | cut -d '=' -f2 >.env-id
RUN mv target/$(cat .env-id)-$(cat .env-version).jar target/export-run-artifact.jar

# Stage 2: Runtime
FROM eclipse-temurin:17-jre-alpine

# Copiar JAR desde builder
COPY --from=builder /app/target/export-run-artifact.jar /deployments/app.jar

# Copiar configuración
COPY --from=builder /app/conf /deployments/conf

# Crear usuario no-root (OpenShift friendly)
RUN addgroup -S spring && adduser -S spring -G spring
RUN chown -R spring:spring /deployments
USER spring

EXPOSE 8181

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=60s \
  CMD wget --no-verbose --tries=1 --spider http://localhost:8181/actuator/health || exit 1

# Cambiar al directorio deployments donde está conf/
WORKDIR /deployments

ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=8181"]

