# Grails 5.1.1 - REST API Example

A sample Grails 5.1.1 application with example Dockerfile to deploy over standalone tomcat.

## Steps to Deploy and Run Application

1. Build application using command `./gradlew build`. 
2. Build Docker image using command `docker build -t restapidemo:0.1 .`.
3. Start a new Docker container using command `docker run -it --rm -p 8080:8080 puneetbehl/restapidemo:0.1`.

