FROM openjdk:11
EXPOSE 8082
ADD target/gestProjwithEurk-0.0.1-SNAPSHOT.jar gestProjwithEurk-1.0.jar
ENTRYPOINT ["java","-jar","/gestProjwithEurk-1.0.jar"]


