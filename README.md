# Enterprise Spring Boot Application Template

Project Template is a Java application template using enterprise architecture and design to make it easy to understand, extend and maintain. It showcases the use of various classes, interfaces, and design patterns to interact with a database and perform user-related operations.

## Controllers

### UserController

- Manages user-related operations.
- Includes API endpoints for retrieving user information and user login.
- Utilizes `IUserDao` and `SqlServerUserDao` for data access.

### ProductController

- Handles product-related operations.
- Provides an API endpoint for retrieving product information.
- Relies on `IProductDao` and `SqlServerProductDao` for data access.

## Validator

### ValidatorRule

- Abstract base class for validator rules.
- Maintains property name to which the rule applies and validation error message.

### ValidateRequired

- Extends `ValidatorRule`.
- Validates if a property is required.

### ValidateLength

- Extends `ValidatorRule`.
- Validates the length of a property.

### Validator

- Abstract base class for validator rules.
- Contains basic validation rule infrastructure.
- Validates the properties using a list of `ValidatorRule`s.

## Entities

### User

- Extends `Validator`.
- Represents a user entity with validation rules for UserName and Password.

### Product

- Extends `Validator`.
- Represents a product entity.

## Data Access Layer (DAL)

The Data Access Layer is the core component of this application, responsible for connecting to different data providers and performing data access operations. Key features of the DAL include:

### Abstract Factory Design Pattern

This project makes use of the Abstract Factory Design Pattern to create data access objects based on the selected data provider. The Abstract Factory provides an interface for creating families of related or dependent objects without specifying their concrete classes. It enables the application to seamlessly switch between different data providers, such as MySQL and SQL Server, by utilizing the appropriate factory.

### User Data Access

The DAL includes data access interfaces and concrete implementations for user data. Two implementations of the `IUserDao` interface are provided for different data providers:

### MySQL User Data Access (MySqlUserDao)

The `MySqlUserDao` class provides data access methods for user-related operations in a MySQL database. It implements the `IUserDao` interface, defining methods to retrieve user information and validate user credentials.

### SQL Server User Data Access (SqlServerUserDao)

The `SqlServerUserDao` class is responsible for data access operations related to users in a SQL Server database. It also implements the `IUserDao` interface, providing methods to retrieve user information and validate user credentials.

## Abstract Factory Design Pattern

The Abstract Factory Design Pattern is a creational pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. In this project, it is used to select the appropriate factory for data access based on the chosen data provider. This design pattern allows for flexibility in connecting to different databases, making it easier to adapt to changing requirements or data providers.

## Usage

1. Clone the repository.

2. Import the project into your preferred Java IDE.

3. Run the Spring Boot application.

4. Access the APIs through the defined endpoints, e.g.:

    - Retrieve user information:
      ```
      GET http://localhost:8080/user/{userid}
      ```

    - User login:
      ```
      GET http://localhost:8080/user/{username}/{password}
      ```

    - Retrieve product information:
      ```
      GET http://localhost:8080/product/{productId}
      ```

## Additional Information

## Note

- This application is for demonstration purposes and uses mock data.
- Data retrieval from the database is simulated and needs to be updated for a real application.