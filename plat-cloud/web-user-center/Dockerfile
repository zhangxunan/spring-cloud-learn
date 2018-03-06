FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD ./target/web-user-center-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=user1","-jar","/app.jar"]
EXPOSE 8001
