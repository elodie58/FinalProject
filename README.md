# Content Creator Hub

A Spring Boot RESTful API for managing content creators, their profiles, and published content. Built as part of a full-stack developer course project.

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Security (JWT)
- Spring Data JPA
- MySQL
- Lombok
- Bean Validation (JSR-380)
- Maven

## 📚 Features

- **User Authentication & Authorization**
    - JWT-based login system
    - Role-based access control (`ADMIN`, `USER`)

- **Account Management**
    - Register and login with secure password encryption
    - Assign roles to users

- **Creator Module**
    - Manage contacts (`IndividualContact`, `CompanyContact`)
    - Create profiles for individual or company creators

- **Content Module**
    - Create and manage different types of content
    - Assign content types and languages

- **Validation & Error Handling**
    - Custom exception handling for better API feedback
    - Request validation with `@Valid`

- **Secure Endpoints**
    - Protected routes using Spring Security and JWT filters
## 📊 Class Diagram

## 📊 Class Diagram

## 📊 Class Diagram

![Class Diagram](docs/contentcreatorscatalog.png)



## 🗃 Project Structure

account

model, repository, security,dto,service,  controller,

creator

contact (individual, company), profile, service, repository

content

content, content-type, language

dataloader

security


### Setup
spring:
datasource:
url: jdbc:mysql://localhost:3306/content_creators_catalog_db
username: root
password: root

jpa:
hibernate:
ddl-auto: update

    show-sql: true

server:
error:
include-stacktrace: never

Configure MySQL database
Update application.yaml:

🧪 API Endpoints
Authentication
POST /auth/register - Register a new user

POST /auth/login - Authenticate and get JWT token

User Management
GET /users/me - Get current user profile

Creator Management
POST /contacts/individual - Create individual contact

POST /contacts/company - Create company contact

POST /profiles/individual - Create profile for individual

POST /profiles/company - Create profile for company

Content Management
POST /content - Create new content

GET /content - Get all content

🧰 Tools and Configuration
Lombok for reducing boilerplate

Bean Validation (@NotNull, @Size, etc.) on DTOs

Custom Exception Handling with @ControllerAdvice

Security Configuration via JWT filters

✍️ Author
Elodie - Final Project for IronHack Java Developer Bootcamp