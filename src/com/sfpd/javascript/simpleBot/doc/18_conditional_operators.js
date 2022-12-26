/**
$1. Conditional operators
    We've only considered programs that execute commands line by line. But in real
    programming, they may look like a crossroad. In these cases we use conditional
    operators.
**/

/**
$2. The "if" statement
    We need to make a decision based on some conditions. This concept is realized with
    the if-statement. It's called a conditional operator.
    For example, imagine you have a cat that meows when it gets hungry after 6 am.
    We can write a statement:
**/
    function meow() {
      return "Meow!";
    }

    let time = 10;
    let sound;

    if (time >= 6) {
      sound = meow();
      console.log(sound);
    }

 // Note that when we work with the if statement, the condition inside the parentheses
 // is converted to a boolean. The code inside if is executed if the boolean is true.
 // So every boolean could be a condition:
    let condition = true;

    if (condition) {
      console.log("True!");
    }

/**
$3. The "else" block
    When the condition is false, the else block can be used instead of if. For example:
**/
    function meow() {
      return "Meow!";
    }

    function sleep() {
      return "Zzzzz...";
    }

    let time = 5;
    let sound;

    if (time >= 6) {
      sound = meow();
    } else {
      sound = sleep();
    }
    console.log(sound);

/**
$4. Several conditions: "else if" block
    There are situations when we have not just two bur several possible conditions.
    For this purpose we use the else if block:
**/
    function meow() {
      return "Meow!";
    }

    function sleep() {
      return "Zzzzz...";
    }

    function play() {
      return "Bang bang!";
    }

    let time = 9;
    let sound;

    if (time < 6) {
      sound = sleep();
    } else if (time < 8) {
      sound = meow();
    } else {
      sound = play();
    }
    console.log(sound);

/**
$5. The ternary operator "?:"
    When the aim of the program is to assign a variable depending on a condition, we
    can use the short version of the if...else block: the ternary operator ?:. It
    works like this:
**/
    let time = 11;
    let isHungry = (time >= 6) ? true : false;

 // You can see the condition. Then goes ? and two possible values of the set variable:
 // first, what we set when the condition is true, and after : comes whatever we set
 // for false. A condition for visibility can be placed in brackets, but this action is
 // not necessary.
    let time = 11;
    let isHungry = time >= 6 ? true : false;

 // The condition can be as simple as in the example above, as well as more complex.
 // For example, by using logical operators:
    let time = 11;
    let isHungry = !(time <= 6) ? true : false;
