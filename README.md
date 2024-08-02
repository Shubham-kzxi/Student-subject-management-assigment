# Student-Subject Management Project
## Overview
This project is a simple Spring Boot application for managing students and their enrolled subjects. It provides RESTful APIs for creating, retrieving, and managing students and subjects.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- H2 Database (In-Memory)
- Maven

## How to Run the Project

### Prerequisites

- JDK 17 or later
- Maven 3.6.3 or later

### Steps to Run

 ## Clone the Repository-->
   git clone https://github.com/username/student-subject-management-assigment.git

 ## Access the API
The application runs on http://localhost:8080.
Use tools like Postman to interact with the API. 

## REST METHODS AND SYNTAX-->
http://localhost:8080/
POST /subject: Create a new subject.
format-->
{
 "name": "subject-name"
}
GET /subjects: Retrieve all subjects.

POST /students: Create a new student.
{
  "name": "student-name",
  "address": "student-address",
  "subjects": [
    {
      "id": 1
    },
    {
      "id": 2
    }
  ]
}

GET /student: Retrieve all student.

Thank you.


