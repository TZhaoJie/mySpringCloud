#FROM java8
FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ADD eureka-server-0.0.1-SNAPSHOT.jar app.jar
#RUN sh -c 'touch /app.jar'
#ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
ADD /target/eureka-zuul-0.0.1-SNAPSHOT.jar eureka-zuul-0.0.2-SNAPSHOT.jar
EXPOSE 8081 80
ENTRYPOINT ["java","-jar","/eureka-zuul-0.0.2-SNAPSHOT.jar"]