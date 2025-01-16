# Online Poll/Voting System

An efficient and user-friendly online poll/voting system built with Spring Boot, Angular, and MySQL. This application
enables users to create and participate in polls or voting events seamlessly.

## Features

- User authentication and authorization.
- Create, view, and manage polls/votes.
- Real-time updates for ongoing polls.
- Secure and reliable data handling.
- Responsive design for desktop and mobile devices.

## Tech Stack

### Backend

- **Framework**: Spring Boot
- **Language**: Java
- **Tools**: Maven

### Frontend

- **Framework**: Angular
- **Styling**: Bootstrap

### Database

- **Database**: MySQL

## Prerequisites

Ensure the following tools are installed on your system:

- **Java 17** or higher
- **Node.js** (v14 or higher)
- **Angular CLI** (v13 or higher)
- **MySQL** (v8.0 or higher)
- **Maven**

## Installation

### Backend Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/online-poll.git
   cd online-poll/backend
   ```

2. Configure the database:
    - Create a MySQL database (e.g., `online_poll`).
    - Update the `application.properties` file in `src/main/resources`:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/online_poll
      spring.datasource.username=your_username
      spring.datasource.password=your_password
      spring.jpa.hibernate.ddl-auto=update
      ```

3. Build and run the backend:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### Frontend Setup

1. Navigate to the frontend directory:
   ```bash
   cd ../frontend
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Run the Angular development server:
   ```bash
   ng serve
   ```

4. Open your browser and navigate to `http://localhost:4200/`.

## Usage

1. Start the backend server by running the Spring Boot application.
2. Start the frontend server by running `ng serve`.
3. Access the application at `http://localhost:4200/`.
4. Register an account, log in, and start creating or participating in polls.

## Project Structure

### Backend (Spring Boot)

- `src/main/java`: Contains application logic, controllers, services, and models.
- `src/main/resources`: Configuration files and static resources.

### Frontend (Angular)

- `src/app`: Contains Angular components, services, and modules.
- `src/assets`: Static assets like images and CSS.

## Contributing

1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push to the branch:
   ```bash
   git push origin feature/your-feature
   ```
5. Create a pull request.

Enjoy building polls with the Online Poll/Voting System!

