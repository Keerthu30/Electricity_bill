FROM openjdk:11-jdk-alpine
LABEL maintainer="keethu824@gmail.com"
VOLUME /main-app
ADD build/libs/spring-boot-postgresql-base-project-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]