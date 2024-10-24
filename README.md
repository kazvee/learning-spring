# 🌿 Learning Spring ☕

This repository documents my progress during the 'Learning Spring 6 with Spring Boot 3' course. 👩‍💻

I've also made some styling changes and added a landing page for the fictitious Landon Hotel just for fun! 🏨

## Table of Contents

- [Final Product](#final-product)
- [Image Credits](#image-credits)
- [API Endpoints](#api-endpoints)
- [Key Dependencies](#key-dependencies)
- [Installation](#installation)

## Final Product

### Main Page:

![Landon_Hotel_Main_Page](/landon-hotel/src/main/resources/static/images/readme/Landon_Hotel_Main_Page.png)

### Rooms Page:

![Landon_Hotel_Rooms_Page](/landon-hotel/src/main/resources/static/images/readme/Landon_Hotel_Rooms_Page.png)

### Reservations Page:

![Landon_Hotel_Reservations_Page](/landon-hotel/src/main/resources/static/images/readme/Landon_Hotel_Reservations_Page.png)

## Image Credits

Hotel image by [Hans-Joachim Müller-le Plat](https://pixabay.com/users/zuluzulu-2223810/?utm_source=link-attribution&utm_medium=referral&utm_campaign=image&utm_content=1567013) from [Pixabay](https://pixabay.com//?utm_source=link-attribution&utm_medium=referral&utm_campaign=image&utm_content=1567013)

## API Endpoints

You can test the API endpoints using curl and jq:
`curl http://localhost:8080/api/rooms | jq`

Or use your web browser to visit the available API endpoints:

### Rooms
- Get all rooms:  
  `http://localhost:8080/api/rooms`

- Get a specific room by ID:  
  `http://localhost:8080/api/rooms/{roomId}`  

### Guests
- Get all guests:  
  `http://localhost:8080/api/guests`

- Get a specific guest by ID:  
  `http://localhost:8080/api/guests/{guestId}`  

### Reservations
- Get all reservations:  
  `http://localhost:8080/api/reservations`
  
- Get a specific reservation by ID:  
  `http://localhost:8080/api/reservations/{reservationId}`

## Key Dependencies

- Java v21
- Maven v3
- Spring Framework (including Spring Boot)
- PostgreSQL
- Dotenv-java
- Lombok
- Thymeleaf

## Installation

- Fork this repository to your own GitHub account
- Clone your fork onto your local machine
- Navigate to the landon-hotel directory
  `cd landon-hotel`
- Install dependencies: 
  `mvn clean install`
- Create a PostgreSQL database for the application
- Populate the database using the SQL schema and data files located in the `bin/postgresql` directory
- Create a new `.env` file in the `landon-hotel` directory with your database credentials (use the `.env.example` file for guidance)
- Run the app from inside the `landon-hotel` directory
  `mvn spring-boot:run`
- Navigate to [http://localhost:8080](http://localhost:8080/) in your browser