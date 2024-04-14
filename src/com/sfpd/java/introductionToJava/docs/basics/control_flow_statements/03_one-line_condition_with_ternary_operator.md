# One-line condition with ternary operator
Quite often you may need to assign different values to a variable depending on a certain condition.
You may do it conveniently with the help of the **ternary operator**. It provides a compact way to
express simple *conditional statements*. Instead of writing lengthy <mark>if-else</mark> constructs
for basic conditions, you can use the ternary operator to achieve the same result in a more concise
manner.

## What is the ternary operator?
The ternary operator is an operator which evaluates a condition and chooses one of two cases to 
execute. It is also called the **conditional operator**. The operator can be considered as a form of
the <mark>if</mark>-then-<mark>else</mark> statement. The ternary operator should not be confused
with the conditional statement, despite their similarity. This operator can be used in places where
an *expression* is expected.

Sometimes **the ternary operator** is more readable and concise than the corresponding *if statement*.

Let's start learning this operator with an example. Suppose we have to find the *maximum* of two int
variables, <mark>a</mark> and <mark>b</mark>. It is easy to write using a conditional statement:
```
int a = ...;
int b = ...;
int max = ...;

if (a > b) {
max = a;
} else {
max = b;
}
```
Here is what an equivalent ternary operator looks like:
```
int max = a > b ? a : b;
```
This code is more concise than the code above, isn't it?

The general syntax of the ternary operator is the following:
```
result = condition ? trueCase : elseCase;
```
It includes two special symbols <mark>?</mark> and <mark>:</mark>.

Here, the <mark>condition</mark> is a Boolean expression that evaluates to either <mark>true</mark>
or <mark>false</mark>. If this expression is <mark>true</mark>, the ternary operator evaluates
<mark>trueCase</mark>, otherwise <mark>elseCase</mark> is evaluated. It is important that
<mark>trueCase</mark> and <mark>elseCase</mark> are expressions which can be reduced to a common
*type*. This type determines the type of the <mark>result</mark>.

## Usage example
Let's consider another example that *prints* whether a number is even or odd.
```
int num = ...;  // it's initialized by a value
System.out.println(num % 2 == 0 ? "even" : "odd");
```
This ternary operator consists of three *operands*: the value of the expression <mark>num % 2 == 0</mark>,
and two string *literals* <mark>"even"</mark> and <mark>"odd"</mark>. Its result type is <mark>String</mark>.

> Note: Java allows us to nest one ternary operator into another one, but it can be less readable
> than the corresponding conditional statement. If you do this, be careful.

Imagine you need to compare two *integer numbers* and print <mark>equal</mark> in case they are
equal, <mark>more</mark> if the first one has a bigger value than the second and <mark>less</mark>
otherwise. The task can be solved using a combination of 2 ternary operators:
```
int a = ...; // it's initialized by a value
int b = ...; // it's initialized by a value
String result = a == b ? "equal" :
a > b ? "more" : "less";
```
At first, the outer ternary operator checks equality of <mark>a</mark> and <mark>b</mark> numbers.
If it is true, <mark>equal</mark> is printed, otherwise, the nested ternary operator <mark>a > b ?
"more" : "less"</mark> is calculated. To improve readability, the whole expression is divided into
two lines.

## Conclusion
The ternary operator in Java is a concise way to evaluate a condition and assign values to a
variable based on that condition. It is similar to an <mark>if-else</mark> statement but can be
more readable and concise in certain situations. The *syntax* is <mark>result = condition ?
trueCase : elseCase</mark>, and it's useful for making quick decisions in code. However, nesting
ternary operators should be done with caution as it can reduce readability.
