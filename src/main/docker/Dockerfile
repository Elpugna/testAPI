FROM ibm-semeru-runtimes:open-11-jdk-focal
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]