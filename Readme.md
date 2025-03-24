# Student Hub API

## Overview
Student Hub API is a **Spring Boot RESTful API** that allows managing student data. It follows a **layered architecture**, separating concerns into different modules for better maintainability and scalability. The project was build under the **PostgresSQL** database. 

## Architecture
The application follows the **three-layered architecture**:

1. **Controller Layer** (API Layer) - Handles HTTP requests and responses.
2. **Service Layer** (Business Logic Layer) - Implements business logic.
3. **Repository Layer** (Data Access Layer) - Communicates with the database.

### Diagram
```
 StudentController (REST API layer)  <-->  StudentService (Business Logic)  <-->  StudentRepository (Database Access)  <-->  PostgreSQL
```

## API Endpoints
### Base URL: `http://localhost:8080/api/v1/student`

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/` | Fetch all students |
| POST | `/` | Add a new student |
| DELETE | `/{studentId}` | Delete a student by ID |
| PUT | `/{studentId}?name=NewName&email=new@email.com` | Update a student's details |

### Request & Response Examples
#### 1. Get All Students
**Request:**
```sh
GET http://localhost:8080/api/v1/student
```
**Response:**
```json
[
  {
    "id": 1,
    "name": "Nirusan Hariharan",
    "email": "nirusan.harihara350@gmail.com",
    "dob": "2003-10-09"
  },
  {
    "id": 2,
    "name": "Malith Lekamage",
    "email": "malith.lekamge@gmail.com",
    "dob": "2002-02-10"
  }
]
```

#### 2. Add a Student
**Request:**
```sh
POST http://localhost:8080/api/v1/student
Content-Type: application/json
```
**Body:**
```json
{
  "name": "Sasni Rafeek",
  "email": "Sasni@gmail.com",
  "dob": "2000-12-29"
}
```

## Running the Project
### Prerequisites
- **Java 17+**
- **Maven**
- **PostgreSQL**

### Setup Database
Modify `application.properties` with your PostgreSQL credentials:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/student
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Running Locally
1. Clone the repository:
   ```sh
   git clone https://github.com/Nirusan03/student-hub-api
   cd student-hub-api
   ```
2. Build and run the project:
   ```sh
   mvn spring-boot:run
   ```
3. Open `http://localhost:8080/api/v1/student` to interact with the API.

### Running JAR File
To run the application as a JAR file:
```sh
java -jar target/student-hub-api-0.0.1-SNAPSHOT.jar --server.port=8081
```

## Technologies Used
- **Spring Boot** - Backend framework
- **Spring Data JPA** - ORM for database access
- **PostgreSQL** - Database
- **Maven** - Build automation
- **REST API** - API structure

## License
This project is licensed under the MIT License.
