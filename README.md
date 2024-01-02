# Microservice Project
## Description
This project is a microservice-based application that provides quiz and question services for users. It consists of four components:

* Quiz Service: A service that allows users to create, retrieve, and manage quizzes.
* Question Service: A service that allows users to create, retrieve, and manage questions for quizzes.
* Service Registry: A service that registers and discovers other services using Eureka.
* API Gateway: A service that routes and filters requests to other services using Spring Cloud Gateway.

## Documentation
The documentation for this project includes the following:

* OpenAPI definitions for the quiz and question services, which describe the API endpoints, parameters, responses, and models.
* Postman collections for the quiz and question services, which provide examples of requests and responses for testing the API.
* Human-readable documentation generated from the OpenAPI definitions, which provide a user-friendly interface for exploring the API.

## Requirements
The requirements for this project are:

* Java 17
* Spring Boot 3.2.1
* Spring Cloud 2023.0.0
* MySQL
* Lombok
* Feign

## Setup
The steps to set up this project are:

* Clone the GitHub repository to your local machine.
* Install the dependencies using Maven.
* Create a MySQL database and user for each service and update the application.properties files with the connection details.
* Run each service using the ```mvn spring-boot:run``` command or the ```java -jar``` command with the JAR file in the target directory.
* Access the Eureka dashboard at http://localhost:8761 to see the registered services.
* Access the API Gateway at http://localhost:9096 to make requests to the quiz and question services.

## Testing
The steps to test this project are:

* Use the Postman collections to make requests to the quiz and question services and verify the responses.
* Use the documentation to explore the API and try out different scenarios and parameters.
* Use the actuator endpoints to monitor and manage the services, such as /health, /info, /metrics, and /refresh.

## Configuration
The configuration for this project includes the following:

* The server.port property, which sets the port number for each service.
* The spring.application.name property, which sets the name for each service.
* The spring.datasource properties, which set the database connection details for each service.
* The spring.cloud.gateway.routes properties, which set the routes for the API Gateway.
* The eureka.client properties, which set the Eureka client settings for each service.

## Discussion
The discussion for this project includes the following:

#### Why microservices?
* Microservices are a way of designing software applications as a collection of loosely coupled, independently deployable, and scalable services that communicate with each other using well-defined APIs.
* Microservices offer several benefits, such as faster development, easier maintenance, better performance, higher availability, and more flexibility.
#### How to use Feign?
* Feign is a declarative HTTP client that makes writing web service clients easier.
* Feign allows you to create an interface and annotate it with the HTTP request details, such as the method, the URL, the parameters, and the headers. Feign then generates a client that implements the interface and handles the communication with the web service.
#### How to use Spring Cloud Gateway?
* Spring Cloud Gateway is an API gateway that provides a simple and effective way to route and filter requests to microservices.
* Spring Cloud Gateway allows you to define routes for each service using properties or Java code, and apply filters to modify the requests and responses, such as adding headers, logging, rewriting paths, and more.
