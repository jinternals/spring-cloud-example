FROM java:8-jre
MAINTAINER Mradul Pandey <pandeymradul@gmail.com>

ADD ./spring-cloud-example-user-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/spring-cloud-example-user-service.jar"]

EXPOSE 8081