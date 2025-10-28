####
# Dockerfile para SIPABWebService
# Este Dockerfile sigue el patrón de Red Hat OpenShift
#
# Build the image with:
# docker build -f docker/Dockerfile -t sipab-webservice .
####
FROM registry.access.redhat.com/ubi8/openjdk-17:1.23-3.1757607140 AS builder

# Build dependency offline to streamline build
RUN mkdir project
WORKDIR /home/jboss/project
COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src src
RUN mvn package -Dmaven.test.skip=true -B

# compute the created jar name and put it in a known location to copy to the next layer.
# If the user changes pom.xml to have a different version, or artifactId, this will find the jar
RUN grep version target/maven-archiver/pom.properties | cut -d '=' -f2 >.env-version
RUN grep artifactId target/maven-archiver/pom.properties | cut -d '=' -f2 >.env-id
RUN mv target/$(cat .env-id)-$(cat .env-version).jar target/export-run-artifact.jar

# Copiar configuración
RUN mkdir -p /home/jboss/project/conf
COPY conf /home/jboss/project/conf

FROM registry.access.redhat.com/ubi8/openjdk-17-runtime:1.23-3.1757607183

COPY --from=builder /home/jboss/project/target/export-run-artifact.jar /deployments/app.jar
COPY --from=builder /home/jboss/project/conf /deployments/conf

# Crear usuario no-root
RUN chown -R 1001:0 /deployments && \
    chmod -R g+rw /deployments

USER 1001

EXPOSE 8181

ENTRYPOINT ["java", "-jar", "/deployments/app.jar", "--server.port=8181"]

