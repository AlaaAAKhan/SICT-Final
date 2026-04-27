FROM maven:3.9-amazoncorretto-24 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

FROM amazoncorretto:24-alpine
WORKDIR /app

COPY --from=build /app/target/javaCalculatorCLI-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
CMD ["java", "-Dlogback.statusListenerClass=ch.qos.logback.core.status.NopStatusListener", "-jar", "app.jar"]