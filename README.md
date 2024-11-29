# Employee Management System

A simple **Employee Management System** built with **Spring Boot** to manage employee details. The application provides RESTful APIs for creating, retrieving, updating, and deleting employee records. It is designed with scalability and ease of use in mind, making it ideal for learning or extending into a full-fledged enterprise application.

## Features
- Add, update, and delete employee records.
- Retrieve employee details with pagination and sorting.
- Department and designation fields for structured management.
- RESTful APIs for seamless integration.

## Technologies Used
- **Spring Boot** for the backend framework.
- **Spring Data JPA** for ORM.
- **MySQL** for database storage.

## Getting Started
1. Clone the repository:
   ```bash
   git clone git@github.com:thirajpro/emplmanager.git
   ```
2. Configure the database in `application.properties`.
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the APIs at `http://localhost:8080/api/employees`.

## Endpoints
### Employee
- **GET** `/api/employees` - Get all employees.
- **GET** `/api/employees/{id}` - Get an employee by ID.
- **POST** `/api/employees` - Add a new employee.
- **PUT** `/api/employees/{id}` - Update an employee.
- **DELETE** `/api/employees/{id}` - Delete an employee.

### Department
- **GET** `/api/departments` - Get all departments.
- **GET** `/api/departments/{id}` - Get a department by ID.
- **POST** `/api/departments` - Add a new department.
- **PUT** `/api/departments/{id}` - Update a department.
- **DELETE** `/api/departments/{id}` - Delete a department.

## License
This project is open-source and available under the [MIT License](LICENSE).
