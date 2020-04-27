FROM maven:3.5-jdk-8-alpine AS build

LABEL maintainer="Mauro Cicolella <mcicolella@libero.it>"

COPY src /usr/src/zuul-gateway/src
COPY pom.xml /usr/src/zuul-gateway
RUN mvn -f /usr/src/zuul-gateway/pom.xml clean package

FROM openjdk:8-jre-alpine
COPY --from=build /usr/src/zuul-gateway/target/zuul-gateway-0.0.1-SNAPSHOT.jar /usr/zuul-gateway/zuul-gateway-0.0.1-SNAPSHOT.jar  

EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/usr/zuul-gateway/zuul-gateway-0.0.1-SNAPSHOT.jar"]
