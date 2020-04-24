FROM maven:3.5-jdk-8-alpine AS build

LABEL maintainer="Mauro Cicolella <mcicolella@libero.it>"

COPY src /usr/src/eureka-server/src
COPY pom.xml /usr/src/eureka-server
RUN mvn -f /usr/src/eureka-server/pom.xml clean package

FROM openjdk:8-jre-alpine
COPY --from=build /usr/src/eureka-server/target/eureka-server-0.0.1-SNAPSHOT.jar /usr/eureka-server/eureka-server-0.0.1-SNAPSHOT.jar  

EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/usr/eureka-server/eureka-server-0.0.1-SNAPSHOT.jar"]

