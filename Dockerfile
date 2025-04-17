# Use JDK image 
FROM eclipse-temurin:17-jdk-jammy 
#Set working dir 
WORKDIR /app 
# Copy the Java file 
COPY App.java .
#Compile the Java file 
RUN javac App.java 
# Expose the port 
EXPOSE 8888 
# Run the app 
CMD ["java", "App"]
