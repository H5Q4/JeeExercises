### Producers

By default, we can't inject primitives and classes like `java.util.Date`,
`java.lang.String`. That's because all these classes are packaged in the _rt.jar_
file and this archive does not contain a __beans.xml__. Without __beans.xml__,
CDI will not trigger bean discovery and POJOs will not be able to be treated as beans and 
can not be injectable, so do third party libs. The only way is to use __Producer field__ or
__Producer methods__.

#### How to Use

Annotate the fields or methods with __@Produces__ and now you can inject them.

```java
public class ISBNProducer {
  @Produces
  @ThirteenDigits
  private int prefix = 978;

  @Produces
  @ThirteenDigits
  private String number = "3738695027";

  @Produces
  @Separator
  public String separator() {
    return "-";
  }
}

public class ISBN13Generator implements ISBNGenerator {

  @Inject @ThirteenDigits
  private int prefix;

  @Inject @ThirteenDigits
  private String number;

  @Inject @Separator
  private String separator;

  public String generate() {
    return String.format("%d%s%s", prefix, separator, number);
  }
}
```
#### InjectionPoint API

When we want to know something about the injection point into which they are injected, the 
__InjectionPoint__ api can help us.

#### How to Use

We need to create a producer method that takes an InjectionPoint class as its parameter.

```java

``` 








