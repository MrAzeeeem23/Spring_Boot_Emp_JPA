# Spring Boot Employee API with H2 Database

## Project Description
This project is a basic implementation of a RESTful API using Spring Boot, Spring JPA, and an H2 in-memory database. It demonstrates CRUD operations on employee data and serves as an introduction to Spring Boot development and containerization.

## Tech Stack
- Java 21 (Recommended)
- Spring Boot
- Spring JPA (Hibernate)
- H2 Database (In-Memory)
- Maven
- IntelliJ IDEA (or any Java IDE)
- Postman/Insomnia (For API Testing)

## Pre-requisites
Make sure you have the following installed:
- Java JDK 21
- Maven
- IntelliJ IDEA
- Postman or Insomnia

## Getting Started

### 1. Clone the Repository
```sh
git clone https://github.com/MrAzeeeem23/Spring_Boot_Emp_JPA.git
cd Spring_Boot_Emp_JPA
```

### 2. Configure Database
Modify the `application.properties` file (located in `src/main/resources/`):
```properties
spring.application.name=h2
# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=<Your Username>
spring.datasource.password=<Your Password>
spring.datasource.platform=h2
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
server.port=9988
```
Replace `<Your Username>` and `<Your Password>` with your own credentials.

### 3. Build and Run the Application
```sh
mvn clean install
mvn spring-boot:run
```

### 4. Test the API Endpoints
Use Postman or Insomnia to test the API:

- **GET** all employees: `GET http://localhost:9988/api/v1/emp`
- **GET** employee by ID: `GET http://localhost:9988/api/v1/emp/{id}`
- **POST** a new employee: `POST http://localhost:9988/api/v1/emp`
- **PUT** update an employee: `PUT http://localhost:9988/api/v1/emp/{id}`
- **DELETE** an employee: `DELETE http://localhost:9988/api/v1/emp/{id}`

### 5. Access H2 Database Console
Go to: `http://localhost:9988/h2-console/`
Enter the same credentials as defined in `application.properties` and connect.

## Project Structure
```
Spring_Boot_Emp_JPA/
│── src/main/java/com/example/ 
│   ├── controller/   # Handles API requests
│   ├── model/        # Defines Employee entity
│   ├── service/      # Business logic layer
│   ├── repository/   # JPA repository for data access
│── src/main/resources/
│   ├── application.properties  # Configurations
│── pom.xml  # Maven dependencies
```

## Future Enhancements
- **Docker Containerization**: Containerizing the application for easier deployment.
- **Integration with PostgreSQL**: Persisting data beyond in-memory H2.
- **Authentication & Authorization**: Adding security using Spring Security.

## Additional Support
If you want to understand this code better, feel free to ask **ChatGPT**! 🚀 from Ak.........