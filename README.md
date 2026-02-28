<h1 align="center">🧠 Cognitask AI System</h1>
<h3 align="center">AI-Powered Productivity Agent with Secure Backend & Gesture Interaction</h3>

<p align="center">
  <b>Spring Boot • JWT Security • AI Integration • MediaPipe • Clean Architecture</b>
</p>

---

# 🚀 Product Vision

Cognitask AI System is not just a backend project.

It is a next-generation AI productivity platform designed to merge:

✔ Secure backend engineering  
✔ Intelligent AI automation  
✔ Real-time gesture-based interaction  

The system is engineered to evolve into an interactive AI productivity assistant where users can manage tasks through both REST APIs and physical hand gestures using computer vision.

---

# 🏗 System Architecture

### High-Level Flow

┌─────────────────────────────────────┐
│ Frontend Layer │
│ Camera UI + MediaPipe Hand Track │
└─────────────────────────────────────┘
↓
┌─────────────────────────────────────┐
│ Gesture Processing Layer │
│ - Hand Tracking │
│ - Gesture Detection │
│ - Gesture → Command Mapping │
└─────────────────────────────────────┘
↓
┌─────────────────────────────────────┐
│ Backend REST API Layer │
│ - Spring Boot Controllers │
│ - JWT Authentication │
│ - RBAC Authorization │
│ - Business Logic (Services) │
└─────────────────────────────────────┘
↓
┌─────────────────────────────────────┐
│ Intelligence & Data Layer │
│ - AI Processing (LLM Integration) │
│ - MySQL Database │
└─────────────────────────────────────┘
↓
Structured JSON Response

---

# 🧩 Architecture Philosophy

The backend strictly follows **Layered Architecture Principles**:

- **Controller Layer** → Handles HTTP requests
- **Service Layer** → Business logic orchestration
- **Repository Layer** → Database abstraction
- **DTO Layer** → Clean data transfer contracts
- **Security Layer** → JWT filter chain & RBAC enforcement

This ensures:

- Separation of concerns
- Scalability
- Testability
- Clean extensibility for AI and frontend layers

---

# 🔐 Enterprise-Grade Security Implementation

✔ Stateless Authentication using JWT  
✔ Custom JWT Authentication Filter  
✔ BCrypt Password Encryption  
✔ Role-Based Access Control (USER / ADMIN)  
✔ Endpoint-Level Protection  
✔ Exception Handling Mechanism  

Security is designed to simulate production-ready backend standards.

---

# 🧠 AI Layer (Phase 2)

The AI layer will integrate an external LLM (Gemini or equivalent) to provide:

- Intelligent task breakdown
- Context-aware suggestions
- Smart goal planning
- Dynamic productivity insights

This transforms Cognitask from a CRUD backend into an intelligent assistant.

---

# ✋ Gesture Interaction Layer (Phase 3)

The final system introduces computer vision interaction using MediaPipe.

### Planned Gesture Mapping

| Gesture | Action |
|----------|--------|
| 👍 Thumbs Up | Mark Task Complete |
| ✋ Open Palm | Pause Task |
| ✊ Fist | Start Focus Session |
| ✌ Two Fingers | Show Progress |
| 👉 Point Right | Switch to Next Task |

This layer enables hands-free productivity control — bridging AI and physical interaction.

---

# 📦 Core Backend Features (Current Phase Complete)

- User Registration API
- Secure Login API (JWT Token Generation)
- Token Validation Filter
- Role-Based Authorization
- Goal & Task Entities
- Exception Handling
- Clean Package Structure
- MySQL Integration

---

# 🗺 Development Roadmap

### ✅ Phase 1 — Secure Backend Foundation (Completed)

- Security Architecture
- JWT Implementation
- RBAC Enforcement
- Database Integration

### 🔜 Phase 2 — AI Integration

- External LLM Integration
- Smart Task Generator
- AI Suggestions Engine

### 🔜 Phase 3 — Frontend + Gesture Layer

- Web Interface
- MediaPipe Integration
- Gesture Recognition Engine
- Real-Time API Communication

---

# 🧰 Tech Stack

## Backend
- Java 17+
- Spring Boot 3
- Spring Security
- Spring Data JPA
- MySQL
- Maven

## AI (Planned)
- Gemini API / External LLM

## Frontend (Planned)
- JavaScript
- MediaPipe
- REST API Integration

---

# ⚙ Running the Project

1. Clone the repository  
2. Configure `application.properties`  
3. Ensure MySQL is running  
4. Run Spring Boot application  
5. Test APIs using Postman  

---

# 🎯 Long-Term Objective

Cognitask AI is being engineered as a modular, scalable productivity ecosystem capable of expanding into:

- AI-based productivity analytics
- Voice or gesture-based command systems
- Multi-user collaboration
- Real-time AI coaching

This repository represents the foundation of an intelligent, secure, and extensible productivity platform.

---

<p align="center">
  <b>Engineered with Scalability. Secured for Production. Designed for Intelligence.</b>
</p>
