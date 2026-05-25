# EmployeeMangament-System
Console-based Employee Management System using Java, JDBC, and MySQL with layered architecture and CRUD operations.
# Employee Management System

## Project Overview

This is a console-based Employee Management System developed using Java, JDBC, and MySQL.
The project performs CRUD (Create, Read, Update, Delete) operations and follows a layered architecture approach.

The project was built to strengthen backend development fundamentals such as JDBC connectivity, SQL integration, OOP concepts, exception handling, DAO pattern, and service layer architecture.

---

## Features

* Add Employee
* View All Employees
* Update Employee Salary
* Delete Employee
* Database Connectivity using JDBC
* Layered Architecture
* Service Layer Validations
* Exception Handling

---

## Technologies Used

* Java
* JDBC
* MySQL
* Git & GitHub

---

## Project Structure

src/

├── model

├── dao

├── service

├── util

├── exception

└── main

---

## Concepts Implemented

* Object-Oriented Programming (OOP)
* Encapsulation
* Constructors
* Utility Classes
* DAO Pattern
* Service Layer
* PreparedStatement
* ResultSet Handling
* Transactions Basics
* Exception Handling
* Collections Framework

---

## Database Schema

```sql
create table employee(
    emp_id int primary key,
    name varchar(50),
    department varchar(30),
    salary double,
    age int
);
```

---

## How to Run the Project

1. Clone the repository
2. Open project in IntelliJ IDEA/Eclipse
3. Add MySQL Connector JAR file
4. Create MySQL database:

```sql
create database employee_management;
```

5. Update database credentials in `DBConnection.java`
6. Run `MainApp.java`

---

## Future Improvements

* Search Employee by ID
* Department-wise Filtering
* Maven Integration
* Spring Boot REST API Conversion
* Frontend Integration

---

## Author

Sudharshan

