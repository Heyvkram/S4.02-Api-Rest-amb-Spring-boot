# IT ACADEMY BACKEND JAVA SPECIALIZATION

## SPRINT 4 TASK 2 - LEVEL 1

## Summary

This is a Spring Boot project built with Maven as the dependency manager. It implements a complete CRUD for a Fruit entity and follows the MVC pattern, using REST best practices and persistence with an in-memory H2 database.

## Technologies Used

* Java JDK (version 17)
* Spring Boot
* Spring Data JPA
* H2 Database
* Maven
* Postman

## Requirements

* Java JDK (version 17)
* Maven installed
* Postman (or another HTTP client) to test endpoints

## How to run the application

1.  Clone this repository or download the project.
2.  Open a terminal in the project root directory.
3.  Run the following Maven command:

    `./mvnw spring-boot:run`

## API Endpoints

This API has been tested using Postman.

### Add a fruit:

* Method: POST
* URL: http://localhost:8080/fruita/add
* Body:

    ```json
    {
        "nom": "Apple",
        "quantitatQuilos": 10
    }
    ```

### Get all fruits:

* Method: GET
* URL: http://localhost:8080/fruita/getAll

### Get a fruit by ID (example ID 1):

* Method: GET
* URL: http://localhost:8080/fruita/getOne/1

### Update a fruit (example ID 1):

* Method: PUT
* URL: http://localhost:8080/fruita/update/1
* Body:

    ```json
    {
        "nom": "Updated Apple",
        "quantitatQuilos": 15
    }
    ```

### Delete a fruit (example ID 1):

* Method: DELETE
* URL: http://localhost:8080/fruita/delete/1

## H2 Console

You can access the H2 console at: http://localhost:8080/h2-console

* JDBC URL: jdbc:h2:mem:fruita\_db
* User: sa
* Password: (empty)

## Useful Maven Commands

* `mvn compile`: Compiles the project.
* `mvn package`: Packages the project as a JAR.
* `mvn clean`: Cleans up the compiled files.
* `mvn spring-boot:run`: Runs the Spring Boot application.