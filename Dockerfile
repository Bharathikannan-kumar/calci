FROM eclipse-temurin:17
COPY target/calculator.jar calculator.jar
CMD [ "java","-jar","calculator.jar" ]