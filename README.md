# Spring Boot Demo

Small Spring Boot demo application with:

- a web entry point at `/`
- a static `Hello World` page
- a simple `OrderService` wired to a `PaymentService` implementation

## Requirements

- Java 25+
- Maven Wrapper included in the repo

## Run

```bash
./mvnw spring-boot:run
```

The application is configured to run on `http://localhost:8081`.

## Test

```bash
./mvnw test
```

## Current Behavior

- `GET /` returns `index.html` from `src/main/resources/static`
- the app name is read from `spring.application.name`
- on startup, `DemoApplication` resolves `OrderService` from the Spring context
- `OrderService.placeOrder()` calls `PaymentService.processPayment(10)`
- `PaypalPaymentService` is the active Spring bean because it is annotated with `@Service`

## Configuration

Current configuration is in `src/main/resources/application.yaml`:

- `spring.application.name: demo`
- `server.port: 8081`
- `app.page-size: 10`

## Project Structure

```text
src/main/java/com/learnspringboot/demo/
  DemoApplication.java
  HomeController.java
  OrderService.java
  PaymentService.java
  PaypalPaymentService.java
  StripePaymentService.java

src/main/resources/
  application.yaml
  static/index.html

src/test/java/com/learnspringboot/demo/
  DemoApplicationTests.java
```
