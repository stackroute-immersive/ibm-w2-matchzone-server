FROM java:8-jre

ADD ./target/user-authenticationservice-1.0.0.jar /usr/src/user-authenticationservice-1.0.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "user-authenticationservice-1.0.0.jar"]
