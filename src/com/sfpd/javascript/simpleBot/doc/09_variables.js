/**
$1. What is a variable?
    A variable is a named place in memory when you can store data to access it later.
    Every variable has a name to distinguish it from other variables.
**/

/**
$2. Variables declaration
    Before you start working with a variable, you need to declare it. JavaScript uses
    two keywords to create variables:
        let: defines a mutable variable the value which can be changed as many times as needed
        const: declares a constant whose value you want to forbid overwriting.
**/

/**
$3. Mutable variables
    Let's try to create a mutable variable and understand why it is called that. Let's
    call it 'month' and put data into it using the = symbol.
**/
    let month = "November"; // define the variable and assign it a value

 /* In variables, it is possible to store any type of data. In this case, we saved the
  * string "November". You can refer to this line if you use a variable name:
 */
    console.log(month); // outputs the content of the variable

 // Now let's try to change the variable and output a new value to the console:
    month = "December";
    console.log(month); // December

/**
$4. Other ways to declare variables
    In older scripts, you may see that var keyword is used instead of let. It looks
    like this:
**/
    var age = 21; // This is an outdated way of declaring a variable.

/**
$5. Constants
    Declare the immutable variable called language and add the string "JavaScript" as
    a value:
**/
    const language = "JavaScript";
 // If we wanted to change the value of a variable created with the const keyword, we
 // could have failed and got an error:
    language = "PHP"; // error

