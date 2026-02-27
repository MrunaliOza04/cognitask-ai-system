# 🚀 Cognitask AI – Secure Backend System

## 📌 Overview

Cognitask AI is a secure and scalable backend system built using Spring Boot.
The project demonstrates implementation of production-level authentication,
JWT-based security, and layered architecture design principles.

The goal of this project is to design a robust backend foundation
that can support real-world application development.

---

## 🏗 Architecture Design

The project follows a clean layered architecture:

- **Controller Layer** → Handles HTTP Requests
- **Service Layer** → Business Logic Processing
- **Repository Layer** → Database Interaction
- **DTO Layer** → Data Transfer Abstraction
- **Security Layer** → JWT Authentication & Authorization

This structure ensures:
- Separation of concerns
- Maintainability
- Scalability
- Clean code practices

---

## 🔐 Security Implementation

Security is implemented using:

- Spring Security 6
- BCrypt Password Encoding
- JWT Token Generation
- JWT Validation Filter
- Stateless Authentication

Authentication Flow:

1. User registers
2. Password stored using BCrypt hashing
3. User logs in
4. JWT token is generated
5. Client sends token in `Authorization: Bearer <token>`
6. Security filter validates token
7. Access granted to protected endpoints

---

## 🧰 Tech Stack

| Technology | Purpose |
|------------|----------|
| Java 25 | Core Language |
| Spring Boot 3.x | Backend Framework |
| Spring Security | Authentication & Authorization |
| JWT | Stateless Security |
| Spring Data JPA | ORM |
| MySQL | Database |
| Maven | Build Tool |
| Postman | API Testing |

---

## 📂 Project Structure

cognitask-ai
├── src
│ ├── main
│ │ ├── java
│ │ │ ├── controller
│ │ │ ├── service
│ │ │ ├── repository
│ │ │ ├── dto
│ │ │ ├── security
│ │ │ └── model
│ │ └── resources
│ │ └── application.properties
│ └── test
├── pom.xml
├── mvnw
└── mvnw.cmd


---

## ✅ Features Implemented

- User Registration API
- Secure Login API
- BCrypt Password Encryption
- JWT Token Creation
- JWT Request Filter
- Protected REST Endpoints
- Exception Handling Structure
- Clean Package Organization

---

## 🔄 Current Development

- Role-Based Authorization (In Progress)

---

## 🗄 Database Design

- Relational schema using MySQL
- Entity relationships mapped with JPA
- Repository pattern for data abstraction

---

## ▶ Running the Application

1. Clone the repository
2. Configure database credentials in `application.properties`
3. Run using: mvn spring-boot:run
4. Test APIs using Postman

---

## 🎯 Future Improvements

- Complete Role-Based Access Control
- Refresh Token Implementation
- API Documentation (Swagger/OpenAPI)
- Docker Containerization
- Cloud Deployment (AWS / Render)
- Unit & Integration Testing

---

## 👨‍💻 Author

**Mrunali Oza**  
Backend Developer – Java & Spring Boot  
