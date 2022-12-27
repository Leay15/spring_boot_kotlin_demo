FROM amazoncorretto:17.0.5-alpine3.16

COPY . ./src/assemble
WORKDIR ./src/assemble
RUN ./gradlew assemble
RUN rm build/libs/*-plain.jar
RUN cp build/libs/*.jar ../app.jar
WORKDIR ..
RUN rm -rf assemble
#COPY build/libs/demo_kt-0.0.1-SNAPSHOT.jar ./src/app.jar