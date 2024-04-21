# Spring beans

We often need to create different objects in an application to use their functionalities. Some of 
them need other objects as their dependencies, which in turn require other objects. Spring offers
a great way to simplify this huge and complicated chain of creating objects. It can create all the
necessary objects during the application startup and put them in a container. Then, each class can
retrieve the objects it needs from this container. No more creation and initialization operations
are required!

These container-managed objects are known as *beans*, and they organize the backbone of your 
application. They look exactly like standard Java or Kotlin objects but can be created during the
application startup, registered, and then injected into different parts of an application by the
container.

In this topic, we will examine how the **Spring IoC container** helps us initialize and use beans.
We will start with the simplest possible example to grasp the basic idea and gradually make it
more complicated. Understanding how **DI (Dependency Injection)** works is crucial for all upcoming
topics. If you are already familiar with Spring or Spring Boot, the information in this topic may
seem quite basic, but we hope you'll learn something new anyway!

## Initial preparations

Before using beans, make sure you have the basic Spring Boot application:
- Java
- Kotlin

If you don't have it, you can generate it in your IDE or using the **Spring Initializr**. Afterwards,
follow the explanation here.

To start using beans, we will modify the above code and the **dependency injection** mechanism that
is the core part of the entire Spring Boot framework.

## Declaring beans

Beans are usually declared in classes with the @Configuration annotation, but it is also possible
to declare them in the class containing the @SpringBootApplication annotation. In this lesson,
we'll learn how to do it both ways.

To declare a bean, you need a method with the @Bean annotation. The result of executing this method
will be a bean that is managed by the IoC container.

Here is an example of a simple bean declared in a configuration class:
- Java
- Kotlin

The effect of this code is as follows. When you start the application, a manageable string bean 
named address will contain the value "Green Street, 102". Spring automatically invokes the method
with the @Bean annotation during startup to initialize all declared beans.

> By default, beans are **singletons**. This means that there is only one object for the whole
> application. But this default behavior can be changed. You will learn more about it in the
> following topics.

By default, the name of a bean is the same as the name of the method that produces it. However,
the @Bean annotation allows you to rename the bean to not depend on the method name. All you need
to do is specify the new name in the annotation, for example, @Bean("greenStreet"). In this case,
the name of the bean is greenStreet.

## Autowiring beans

Now that you have declared a bean, you can use it to create other beans that depend on it.

The Spring IoC container provides the **dependency injection (DI)** mechanism that allows us to do
that. A bean with a suitable type can be automatically injected into a method annotated with @Bean.
There is also the @Autowired annotation that marks a constructor, a field, or a method to be
injected by Spring's DI.

In the following example, let's introduce an additional class representing customers.
- Java
- Kotlin

This class includes the *address* field, which we will get from our previous bean to create a new
Customer object.

> Since this is the first topic about beans, for simplicity, all the following methods will be
> declared in the class annotated with @SpringBootApplication. However, in real-world applications,
> you often see bean-annotated methods declared in @Configuration classes.

Here is a method that returns an object of the Customer class as a bean. The @Autowired annotation 
marks the method parameter to be automatically injected.
- Java
- Kotlin

Spring DI injects the address bean into this method and this bean can be used to construct a new
object of the Customer class. The injection works because the type of bean we need is the same as
the type of bean produced earlier, and Spring's container can inject that bean. Even if the
argument had another name (e.g., addr), this code would work as expected.

> The @Autowired annotation is not always required to inject a bean. Spring will inject an
> appropriate bean anyway if a method has the @Bean annotation (or specific other annotations).
> We are always going to explicitly use the @Autowired annotation in our examples to make the
> explanation easier for beginners. When you get more experience with Spring, you can decide
> whether to avoid this annotation.

You may wonder how to ensure both methods are invoked and the beans are successfully created. There
is no need to introduce new concepts ? we can just create a third temporary bean depending on
Customer and print the autowired bean. Add the following code to the same DemoApplication class
where you put the last bean.
- Java
- Kotlin

Now if you run the application, you will see the information about the customer in the log.
```
Customer{name='Clara Foster', address='Green Street, 102'}
```
Remember that Spring prints many log messages. The above message will be among them because beans
are initialized during the application startup. Thus, we can conclude that the Spring IoC container
correctly created and successfully injected all our beans.

> There are no restrictions on the number of bean injection points in the code.

## Distinguishing beans of the same type

As we mentioned before, the location of an injection point is determined by the type of bean. But
what if we have several beans of the same type and want to use a particular one? Fortunately, there
is the @Qualifier annotation that allows us to specify the name of the bean we need to use.
- Java
- Kotlin

In this example, we specify the name of the bean we need to use to build the customer. The last
bean, temporary, is created only to print the information during the application startup.

If we delete the @Qualifier from the customer method, the application wouldn't start, and we'd get
an error that several beans can be injected:
```
Parameter 0 of method customer in org.hyperskill.beans.DemoSpringApplication
required a single bean, but 2 were found:
    - address1: defined by method 'address1' in org.hyperskill.beans.DemoSpringApplication
    - address2: defined by method 'address2' in org.hyperskill.beans.DemoSpringApplication
```

So, if this error occurs, you need to determine which bean you want to use and apply the @Qualifier
annotation.

## Beans vs standard objects

Now you have a general idea of what Spring beans are and how to use them. But should you always use
beans in Spring and forget about standard objects? The answer is no. You can still use standard
objects by creating them manually following the object-oriented programming approach:
- Java
- Kotlin

In real applications, beans are usually used to form the backbone of your app and separate it by
layers and configuration files. Still, most domain objects (like students, accounts, courses, etc.)
are standard objects. In this topic, we deliberately used rather synthetic examples to show the
logic behind beans without additional complexity. In the following topics, you will encounter a
lot of examples where beans are much more convenient than standard objects.

## Conclusion

In this topic, you've learned about the ability of the Spring IoC container to create and inject
beans on startup. Usually, beans are declared in classes annotated with the @Configuration 
annotation, but they can also be declared in the class annotated with @SpringBootApplication.
To declare a bean, you should create a method with the @Bean annotation, and the result of this
method will be a managed bean. The @Autowired annotation is used to mark an expected bean injection,
and the @Qualifier annotation can help us specify the name of the bean to be injected in ambiguous
situations.
