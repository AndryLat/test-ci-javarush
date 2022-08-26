FROM openjdk:17

COPY ./target/ci_javarush_server-1.0-SNAPSHOT.jar ./ci_javarush_server-1.0-SNAPSHOT.jar
ENV PORT=8080
EXPOSE 8080
CMD ["java","-jar","ci_javarush_server-1.0-SNAPSHOT.jar"]