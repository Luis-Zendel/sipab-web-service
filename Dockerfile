# Multi-stage build para optimizar el tamaño de la imagen
FROM maven:3.9-eclipse-temurin-17 AS builder

# Copiar archivos del proyecto
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Descargar dependencias (cached layer)
RUN mvn dependency:go-offline -B

# Construir la aplicación
RUN mvn clean package -DskipTests

# Imagen final
FROM eclipse-temurin:17-jre-alpine

# Crear usuario no-root para seguridad
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

WORKDIR /app

# Copiar solo el JAR compilado desde el stage builder
COPY --from=builder --chown=spring:spring /app/target/SIPABWebService-1.0.jar app.jar

# Copiar configuración (si es necesaria)
COPY --chown=spring:spring conf/ ./conf/

# Exponer puerto
EXPOSE 8181

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=60s \
  CMD wget --no-verbose --tries=1 --spider http://localhost:8181/actuator/health || exit 1

# Ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE:default}", "app.jar"]

