# syntax=docker/dockerfile:1

FROM openjdk:16-alpine3.13

WORKDIR /app

COPY pom.xml mvn ./

RUN /mvn/bin/mvn.cmd dependency:go-offline

COPY src ./src

CMD ["/mvn/bin/mvn.cmd", "test"]