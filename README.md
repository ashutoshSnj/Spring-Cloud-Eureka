# Spring Cloud Eureka Microservices

This repository contains three microservices using **Spring Cloud Eureka** for service discovery and management. The project includes a main service and two microservices for **User Service** and **Order Service**.

### Repository Structure

- **main**: This is the default branch, which sets up the Eureka server for service discovery.
- **user-service**: This branch contains the implementation for the **User Service**, which provides functionalities related to user management.
- **order-service**: This branch contains the implementation for the **Order Service**, which manages order-related functionalities.

### Branch Overview

#### **`main` branch**
This branch contains the **Eureka Server**, which acts as the service registry and discovery server for all microservices in this project. It allows services to register and discover other services in a microservices architecture.

#### **`user-service` branch**
This branch contains the **User Service**, which handles operations related to user management (e.g., user creation, authentication, etc.). It registers itself with the Eureka server for discovery.

#### **`order-service` branch**
This branch contains the **Order Service**, which manages order operations (e.g., order creation, order tracking, etc.). This service also registers itself with the Eureka server for discovery.

### How to Run the Project

#### Prerequisites

- **JDK 17 or later**
- **Maven** (for building the project)
- **Docker** (optional, for running services in containers)
- **Spring Boot** (for running individual services)

#### Steps to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/ashutoshSnj/Spring-Cloud-Eureka.git
