FORM Maven

USER root
COPY ./src/main/java
WORKDIR /src/main/java
CMD mvn test