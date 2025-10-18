🏨 StayEase - Spring Boot Booking Application
📌 Overview

StayEase is a hotel booking management application built with Spring Boot.
It allows users to search, book, and manage hotel stays easily. The backend exposes REST APIs for managing bookings, hotels, and customers.

🚀 Features

User registration and login

Create, view, and cancel bookings

View hotel details

RESTful API architecture

Integrated with MySQL database

Follows layered architecture (Controller → Service → Repository)

🧰 Tech Stack

Backend: Spring Boot (v3+)

Database: MySQL

Build Tool: Maven

API Testing: Postman

Version Control: Git & GitHub

Containerization : Docker

⚙️ Setup Instructions
1️⃣ Clone the repository
git clone https://github.com/Zeeshan9980/stayease-springboot-app.git

cd stayease-springboot-app

2️⃣ Configure the database

Edit your src/main/resources/application.properties file:

spring.datasource.url=jdbc:mysql://localhost:3306/stayease

spring.datasource.username=root

spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update

3️⃣ Build and run the project

mvn clean install

mvn spring-boot:run

4️⃣ Access the app

Open your browser or Postman:
👉 http://localhost:8081

🧭 Project Structure

com.stayease.bookingapp
 ├── advice
 ├── config
 ├── controller
 ├── dto
 ├── entity
 ├── exception
 ├── repository
 ├── security
 ├── service
 ├── strategy
 ├── util
 └── StayEaseApplication.java

 🧪 API Testing

All endpoints can be tested using Postman.
You can import the included Postman collection or manually test endpoints such as:

POST /api/users/register

POST /api/users/login

GET /api/hotels

POST /api/bookings

DELETE /api/bookings/{id}

