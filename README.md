# Kafka project wikievent

This is a Kafka project for wikievent which is a producer and consumer project.

The producer project sends data to Kafka topic and the consumer project reads data from Kafka topic and stores it in MySQL database.
Start docker-compose.yml file to initialize the kafka container and then start the producer and consumer project.

## Commands to create a multi module project:
mvn archetype:generate -DgroupId=com.spring.java.wikievent -DartifactId=wikievent-stream -DinteractiveMode=false
mvn archetype:generate -DgroupId=com.spring.java.wikievent -DartifactId=wikievent-producer -DinteractiveMode=false
mvn archetype:generate -DgroupId=com.spring.java.wikievent -DartifactId=wikievent-consumer -DinteractiveMode=false
