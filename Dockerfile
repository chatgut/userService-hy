
FROM maven:3.9.6-eclipse-temurin-22-alpine as build
RUN mkdir /app
WORKDIR /app
COPY target/labb2webservices-0.0.1-SNAPSHOT.jar /app

FROM eclipse-temurin:22-jre-alpine
WORKDIR /app
COPY --from=build /app/labb2webservices-0.0.1-SNAPSHOT.jar /app/labb2webservices-0.0.1-SNAPSHOT.jar
CMD java -jar /app/labb2webservices-0.0.1-SNAPSHOT.jar
