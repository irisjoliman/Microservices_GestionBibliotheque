FROM openjdk:14
EXPOSE 8000
ADD /target/livre-service-0.0.1-SNAPSHOT.jar livre-service.jar
ENTRYPOINT ["java", "-jar", "livre-service.jar"]