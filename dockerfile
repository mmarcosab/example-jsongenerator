FROM openjdk:12-alpine
MAINTAINER github/mmarcosab
COPY ./target/example-jsongenerator-0.0.1-SNAPSHOT.jar /app/example-jsongenerator-0.0.1-SNAPSHOT.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "example-jsongenerator-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
