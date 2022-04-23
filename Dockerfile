#FROM adoptopenjdk/openjdk11
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java", "-jar", "/app.jar"]
#use the following command to run the above
#docker build --build-arg JAR_FILE=build/libs/\*.jar -t springio/gs-spring-boot-docker .

#slightly different syntax
FROM adoptopenjdk/openjdk11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
#use the following command to run the above
#docker build -t springio/gs-spring-boot-docker .