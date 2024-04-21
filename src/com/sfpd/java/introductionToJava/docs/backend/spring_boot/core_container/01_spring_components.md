# Spring components

As you already know, Spring IoC provides a great way to manage beans that are declared with the 
help of the *@Bean* annotation. They can be initialized at startup and automatically wired to other
beans when needed. However, this is not the only way to declare container-managed objects in a
Spring application, and you will often use a different approach based on the **component** concept.

In this topic, you will learn what a component is, when to use it and how components differ from
the beans discussed previously.

## Components

In Spring, a **component** is a special kind of class that can be autodetected by Spring IoC and
used for dependency injection. Components are mostly used to:
- Ensure a high level of decoupling between different parts of an application.
- Assign responsibilities to classes in a more efficient way.

To define a component, there is a special class-level annotation *@Component* from the
*org.springframework.stereotype* package. Spring IoC automatically identifies all classes annotated
with it and creates corresponding managed beans. By default, there is only one bean for every
component.

Usually, a component has one or more non-static methods that can be invoked from outside the
component. However, in some situations, there are components without public methods.

Imagine there is a component called PasswordGenerator that can produce random passwords of a
specified length.
- Java
- Kotlin

An object of this class needs no special initialization and can be created via the default
constructor. When Spring Boot starts an application, it looks for all the *@Component*-annotated
classes and creates objects of these classes, which will then be waiting in the container.

> There's no need to worry if you haven't gotten a chance to use the *Random* or *StringBuilder* 
> classes yet. All you need to know is that the first class can help us get random numbers, and
> the second creates a string by appending new elements.

## Interacting with the command line

Before moving on, let's look at one facility of the Spring Framework and learn a bit more about 
components. To simplify the following explanation, we will declare a special component allowing 
us to interact with the standard I/O.

To achieve this, the component should implement the CommandLineRunner interface and override the 
run method. It is just an equivalent of the main method in console applications. You can write 
any piece of code there, and it will be executed once the Spring application starts.
- Java
- Kotlin

The Spring framework will automatically invoke the run method. If you start an application that 
contains this component, you will see the result in the log:
```
Hello, Spring!
```

> You don't need to use *CommandLineRunner* in every Spring application, but this component can
> be used as a temporary solution when debugging or studying new features of the framework.

## Autowiring components

All beans created automatically for components can be injected into each other using the *@Autowired*
annotation. The dependency injection mechanism works exactly as you've seen with *@Bean*-annotated
methods.

Since they are both Spring components, our previously declared classes *PasswordGenerator* and *Runner*
can use the dependency injection mechanism. As an example, we will provide a modified version of
the Runner component that contains the autowired bean of the PasswordGenerator component.
- Java
- Kotlin

Here we use the *@Autowired* annotation to tell Spring Boot that we need a *PasswordGenerator*
object from the container. If you start this application, you will see output similar to the
following:
```
A short password: bqtik
A long password: tjgdpswzbd
```

That's it! We ensured an object was put in the container with a *@Component* annotation and then
took it to another object with @Autowired above its constructor.

> It is important to know that a bean created with *@Component* is a singleton by default. If you
> declare another component and inject *PasswordGenerator* there, it will be the same object, not
> a copy. This default behavior can be modified. You will learn how to do so in the following
> lessons.

> Spring has an important restriction: you cannot declare circular dependencies between beans 
> (including components). If you do so nonetheless, your application will not start, and you
> will get an error: The dependencies of some of the beans in the application context form a
> cycle.

## Where to put the @Autowired annotation

You can put the @Autowired annotation in several places worth knowing.
1. As you've seen before, it is possible to put it on top of a constructor:
   - Java
   - Kotlin
2. You can place the @Autowired annotation before a constructor argument:
   - Java
   - Kotlin
3. You can place the @Autowired annotation directly on a field to be injected:
   - Java
   - Kotlin
4. Alternatively, you can omit the annotation over the constructor. This is possible because Spring IoC knows all the components and can inject them by their type when needed:
   - Java
   - Kotlin

So, if you don't want to add *PasswordGenerator* to another component's constructor, you can place 
*@Autowired* on the field instead. However, it is recommended to use constructor injection over
field injection. Constructor injection identifies the dependencies, helps with thread safety, and
simplifies testing the code.

> When you use constructor injection, the @Autowired annotation can be omitted, but it is required
> when you use field injection. Otherwise, your fields will be null. We will continue explicitly
> using the annotation to make the learning process easier.

## Conclusion

Components are special classes that Spring IoC creates during startup and provides to other beans.
The @Component annotation placed above a class means there will be a bean of that class. Like
other beans, a component can be injected using the @Autowired annotation. Moreover, constructors
can be used with or without this annotation.

As a bonus, we developed a small but useful Spring Boot application that generates random passwords
using only two components. One of those components implemented the CommandLineRunner interface to 
be able to interact with the standard I/O. We hope this component-based approach will encourage
you to build flexible and well-decomposed applications in the future!
