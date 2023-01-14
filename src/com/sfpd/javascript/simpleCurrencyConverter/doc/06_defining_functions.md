# Functions
## 1. Function declaration
Function declaration is a classic method of defining functions. It consists of:
*	 The function *keyword*.
*	 A required *identifier*. A function identifier should clearly reflect what it
     does. Function identifiers can contain letters, digits, underscores, and
     dollar signs (same rules as variables). Usually, they are verbs.
*	 A pair of parentheses. The parentheses may include *parameter* names separated
     by commas: (parameter1, parameter2). Parameters are inputs that are passed
     to functions as names and behave as local variables. For example, when a
     user logs into an application, we may want the program to greet them by name.

The function body, which consists of a pair of curly braces within which you can
put the code to be executed.

```
    function sayHi(name) {
      alert('Hello' + ' ' + name);
    }

    sayHi("Joe"); // "Hello Joe"
```

Declared functions are not executed immediately. They are "saved for later use",
and will be executed later when they are invoked (called upon).

The main feature of function declaration is that the interpreter that reads
JavaScript defines the declaration before the rest of the code executes. This
behavior of functions is called *hoisting*. Hoisting, or moving declarations to
the top, is JavaScript's default behavior. So, we can call the function in the
code before defining it, and this code will work just fine.

```
    sum(2, 3); // 5

    function sum(a, b) {
      return a + b;
    }
```

## 2. Function expression

Function expression is a function definition method that is part of an expression
(usually, an assignment).

```
    let sayHi = function(name){
      alert('Hello' + ' ' + name);
    }
```

Function expression is often defined as assigning an *anonymous function* to a
variable.

This way allows us to create an anonymous function that doesn't have any function
identifier, which is the main difference between function expression and function
declaration.

Unlike function declarations, function expressions must be defined *before* they
are called. Function expressions are created during the execution of the
expression that creates them.

In this case, the function will be created during the assignment operation.

```
    let sum = function(a, b) {
      return a + b;
    }

    sum(2, 3)
```

## 3. Arrow function expression
ECMAScript is a revision of the JavaScript Standard that has different versions
(ES6, ES21, etc.). 
ES6 was released in 2015, and it's a milestone in the history
of JavaScript. It added *arrow functions*.

In the modern standard JavaScript, function expression can be declared using arrow
notation. The advantage of arrow functions is that they have a *shorter syntax*
than function expressions.

```
    let sum = (a, b) => {
      return a + b;
    }

    sum(2, 3);
```

## 4. The function constructor
Functions can also be defined with a built-in JavaScript function constructor
called *Function()*.

```
    const mult = new Function("a", "b", "return a * b");

    let x = mult(4, 3); // x = 12
```

In practice, this way of function definition is rarely used: you don't have to use
a function constructor. 

The example above is the same as writing the following:

```
    const mult = function (a, b) {return a * b};

    let x = mult(4, 3); // x = 12
```
