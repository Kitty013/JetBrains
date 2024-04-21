# Dependency injection in Spring

You've already learned that Spring context is a place in the memory where we can put our 
beans so Spring can manage them. You've also learned how DI makes the code cleaner and
achieves more decoupling, which simplifies testing. Today we will discuss three different
ways to inject dependencies in Spring.

## Field injection

Let's create the following class:
- Java
- Kotlin

We told Spring to create the Product bean and add it to the context by using @Component.

Now let's create another class:
- Java
- Kotlin

Using @Autowired we tell Spring to get a value from its context, which we added before, and
then inject it into the field. However, field injection is not recommended because it doesn't
allow us to benefit from DI: the code becomes harder to test and maintain, and we can't make
it immutable.

The following code will throw a compilation error:
```
@Component
public class Customer {
    @Autowired
    private final Product product;

}
```

Why? final in Java means that a class field must be initialized at the time of declaration or
in the constructor. Also, in the previous case using final with @Autowired doesn't guarantee 
that the field will be properly initialized because in some cases Spring may not find the 
suitable bean. The main practical benefit of having a dependency final is that you won't forget
to add the annotation, and it won't be null in runtime.

## Setter-based dependency injection

We can rewrite the code from the previous section to use **setter-based** dependency injection as
follows:
- Java
- Kotlin

Spring invokes the setter during the object initialization.

Now we have more flexibility, but there are still some disadvantages, such as less readable code,
which is harder to debug and maintain. Also, we can't make it final.

## Constructor-based dependency injection

The best and recommended way is to use **constructor-based** injection. Let's rewrite the
previous code:
- Java
- Kotlin

We have removed @Autowired, then added a constructor that accepts product, and then assigned it.
This way, we have the following advantages:
- Testability: to keep it simpler now, just keep in mind that using constructor-based injection 
will make testing easier than field and setter injection.
- Immutability: constructor-based injection promotes immutability, which is a good software 
design practice. Once a dependency is injected through the constructor and assigned to a final
field, it can't be changed, resulting in a more predictable and stable behavior of the class.
This can help prevent bugs caused by unintended modifications of dependencies during the lifecycle 
of the object.
- Safer code: constructor-based injection helps create safer code by ensuring that all required
dependencies are provided at the time of object creation. This helps avoid null pointer exceptions
or missing dependencies at runtime, as the dependencies are guaranteed to be available when the
object is instantiated. This makes the code more robust and less error-prone.

It's worth mentioning that it's not necessary to remove it, but Spring is smart enough to figure
it out if the class has a single constructor. If a class has multiple constructors, Spring may
not be able to determine which constructor to use for dependency injection. In this case, the
@Autowired annotation can specify which constructor to use.

So, which type of DI to use? According to official *docs*:
- Constructor injection is the most recommended and preferable option for mandatory dependencies.
- Setter injection should only be used for optional dependencies.
- Field injection is to be avoided.

## Type matching

Let's start by creating beans and adding them to the context.

First, we will create a normal class to be our bean:
- Java
- Kotlin

Now let's create the config class, which of course will be the container for our beans:
- Java
- Kotlin

We have created two beans with the same type Car and annotated it with @Bean . Now let's print 
them out and see what we will get:
- Java
- Kotlin

Now run the application. BOOM! We get NoUniqueBeanDefinitionException. Why? Simply put, this
happened as we are trying to get the bean by type and there are two beans of the same type in
the context.

The first solution to this problem is to use @Primary which tells Spring that if there are
two or more beans of the same type, you need to annotate the bean with this annotation. Now
let's modify the Config class:
- Java
- Kotlin

After running the code again, it should work and you should find "Tesla" in the output.

Another solution to this problem is matching the bean by the name, so that after removing 
@Primary from the bean we can do the following:
- Java
- Kotlin

We added another argument to the getBean() method, which is responsible for matching the bean
by the provided name. By default, the name is the method name. Now what if we want to change
the name? We can just pass the name inside the @Bean annotation as the following:
- Java
- Kotlin

That's It. We passed the name in the parenthesis. Now let's retrieve it as we did in the
previous example:
- Java
- Kotlin

The output will be "Tesla".

## @Qualifier

Let's do something different and try to inject one of these beans like this:
- Java
- Kotlin

We created a new class Engine. Let's add it to the context and then inject it into Car.
- Java
- Kotlin

Now let's inject it into the car:
- Java
- Kotlin

Still not enough. The compilation error suggests using @Qualifier as there is more than one
of the Engine type.

Now let's update the code:
- Java
- Kotlin

Good enough! So what does @Qualifier do here? It removes the ambiguity for Spring to choose
which bean to inject.

Now let's run this code:
- Java
- Kotlin

The output will be "Tesla" again.

## loose coupling

Let's create the following:
- Java
- Kotlin
- Java
- Kotlin
- Java
- Kotlin
- Java
- Kotlin
- Java
- Kotlin

We created the interface Engine and two concrete classes that implement it. Then we injected
Engine into the Vehicle using constructor injection. Finally, we created the beans in the
class Config and, to remove ambiguity, we use @Qualifier, which tells Spring which one to inject.

Now let's run it and see the results:
- Java
- Kotlin

The output:
```
// Goes b-z-z-z-z... and produces sparks
```

## Conclusion

In this topic, you learned how to implement Spring in an application in different ways, like
setter-based injection, constructor injection and field injection. The best recommended way is
to use constructor-based injection for clarity, safety, and simplicity reasons. You also learned
about type matching and how to remove ambiguity in Spring.
