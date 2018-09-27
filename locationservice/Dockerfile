FROM java:8-jre

ADD ./target/Location-0.0.1-SNAPSHOT.jar /usr/src/Location-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "Location-0.0.1-SNAPSHOT.jar"]
