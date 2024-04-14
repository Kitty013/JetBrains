# Boolean type and operations. True and False

The <mark>boolean</mark> *data type* in Java is used to represent logical values, which can have
only two possible states: <mark>true</mark> and <mark>false</mark>. It is used for creating
conditions and logic in programs, allowing programmers to make decisions based on *Boolean* conditions.

This data type is particularly useful for implementing logic related to binary states, such as
on/off, yes/no, and similar situations.

## Boolean type
The <mark>boolean</mark> is a data type that has only two possible values: <mark>false</mark> and
<mark>true</mark>. This is also known as the **logical type**.

This type is a common way in programming languages to represent something that has only two opposite
states like on or off, yes or no, etc.

If you are writing an application that keeps track of opening and closing a door you'll find it
natural to use a boolean to store the current door state.
```
boolean open = true;
boolean closed = false;

System.out.println(open);   // true
System.out.println(closed); // false
```
> Important, you cannot assign an integer value to a boolean variable. In Java, 0 is not the same
> as false.

## Logical operators
Variables of the <mark>boolean</mark> type are often used to build logical *expressions* using
*logical operators*. Java has four logical operators NOT, AND, OR and XOR:

- NOT is a *unary operator* that reverses the boolean value. It is denoted as !.
```
boolean f = false; // f is false
boolean t = !f;    // t is true
```
- AND is a binary operator that returns <mark>true</mark> if both operands are <mark>true</mark>,
otherwise, it returns <mark>false</mark>. It is denoted as &&.
```
boolean b1 = false && false; // false
boolean b2 = false && true;  // false
boolean b3 = true && false;  // false
boolean b4 = true && true;   // true
```
- OR is a binary operator that returns <mark>true</mark> if at least one operand is <mark>true</mark>,
otherwise, it returns <mark>false</mark>. It is denoted as ||.
```
boolean b1 = false || false; // false
boolean b2 = false || true;  // true
boolean b3 = true || false;  // true
boolean b4 = true || true;   // true
```
- XOR (exclusive OR) is a binary operator that returns <mark>true</mark> if boolean operands have
different values, otherwise, it returns <mark>false</mark>. It is denoted as ^.
```
boolean b1 = false ^ false; // false
boolean b2 = false ^ true;  // true
boolean b3 = true ^ false;  // true
boolean b4 = true ^ true;   // false
```
The **XOR** operator is used less often than the others. Just remember that Java has it. If you
really need it, you can use it.

## The precedence of logical operators
Here are the logical operations sorted in order of decreasing priorities in expressions:
! (NOT), ^ (XOR), && (AND), || (OR).

The following variable is true:
```
boolean b = true && !false; // true, because !false is evaluated before &&
```
To change the order of execution you can use parentheses (...).

## An example: trekking
As an example, let's write a complex boolean expression that determines the possibility of
trekking in summer and in other seasons. Let's suppose that the right conditions for trekking 
are dry warm weather in any season or dry weather in summer.
```
boolean cold = false;
boolean dry = true;
boolean summer = false; // suppose now is autumn

boolean trekking = dry && (!cold || summer); // true, let's go trekking!
```
Do not get confused in the expression above, otherwise, you will go trek in bad weather! A
programmer should understand not only arithmetic but also logical *operations*.

##Short-circuiting evaluation
An interesting thing is that the <mark>&&</mark> and <mark>||</mark> operators don't evaluate the
second argument if it isn't necessary. When the first argument of the <mark>&&</mark> operator
evaluates to <mark>false</mark>, the overall value must be <mark>false</mark>; and when the first
argument of the <mark>||</mark> operator evaluates to <mark>true</mark>, the overall value must
be <mark>true</mark>. So:
- false && ... -> false, since it is not necessary to know what the right-hand side is;
- true || ... -> true, since it is not necessary to know what the right-hand side is.

This behavior is known as **short-circuit evaluation** (do not confuse it with an electrical
short circuit). It reduces the computation time, but can also be used to avoid some errors in
programs. We will discuss this in the following topics.

## Conclusion
The <mark>boolean</mark> data type has only two possible values: <mark>false</mark> and
<mark>true</mark>, and is used to represent logical states. The use of logical operators
<mark>! , ^ , &&, ||</mark> allows for the creation of complex logical expressions that take
into account multiple factors. Understanding the *precedence* of these operators enables proper
organization of expressions and helps avoid errors.