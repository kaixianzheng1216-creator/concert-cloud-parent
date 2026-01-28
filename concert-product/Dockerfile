FROM eclipse-temurin:21-jre-alpine

COPY concert-product/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]