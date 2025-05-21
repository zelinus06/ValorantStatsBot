
FROM openjdk:21

# Tên của file jar (có thể thay đổi nếu khác tên)
ARG JAR_FILE=target/*.jar

# Copy file jar vào container
COPY ${JAR_FILE} app.jar

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "/app.jar"]
