FROM eclipse-temurin:21-jre-alpine

COPY concert-auth/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]