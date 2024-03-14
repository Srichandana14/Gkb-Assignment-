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

8. Inserted values
INSERT INTO `user` VALUES 
  (1, 20, '2001-05-20 00:00:00.000000', 'sri@gmail.com', 'Sri'),
  (2, 20, '2001-05-12 05:30:00.000000', 'varu@gmail.com', 'Varu'),
  (3, 21, '2002-02-15 05:30:00.000000', 'chandana@gmail.com', 'Chandana'),
  (4, 40, '1992-10-21 05:30:00.000000', 'bhavani@gmail.com', 'Bhavani'),
  (5, 23, '2000-12-26 05:30:00.000000', 'priya@gmail.com', 'Priya'),
  (6, 24, '2000-12-25 05:30:00.000000', 'shiva@gmail.com', 'Shiva'),
  (7, 21, '2002-07-24 05:30:00.000000', 'varshini@gmail.com', 'Varshini');


9.This documentation provides the brief explanation of the project.
