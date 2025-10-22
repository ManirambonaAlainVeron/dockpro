# Use Java 17 runtime
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the Spring Boot JAR into container
COPY target/dockpro-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app uses
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
