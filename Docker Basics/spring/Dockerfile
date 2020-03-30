FROM openjdk:11-jdk-slim-buster
COPY . .
RUN ./gradlew build
CMD ["java", "-jar", "/build/libs/spring.jar"]

