# @Bean vs @Component

You've learned by now that Spring provides different ways to create spring container-managed beans.
One is by using the @Bean annotation, and another is by applying the @Component annotation. Both
provide special objects that can be initialized at startup and automatically wired across different 
parts of an application. However, it might sometimes be unclear how to use them together and which 
to choose when.

In this topic, you will learn about the key differences between the @Bean and @Component 
annotations and how to use them together.

## Using @Bean and @Component in code together

In practice, a Spring Bean created manually by annotating a method with @Bean can be injected 
into components using the @Autowired annotation, which is quite a canonical way of using them. 
In this case, @Bean creates different application- or component-wide configs, which are autowired 
when needed.

To see how this works, let's look at an application that generates random passwords. You've 
already seen it in previous topics. We are going to discuss three key parts of this application:
- A configuration bean that is used to define a set of characters for creating passwords.
- A component that requires this configuration bean and performs some calculations.
- A component that is used to interact with the IO system.

Here is PasswordConfig that produces the bean containing the information about the alphabet we'd
like to use:
- Java
- Kotlin

Below is a new version of the PasswordGenerator component that applies this config to the password
generation process.
- Java
- Kotlin

Last but not least, here is the component that is responsible for interacting with IO:
- Java
- Kotlin

If you run this application, you will most likely get passwords containing letters, digits and
special characters. For example:
```
A short password: e&7sd
A long password: up_&g4xtj7
```

It is possible to declare several alphabet config beans and, depending on our intentions, inject 
them using the @Qualifierannotation. It will allow you to make this application much more
customizable for different use cases.

> Usually, components depend on other components or objects produced by bean @Bean-annotated
> methods. However, technically, you can also autowire a component into the parameters of a method.

## @Component vs @Bean

So far, we have used the @Bean and @Componentgeneric annotation to create beans that can be
injected into each other. Now let's look at the differences between these annotations in Spring
Framework.
- The @Bean annotation is a method-level annotation, whereas @Component is a class-level annotation.
- The @Component annotation doesn't need to be used with the @Configuration annotation, whereas the
@Beangeneric annotation has to be used within a class annotated with @Configuration.
- If you want to create a single bean for a class from an external library, you cannot just add the
@Componentannotation because you cannot edit the class. However, you can declare a method annotated
with @Bean and return an object of this class from this method.
- There are several specializations of the @Component annotation, whereas @Bean doesn't have any
specialized stereotype annotations.

In most cases, you can use both approaches, but Spring developers typically prefer Spring
@Component annotation whenever possible. The @Bean annotation is mainly used for producing beans 
of unmodifiable classes or creating configs.

## Specializations of components in Spring

As mentioned above, there are several specializations of components depending on their role in
Spring applications:
- @Component indicates a generic Spring component.
- @Service indicates a business logic component but doesn't provide any additional functions.
- @Controller / @RestController indicates a component that can work in REST web services.
- @Repository indicates a component that interacts with an external data storage (e.g., a database).

> In the following topics, you will learn more about different types of Spring components and how
> they are typically used in application context. For now, remember the following: if your
> component doesn't need to communicate with a database or return an HTTP result, you can use the
> @Service annotation whenever using the @Component annotation is possible. As long as you write
> simple Spring boot application, there should be no difference between these annotations.

## Conclusion

Now you've learned about the differences between the @Bean and @Component types annotations and
when to use them when developing Spring applications. We discussed an example with two components 
and one @Bean-annotated method and saw how these concepts make your application more customizable. 
We also introduced several component specialized annotations. With getting answers to these 
questions you will explore further and gradually start using them in future topics.
