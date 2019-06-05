### Qualifiers

1. What is Qualifiers?
> - User-defined annotations 
> - Helps container to choose the right one from multiple implementations of an interface
> - Every CDI bean has a @Default if you don't specify one

2. How to use?
```java

// Define your qualifier
@Qualifier
@Retention(RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
public @interface ISBN13 {}

// Annotate it to a bean and injection point
@ISBN13
public class ISBN13Generator implements ISBNGenerator {
  //...
}

public class BookService {
  @Inject
  @ISBN13
  private ISBNGenerator isbnGenerator;
  
  //...
}

```
3. Qualifiers with Members

Creating qualifiers for every implementation of a same interface may end up with a large number of
annotations. One way to avoid this is to use members.

3.1 How to Use?

```java

// Create an Qualifier with members
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
public @interface ISBN {
  enum Type {
    TEN,
    THIRTEEN
  }
  
  Type type();
}

// Annotate it to a bean and injection point
@ISBN(type = ISBN.Type.THIRTEEN)
public class ISBN13Generator implements ISBNGenerator {
  //...
}

public class BookService {
  @Inject
  @ISBN(type=ISBN.Type.THIRTEEN)
  private ISBNGenerator isbnGenerator;
  
  //...
}
```

4. Multiple Qualifiers

You can also combine different qualifiers, only a bean matches all the qualifiers would be eligible
for injection.

4.1 How to Use?

```java
// Create another qualifier

```
