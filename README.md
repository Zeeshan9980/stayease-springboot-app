📄 Project Summary

StayEase is a hotel booking management backend built using Spring Boot.
It provides RESTful APIs for managing hotels, users, and bookings — designed with clean architecture, modular services, and secure access.

The system is production-ready, easily deployable with Docker, and follows enterprise backend standards for scalability and maintainability.

🎯 Project Objectives

✅ Build a robust, modular backend system for hotel booking platforms.

✅ Support core business features like registration, booking, and cancellation.

✅ Ensure data integrity, security, and performance with Spring Boot & MySQL.

✅ Provide containerized deployment for CI/CD readiness.

🧠 System Overview

Client Application / Frontend
→ Handles user interactions and communicates with the backend via RESTful APIs.

RESTful API Layer
→ Acts as the gateway between the frontend and backend microservices, ensuring secure and efficient request routing.

Backend Microservices

Authentication & Authorization Service – Manages user login, registration, and secure access control.

Booking Management Service – Handles booking creation, updates, and tracking.

Hotel Management Service – Manages hotel details, availability, and inventory.

User Profile Management Service – Handles user information, preferences, and profile updates.

Database Layer (MySQL)
→ Stores structured data for users, bookings, and hotels with relationships optimized for scalability and consistency.




🚀 Key Features

👤 User Management: Register, login, and secure authentication.

🏨 Hotel Management: Add, view, and manage hotel information.

📅 Booking Management: Create, view, and cancel bookings.

🌐 RESTful APIs: Follows REST standards with clear endpoints.

🧱 Layered Architecture: Controller → Service → Repository.

🐳 Docker Integration: Seamless containerized deployment.

🧩 Technology Stack

Category	Technologies
Framework	Spring Boot (v3+)
Language	Java 21
Database	MySQL
Security	Spring Security + JWT (planned)
Build Tool	Maven
API Testing	Postman
Version Control	Git & GitHub
Containerization	Docker

⚙️ Setup & Installation
1️⃣ Clone the Repository
git clone https://github.com/Zeeshan9980/stayease-springboot-app.git

cd stayease-springboot-app

2️⃣ Configure the Database

Edit the application.properties file in:
src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/stayease
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Build & Run the Application

mvn clean install

mvn spring-boot:run

4️⃣ Access the Application

Open in browser or Postman:
👉 http://localhost:8081

🧭 Project Structure

com.stayease.bookingapp
│
├── advice              → Global exception handling
├── config              → Application configurations
├── controller          → REST API controllers
├── dto                 → Data Transfer Objects
├── entity              → Database entities
├── exception           → Custom exception classes
├── repository          → Data access layer
├── security            → JWT & Authentication logic
├── service             → Business logic layer
├── strategy            → Booking strategies
├── util                → Utility classes
└── StayEaseApplication.java → Main entry point

🧪 API Testing (Postman Ready)

| Action         | Endpoint              | Method |
| -------------- | --------------------- | ------ |
| Register User  | `/api/users/register` | POST   |
| Login          | `/api/users/login`    | POST   |
| View Hotels    | `/api/hotels`         | GET    |
| Create Booking | `/api/bookings`       | POST   |
| Cancel Booking | `/api/bookings/{id}`  | DELETE |

🐳 Docker Deployment
🧱 Build Docker Image

docker build -t stayease-app .

🚀 Run Container

docker run -p 8081:8081 stayease-app

Then visit:
👉 http://localhost:8081
