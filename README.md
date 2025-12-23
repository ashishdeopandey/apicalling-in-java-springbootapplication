## apicalling-in-java-springbootapplication – External API Integration with Swagger

**Project Description**

apicalling-in-java-springbootapplication is a **Spring Boot application** that demonstrates how to integrate and expose a **third-party REST API** within a structured Java backend. The project consumes an external public API and re-exposes it through a custom REST endpoint, fully documented using **Swagger (OpenAPI)**.

This project follows **industry-standard layered architecture** (Controller → Service → DTO) and is suitable for real-world enterprise applications such as **financial and risk management systems**.

---

## 🚀 Features

* Consume external REST API using Spring Boot
* Expose wrapped API through custom REST endpoints
* Swagger UI integration for API documentation & testing
* Clean layered architecture (Controller / Service / DTO)
* Easy to extend for authentication, caching, or persistence

---

## 🛠️ Tech Stack

* **Java 17+**
* **Spring Boot**
* **Spring Web (REST)**
* **springdoc-openapi (Swagger UI)**
* **Maven**

---

## 🌐 External API Used

```
GET https://api.restful-api.dev/objects
```

This API returns a list of objects in JSON format.

---

## 📂 Project Structure

```
src/main/java
└── com/codewith/pandeyji
    ├── PandeyjiApplication.java
    ├── controller
    │   └── ExternalApiController.java
    ├── service
    │   └── ExternalApiService.java
    └── model (or dto)
        └── ExternalObject.java
```

---

## 📖 API Endpoints

### 🔹 Fetch External Objects

```
GET /api/external/objects
```

**Description:**
Calls the third-party API and returns the response via the Spring Boot application.

---

## 📘 Swagger Documentation

Once the application is running, access Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```

Swagger provides:

* Interactive API documentation
* Request/response visualization
* Easy API testing via browser

---

## ▶️ How to Run the Project

1. **Clone the repository**

```bash
git clone  https://github.com/ashishdeopandey/apicalling-in-java-springbootapplication.git
```

2. **Navigate to the project directory**

```bash
cd apicalling
```

3. **Build and run the application**

```bash
mvn spring-boot:run
```

4. **Open Swagger UI**

```
http://localhost:8080/swagger-ui.html
```

---

## ✅ Sample Use Case

* Acts as a middleware service between frontend and third-party APIs
* Centralizes API consumption logic
* Adds documentation, validation, and security layers

---

##🔒 Future Enhancements

* Add Spring Security (JWT / OAuth2)
* Error handling with `@ControllerAdvice`
* Caching external API responses
* WebClient (non-blocking calls)
* Unit & integration tests

---

##👨‍💻 Author

**Ashish Deo Pandey**
Java Developer (3+ Years Experience)

---

📄 License

This project is for learning and demonstration purposes.
