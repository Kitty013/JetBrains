# Functions

## 1. Basic syntax
To create a *function*, you need to write a keyword function, come up with a name
for it and open parentheses. In parentheses, you can specify the parameters: data
that you want to transfer to the program. The code of the function, also called
a function body, must be written inside the curly brackets.

Let's write a function that outputs a string "Find and book your ideal tour!"
to the console.
```
    function writeMessage() {
        console.log("Find and book your ideal tour!");
    };
```
Call the function.
```
    writeMessage();  // Find and book your ideal tour!
```
The function can be called more than once. The function is called anywhere in the
file. You can call the function both before or after its creation.
```
    writeMessage(); // Find and book your ideal tour!
    writeMessage(); // Find and book your ideal tour!
```

## 2. Parameters
We can transfer any information inside the function using the *parameters*. Let's
try to pass two arguments to the function: a and b.
```
    function quotient(a, b) {
      console.log(a / b);
    }

    quotient(10, 5); // 2
    quotient(6, 2);  // 3
```

## 3. Returning a value
It is possible to return the function result using the *return* statement. The
return can be located anywhere in the body of the function. Once the execution
of the code reaches the point of return, the function stops and the value
returns to the code that called it.
```
    function multiply(a, b) {
      return a * b;
    }

    let result = multiply(10, 2);
    console.log(result); // 20
```