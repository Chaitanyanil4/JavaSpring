# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk-alpine

# Copy the packaged JAR file into the container at the specified directory
ADD target/inndata-0.0.1-SNAPSHOT.jar /app/inndata.jar

# Expose the port the application runs on
EXPOSE 8080

# Specify the command to run on container startup
ENTRYPOINT ["java", "-jar", "inndata.jar"]
