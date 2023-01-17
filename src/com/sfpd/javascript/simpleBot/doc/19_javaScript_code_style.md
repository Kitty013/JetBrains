# javaScript code style
## 1. What is a Style Guide?
The list of best practices for writing code. Following it makes your code
understandable and easy to read by other developers.

Most popular:
   - Airbnb JavaScript Style Guide: https://airbnb.io/javascript/
   - Google JavaScript Style Guide: https://google.github.io/styleguide/jsguide.html

## 2. Airbnb JavaScript Style Guide
Sometimes developers write long lines of code; to read them fully, you need to use
horizontal scrolling. The best alternative is to set the maximum line length and
move the other characters below. As stated in the Airbnb JavaScript Style Guide,
100 characters for a string is sufficient.
```
    // good
    const thePaymentIsActive = isPaymentFromToday(payment.date)
    && isPaymentFromAvaliableAdresses(payment.id)
    && isPaymentToShow(payment.id)

    // bad
    const thePaymentIsActive = isPaymentFromToday(payment.date) && isPaymentFromAvaliableAdresses(payment.id) && isPaymentToShow(payment.id)
```
There is an eternal argument between programmers whether to use spaces or tabs as
an indent. The Airbnb JavaScript Style Guide provides an answer to this question
and recommends using two spaces. If you like to use tabulation, you can set it to
two spaces.
```
    // good
    function myFunction() {
      const name = "Alex";
    }

    // only one space is bad
    function myFunction() {
     const name = "Alex";
    }

    // four spaces are bad
    function myFunction() {
        const name = "Alex";
    }
```
In functions, you should place one space before the first bracket.
```
     // good
     function show() {
       console.log("My name is Helen");
     }


     // bad
     function show(){
       console.log("My name is Helen");
     }
```
In the control statements, it is better to put only one space before the opening
bracket.
```
    // good
    if (a === b) {
      console.log(a)
    }

    // bad
    if(a === b) {
      console.log(a)
    }
```
You should only use one empty line to separate your code.
```
    // good
    if (a > b) {
      console.log ("a is bigger than b");
    }

    // bad
    if (a > b) {


      console.log ("a is bigger than b");

    }
```
Don't forget to write the semicolon at the end of your statements. Otherwise,
JavaScript may split your code incorrectly.
```
    // good
    const a = 5;
    const b = 7;
    const c = 10;

    // bad
    const a = 5
    const b = 7
    const c = 10
```
It is better to use camelCase for naming functions, objects, and methods. camelCase
means that for names consisting of multiple words, the first word should start
with a lowercase letter, and the rest of the words start with a capital letter.
```
    // good
    function myFunctionToCheckValues() {
      //...
    }

    // bad
    function MyFunctionToCheckValues() {
      //...
    }

    // bad
    function myfunctiontocheckvalues() {
      //...
    }
```

## 3. Linters
A tool that will help you check all pattern automatically in order to write clean
code.
   - JSLint: a linter without an extensive list of configuration settings.
   - JSHint: this style has more config parameters than JSLint.
   - ESLint: one of the most common linters. It can not only show you errors but
             also fix your scripts automatically.

