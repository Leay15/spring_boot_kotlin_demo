FROM amazoncorretto:17.0.5-alpine3.16

COPY . ./src/assemble
WORKDIR ./src/assemble
RUN ./gradlew assemble
RUN cp build/libs/demo_kt-0.0.1-SNAPSHOT.jar ../app.jar
WORKDIR ./src
RUN rm -rf /assemble
#COPY build/libs/demo_kt-0.0.1-SNAPSHOT.jar ./src/app.jar