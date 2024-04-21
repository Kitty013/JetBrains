# External resources

In Spring boot, both the application.properties and application.yaml files are built-in 
mechanisms for configuring applications. Additionally, we have the flexibility to define 
custom files, for example database.properties, to store specific configuration information.
These files serve as repositories for storing various settings and configurations that don't
need to be stored in a database.

For instance, we can store database credentials in these files. We can have different nodes
with identical configurations.

In this topic, you will learn how to load and use these files.

## @PropertySource
The @PropertySource annotation in Spring Boot is used to specify a properties file you want
Spring Boot to load. The annotation takes two parameters: the name of the properties file
and the location of the properties file. The location of the properties file is the path
to the file relative to the classpath.

For example, the following annotation specifies that a properties file named
application.properties is to be loaded from the classpath:
```
@PropertySource("classpath:application.properties")
```
Let's take a practical example by creating a Spring Boot project.

In the application.properties file let's add the following pair key values:
```
EGP=30
Euro=0.92
Yen=138
```
We wrote some currency keys and their values in dollars for demonstration purposes.

Now let's get a value from application.properties file and print it. Here's the code:
```
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("One dollar = " + environment.getProperty("yen") + " Yen");
        System.out.println("One dollar = " + environment.getProperty("EGP") + " EGP");
    }
}
```
CommanLineRunner interface is used to run the code block only once after the application is
initialized, and then it overrides the run method to print our values.

Environment is an interface representing the environment in which the current application
is running and we used the method getProperty() inherited from the interface PropertyResolver
by Environment. getProperty() returns the value by the key.

Run the code, and you will see the following output :
```
One dollar = 138 Yen
One dollar = 30 EGP
```
Ok, but where is @PropertySource ? Let's create another file in the resources package and call
it user.properties, and write the following:
```
name=Eyad
country=Egypt
job=student
```
Now let's try this:
```
    @Override
    public void run(String... args) {
        System.out.println(environment.getProperty("name"));
    }
```
Rerun the code. Why do we get null ? The application.properties (or application.yml) file is
considered the default configuration file in Spring Boot. When you place this file in the
classpath of your application, Spring Boot automatically loads the properties defined in it 
and makes them available through the Environment object.

In a Spring Boot project, there is no need to declare a @PropertySource annotation explicitly
for the application.properties file since Spring Boot handles it automatically. However, in a
"pure" Spring Framework project, you would need to use @PropertySource to specify the property 
file(s) that should be loaded.

To load our custom file user.properties, we need to use @PropertySource annotation. Here's how:
```
@SpringBootApplication
@PropertySource("classpath:user.properties")
public class DemoApplication implements CommandLineRunner {
@Autowired
private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(environment.getProperty("name"));
    }
}
```
It's pretty simple: we put the annotation with the file's name.

Wondering what classpath is? classpath refers to the list of directories and JAR files that
the Java Virtual Machine (JVM) searches for classes and resources. After rerunning the
application, you will see "Eyad" in the output.

What if there's no name? Remove the name from user.properties as following :
```
country=Egypt
job=student
```
Now if we rerun the app with the same code as before, we will get null in the output.

The getProperty() can take default value as a second argument like this:
```
    @Override
    public void run(String... args) {
        System.out.println(environment.getProperty("name","Anon"));
    }
```
Because we removed the name, we will get "Anon" in the output.

What if we have multiple files ? Let's create another file in the resources directory called
landmark.properties with the following values:
```
egypt=pyramids
usa=Statue of Liberty
france=Eiffel Tower
```
Now, let's edit the code:
```
@SpringBootApplication
@PropertySource("classpath:user.properties")
@PropertySource("classpath:landmark.properties")
public class DemoApplication implements CommandLineRunner {
@Autowired
private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("The most famous landmark in Egypt is " +
                environment.getProperty("egypt"));
    }
}
```
One way to load multiple files is by writing the annotation for each: the first one written, the
first one loaded.

The output will be the following:
```
The most famous landmark in Egypt is pyramids
```
Here's another way of writing multiple @PropertySource by using @PropertySources and putting
@PropertySource separated by a comma:
```
@SpringBootApplication
@RequestMapping
@PropertySources({
@PropertySource("classpath:user.properties"),
@PropertySource("classpath:landmark.properties")})
public class DemoApplication implements CommandLineRunner {
@Autowired
private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("The most famous landmark in Egypt is " +
                environment.getProperty("egypt"));
    }
}
```
We could define a collection as well. Update landmark.properties as follows:
```
egypt=pyramids, Karnak Temple, Valley of the Kings, Abu Simbel, Temple of Osiris, Egypt Museum, St. Catherine?s Monastery
usa=Statue of Liberty
france=Eiffel Tower
```
Now let's update the code and tweak it a bit:
```
@SpringBootApplication
@PropertySource("classpath:user.properties")
@PropertySource("classpath:landmark.properties")
public class DemoApplication implements CommandLineRunner {
@Autowired
private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {

        List<String> landmarks = List.of(environment.getProperty("egypt").split(","));
        Random random = new Random();

        System.out.println("One of the most famous landmark in Egypt is " +
                landmarks.get(random.nextInt(landmarks.size())));
    }
}
```
We get the value and a list by using split(), followed by a random value from this list.

## @Value
Instead of using environment.getProperty(), we could simply use the @Value annotation:
```
@SpringBootApplication
@PropertySource("classpath:user.properties")
@PropertySource("classpath:landmark.properties")
public class DemoApplication implements CommandLineRunner {
@Autowired
private Environment environment;

    @Value("france")
    private String landmark;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(landmark);
    }
}
```
The @Value annotation allows you to retrieve and assign property values from different sources,
such as property files, environment variables, or command-line arguments.

Now rerun the app. Here's the output:
```
france
```
Yes, you expect to see the "Eiffel Tower" value but instead, you see "name". Using the @Value
annotation like this will inject the text inside the parenthesis in the variable and not the key.

To fix that, modify it as the following:
```
    @Value("${france}")
    private String landmark;
```
Now rerun the app and see the expected value "Eiffel Tower".

You can also provide a default value in case the property is not defined or missing in the
property file. Here's an example:
```
    @Value("${france:Louvre Museum}")
    private String landmark;
```
After modifying the code above, remove the france key and its value from landmark.properties 
and rerun the app:
```
Louvre Museum
```

## Conclusion
Today you learned how to load external files using @PropertySource and @Value.The @PropertySource
annotation is used to load specific property files, and the Environment interface provides methods
to access the property values. Additionally, the @Value annotation can be used to assign property
values to variables directly.

We also learned how to load multiple files and put default values in case there is no key-pair value.
