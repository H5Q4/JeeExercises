### Context and Dependency Injection

1. What is dependency?
> - Requirement for other classes
> - Single-purpose classes
> - Class X depends on/uses class Y
> - Allows reuse of functionality

2. What is coupling?
> - Loosely or tightly coupled
> - Tightly coupled classes reduce reuse
> - Strive for loose coupling
> - Uses interfaces for reference types

3. What is Dependency Injection?
> - No creation of dependencies by class itself, pass it(Setters, Constructors)
> - Let other classes or container create dependencies

4. What is a CDI bean?
> A java class with a default constructor or has a constructor annotated with @Inject.

5. CDI Configuration and Use
> - Switch on bean discovery
> - The discovery of beans during start-up
> - Deployment cancelled if errors occurs
> - You need a **resources/META-INF/beans.xml** file
> - Set **bean-discovery-mode** to **all**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans
    xmlns="http://xmlns.jcp.org/xml/ns/javaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
                      http://xmlns.jcp.org/xml/ns/javaee/beans_2_0.xsd"
    bean-discovery-mode="all">
</beans>
```
> - CDI 2.0 uses in Java

```java
// Use @Inject to inject dependencies, you can add it to fields, setters, constructors as you like.
class BookService {
  @Inject
  ISBNGenerator isbnGenerator;
  
  //...
};

// Init cdi container
SeContainer container = SeContainerInializer.newInstance().initialize();

// Obtain bean by class
BookService bookService = container.select(BookServcie.class).get()
```