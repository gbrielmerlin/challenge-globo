FROM openjdk:21
COPY target/*.jar app.jar
COPY config/docker-entrypoint.sh
ENTRYPOINT["sh", "/docker-entrypoint.sh"]