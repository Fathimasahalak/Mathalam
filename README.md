# Mathalam — Social Media Messaging App

A full stack social media messaging application built with Java Spring Boot and MySQL, featuring user registration, authentication, and real time messaging.

## Tech Stack

- **Backend:** Java, Spring Boot
- **Database:** MySQL, Spring Data JPA
- **Security:** Spring Security, BCrypt Password Encryption
- **Real Time:** WebSocket
- **Build Tool:** Maven

## Features Completed

- User registration with validation
- BCrypt password encryption
- REST APIs for user management
- MySQL database integration with auto table generation
- Spring Security configuration
- Duplicate username and email detection

## Features In Progress

- Real time messaging using WebSocket
- User login with JWT authentication
- Frontend (HTML, CSS, JavaScript)
- Friend request system
- Online/Offline status

## Project Structure

```
src/main/java/com/mathalam/mathalam/
├── controller/
│   └── AuthController.java
├── model/
│   └── User.java
├── repository/
│   └── UserRepository.java
├── service/
│   └── UserService.java
├── SecurityConfig.java
└── MathalamApplication.java
```

## Getting Started

### Prerequisites
- Java 17
- MySQL 8.0
- Maven

### Setup

1. Clone the repository
```
git clone https://github.com/Fathimasahalak/mathalam.git
```

2. Create MySQL database
```sql
CREATE DATABASE mathalamdb;
```

3. Update application.properties
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mathalamdb
spring.datasource.username=root
spring.datasource.password=yourpassword
```

4. Run the application
```
./mvnw spring-boot:run
```

5. App runs at
```
localhost:8080
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /auth/register | Register new user |
| GET | /auth/user/{username} | Get user by username |

## Author

Fathima Sahal — [GitHub](https://github.com/Fathimasahalak)