FROM openjdk:8u121-jre-alpine
ADD target/MiracleSolution-CLI-1.0-SNAPSHOT-jar-with-dependencies.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /MiracleSolution-CLI-1.0-SNAPSHOT-jar-with-dependencies.jar"]