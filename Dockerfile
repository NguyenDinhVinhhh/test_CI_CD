FROM openjdk:17-jdk

WORKDIR /app

COPY target/department-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8082

CMD ["java", "-jar", "app.jar"]
