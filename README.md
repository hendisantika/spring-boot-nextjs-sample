# spring-boot-nextjs-sample

[![Java CI with Maven](https://github.com/hendisantika/spring-boot-nextjs-sample/actions/workflows/maven.yml/badge.svg)](https://github.com/hendisantika/spring-boot-nextjs-sample/actions/workflows/maven.yml)
![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1-6DB33F?logo=springboot)

This is a sample project to demonstrate how to integrate Spring Boot (backend REST API) with Next.js (frontend).

Frontend: Next.js --> https://github.com/hendisantika/used-cars-sales

## Tech Stack

- Java 25 (Temurin)
- Spring Boot 4.1 (Web, Data JPA, Validation, Docker Compose support)
- MySQL 9 (via Docker Compose)
- Springdoc OpenAPI (Swagger UI)
- Lombok
- Testcontainers 2 + JUnit 5 for tests
- Maven (wrapper included)

## Prerequisites

- JDK 25
- Docker & Docker Compose

## Getting Started

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-nextjs-sample.git`
2. Go to the folder: `cd spring-boot-nextjs-sample`
3. Run the application: `./mvnw clean spring-boot:run`
   - Spring Boot Docker Compose support starts the MySQL container from `compose.yaml` automatically
     (exposed on port `3307`, database `carsDB`).
4. Open your favorite browser: http://localhost:8080

## Build & Test

```shell
./mvnw clean package
```

Integration tests use Testcontainers (`jdbc:tc:mysql`), so Docker must be running.

## API Documentation

- Swagger UI: http://localhost:8080/swagger-ui
- OpenAPI spec: http://localhost:8080/v3/api-docs

List of Cars:

```shell
http://localhost:8080/api/cars?maker=Audi&model=A5&year=&odometer=&vehicleCondition=&states=&customDate=&saleCategory=&badges=&bodyType=&bodyTypeConfig=&fuelType=&transmission=&engine=&cylinders=&division=&drive=&seat=&doors=&description=&sort=Sort%20by%20Sale%20Date&asc=DESC
```

## CI/CD & Dependency Updates

- **GitHub Actions** (`.github/workflows/maven.yml`): builds and tests the project on JDK 25 for every push and pull request to `main`.
- **Dependabot** (`.github/dependabot.yml`): keeps Maven dependencies, GitHub Actions and Docker Compose images up to date,
  with grouped pull requests (Spring Boot, Testcontainers, Maven plugins, minor/patch).
