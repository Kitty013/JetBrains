# Reading user's input with Scanner
The **standard input** is a data *stream* going into a program and supported by the operating system.
By default, the standard input acquires data from keyboard input, but it can be redirected from a file.

Not every program needs to use the standard input, but you'll use it frequently here to help master
your programming skills! The typical approach to solving programming problems is:
- Read data from the standard input (System.in);
- Process data to obtain a *result*;
- Output the result to the *standard output* (System.out).

This type of code challenge can be eaily tested with different input data formats, so we'll use them
often.

## Reading data with a scanner
The simplest method to obtain data from the standard input is using the standard class Scanner. It
allows a program to read values of various *types*, like strings or numbers, from the standard input.
In this topic, we consider reading data from the input.

To use this class, you should add the following *import* statement at the top of your file with the
source code.
```
import java.util.Scanner;
```
After the import, add a class with this construction:
```
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}
```
In the main *method*, we make an *object* of Scanner *class*, which allows us to use its methods.
System.in signals that the program will read the text that you entered in the standard input. You'll
need this line exactly as it is for now.

The Scanner class offers two ways to read strings. If your input is an *integer number* or a single 
word, you can use the next() method. For example, the following code snippet reads the user's name
and prints a hello message:
```
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
```
For example, if the user enters their name as James, the program's output will be:
```
Hello, James!
```
If you enter an integer number like 123 as the user's input, the program will output this number.
Remember that the next() method will store 123 or some other integer number as a *string*, even if
we know that this string represents a number.
```
Hello, 123!
```
Now, what if a user inputs a compound name like Erich Maria? The program will only output the first
word:
```
Hello, Erich!
```
In this case, you'll need to invoke the next() method again:
```
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next(); // "Erich"
        String lastName = scanner.next(); // "Maria"
        System.out.println("Hello, " + firstName + " " + lastName  + "!");
    }
}
```
However, it would be more efficient to use another method, the nextLine() method, which reads and 
outputs the entire line:
```
Hello, Erich Maria!
```
You may notice that the next() method only reads a single word and excludes any *whitespace*. On
the other hand, the nextLine() method includes all space *characters* it encounters.

Note that in Java, **whitespace** includes not just the space character, but also everything that 
appears empty when printed: a *tab*, the *newline* character, and other non-printing characters.

In this article, we'll discuss space and newline characters: essentially, we create a corresponding
character when we press Enter and start a new line. The term "whitespace" refers to either of these.
A more correct term for what we've been calling a "word" is a **token**, which can be described as a
piece of text surrounded by whitespace. So we can say that the next() method locates and returns the
next token, while the nextLine() reads all data till the end of the current line.

## Reading a multiline input
Reading *multiline input* might be a bit complicated; you need to consider the cursor's position and
the behavior of the reading methods.

Let's explore this with an example:
```
|This is a simple

multiline input,

that is being read

```
| indicates the cursor's position before reading the input.

If we call the next() method, the program will read the input up to the whitespace:
```
This| is a simple

multiline input,

that is being read
```
After invoking the nextLine() method, the program reads the remaining line starting from the whitespace.
If there is such a line in your input, the nextLine() places the cursor at the start of the new line:
```
This is a simple

|multiline input,

that is being read
```
Next, let's invoke the next() method two times. The first input is indicated by the position of the
cursor which is right after the word and before the whitespace:
```
This is a simple

multiline| input,

that is being read
```
We're now invoking the next() method once again. The program outputs the second word in the line without
any whitespace. The number of space characters doesn't matter, as the next() method will skip the
whitespace until it finds the next token.

As you'll see, the cursor's position remains at the current line, just before the new line and after
the comma:
```
This is a simple

multiline input,|

that is being read
```
Here's a tricky thing about the nextLine() method, which also shows a major difference between next()
and nextLine() methods. As you know already, the program will read input from the cursor's position to
the new line (again, if such a line exists in your input). In this example, the cursor is placed before
the new line. This means the nextLine() method will return an empty line ("") and place the cursor at 
the start of a new line.
```
This is a simple

multiline input,

|that is being read
```
To sum it all up, let's look at the entire code and consider what variables we've just read:
```
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next(); // "This"
        String line1 = scanner.nextLine(); // " is a simple" 
        String word2 = scanner.next(); // "multiline"
        String word3 = scanner.next(); // "input,"
        String line2 = scanner.nextLine(); // "" 
    }
}
```
This example may seem a bit artificial, but it should assist you in understanding the difference between
these two methods?remember that usually, variables have more expressive names.

## Conclusion
You can read data from the standard input with a specialized Scanner class. The next() and nextLine()
methods help you read strings. Both are used for gathering input, but they act differently. The next()
method reads input until the next whitespace, while the nextLine() method reads input to the end of the
line.

We suggest using the Scanner class when solving programming challenges?it is one of the simplest ways 
to obtain values from the standard input.
