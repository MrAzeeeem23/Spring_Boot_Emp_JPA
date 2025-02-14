FROM openjdk:21-jdk

WORKDIR /app

COPY target/h2-0.0.1-SNAPSHOT.jar h2.app

EXPOSE 9988

CMD ["java", "-jar", "h2.app"]