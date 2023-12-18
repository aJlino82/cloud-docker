FROM openjdk:17-alpine

FROM openjdk:17-alpine
VOLUME /tmp
ARG JAR_FILE=target/projeto-final.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]