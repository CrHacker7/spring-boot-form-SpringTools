# Documentation
- If you are using Spring Boot 2.3 or later, you need to add the `spring-boot-starter-validation` dependency.
- To check if `spring-boot-starter-web` already includes it, use Ctrl + Click on the dependency and search for `validation`. ==If it is present, you do not need to add anything else.==

> [!note] You need to add the dependency anyway to use @Valid annotation.

- **`BindingResult`**: It must be declared immediately after the object being validated.

#### Validations
- To preserve form data after a validation error, use `th:value="${user.username}"`. Ensure the property name matches the Java class field exactly, maintaining lowercase formatting, and the user class in lowercase.

> [!warning] If you make changes in properties, it is required to restart the app.
