FROM java:8-jre

ADD ./target/Projects-0.0.1-SNAPSHOT.jar /usr/src/Projects-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "Projects-0.0.1-SNAPSHOT.jar"]
