# 🏋️ Fitness Recommendation App

A full-stack **Microservices-based Fitness Recommendation Application** built using **Spring Boot, React, RabbitMQ, Keycloak, and Gemini AI API**.

This application allows users to track their fitness activities such as workout type, duration, calories burned, and date. Based on the activity data, the system generates **AI-powered fitness recommendations** to help users improve their health and workout efficiency.

---

## 🚀 Features

### 👤 User Management
- User registration and profile management
- Secure authentication using **Keycloak**
- OAuth 2.0 + PKCE Flow implementation

### 🏃 Activity Tracking
- Add fitness activities (Cycling, Running, Gym, etc.)
- Track:
  - Activity Type
  - Duration (minutes)
  - Calories Burned
  - Date

### 🤖 AI Recommendations
- AI-generated personalized fitness suggestions
- Recommendation based on:
  - Activity Type
  - Duration
  - Calories Burned
- Powered by **Gemini API**

### 🔄 Asynchronous Communication
- **RabbitMQ** used for event-driven communication
- Activity data sent asynchronously to AI Service

### 🌐 Microservices Architecture
- User Service
- Activity Service
- AI Recommendation Service
- Eureka Discovery Server
- API Gateway
- Config Server

### 🔐 Security
- Authentication and Authorization using **Keycloak**
- Secure API Gateway with OAuth 2.0 Resource Server

---

## 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring Cloud
- Spring Security
- Spring Data JPA
- Hibernate
- PostgreSQL
- MongoDB
- RabbitMQ
- Eureka Server
- API Gateway
- Config Server
- Keycloak
- Gemini API

### Frontend
- React.js
- Redux Toolkit
- Material UI
- Axios
- Vite

---

## 🏗️ System Architecture

```text
Frontend (React + Redux)
        ↓
API Gateway
        ↓
-----------------------------------
| User Service                    |
| Activity Service                |
| AI Recommendation Service       |
-----------------------------------
        ↓
RabbitMQ (Async Communication)
        ↓
Gemini API (AI Suggestions)

+ Eureka Server
+ Config Server
+ Keycloak Authentication
