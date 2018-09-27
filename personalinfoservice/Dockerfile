FROM java:8-jre

ADD ./target/PersonalInfo-0.0.1-SNAPSHOT.jar /usr/src/PersonalInfo-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "PersonalInfo-0.0.1-SNAPSHOT.jar"]
