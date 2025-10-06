# E-commerce Product Catalog

This is a full-stack web application that displays a product catalog. It consists of a Spring Boot backend that serves a REST API and a React frontend that consumes the API to display the products.

## Project Structure

The project is organized into two main directories:

-   `ecom-back/`: The backend application (Spring Boot)
-   `ecom-front/`: The frontend application (React)

---

## Backend (`ecom-back`)

The backend is a Java-based Spring Boot application that manages products and categories.

### Technologies Used

-   **Java 17**
-   **Spring Boot 3.5.6**: Core framework for building the application.
-   **Spring Data JPA**: For database interaction.
-   **MySQL**: The relational database for storing product and category data.
-   **Maven**: For project build and dependency management.

### Features

-   Provides RESTful APIs to fetch products and categories.
-   Supports fetching all products or filtering them by category.

### API Endpoints

-   `GET /api/products`: Retrieves a list of all products.
-   `GET /api/products/category/{categoryId}`: Retrieves products belonging to a specific category.
-   `GET /api/categories`: Retrieves a list of all available product categories.

### Setup and Running

1.  **Database Configuration**:
    -   Make sure you have MySQL installed and running.
    -   Create a database named `product-catalog`.
    -   Update the database credentials in `ecom-back/src/main/resources/application.properties` if they differ from the default (username: `root`, no password).

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/product-catalog
    spring.datasource.username=root
    spring.datasource.password=
    ```

2.  **Run the Application**:
    -   Navigate to the `ecom-back` directory.
    -   Run the application using the Maven wrapper:
        ```bash
        ./mvnw spring-boot:run
        ```
    -   The backend server will start on `http://localhost:8080`.

---

## Frontend (`ecom-front`)

The frontend is a single-page application (SPA) built with React that provides a user interface for the product catalog.

### Technologies Used

-   **React 19**: For building the user interface.
-   **Vite**: As the build tool and development server.
-   **Bootstrap 5**: For styling and responsive design.

### Features

-   Displays a grid of products with their image, name, description, and price.
-   Allows users to filter products by category via a dropdown menu.
-   Provides a search bar to find products by name.
-   Allows sorting products by price (Low to High or High to Low).
-   Communicates with the backend at `http://localhost:8080` to fetch data.

### Setup and Running

1.  **Install Dependencies**:
    -   Navigate to the `ecom-front` directory.
    -   Install the required npm packages:
        ```bash
        npm install
        ```

2.  **Run the Development Server**:
    -   Start the Vite development server:
        ```bash
        npm run dev
        ```
    -   The frontend application will be available at `http://localhost:5173`.

---

## Getting Started (Complete Setup)

To run the entire application, you need to start both the backend and the frontend servers.

1.  **Start the Backend**: Follow the setup instructions in the "Backend" section.
2.  **Start the Frontend**: Follow the setup instructions in the "Frontend" section.
3.  **View the Application**: Open your web browser and go to `http://localhost:5173`.
