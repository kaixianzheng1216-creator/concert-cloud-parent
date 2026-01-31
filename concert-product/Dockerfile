FROM eclipse-temurin:21-jre-alpine

COPY concert-product/target/*.jar app.jar

ENV JAVA_OPTS=""

ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar app.jar"]