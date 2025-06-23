FROM eclipse-temurin:21-jdk
 
WORKDIR /cine-manager-api
 
COPY .mvn/ .mvn

COPY mvnw pom.xml ./

RUN ./mvnw dependency:go-offline
 
COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
