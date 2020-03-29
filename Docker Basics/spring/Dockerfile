FROM openjdk:11 AS BUILD_JAR
COPY . .
RUN ./gradlew build
#WORKDIR /build/libs
#CMD ["java", "-jar", ".jar"]

FROM openjdk:11
COPY --from=BUILD_JAR /build/libs/spring.jar .
CMD ["java","-jar", "spring.jar"]