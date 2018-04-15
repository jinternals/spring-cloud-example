FROM java:8-jre
MAINTAINER Mradul Pandey <pandeymradul@gmail.com>

ADD ./spring-cloud-example-registry.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/spring-cloud-example-registry.jar"]

EXPOSE 8761