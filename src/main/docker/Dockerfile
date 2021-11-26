FROM anapsix/alpine-java
VOLUME /tmp
ADD cconfig-0.0.1.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
