# Simple Java Program
A java program is executed from the main method in the class.
```
    public static void Welcome() {
        System.out.println("Welcome to Java");
    }
```
Class names start with an uppercase letter. 

The main method is the entry point where the program begins execution. A method is a
construct that contains statements.

String is a programming term meaning a sequence of characters. A string must be enclosed 
in double quotation marks. Every statement in Java ends with a semicolon (;), known as
the statement terminator.

Reserved words: class, static, void, public

```
    public static void WelcomeWithThreeMessages() {
        System.out.println("Programming is fun!");
        System.out.println("Fundamentals First");
        System.out.println("Problem Driven");
    }

    public static void ComputeExpression() {
        System.out.println("(10.5 + 2 * 3) / (45 - 3.5) = ");
        System.out.println((10.5 + 2 * 3) / (45 - 3.5));
    }
```

## creating, compiling and executing a java program
You save a Java Program in a .java file and compile it into a .class file.
The .class file is executed by the Java Virtual Machine (JVM).
See [compile_and_run_program_from_cmd_line.md](..%2F..%2F..%2F..%2F..%2F..%2F..%2F..%2FJetbrains%2Fsrc%2Fcom%2Fsfpd%2Fcompile_and_run_program_from_cmd_line.md)