# Restaurant Management System

This is a Restaurant Management System application built using Java and Spring Boot. It provides RESTful APIs for managing restaurants.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
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

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/restaurant-management-system.git
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
