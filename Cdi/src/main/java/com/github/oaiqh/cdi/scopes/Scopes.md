### Scopes

CDI is about Dependency Injection but also Context. With CDI, a bean is bound to a context and it
remains in that context until the bean is destroyed by the container.

There are six scopes in CDI.

> - Request(@RequestScoped) -- HTTP request
> - Session(@SessionScoped) -- HTTP session
> - Application(@ApplicationScoped) -- A web application
> - Conversation(@ConversationScoped) -- JSF lifecycle
> - Dependent(@Dependent) -- Client's scope, default
> - Singleton(@Singleton) -- Application

### Bean Name

By default, CDI Beans are not assigned any name. To assign a bean a name,
it must be annotated with the `@javax.inject.Named` built-in qualifier. After that, we can access
the bean through its name(which by default is the class name in lower camel case) in JSF.