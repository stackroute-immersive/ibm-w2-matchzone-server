FROM java:8
RUN mkdir /src
WORKDIR /src
COPY target/coreNLP-service-1.1.0.jar /src/coreNLP-service-1.1.0.jar
COPY stopword.txt /src/stopword.txt
COPY extra.txt /src/extra.txt
COPY location.txt /src/location.txt
COPY skill.txt /src/skill.txt
COPY organisation.txt /src/organisation.txt
COPY certification.txt /src/certification.txt
COPY college.txt /src/college.txt
COPY projects.txt /src/projects.txt
EXPOSE 8084
RUN sh -c 'touch /src/coreNLP-service-1.1.0.jar'
ENTRYPOINT ["java","-jar","/src/coreNLP-service-1.1.0.jar"]
