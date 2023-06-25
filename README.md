# Restaurant Management System

This is a Restaurant Management System application built using Java and Spring Boot. It provides RESTful APIs for managing restaurants.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Data Flow](#data-flow)
- [Data Structure Used](#data-structure-used)
- [Project Summary](#project-summary)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features

- Get a list of all restaurants
- Get a specific restaurant by ID
- Add new restaurants
- Update existing restaurants
- Delete restaurants

## Prerequisites

- Java Development Kit (JDK) 17 or later
- Apache Maven
- Git
- Dependencies:
     - Spring Web
     - Lombok
     - Validation   

## Data Flow

The data flow in the project is as follows:

  1. Controller

     - `RestaurantController`: Handles incoming HTTP requests related to restaurants. It defines various methods for handling CRUD operations on restaurants.

   2. Services

      - `RestaurantService`: Provides business logic for managing restaurants. It interacts with the repository to perform operations on the restaurant data.

   3. Repository

      - `RestaurantRepo`: Provides methods for accessing and manipulating the restaurant data. It uses an in-memory `restaurantMap` as a storage mechanism.

   4. Model

      - `Restaurant`: Represents a restaurant. It has attributes such as ID, name, address, phone number, specialty, and total staff count.

   5. Configuration

      - `BeanManager`: Defines a bean for a `Map<Integer, Restaurant>`, which is used as an in-memory storage for the restaurant data.

## Data Structure Used

- `Map<Integer, Restaurant>`: Used as an in-memory storage for storing restaurant objects. The restaurant ID is used as the key.

## Project Summary

The project demonstrates the use of Java and the Spring framework for building a restaurant management system. It follows a simple architecture where the controller handles incoming requests, the service provides business logic, and the repository interacts with the data storage. The project includes input validation using annotations, dependency injection, and RESTful API design principles.


## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/ayaan097/RestaurantManagementSystem.git
   ```

2. Navigate to the project directory:
   ```bash
   cd restaurant-management-system
   ```

3. Build the project using Maven: 
   ```bash
    mvn clean install
    ```

## Usage

  1. Run the application: 
     ```bash
      mvn spring-boot:run
     ```
  2. The application will start running on `http://localhost:8080`.

## API Endpoints

The following API endpoints are available:

- `GET /restaurants`: To Get All Restraunts.

- `GET /restaurants/search/{id}`: To Get One Restraunts by Id.

- `Post /restaurants/add` To Add New Restraunts.

- `PUT /restaurants/update/{id}`
To update the Restraunt Info.

- `DELETE /restaurants/delete/{id}`
To delete the Restraunt.


## Contributing

Contributions to the Restaurant Management System project are welcome! If you find any issues or want to enhance the functionality, feel free to create a pull request.

1. Fork the repository.
2. Create your feature branch: `git checkout -b feature/your-feature`.
3. Commit your changes: `git commit -am 'Add some feature'`.
4. Push to the branch: `git push origin feature/your-feature`.
5. Open a pull request.

## License
This project is not licensed.
