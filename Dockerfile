# Step 1: Use official Eclipse Temurin JDK 21 Alpine image
FROM eclipse-temurin:21-jdk-alpine

# Step 2: Set working directory inside the container
WORKDIR /app

# Step 3: Copy the built jar file
# Your build finalName is 'user-service', so jar will be target/user-service.jar
COPY target/user-service.jar app.jar

# Step 4: Expose the port your Spring Boot app runs on (you said 9090)
EXPOSE 9090

# Step 5: Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
