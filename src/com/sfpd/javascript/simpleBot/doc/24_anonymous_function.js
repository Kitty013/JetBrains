/**
$1. What is an anonymous function?
    As you've noticed, we saved the function in the variable myFunction and didn't use
    any function name between the function keyword and parentheses. It means that we
    used an anonymous function, that is, a function declared without specifying its name.
    There are some nuances to anonymous functions. When you define a named function, you
    can call it in any part of your code because the browser creates a reference to this
    function definition before or after calling it:
**/
    // this code works

    setPrice = function setPrice() {
      // ...
    }

    setPrice();

    // this code works too

    setColor();

    function setColor() {
     // ...
    }

//  However, this is not the case with anonymous functions. These functions are
//  created when they are called. Thus, you can only access an anonymous function
//  after it has been defined.
    // this code works

    const setPrice = function() {
      // ...
    }

    setPrice();

    // this code doesn't work

    setColor();

    const setColor = function() {
      // ...
    }

/**
$2. Anonymous functions as parameters
    One of the most common cases is passing anonymous functions as arguments to other
    functions. Here is an example:
**/
   setTimeout(function () {
     console.log("Timer has finished!")
   }, 5000);

//  Anonymous functions are also useful for doing simple operations like multiplication
    let multiplication = function (x, y) {
      return x * y;
    };

    multiplication(5, 8);

//  We declare an anonymous function in the variable multiplication. Since we don't
//  have a reference to an anonymous function this is a simple way to call it in
//  other parts of the code. Programmers like to apply anonymous functions as
//  arguments because they're short.

/**
$3. Immediately invoked anonymous functions
    It makes sense to use a function without a name for cases when you do not need to
    call it again.
**/
    (function() {
     console.log("I've been launched!");
    }());

//  We wrapped the anonymous function in parentheses and initiated the function call
//  by adding () at the end. This function will be executed as soon as the browser
//  reads this code. The main idea is to use local variables inside an anonymous
//  function without affecting variables with the same name located outside of this
//  function. This approach works well for plugins and other additional developer tools
//  You can also use arguments immediately when calling an anonymous function:
    const text = "I've been launched!";

    (function(text) {
     console.log(text);
    }(text));