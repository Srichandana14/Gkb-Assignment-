# User Web Application
This is a basic web application that allows users to input data, validate it, store it in a database, retrieve it, and display it in a table format.

Technologies Used
----------------------
Backend: Spring Boot
Database: MySQL
Frontend: Angular

Setup Instructions
------------------
1. Clone the Repository:
   git clone https://github.com/Srichandana14/Gkb-Assignment-.git
   
2. Angular Project Setup:
Created Angular project in Visual Studio Code.
Perform necessary installations and configurations for Angular development.

3. Spring Boot Project Setup:
Spring Boot project created using Spring Initializr.
Add necessary dependencies for Spring Boot application development.

4. Database Setup:
Create a MySQL database.
Define the schema for the 'user' table using the provided SQL script.

5. API Setup:
Develop RESTful APIs using Spring Boot to handle CRUD operations for user data.
Test the APIs using Postman or any similar tool.

6. Access Project Repository:
Repository link: https://github.com/Srichandana14/Gkb-Assignment-

7. Database Schema:
   CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `age` int NOT NULL,
  `dob` datetime(6) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

8.This documentation provides the brief explanation of the project.
