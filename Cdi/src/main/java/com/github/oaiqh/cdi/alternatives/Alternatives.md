### Alternatives

Sometimes we may want inject an implementation depending on different scenario. 
This comes to Alternatives. Alternatives are beans annotated with __@Alternative__.

#### How to Use

Annotate __@Alternative__ to a alternative bean

```java
@Alternative
public class MockISBNGenerator implements ISBNGenerator {
  public String generate() {
    return "Mock: 9861230988345";
  }
}
```

Alternatives by default are disabled. We need enable them in `beans.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans
    xmlns="http://xmlns.jcp.org/xml/ns/javaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
                      http://xmlns.jcp.org/xml/ns/javaee/beans_2_0.xsd"
    bean-discovery-mode="all">
  <alternatives>
    <class>com.github.oaiqh.cdi.alternatives.MockISBNGenerator</class>
  </alternatives>
</beans>
```