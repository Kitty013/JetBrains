# Formated output
## Introduction
You are already familiar with the <mark>System.out.print()</mark> and <mark>System.out.println()</mark>
methods to print output to the console. But when you need complex **formatting** of output, these
two methods are not really helpful. There are two methods that you can use in such cases, namely,
<mark>System.out.printf()</mark> and <mark>String.format()</mark>. Let's discuss them in detail and
focus on string and number formatting.

## Introducing the printf() method
The <mark>printf()</mark> method usually has two parts. First, you give the string you want to
format as the first attribute. This string itself includes rules to format it via format specifiers.
Some examples of **format specifiers** are <mark>%d</mark>, <mark>%s</mark>, etc. In the second part,
you give the argument list that Java can use to format the string according to the format specifiers.

See the following example to understand the different parts of the <mark>printf()</mark> function.
```
System.out.printf("My Name is %s. I was born in %d", "Mike", 1998);
```
- The first part is <mark>"My Name is %s. I was born in %d"</mark>, where <mark>%s</mark> and
  <mark>%d</mark> are the format specifiers.
- The second part is the argument list: <mark>"Mike"</mark>, <mark>1998</mark>.

## Different use cases of printf()
It's time to know the different use cases of format-specifiers. It's quite easy to understand it
with code samples. Let's try now.

You can display an integer with the %d format specifier.
```
public static void main(String[] args){
System.out.printf("Display a Number %d", 15000);
}
```
Java will replace <mark>%d</mark> with 15000. The output of the above code is <mark>Display a
Number 15000</mark>.

If you want several integers to be displayed in the output, use several <mark>%d</mark> specifiers.
```
public static void main(String[] args){
    System.out.printf("The sum of %d and %d is %d", 15, 40, 55);
}
```
Java will put each argument in place of <mark>%d</mark>, starting from the left. The output of the
above code is <mark>The sum of 15 and 40 is 55</mark>.

If you want to display a floating-point value, use the <mark>%f</mark> specifier.
```
public static void main(String[] args){
    System.out.printf("Display a Number %f", 15.23);
}
```
Similar to the above cases, Java will put 15.23 in place of <mark>%f</mark>. The above code will 
produce the following output: <mark>Display a Number 15.230000.</mark> Although it's technically 
correct, it looks ugly. You don't want so many trailing zeros. You can set the number's precision
with the <mark>printf()</mark> method.
```
public static void main(String[] args){
    System.out.printf("Display a Number %.2f", 15.23);
}
```
<mark>.2f</mark> decides that the number of digits that should appear after the decimal place is
two. The code given above will output <mark>Display a Number 15.23</mark>.

Similarly, you can display Characters and Strings with the <mark>printf()</mark> method. Take a
look at the following code. If you want to print a character, use <mark>%c</mark>, and if you want
to print a String, use <mark>%s</mark>.
```
public static void main(String[] args){
    char abbr = 'H';
    String element = "Hydrogen";
    System.out.printf("%c stands for %s", abbr, element);
}
```
When this code runs, the value of the <mark>abbr</mark> variable will replace <mark>%c</mark>
and the value of the element variable will replace <mark>%s</mark>. The output of the above code
is <mark>H</mark> stands for Hydrogen. That's all about the <mark>printf()</mark> method. Let's
move on to learn about the <mark>String.format()</mark> method.

## The String.format() Method
The <mark>format()</mark> method in the <mark>String</mark> class works very much like the
<mark>printf()</mark> method. The main difference here is that it returns a string instead of
printing it. Let's see several examples.

The following code formats an integer using it.
```
public static void main(String[] args){
    int age = 22;
    String str = String.format("My age is %d", age);
    System.out.println(str);
}
```
When you execute this code, Java will create a String called str by concatenating My age is with
the value of the age variable. Then it will print the value of str. The output is:
```
My age is 22
```
Similarly, you can format other data types as well. See the following code.
```
public static void main(String[] args){
int age = 22;
char initial = 'M';
String surname = "Anderson";
double height = 1.72;

    String details = String.format(
            "My name is %c. %s.%nMy age is %d.%nMy height is %.2f.",
            initial, surname, age, height);
    System.out.println(details);
}
```
You can see that we have used four data types in this example. Java will replace %c, %s, %d, %f
with initial, surname, age, and height respectively. %n is the newline character that breaks the 
line every time it is used. The output of our code is:
```
My name is M. Anderson.
My age is 22.
My height is 1.72.
```
The <mark>String</mark> class also has a newer and slightly simpler method <mark>formatted(Object... args)</mark>
that you can use instead of the static <mark>String.format</mark> method. Both of them have the same
method body, so they are completely interchangeable. Here's how it looks in the program:
```
public static void main(String[] args) {
    int age = 22;
    char initial = 'M';
    String surname = "Anderson";
    double height = 1.72;

        String details = "My name is %c. %s.%nMy age is %d.%nMy height is %.2f."
                .formatted(initial, surname, age, height);

    System.out.println(details);
}
```
The result is exactly the same as with the S<mark>tring.format</mark> method:
```
My name is M. Anderson.
My age is 22.
My height is 1.72.
```
Keep in mind that <mark>formatted</mark> is an instance method whereas the <mark>String.format</mark>
method is a static one. You don't need to focus on this difference right now; you will learn about
instance and static methods in the future.

## Summary
Let's summarize what we've learned on this topic.
| Format-Specifier | datatype | Format printing Formatting a string |
| ---------------- | -------- | ----------------------------------- |
| %d | int, short, byte, long | System.out.printf("Display an Integer %d",15000); | String.format("Display an Integer %d",15000) |
| %c | char | System.out.printf("Display a Character %c",'c'); | String.format("Display a Character %c",'c') |
| %f | double, float | System.out.printf("Display a Floating-point Number %f",123.45); | String.format("Display a Floating-point Number %f",123.45) |
| %s | String | System.out.printf("Display a String %s","String"); | String.format("Display a String %s","String") |

## Conclusion
When you are writing complex applications, combining strings and variables with a <mark>+</mark>
sign is not recommended. The <mark>printf()</mark> and <mark>format()</mark> methods are
specifically created for that. Both these methods work exactly the same way, except that the
<mark>printf()</mark> method prints the output while the <mark>format()</mark> method returns a
String. In this article, you have learned most of the uses of both functions. Enjoy it.
