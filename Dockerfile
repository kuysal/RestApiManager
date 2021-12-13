FROM openjdk:11
MAINTAINER "Kemal Uysal"
COPY build/libs/rest-api-manager-1.0.jar rest-api-manager-1.0.jar
ENTRYPOINT ["java","-jar","/rest-api-manager-1.0.jar"]