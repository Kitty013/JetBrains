/**
$1. What is a console?
    The most popular and simple way to make sure that everything in your Javascript
    code works as expected is to use the browser console to output information.

    Generally speaking, a console is an object that provides access to the debugging
    console of the browser. And this object has different methods for displaying
    messages and information.
    There are multiple ways to open the console in the browser:

    - In Google Chrome, open the browser menu → select More Tools → select Developer
      Tools → go to the Console tab.
    - Use the keyboard shortcut Ctrl + Shift + I (on Windows or Linux) or
      Cmd + Opt + I (on Mac) to open the Developer Tools → go to the Console tab.
    - Use the keyboard shortcut Ctrl + Shift + J (on Windows or Linux) or
      Cmd + Opt + J (on Mac) to open the Console tab right away.
    - Press F12 → go to the Console tab.
**/
/**
$2. The console.log() method
    Among the various console methods, the most widely used one is the console.log()
    method, which writes a message to the console:
**/
    console.log("No bugs here!"); // No bugs here!
/**
    Logging is useful for debugging purposes: it allows you to see the values of
    variables when the code doesn't work correctly. It's better to learn debugging
    using an example. Below you have a function that accepts two arguments and checks
    if their sum equals 42:
**/
    let x = 20;
    let y = "22";
    function findAnswer(num1, num2) {
      let sum = num1 + num2;
      if (sum === 42) {
        return true;
      } else {
        return false;
      }
    }
    findAnswer(x, y); // false
/**
    However, the function returns false. To find out what's wrong with the code,
    let's use the console.log() method. We need to log the value of the sum variable,
    which is used later in the conditional expression. After the fourth line of code,
    let's add the following:
**/
    console.log(sum); // 2022
/**
   Looks like we've found a bug! If we look closely, we see that variable y is a
   string, but it should be a number. After fixing this typo our code works correctly,
   and the function finally returns true:
**/
    let x = 20;
    let y = 22;
    function findAnswer(num1, num2) {
      let sum = num1 + num2;
      console.log(sum); // 42
      if (sum === 42) {
        return true;
      } else {
        return false;
      }
    }
    findAnswer(x, y); // true

/**
$3. Setting breakpoints
    Another debugging technique is setting breakpoints in the code. A breakpoint is
    a special point in the code that interrupts the program execution. When the
    program is stopped, you can examine its current state and then resume it. Also,
    you can set multiple breakpoints.
    An easy way to set a breakpoint is to use the debugger keyword. If the debugging
    is turned on in the browser or a code editor, the code will be stopped at that
    point. Here is an example:
**/
    let friend = "John";
    function greet(name) {
      debugger; // breakpoint
      return "Hello, " + name + "!";
    }
    console.log(greet(friend)); // Hello, John!

/**
    If we open Developer Tools and go to the Sources tab, we'll see the following:
    The Sources window shows the source file, where the line with the breakpoint is
    highlighted. Also, there is a browser message saying that the code is paused on
    the breakpoint. On the right side, you can see the existing breakpoints, the
    current values of the variables, and what function is being called at the moment.
    You need to click on the play button to resume code execution.
    To set a breakpoint in the Developer Tools, you should click on the number on the
    left side of the code:
    The debugger keyword is convenient when you use a code editor, but if you also
    interact with the browser, you can set the breakpoint in the Developer Tools.
**/

area = 30;
volume = 210;
30 210
true