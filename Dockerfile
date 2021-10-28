FROM java: 8
EXPOSE 8090
ADD /target/quiz-service-0.0.1-SNAPSHOT.jar docker-quiz-service.jar
ENTRYPOINT ["java", "-jar", "quiz-service.jar"]