FROM openjdk:17-alpine
    ENV APP_NAME projeto-final
    COPY ./target/${APP_NAME}.jar /final/${APP_NAME}.jar
    WORKDIR /final
    CMD java -jar ${APP_NAME}.jar
    EXPOSE 8080