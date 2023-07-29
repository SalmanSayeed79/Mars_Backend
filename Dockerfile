FROM sapmachine
EXPOSE 8081
ARG JAR_FILE=target/Mars_Backend-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} .
CMD [ "java", "-jar",  "/Mars_Backend-0.0.1-SNAPSHOT.jar"]