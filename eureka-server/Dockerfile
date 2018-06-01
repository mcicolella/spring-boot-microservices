FROM openjdk:8-jdk-alpine
LABEL maintainer="Mauro Cicolella <mcicolella@libero.it>"
VOLUME /tmp
EXPOSE 8761
ARG JAR_FILE=target/eureka-server-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} eureka-server.jar
ENTRYPOINT ["java", "-jar", "/eureka-server.jar"]
