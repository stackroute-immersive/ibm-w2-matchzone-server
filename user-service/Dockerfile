FROM java:8
MAINTAINER sharoon "sharoon8105@gmail.com"
RUN mkdir /src

WORKDIR /src

COPY target/user-service-1.1.0.jar /src/user-service-1.1.0.jar

RUN sh -c 'touch /src/user-service-1.1.0.jar'

ENTRYPOINT ["java","-jar","/src/user-service-1.1.0.jar"]
