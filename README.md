# Getting Started

You can run this project with Docker.

Just be sure of have installed Docker Compose.

Execute
> docker-compose up -d api

And it should run the PostgresSQL and API container

You can see the server running on
> http://localhost:8080

This example tries to follow the CLEAN principles architecture but
adapted to Spring MVC way.

WIP: Consume External API as gateway

# IntelliJIDEA Users

You can run this project by setting up your IntelliJIDEA IDE Gradle to
Java 17

Also by running
> docker-compose up -d postgres

It will setting up the database for testing proposes.

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.1/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.1/gradle-plugin/reference/html/#build-image)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#data.sql.jpa-and-spring-data)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

